package net.minecraft.client.IlIlIIIllIIllIlllllI;

import java.util.*;
import com.google.common.collect.*;
import tv.twitch.broadcast.*;
import tv.twitch.*;

public class llllIIllllIlIlIIIIll
{
    protected lllIIIIlllllIlIIllIl llllIIIIlIIIlIlllIll;
    protected Stream IlIlIlIlIlllllllllIl;
    protected IngestList llIllIIIIIllIlIIIIlI;
    protected IlIlIIIIIIlllIlIllIl IlIIIlIlIIIllIlIlIIl;
    protected long IlIlIIIllIllIIIIIllI;
    protected long IllIIlllIIIIlllIIlIl;
    protected long llllIIIlIlllIlIIIIIl;
    protected RTMPState lIIIIlIIIIIlllIllIII;
    protected VideoParams lIIIlllIIIllIIIllIII;
    protected AudioParams llIIlIIIlIIIllIlIIIl;
    protected long llIllIlIIIIllIlIIllI;
    protected List lIlIlIIIllIIllIIIllI;
    protected boolean IlIlIIIllIIllIlllllI;
    protected IStreamCallbacks IIIIlllIIIIIIlIIIlll;
    protected IStatCallbacks llllIIllllIlIlIIIIll;
    protected IngestServer IlIllIlIlIIIlIlIlIII;
    protected boolean IIlllIIlIllIllIlIIll;
    protected boolean lllIIIIlllllIlIIllIl;
    protected int IlIlIIIIIIlllIlIllIl;
    protected int IIllIIllIIIlIlIIIIlI;
    protected long IIIlIIIlIlIIlllIIlll;
    protected float IlIlIIIlIIlIlIIlllIl;
    protected float IlllllllIIIlIIIlIlII;
    protected boolean IIlIIIIlllIlllllIlII;
    protected boolean IIIlIIlIIIIlllIlllII;
    protected boolean IlIlIllllllllIIIIlII;
    protected IStreamCallbacks IIlllIlIIllIlIlIlIIl;
    protected IStatCallbacks llIIIlIlIllIIlIlIlII;
    private static volatile /* synthetic */ int[] lllllIlIIIlIlIIlllII;
    
    public void llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public IngestServer llllIIIIlIIIlIlllIll() {
        return this.IlIllIlIlIIIlIlIlIII;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.IlIlIIIIIIlllIlIllIl;
    }
    
    public boolean llIllIIIIIllIlIIIIlI() {
        return this.IlIIIlIlIIIllIlIlIIl == net.minecraft.client.IlIlIIIllIIllIlllllI.IlIlIIIIIIlllIlIllIl.IllIIlllIIIIlllIIlIl || this.IlIIIlIlIIIllIlIlIIl == net.minecraft.client.IlIlIIIllIIllIlllllI.IlIlIIIIIIlllIlIllIl.lIIIIlIIIIIlllIllIII || this.IlIIIlIlIIIllIlIlIIl == net.minecraft.client.IlIlIIIllIIllIlllllI.IlIlIIIIIIlllIlIllIl.lIIIlllIIIllIIIllIII;
    }
    
    public float IlIIIlIlIIIllIlIlIIl() {
        return this.IlllllllIIIlIIIlIlII;
    }
    
    public llllIIllllIlIlIIIIll(final Stream ilIlIlIlIlllllllllIl, final IngestList llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = null;
        this.IlIlIlIlIlllllllllIl = null;
        this.llIllIIIIIllIlIIIIlI = null;
        this.IlIIIlIlIIIllIlIlIIl = net.minecraft.client.IlIlIIIllIIllIlllllI.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll;
        this.IlIlIIIllIllIIIIIllI = 8000L;
        this.IllIIlllIIIIlllIIlIl = 2000L;
        this.llllIIIlIlllIlIIIIIl = 0L;
        this.lIIIIlIIIIIlllIllIII = RTMPState.Invalid;
        this.lIIIlllIIIllIIIllIII = null;
        this.llIIlIIIlIIIllIlIIIl = null;
        this.llIllIlIIIIllIlIIllI = 0L;
        this.lIlIlIIIllIIllIIIllI = null;
        this.IlIlIIIllIIllIlllllI = false;
        this.IIIIlllIIIIIIlIIIlll = null;
        this.llllIIllllIlIlIIIIll = null;
        this.IlIllIlIlIIIlIlIlIII = null;
        this.IIlllIIlIllIllIlIIll = false;
        this.lllIIIIlllllIlIIllIl = false;
        this.IlIlIIIIIIlllIlIllIl = -1;
        this.IIllIIllIIIlIlIIIIlI = 0;
        this.IIIlIIIlIlIIlllIIlll = 0L;
        this.IlIlIIIlIIlIlIIlllIl = 0.0f;
        this.IlllllllIIIlIIIlIlII = 0.0f;
        this.IIlIIIIlllIlllllIlII = false;
        this.IIIlIIlIIIIlllIlllII = false;
        this.IlIlIllllllllIIIIlII = false;
        this.IIlllIlIIllIlIlIlIIl = (IStreamCallbacks)new IlIllIlIlIIIlIlIlIII(this);
        this.llIIIlIlIllIIlIlIlII = (IStatCallbacks)new IIlllIIlIllIllIlIIll(this);
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public void IlIlIIIllIllIIIIIllI() {
        if (this.IlIIIlIlIIIllIlIlIIl == net.minecraft.client.IlIlIIIllIIllIlllllI.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll) {
            this.IlIlIIIIIIlllIlIllIl = 0;
            this.IIlllIIlIllIllIlIIll = false;
            this.lllIIIIlllllIlIIllIl = false;
            this.IIlIIIIlllIlllllIlII = false;
            this.IIIlIIlIIIIlllIlllII = false;
            this.IlIlIllllllllIIIIlII = false;
            this.llllIIllllIlIlIIIIll = this.IlIlIlIlIlllllllllIl.getStatCallbacks();
            this.IlIlIlIlIlllllllllIl.setStatCallbacks(this.llIIIlIlIllIIlIlIlII);
            this.IIIIlllIIIIIIlIIIlll = this.IlIlIlIlIlllllllllIl.getStreamCallbacks();
            this.IlIlIlIlIlllllllllIl.setStreamCallbacks(this.IIlllIlIIllIlIlIlIIl);
            this.lIIIlllIIIllIIIllIII = new VideoParams();
            this.lIIIlllIIIllIIIllIII.targetFps = 60;
            this.lIIIlllIIIllIIIllIII.maxKbps = 3500;
            this.lIIIlllIIIllIIIllIII.outputWidth = 1280;
            this.lIIIlllIIIllIIIllIII.outputHeight = 720;
            this.lIIIlllIIIllIIIllIII.pixelFormat = PixelFormat.TTV_PF_BGRA;
            this.lIIIlllIIIllIIIllIII.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_HIGH;
            this.lIIIlllIIIllIIIllIII.disableAdaptiveBitrate = true;
            this.lIIIlllIIIllIIIllIII.verticalFlip = false;
            this.IlIlIlIlIlllllllllIl.getDefaultParams(this.lIIIlllIIIllIIIllIII);
            this.llIIlIIIlIIIllIlIIIl = new AudioParams();
            this.llIIlIIIlIIIllIlIIIl.audioEnabled = false;
            this.llIIlIIIlIIIllIlIIIl.enableMicCapture = false;
            this.llIIlIIIlIIIllIlIIIl.enablePlaybackCapture = false;
            this.llIIlIIIlIIIllIlIIIl.enablePassthroughAudio = false;
            this.lIlIlIIIllIIllIIIllI = Lists.newArrayList();
            for (int n = 3, i = 0; i < n; ++i) {
                final FrameBuffer allocateFrameBuffer = this.IlIlIlIlIlllllllllIl.allocateFrameBuffer(this.lIIIlllIIIllIIIllIII.outputWidth * this.lIIIlllIIIllIIIllIII.outputHeight * 4);
                if (!allocateFrameBuffer.getIsValid()) {
                    this.llIIlIIIlIIIllIlIIIl();
                    this.llllIIIIlIIIlIlllIll(net.minecraft.client.IlIlIIIllIIllIlllllI.IlIlIIIIIIlllIlIllIl.lIIIlllIIIllIIIllIII);
                    return;
                }
                this.lIlIlIIIllIIllIIIllI.add(allocateFrameBuffer);
                this.IlIlIlIlIlllllllllIl.randomizeFrameBuffer(allocateFrameBuffer);
            }
            this.llllIIIIlIIIlIlllIll(net.minecraft.client.IlIlIIIllIIllIlllllI.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl);
            this.llIllIlIIIIllIlIIllI = System.currentTimeMillis();
        }
    }
    
    public void IllIIlllIIIIlllIIlIl() {
        if (!this.llIllIIIIIllIlIIIIlI() && this.IlIIIlIlIIIllIlIlIIl != net.minecraft.client.IlIlIIIllIIllIlllllI.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll && !this.IIIlIIlIIIIlllIlllII && !this.IlIlIllllllllIIIIlII) {
            switch (llIllIlIIIIllIlIIllI()[this.IlIIIlIlIIIllIlIlIIl.ordinal()]) {
                case 2:
                case 5: {
                    if (this.IlIllIlIlIIIlIlIlIII != null) {
                        if (this.lllIIIIlllllIlIIllIl || !this.IlIlIIIllIIllIlllllI) {
                            this.IlIllIlIlIIIlIlIlIII.bitrateKbps = 0.0f;
                        }
                        this.IlIlIlIlIlllllllllIl(this.IlIllIlIlIIIlIlIlIII);
                        break;
                    }
                    this.llIllIlIIIIllIlIIllI = 0L;
                    this.lllIIIIlllllIlIIllIl = false;
                    this.IlIlIIIllIIllIlllllI = true;
                    if (this.IlIIIlIlIIIllIlIlIIl != net.minecraft.client.IlIlIIIllIIllIlllllI.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl) {
                        ++this.IlIlIIIIIIlllIlIllIl;
                    }
                    if (this.IlIlIIIIIIlllIlIllIl < this.llIllIIIIIllIlIIIIlI.getServers().length) {
                        this.llllIIIIlIIIlIlllIll(this.IlIllIlIlIIIlIlIlIII = this.llIllIIIIIllIlIIIIlI.getServers()[this.IlIlIIIIIIlllIlIllIl]);
                        break;
                    }
                    this.llllIIIIlIIIlIlllIll(net.minecraft.client.IlIlIIIllIIllIlllllI.IlIlIIIIIIlllIlIllIl.IllIIlllIIIIlllIIlIl);
                    break;
                }
                case 3:
                case 4: {
                    this.llIllIIIIIllIlIIIIlI(this.IlIllIlIlIIIlIlIlIII);
                    break;
                }
                case 7: {
                    this.llllIIIIlIIIlIlllIll(net.minecraft.client.IlIlIIIllIIllIlllllI.IlIlIIIIIIlllIlIllIl.lIIIIlIIIIIlllIllIII);
                    break;
                }
            }
            this.lIIIlllIIIllIIIllIII();
            if (this.IlIIIlIlIIIllIlIlIIl == net.minecraft.client.IlIlIIIllIIllIlllllI.IlIlIIIIIIlllIlIllIl.lIIIIlIIIIIlllIllIII || this.IlIIIlIlIIIllIlIlIIl == net.minecraft.client.IlIlIIIllIIllIlllllI.IlIlIIIIIIlllIlIllIl.IllIIlllIIIIlllIIlIl) {
                this.llIIlIIIlIIIllIlIIIl();
            }
        }
    }
    
    public void llllIIIlIlllIlIIIIIl() {
        if (!this.llIllIIIIIllIlIIIIlI() && !this.IIlllIIlIllIllIlIIll) {
            this.IIlllIIlIllIllIlIIll = true;
            if (this.IlIllIlIlIIIlIlIlIII != null) {
                this.IlIllIlIlIIIlIlIlIII.bitrateKbps = 0.0f;
            }
        }
    }
    
    protected boolean llllIIIIlIIIlIlllIll(final IngestServer ilIllIlIlIIIlIlIlIII) {
        this.IlIlIIIllIIllIlllllI = true;
        this.llllIIIlIlllIlIIIIIl = 0L;
        this.lIIIIlIIIIIlllIllIII = RTMPState.Idle;
        this.IlIllIlIlIIIlIlIlIII = ilIllIlIlIIIlIlIlIII;
        this.IIIlIIlIIIIlllIlllII = true;
        this.llllIIIIlIIIlIlllIll(net.minecraft.client.IlIlIIIllIIllIlllllI.IlIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI);
        if (ErrorCode.failed(this.IlIlIlIlIlllllllllIl.start(this.lIIIlllIIIllIIIllIII, this.llIIlIIIlIIIllIlIIIl, ilIllIlIlIIIlIlIlIII, StartFlags.TTV_Start_BandwidthTest, true))) {
            this.IIIlIIlIIIIlllIlllII = false;
            this.IlIlIIIllIIllIlllllI = false;
            this.llllIIIIlIIIlIlllIll(net.minecraft.client.IlIlIIIllIIllIlllllI.IlIlIIIIIIlllIlIllIl.IlIlIIIllIllIIIIIllI);
            return false;
        }
        this.IIIlIIIlIlIIlllIIlll = this.llllIIIlIlllIlIIIIIl;
        ilIllIlIlIIIlIlIlIII.bitrateKbps = 0.0f;
        this.IIllIIllIIIlIlIIIIlI = 0;
        return true;
    }
    
    protected void IlIlIlIlIlllllllllIl(final IngestServer ingestServer) {
        if (this.IIIlIIlIIIIlllIlllII) {
            this.lllIIIIlllllIlIIllIl = true;
        }
        else if (this.IIlIIIIlllIlllllIlII) {
            this.IlIlIllllllllIIIIlII = true;
            final ErrorCode stop = this.IlIlIlIlIlllllllllIl.stop(true);
            if (ErrorCode.failed(stop)) {
                this.IIlllIlIIllIlIlIlIIl.stopCallback(ErrorCode.TTV_EC_SUCCESS);
                System.out.println("Stop failed: " + stop.toString());
            }
            this.IlIlIlIlIlllllllllIl.pollStats();
        }
        else {
            this.IIlllIlIIllIlIlIlIIl.stopCallback(ErrorCode.TTV_EC_SUCCESS);
        }
    }
    
    protected long lIIIIlIIIIIlllIllIII() {
        return System.currentTimeMillis() - this.llIllIlIIIIllIlIIllI;
    }
    
    protected void lIIIlllIIIllIIIllIII() {
        final float n = (float)this.lIIIIlIIIIIlllIllIII();
        switch (llIllIlIIIIllIlIIllI()[this.IlIIIlIlIIIllIlIlIIl.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 6:
            case 8:
            case 9: {
                this.IlllllllIIIlIIIlIlII = 0.0f;
                break;
            }
            case 5: {
                this.IlllllllIIIlIIIlIlII = 1.0f;
                break;
            }
            default: {
                this.IlllllllIIIlIIIlIlII = n / this.IlIlIIIllIllIIIIIllI;
                break;
            }
        }
        switch (llIllIlIIIIllIlIIllI()[this.IlIIIlIlIIIllIlIlIIl.ordinal()]) {
            case 6:
            case 8:
            case 9: {
                this.IlIlIIIlIIlIlIIlllIl = 1.0f;
                break;
            }
            default: {
                this.IlIlIIIlIIlIlIIlllIl = this.IlIlIIIIIIlllIlIllIl / (float)this.llIllIIIIIllIlIIIIlI.getServers().length;
                this.IlIlIIIlIIlIlIIlllIl += this.IlllllllIIIlIIIlIlII / this.llIllIIIIIllIlIIIIlI.getServers().length;
                break;
            }
        }
    }
    
    protected boolean llIllIIIIIllIlIIIIlI(final IngestServer ingestServer) {
        if (this.lllIIIIlllllIlIIllIl || this.IIlllIIlIllIllIlIIll || this.lIIIIlIIIIIlllIllIII() >= this.IlIlIIIllIllIIIIIllI) {
            this.llllIIIIlIIIlIlllIll(net.minecraft.client.IlIlIIIllIIllIlllllI.IlIlIIIIIIlllIlIllIl.IlIlIIIllIllIIIIIllI);
            return true;
        }
        if (this.IIIlIIlIIIIlllIlllII || this.IlIlIllllllllIIIIlII) {
            return true;
        }
        if (ErrorCode.failed(this.IlIlIlIlIlllllllllIl.submitVideoFrame((FrameBuffer)this.lIlIlIIIllIIllIIIllI.get(this.IIllIIllIIIlIlIIIIlI)))) {
            this.IlIlIIIllIIllIlllllI = false;
            this.llllIIIIlIIIlIlllIll(net.minecraft.client.IlIlIIIllIIllIlllllI.IlIlIIIIIIlllIlIllIl.IlIlIIIllIllIIIIIllI);
            return false;
        }
        this.IIllIIllIIIlIlIIIIlI = (this.IIllIIllIIIlIlIIIIlI + 1) % this.lIlIlIIIllIIllIIIllI.size();
        this.IlIlIlIlIlllllllllIl.pollStats();
        if (this.lIIIIlIIIIIlllIllIII == RTMPState.SendVideo) {
            this.llllIIIIlIIIlIlllIll(net.minecraft.client.IlIlIIIllIIllIlllllI.IlIlIIIIIIlllIlIllIl.IlIIIlIlIIIllIlIlIIl);
            if (this.lIIIIlIIIIIlllIllIII() > 0L && this.llllIIIlIlllIlIIIIIl > this.IIIlIIIlIlIIlllIIlll) {
                ingestServer.bitrateKbps = this.llllIIIlIlllIlIIIIIl * 8L / (float)this.lIIIIlIIIIIlllIllIII();
                this.IIIlIIIlIlIIlllIIlll = this.llllIIIlIlllIlIIIIIl;
            }
        }
        return true;
    }
    
    protected void llIIlIIIlIIIllIlIIIl() {
        this.IlIllIlIlIIIlIlIlIII = null;
        if (this.lIlIlIIIllIIllIIIllI != null) {
            for (int i = 0; i < this.lIlIlIIIllIIllIIIllI.size(); ++i) {
                ((FrameBuffer)this.lIlIlIIIllIIllIIIllI.get(i)).free();
            }
            this.lIlIlIIIllIIllIIIllI = null;
        }
        if (this.IlIlIlIlIlllllllllIl.getStatCallbacks() == this.llIIIlIlIllIIlIlIlII) {
            this.IlIlIlIlIlllllllllIl.setStatCallbacks(this.llllIIllllIlIlIIIIll);
            this.llllIIllllIlIlIIIIll = null;
        }
        if (this.IlIlIlIlIlllllllllIl.getStreamCallbacks() == this.IIlllIlIIllIlIlIlIIl) {
            this.IlIlIlIlIlllllllllIl.setStreamCallbacks(this.IIIIlllIIIIIIlIIIlll);
            this.IIIIlllIIIIIIlIIIlll = null;
        }
    }
    
    protected void llllIIIIlIIIlIlllIll(final IlIlIIIIIIlllIlIllIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl != this.IlIIIlIlIIIllIlIlIIl) {
            this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
            if (this.llllIIIIlIIIlIlllIll != null) {
                this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this, ilIIIlIlIIIllIlIlIIl);
            }
        }
    }
    
    static /* synthetic */ int[] llIllIlIIIIllIlIIllI() {
        final int[] lllllIlIIIlIlIIlllII = llllIIllllIlIlIIIIll.lllllIlIIIlIlIIlllII;
        if (lllllIlIIIlIlIIlllII != null) {
            return lllllIlIIIlIlIIlllII;
        }
        final int[] lllllIlIIIlIlIIlllII2 = new int[IlIlIIIIIIlllIlIllIl.values().length];
        try {
            lllllIlIIIlIlIIlllII2[IlIlIIIIIIlllIlIllIl.lIIIIlIIIIIlllIllIII.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            lllllIlIIIlIlIIlllII2[IlIlIIIIIIlllIlIllIl.llllIIIlIlllIlIIIIIl.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            lllllIlIIIlIlIIlllII2[IlIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            lllllIlIIIlIlIIlllII2[IlIlIIIIIIlllIlIllIl.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            lllllIlIIIlIlIIlllII2[IlIlIIIIIIlllIlIllIl.lIIIlllIIIllIIIllIII.ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            lllllIlIIIlIlIIlllII2[IlIlIIIIIIlllIlIllIl.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        try {
            lllllIlIIIlIlIIlllII2[IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError7) {}
        try {
            lllllIlIIIlIlIIlllII2[IlIlIIIIIIlllIlIllIl.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError8) {}
        try {
            lllllIlIIIlIlIIlllII2[IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError9) {}
        return llllIIllllIlIlIIIIll.lllllIlIIIlIlIIlllII = lllllIlIIIlIlIIlllII2;
    }
}
