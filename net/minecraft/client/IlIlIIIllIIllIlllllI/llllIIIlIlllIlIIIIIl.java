package net.minecraft.client.IlIlIIIllIIllIlllllI;

import tv.twitch.chat.*;
import tv.twitch.*;

class llllIIIlIlllIlIIIIIl implements IChatAPIListener
{
    final /* synthetic */ IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll;
    
    llllIIIlIlllIlIIIIIl(final IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public void chatInitializationCallback(final ErrorCode errorCode) {
        if (ErrorCode.succeeded(errorCode)) {
            this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.setMessageFlushInterval(this.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll);
            this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.setUserChangeEventInterval(this.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll);
            this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl();
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI);
        }
        else {
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll);
        }
        try {
            if (this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll != null) {
                this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(errorCode);
            }
        }
        catch (Exception ex) {
            this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl(ex.toString());
        }
    }
    
    public void chatShutdownCallback(final ErrorCode errorCode) {
        if (ErrorCode.succeeded(errorCode)) {
            final ErrorCode shutdown = this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.shutdown();
            if (ErrorCode.failed(shutdown)) {
                this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl(String.format("Error shutting down the Twitch sdk: %s", ErrorCode.getString(shutdown)));
            }
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll);
        }
        else {
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI);
            this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl(String.format("Error shutting down Twith chat: %s", errorCode));
        }
        try {
            if (this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll != null) {
                this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(errorCode);
            }
        }
        catch (Exception ex) {
            this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl(ex.toString());
        }
    }
    
    public void chatEmoticonDataDownloadCallback(final ErrorCode errorCode) {
        if (ErrorCode.succeeded(errorCode)) {
            this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl();
        }
    }
}
