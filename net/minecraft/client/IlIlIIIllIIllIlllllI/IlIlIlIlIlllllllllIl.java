package net.minecraft.client.IlIlIIIllIIllIlllllI;

import tv.twitch.*;
import tv.twitch.broadcast.*;

class IlIlIlIlIlllllllllIl implements IStreamCallbacks
{
    final /* synthetic */ llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll;
    
    IlIlIlIlIlllllllllIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public void requestAuthTokenCallback(final ErrorCode errorCode, final AuthToken iiIlIIIlIlIIlllIIlll) {
        if (ErrorCode.succeeded(errorCode)) {
            this.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll = iiIlIIIlIlIIlllIIlll;
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl);
        }
        else {
            this.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll.data = "";
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl);
            this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(String.format("RequestAuthTokenDoneCallback got failure: %s", ErrorCode.getString(errorCode)));
        }
        try {
            if (this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI != null) {
                this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(errorCode, iiIlIIIlIlIIlllIIlll);
            }
        }
        catch (Exception ex) {
            this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(ex.toString());
        }
    }
    
    public void loginCallback(final ErrorCode errorCode, final ChannelInfo ilIlIIIlIIlIlIIlllIl) {
        if (ErrorCode.succeeded(errorCode)) {
            this.llllIIIIlIIIlIlllIll.IlIlIIIlIIlIlIIlllIl = ilIlIIIlIIlIlIIlllIl;
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl);
            this.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI = true;
        }
        else {
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl);
            this.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI = false;
            this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(String.format("LoginCallback got failure: %s", ErrorCode.getString(errorCode)));
        }
        try {
            if (this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI != null) {
                this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(errorCode);
            }
        }
        catch (Exception ex) {
            this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(ex.toString());
        }
    }
    
    public void getIngestServersCallback(final ErrorCode errorCode, final IngestList ilIlIIIIIIlllIlIllIl) {
        if (ErrorCode.succeeded(errorCode)) {
            this.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl = ilIlIIIIIIlllIlIllIl;
            this.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI = this.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl.getDefaultServer();
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IlIlIIIllIllIIIIIllI.lIIIIlIIIIIlllIllIII);
            try {
                if (this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI != null) {
                    this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl);
                }
            }
            catch (Exception ex) {
                this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(ex.toString());
            }
        }
        else {
            this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(String.format("IngestListCallback got failure: %s", ErrorCode.getString(errorCode)));
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI);
        }
    }
    
    public void getUserInfoCallback(final ErrorCode errorCode, final UserInfo illlllllIIIlIIIlIlII) {
        this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII = illlllllIIIlIIIlIlII;
        if (ErrorCode.failed(errorCode)) {
            this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(String.format("UserInfoDoneCallback got failure: %s", ErrorCode.getString(errorCode)));
        }
    }
    
    public void getStreamInfoCallback(final ErrorCode errorCode, final StreamInfo iIlIIIIlllIlllllIlII) {
        if (ErrorCode.succeeded(errorCode)) {
            this.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII = iIlIIIIlllIlllllIlII;
            try {
                if (this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI != null) {
                    this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(iIlIIIIlllIlllllIlII);
                }
            }
            catch (Exception ex) {
                this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(ex.toString());
            }
        }
        else {
            this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(String.format("StreamInfoDoneCallback got failure: %s", ErrorCode.getString(errorCode)));
        }
    }
    
    public void getArchivingStateCallback(final ErrorCode errorCode, final ArchivingState iiIlIIlIIIIlllIlllII) {
        this.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII = iiIlIIlIIIIlllIlllII;
        if (ErrorCode.failed(errorCode)) {}
    }
    
    public void runCommercialCallback(final ErrorCode errorCode) {
        if (ErrorCode.failed(errorCode)) {
            this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(String.format("RunCommercialCallback got failure: %s", ErrorCode.getString(errorCode)));
        }
    }
    
    public void setStreamInfoCallback(final ErrorCode errorCode) {
        if (ErrorCode.failed(errorCode)) {
            this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(String.format("SetStreamInfoCallback got failure: %s", ErrorCode.getString(errorCode)));
        }
    }
    
    public void getGameNameListCallback(final ErrorCode errorCode, final GameInfoList list) {
        if (ErrorCode.failed(errorCode)) {
            this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(String.format("GameNameListCallback got failure: %s", ErrorCode.getString(errorCode)));
        }
        try {
            if (this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI != null) {
                this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(errorCode, (list == null) ? new GameInfo[0] : list.list);
            }
        }
        catch (Exception ex) {
            this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(ex.toString());
        }
    }
    
    public void bufferUnlockCallback(final long n) {
        this.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.add(FrameBuffer.lookupBuffer(n));
    }
    
    public void startCallback(final ErrorCode errorCode) {
        if (ErrorCode.succeeded(errorCode)) {
            try {
                if (this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI != null) {
                    this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl();
                }
            }
            catch (Exception ex) {
                this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(ex.toString());
            }
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IlIlIIIllIllIIIIIllI.llIllIlIIIIllIlIIllI);
        }
        else {
            this.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll = null;
            this.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl = null;
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IlIlIIIllIllIIIIIllI.lIIIlllIIIllIIIllIII);
            try {
                if (this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI != null) {
                    this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(errorCode);
                }
            }
            catch (Exception ex2) {
                this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(ex2.toString());
            }
            this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(String.format("startCallback got failure: %s", ErrorCode.getString(errorCode)));
        }
    }
    
    public void stopCallback(final ErrorCode errorCode) {
        if (ErrorCode.succeeded(errorCode)) {
            this.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll = null;
            this.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl = null;
            this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII();
            try {
                if (this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI != null) {
                    this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI();
                }
            }
            catch (Exception ex) {
                this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(ex.toString());
            }
            if (this.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI) {
                this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IlIlIIIllIllIIIIIllI.lIIIlllIIIllIIIllIII);
            }
            else {
                this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl);
            }
        }
        else {
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IlIlIIIllIllIIIIIllI.lIIIlllIIIllIIIllIII);
            this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(String.format("stopCallback got failure: %s", ErrorCode.getString(errorCode)));
        }
    }
    
    public void sendActionMetaDataCallback(final ErrorCode errorCode) {
        if (ErrorCode.failed(errorCode)) {
            this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(String.format("sendActionMetaDataCallback got failure: %s", ErrorCode.getString(errorCode)));
        }
    }
    
    public void sendStartSpanMetaDataCallback(final ErrorCode errorCode) {
        if (ErrorCode.failed(errorCode)) {
            this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(String.format("sendStartSpanMetaDataCallback got failure: %s", ErrorCode.getString(errorCode)));
        }
    }
    
    public void sendEndSpanMetaDataCallback(final ErrorCode errorCode) {
        if (ErrorCode.failed(errorCode)) {
            this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(String.format("sendEndSpanMetaDataCallback got failure: %s", ErrorCode.getString(errorCode)));
        }
    }
}
