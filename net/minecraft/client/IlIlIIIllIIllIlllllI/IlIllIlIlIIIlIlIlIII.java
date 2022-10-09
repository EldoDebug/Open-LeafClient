package net.minecraft.client.IlIlIIIllIIllIlllllI;

import tv.twitch.*;
import tv.twitch.broadcast.*;

class IlIllIlIlIIIlIlIlIII implements IStreamCallbacks
{
    final /* synthetic */ llllIIllllIlIlIIIIll llllIIIIlIIIlIlllIll;
    
    IlIllIlIlIIIlIlIlIII(final llllIIllllIlIlIIIIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public void requestAuthTokenCallback(final ErrorCode errorCode, final AuthToken authToken) {
    }
    
    public void loginCallback(final ErrorCode errorCode, final ChannelInfo channelInfo) {
    }
    
    public void getIngestServersCallback(final ErrorCode errorCode, final IngestList list) {
    }
    
    public void getUserInfoCallback(final ErrorCode errorCode, final UserInfo userInfo) {
    }
    
    public void getStreamInfoCallback(final ErrorCode errorCode, final StreamInfo streamInfo) {
    }
    
    public void getArchivingStateCallback(final ErrorCode errorCode, final ArchivingState archivingState) {
    }
    
    public void runCommercialCallback(final ErrorCode errorCode) {
    }
    
    public void setStreamInfoCallback(final ErrorCode errorCode) {
    }
    
    public void getGameNameListCallback(final ErrorCode errorCode, final GameInfoList list) {
    }
    
    public void bufferUnlockCallback(final long n) {
    }
    
    public void startCallback(final ErrorCode errorCode) {
        this.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII = false;
        if (ErrorCode.succeeded(errorCode)) {
            this.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII = true;
            this.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI = System.currentTimeMillis();
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI);
        }
        else {
            this.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI = false;
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IlIlIIIllIllIIIIIllI);
        }
    }
    
    public void stopCallback(final ErrorCode errorCode) {
        if (ErrorCode.failed(errorCode)) {
            System.out.println("IngestTester.stopCallback failed to stop - " + this.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII.serverName + ": " + errorCode.toString());
        }
        this.llllIIIIlIIIlIlllIll.IlIlIllllllllIIIIlII = false;
        this.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII = false;
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IlIlIIIllIllIIIIIllI);
        this.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII = null;
        if (this.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll) {
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.llllIIIlIlllIlIIIIIl);
        }
    }
    
    public void sendActionMetaDataCallback(final ErrorCode errorCode) {
    }
    
    public void sendStartSpanMetaDataCallback(final ErrorCode errorCode) {
    }
    
    public void sendEndSpanMetaDataCallback(final ErrorCode errorCode) {
    }
}
