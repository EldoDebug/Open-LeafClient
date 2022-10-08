package leaf;

import net.arikia.dev.drpc.callbacks.*;
import net.arikia.dev.drpc.*;

class DiscordCallback implements ReadyCallback
{
    final /* synthetic */ Leaf instance;
    
    DiscordCallback(final Leaf instance) {
        this.instance = instance;
    }
    
    @Override
    public void apply(final DiscordUser discordUser) {
        this.instance.setDiscordStatus();
    }
}
