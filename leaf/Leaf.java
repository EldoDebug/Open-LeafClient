package leaf;

import leaf.config.*;
import leaf.database.*;
import leaf.mods.*;
import leaf.font.*;
import net.minecraft.client.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import fr.litarvan.openauth.microsoft.*;
import net.arikia.dev.drpc.callbacks.*;
import net.arikia.dev.drpc.*;

public class Leaf
{
    public static Leaf instance;
    public ConfigManager saveConfig;
    public DownloadPlayerData downloadPlayerData;
    public ModManager modManager;
    private long lastCurrentTimeMillis;
    
    static {
        Leaf.instance = new Leaf();
    }
    
    public void init() {
        this.saveConfig = new ConfigManager();
        this.downloadPlayerData = new DownloadPlayerData();
        this.modManager = new ModManager();
        LoadFont.loadFont();
    }
    
    public void shutdown() {
        DiscordRPC.discordShutdown();
    }
    
    public void loginAccount(final String email, final String password) {
        final MicrosoftAuthenticator microsoftAuthenticator = new MicrosoftAuthenticator();
        try {
            final MicrosoftAuthResult loginWithCredentials = microsoftAuthenticator.loginWithCredentials(email, password);
            Minecraft.getMinecraft().session = new Session(loginWithCredentials.getProfile().getName(), loginWithCredentials.getProfile().getId(), loginWithCredentials.getAccessToken(), "legacy");
        }
        catch (MicrosoftAuthenticationException ex) {}
    }
    
    public void startDiscord(final String applicationId) {
        this.lastCurrentTimeMillis = System.currentTimeMillis();
        DiscordRPC.discordInitialize(applicationId, new DiscordEventHandlers.Builder().setReadyEventHandler(new DiscordCallback(this)).build(), true);
        new leaf.DiscordRPC(this, "Discord Callback").start();
    }
    
    public void setDiscordStatus() {
        final DiscordRichPresence.Builder builder = new DiscordRichPresence.Builder("Playing Minecraft 1.8.9");
        builder.setBigImage("icon", "Leaf Client");
        builder.setSmallImage("check", "Version 4.0");
        builder.setStartTimestamps(this.lastCurrentTimeMillis);
        DiscordRPC.discordUpdatePresence(builder.build());
    }
}
