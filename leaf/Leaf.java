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
    
    public void loginAccount(final String s, final String s2) {
        final MicrosoftAuthenticator microsoftAuthenticator = new MicrosoftAuthenticator();
        try {
            final MicrosoftAuthResult loginWithCredentials = microsoftAuthenticator.loginWithCredentials(s, s2);
            Minecraft.getMinecraft().session = new Session(loginWithCredentials.getProfile().getName(), loginWithCredentials.getProfile().getId(), loginWithCredentials.getAccessToken(), "legacy");
        }
        catch (MicrosoftAuthenticationException ex) {}
    }
    
    public void startDiscord(final String s) {
        this.lastCurrentTimeMillis = System.currentTimeMillis();
        DiscordRPC.discordInitialize(s, new DiscordEventHandlers$Builder().setReadyEventHandler((ReadyCallback)new DiscordCallback(this)).build(), true);
        new leaf.DiscordRPC(this, "Discord Callback").start();
    }
    
    public void setDiscordStatus() {
        final DiscordRichPresence$Builder discordRichPresence$Builder = new DiscordRichPresence$Builder("Playing Minecraft 1.8.9");
        discordRichPresence$Builder.setBigImage("icon", "Leaf Client");
        discordRichPresence$Builder.setSmallImage("check", "Version 4.0");
        discordRichPresence$Builder.setStartTimestamps(this.lastCurrentTimeMillis);
        DiscordRPC.discordUpdatePresence(discordRichPresence$Builder.build());
    }
}
