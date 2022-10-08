package leaf;

class DiscordRPC extends Thread
{
    final /* synthetic */ Leaf instance;
    
    DiscordRPC(final Leaf instance, final String s) {
        this.instance = instance;
        super(s);
    }
    
    @Override
    public void run() {
        while (true) {
            net.arikia.dev.drpc.DiscordRPC.discordRunCallbacks();
        }
    }
}
