package net.minecraft.client.IlIlIIIllIIllIlllllI;

import org.apache.logging.log4j.*;
import com.google.common.collect.*;
import tv.twitch.*;
import tv.twitch.broadcast.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llIllIIIIIllIlIIIIlI.*;

public class llllIIIIlIIIlIlllIll
{
    private static final Logger lIllllllIIllIlIlIlII;
    protected final int llllIIIIlIIIlIlllIll = 30;
    protected final int IlIlIlIlIlllllllllIl = 3;
    private static final IlIIlllIIlIlllllIIlI llIIlllIIlllIIllIllI;
    private String IIlllIIIlIlllIIlllII;
    protected IlIIIlIlIIIllIlIlIIl llIllIIIIIllIlIIIIlI;
    protected String IlIIIlIlIIIllIlIlIIl;
    protected String IlIlIIIllIllIIIIIllI;
    protected String IllIIlllIIIIlllIIlIl;
    protected boolean llllIIIlIlllIlIIIIIl;
    protected Core lIIIIlIIIIIlllIllIII;
    protected Stream lIIIlllIIIllIIIllIII;
    protected List llIIlIIIlIIIllIlIIIl;
    protected List llIllIlIIIIllIlIIllI;
    protected boolean lIlIlIIIllIIllIIIllI;
    protected boolean IlIlIIIllIIllIlllllI;
    protected boolean IIIIlllIIIIIIlIIIlll;
    protected IlIlIIIllIllIIIIIllI llllIIllllIlIlIIIIll;
    protected String IlIllIlIlIIIlIlIlIII;
    protected VideoParams IIlllIIlIllIllIlIIll;
    protected AudioParams lllIIIIlllllIlIIllIl;
    protected IngestList IlIlIIIIIIlllIlIllIl;
    protected IngestServer IIllIIllIIIlIlIIIIlI;
    protected AuthToken IIIlIIIlIlIIlllIIlll;
    protected ChannelInfo IlIlIIIlIIlIlIIlllIl;
    protected UserInfo IlllllllIIIlIIIlIlII;
    protected StreamInfo IIlIIIIlllIlllllIlII;
    protected ArchivingState IIIlIIlIIIIlllIlllII;
    protected long IlIlIllllllllIIIIlII;
    protected llllIIllllIlIlIIIIll IIlllIlIIllIlIlIlIIl;
    private ErrorCode IIlIIIIIllIlIIIlIIll;
    protected IStreamCallbacks llIIIlIlIllIIlIlIlII;
    protected IStatCallbacks lllllIlIIIlIlIIlllII;
    private static volatile /* synthetic */ int[] llllllIllIllIlIllllI;
    
    static {
        lIllllllIIllIlIlIlII = LogManager.getLogger();
        llIIlllIIlllIIllIllI = new IlIIlllIIlIlllllIIlI(String.class, 50);
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public boolean llllIIIIlIIIlIlllIll() {
        return this.lIlIlIIIllIIllIIIllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final String ilIIIlIlIIIllIlIlIIl) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public StreamInfo IlIlIlIlIlllllllllIl() {
        return this.IIlIIIIlllIlllllIlII;
    }
    
    public ChannelInfo llIllIIIIIllIlIIIIlI() {
        return this.IlIlIIIlIIlIlIIlllIl;
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl() {
        return this.llllIIllllIlIlIIIIll == net.minecraft.client.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI.llIllIlIIIIllIlIIllI || this.llllIIllllIlIlIIIIll == net.minecraft.client.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI.IlIlIIIllIIllIlllllI;
    }
    
    public boolean IlIlIIIllIllIIIIIllI() {
        return this.llllIIllllIlIlIIIIll == net.minecraft.client.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI.lIIIlllIIIllIIIllIII;
    }
    
    public boolean IllIIlllIIIIlllIIlIl() {
        return this.llllIIllllIlIlIIIIll == net.minecraft.client.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI.IIIIlllIIIIIIlIIIlll;
    }
    
    public boolean llllIIIlIlllIlIIIIIl() {
        return this.llllIIllllIlIlIIIIll == net.minecraft.client.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI.IlIlIIIllIIllIlllllI;
    }
    
    public boolean lIIIIlIIIIIlllIllIII() {
        return this.IlIlIIIllIIllIlllllI;
    }
    
    public IngestServer lIIIlllIIIllIIIllIII() {
        return this.IIllIIllIIIlIlIIIIlI;
    }
    
    public void llllIIIIlIIIlIlllIll(final IngestServer iIllIIllIIIlIlIIIIlI) {
        this.IIllIIllIIIlIlIIIIlI = iIllIIllIIIlIlIIIIlI;
    }
    
    public IngestList llIIlIIIlIIIllIlIIIl() {
        return this.IlIlIIIIIIlllIlIllIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final float n) {
        this.lIIIlllIIIllIIIllIII.setVolume(AudioDeviceType.TTV_RECORDER_DEVICE, n);
    }
    
    public void IlIlIlIlIlllllllllIl(final float n) {
        this.lIIIlllIIIllIIIllIII.setVolume(AudioDeviceType.TTV_PLAYBACK_DEVICE, n);
    }
    
    public llllIIllllIlIlIIIIll llIllIlIIIIllIlIIllI() {
        return this.IIlllIlIIllIlIlIlIIl;
    }
    
    public long lIlIlIIIllIIllIIIllI() {
        return this.lIIIlllIIIllIIIllIII.getStreamTime();
    }
    
    protected boolean IlIlIIIllIIllIlllllI() {
        return true;
    }
    
    public ErrorCode IIIIlllIIIIIIlIIIlll() {
        return this.IIlIIIIIllIlIIIlIIll;
    }
    
    public llllIIIIlIIIlIlllIll() {
        this.IIlllIIIlIlllIIlllII = null;
        this.llIllIIIIIllIlIIIIlI = null;
        this.IlIIIlIlIIIllIlIlIIl = "";
        this.IlIlIIIllIllIIIIIllI = "";
        this.IllIIlllIIIIlllIIlIl = "";
        this.llllIIIlIlllIlIIIIIl = true;
        this.lIIIIlIIIIIlllIllIII = null;
        this.lIIIlllIIIllIIIllIII = null;
        this.llIIlIIIlIIIllIlIIIl = Lists.newArrayList();
        this.llIllIlIIIIllIlIIllI = Lists.newArrayList();
        this.lIlIlIIIllIIllIIIllI = false;
        this.IlIlIIIllIIllIlllllI = false;
        this.IIIIlllIIIIIIlIIIlll = false;
        this.llllIIllllIlIlIIIIll = net.minecraft.client.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll;
        this.IlIllIlIlIIIlIlIlIII = null;
        this.IIlllIIlIllIllIlIIll = null;
        this.lllIIIIlllllIlIIllIl = null;
        this.IlIlIIIIIIlllIlIllIl = new IngestList(new IngestServer[0]);
        this.IIllIIllIIIlIlIIIIlI = null;
        this.IIIlIIIlIlIIlllIIlll = new AuthToken();
        this.IlIlIIIlIIlIlIIlllIl = new ChannelInfo();
        this.IlllllllIIIlIIIlIlII = new UserInfo();
        this.IIlIIIIlllIlllllIlII = new StreamInfo();
        this.IIIlIIlIIIIlllIlllII = new ArchivingState();
        this.IlIlIllllllllIIIIlII = 0L;
        this.IIlllIlIIllIlIlIlIIl = null;
        this.llIIIlIlIllIIlIlIlII = (IStreamCallbacks)new IlIlIlIlIlllllllllIl(this);
        this.lllllIlIIIlIlIIlllII = (IStatCallbacks)new llIllIIIIIllIlIIIIlI(this);
        this.lIIIIlIIIIIlllIllIII = Core.getInstance();
        if (Core.getInstance() == null) {
            this.lIIIIlIIIIIlllIllIII = new Core((CoreAPI)new StandardCoreAPI());
        }
        this.lIIIlllIIIllIIIllIII = new Stream((StreamAPI)new DesktopStreamAPI());
    }
    
    protected PixelFormat llllIIllllIlIlIIIIll() {
        return PixelFormat.TTV_PF_RGBA;
    }
    
    public boolean IlIllIlIlIIIlIlIlIII() {
        if (this.lIlIlIIIllIIllIIIllI) {
            return false;
        }
        this.lIIIlllIIIllIIIllIII.setStreamCallbacks(this.llIIIlIlIllIIlIlIlII);
        final ErrorCode initialize = this.lIIIIlIIIIIlllIllIII.initialize(this.IlIIIlIlIIIllIlIlIIl, System.getProperty("java.library.path"));
        if (!this.llllIIIIlIIIlIlllIll(initialize)) {
            this.lIIIlllIIIllIIIllIII.setStreamCallbacks((IStreamCallbacks)null);
            this.IIlIIIIIllIlIIIlIIll = initialize;
            return false;
        }
        final ErrorCode setTraceLevel = this.lIIIIlIIIIIlllIllIII.setTraceLevel(MessageLevel.TTV_ML_ERROR);
        if (!this.llllIIIIlIIIlIlllIll(setTraceLevel)) {
            this.lIIIlllIIIllIIIllIII.setStreamCallbacks((IStreamCallbacks)null);
            this.lIIIIlIIIIIlllIllIII.shutdown();
            this.IIlIIIIIllIlIIIlIIll = setTraceLevel;
            return false;
        }
        if (ErrorCode.succeeded(setTraceLevel)) {
            this.lIlIlIIIllIIllIIIllI = true;
            this.llllIIIIlIIIlIlllIll(net.minecraft.client.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl);
            return true;
        }
        this.IIlIIIIIllIlIIIlIIll = setTraceLevel;
        this.lIIIIlIIIIIlllIllIII.shutdown();
        return false;
    }
    
    public boolean IIlllIIlIllIllIlIIll() {
        if (!this.lIlIlIIIllIIllIIIllI) {
            return true;
        }
        if (this.IllIIlllIIIIlllIIlIl()) {
            return false;
        }
        this.IIIIlllIIIIIIlIIIlll = true;
        this.IlIlIIIIIIlllIlIllIl();
        this.lIIIlllIIIllIIIllIII.setStreamCallbacks((IStreamCallbacks)null);
        this.lIIIlllIIIllIIIllIII.setStatCallbacks((IStatCallbacks)null);
        this.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII.shutdown());
        this.lIlIlIIIllIIllIIIllI = false;
        this.IIIIlllIIIIIIlIIIlll = false;
        this.llllIIIIlIIIlIlllIll(net.minecraft.client.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll);
        return true;
    }
    
    public void lllIIIIlllllIlIIllIl() {
        if (this.llllIIllllIlIlIIIIll != net.minecraft.client.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll) {
            if (this.IIlllIlIIllIlIlIlIIl != null) {
                this.IIlllIlIIllIlIlIlIIl.llllIIIlIlllIlIIIIIl();
            }
            while (this.IIlllIlIIllIlIlIlIIl != null) {
                try {
                    Thread.sleep(200L);
                }
                catch (Exception ex) {
                    this.IlIlIlIlIlllllllllIl(ex.toString());
                }
                this.IIlIIIIlllIlllllIlII();
            }
            this.IIlllIIlIllIllIlIIll();
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll(final String ilIllIlIlIIIlIlIlIII, final AuthToken iiIlIIIlIlIIlllIIlll) {
        if (this.IllIIlllIIIIlllIIlIl()) {
            return false;
        }
        this.IlIlIIIIIIlllIlIllIl();
        if (ilIllIlIlIIIlIlIlIII == null || ilIllIlIlIIIlIlIlIII.isEmpty()) {
            this.IlIlIlIlIlllllllllIl("Username must be valid");
            return false;
        }
        if (iiIlIIIlIlIIlllIIlll != null && iiIlIIIlIlIIlllIIlll.data != null && !iiIlIIIlIlIIlllIIlll.data.isEmpty()) {
            this.IlIllIlIlIIIlIlIlIII = ilIllIlIlIIIlIlIlIII;
            this.IIIlIIIlIlIIlllIIlll = iiIlIIIlIlIIlllIIlll;
            if (this.llllIIIIlIIIlIlllIll()) {
                this.llllIIIIlIIIlIlllIll(net.minecraft.client.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl);
            }
            return true;
        }
        this.IlIlIlIlIlllllllllIl("Auth token must be valid");
        return false;
    }
    
    public boolean IlIlIIIIIIlllIlIllIl() {
        if (this.IllIIlllIIIIlllIIlIl()) {
            return false;
        }
        if (this.IlIIIlIlIIIllIlIlIIl()) {
            this.lIIIlllIIIllIIIllIII.stop(false);
        }
        this.IlIllIlIlIIIlIlIlIII = "";
        this.IIIlIIIlIlIIlllIIlll = new AuthToken();
        if (!this.IlIlIIIllIIllIlllllI) {
            return false;
        }
        this.IlIlIIIllIIllIlllllI = false;
        if (!this.IIIIlllIIIIIIlIIIlll) {
            try {
                if (this.llIllIIIIIllIlIIIIlI != null) {
                    this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll();
                }
            }
            catch (Exception ex) {
                this.IlIlIlIlIlllllllllIl(ex.toString());
            }
        }
        this.llllIIIIlIIIlIlllIll(net.minecraft.client.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl);
        return true;
    }
    
    public boolean llllIIIIlIIIlIlllIll(String ilIllIlIlIIIlIlIlIII, String gameName, String streamTitle) {
        if (!this.IlIlIIIllIIllIlllllI) {
            return false;
        }
        if (ilIllIlIlIIIlIlIlIII == null || ilIllIlIlIIIlIlIlIII.equals("")) {
            ilIllIlIlIIIlIlIlIII = this.IlIllIlIlIIIlIlIlIII;
        }
        if (gameName == null) {
            gameName = "";
        }
        if (streamTitle == null) {
            streamTitle = "";
        }
        final StreamInfoForSetting streamInfoForSetting = new StreamInfoForSetting();
        streamInfoForSetting.streamTitle = streamTitle;
        streamInfoForSetting.gameName = gameName;
        final ErrorCode setStreamInfo = this.lIIIlllIIIllIIIllIII.setStreamInfo(this.IIIlIIIlIlIIlllIIlll, ilIllIlIlIIIlIlIlIII, streamInfoForSetting);
        this.llllIIIIlIIIlIlllIll(setStreamInfo);
        return ErrorCode.succeeded(setStreamInfo);
    }
    
    public boolean IIllIIllIIIlIlIIIIlI() {
        if (!this.IlIIIlIlIIIllIlIlIIl()) {
            return false;
        }
        final ErrorCode runCommercial = this.lIIIlllIIIllIIIllIII.runCommercial(this.IIIlIIIlIlIIlllIIlll);
        this.llllIIIIlIIIlIlllIll(runCommercial);
        return ErrorCode.succeeded(runCommercial);
    }
    
    public VideoParams llllIIIIlIIIlIlllIll(final int maxKbps, final int targetFps, final float n, final float n2) {
        final int[] maxResolution = this.lIIIlllIIIllIIIllIII.getMaxResolution(maxKbps, targetFps, n, n2);
        final VideoParams videoParams = new VideoParams();
        videoParams.maxKbps = maxKbps;
        videoParams.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_HIGH;
        videoParams.pixelFormat = this.llllIIllllIlIlIIIIll();
        videoParams.targetFps = targetFps;
        videoParams.outputWidth = maxResolution[0];
        videoParams.outputHeight = maxResolution[1];
        videoParams.disableAdaptiveBitrate = false;
        videoParams.verticalFlip = false;
        return videoParams;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final VideoParams videoParams) {
        if (videoParams == null || !this.IlIlIIIllIllIIIIIllI()) {
            return false;
        }
        this.IIlllIIlIllIllIlIIll = videoParams.clone();
        this.lllIIIIlllllIlIIllIl = new AudioParams();
        this.lllIIIIlllllIlIIllIl.audioEnabled = (this.llllIIIlIlllIlIIIIIl && this.IlIlIIIllIIllIlllllI());
        this.lllIIIIlllllIlIIllIl.enableMicCapture = this.lllIIIIlllllIlIIllIl.audioEnabled;
        this.lllIIIIlllllIlIIllIl.enablePlaybackCapture = this.lllIIIIlllllIlIIllIl.audioEnabled;
        this.lllIIIIlllllIlIIllIl.enablePassthroughAudio = false;
        if (!this.IIlllIlIIllIlIlIlIIl()) {
            this.IIlllIIlIllIllIlIIll = null;
            this.lllIIIIlllllIlIIllIl = null;
            return false;
        }
        final ErrorCode start = this.lIIIlllIIIllIIIllIII.start(videoParams, this.lllIIIIlllllIlIIllIl, this.IIllIIllIIIlIlIIIIlI, StartFlags.None, true);
        if (ErrorCode.failed(start)) {
            this.llIIIlIlIllIIlIlIlII();
            this.IlIlIlIlIlllllllllIl(String.format("Error while starting to broadcast: %s", ErrorCode.getString(start)));
            this.IIlllIIlIllIllIlIIll = null;
            this.lllIIIIlllllIlIIllIl = null;
            return false;
        }
        this.llllIIIIlIIIlIlllIll(net.minecraft.client.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl);
        return true;
    }
    
    public boolean IIIlIIIlIlIIlllIIlll() {
        if (!this.IlIIIlIlIIIllIlIlIIl()) {
            return false;
        }
        final ErrorCode stop = this.lIIIlllIIIllIIIllIII.stop(true);
        if (ErrorCode.failed(stop)) {
            this.IlIlIlIlIlllllllllIl(String.format("Error while stopping the broadcast: %s", ErrorCode.getString(stop)));
            return false;
        }
        this.llllIIIIlIIIlIlllIll(net.minecraft.client.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI.lIlIlIIIllIIllIIIllI);
        return ErrorCode.succeeded(stop);
    }
    
    public boolean IlIlIIIlIIlIlIIlllIl() {
        if (!this.IlIIIlIlIIIllIlIlIIl()) {
            return false;
        }
        final ErrorCode pauseVideo = this.lIIIlllIIIllIIIllIII.pauseVideo();
        if (ErrorCode.failed(pauseVideo)) {
            this.IIIlIIIlIlIIlllIIlll();
            this.IlIlIlIlIlllllllllIl(String.format("Error pausing stream: %s\n", ErrorCode.getString(pauseVideo)));
        }
        else {
            this.llllIIIIlIIIlIlllIll(net.minecraft.client.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI.IlIlIIIllIIllIlllllI);
        }
        return ErrorCode.succeeded(pauseVideo);
    }
    
    public boolean IlllllllIIIlIIIlIlII() {
        if (!this.llllIIIlIlllIlIIIIIl()) {
            return false;
        }
        this.llllIIIIlIIIlIlllIll(net.minecraft.client.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI.llIllIlIIIIllIlIIllI);
        return true;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final String s, final long n, final String s2, final String s3) {
        final ErrorCode sendActionMetaData = this.lIIIlllIIIllIIIllIII.sendActionMetaData(this.IIIlIIIlIlIIlllIIlll, s, n, s2, s3);
        if (ErrorCode.failed(sendActionMetaData)) {
            this.IlIlIlIlIlllllllllIl(String.format("Error while sending meta data: %s\n", ErrorCode.getString(sendActionMetaData)));
            return false;
        }
        return true;
    }
    
    public long IlIlIlIlIlllllllllIl(final String s, final long n, final String s2, final String s3) {
        final long sendStartSpanMetaData = this.lIIIlllIIIllIIIllIII.sendStartSpanMetaData(this.IIIlIIIlIlIIlllIIlll, s, n, s2, s3);
        if (sendStartSpanMetaData == -1L) {
            this.IlIlIlIlIlllllllllIl(String.format("Error in SendStartSpanMetaData\n", new Object[0]));
        }
        return sendStartSpanMetaData;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final String s, final long n, final long n2, final String s2, final String s3) {
        if (n2 == -1L) {
            this.IlIlIlIlIlllllllllIl(String.format("Invalid sequence id: %d\n", n2));
            return false;
        }
        final ErrorCode sendEndSpanMetaData = this.lIIIlllIIIllIIIllIII.sendEndSpanMetaData(this.IIIlIIIlIlIIlllIIlll, s, n, n2, s2, s3);
        if (ErrorCode.failed(sendEndSpanMetaData)) {
            this.IlIlIlIlIlllllllllIl(String.format("Error in SendStopSpanMetaData: %s\n", ErrorCode.getString(sendEndSpanMetaData)));
            return false;
        }
        return true;
    }
    
    protected void llllIIIIlIIIlIlllIll(final IlIlIIIllIllIIIIIllI llllIIllllIlIlIIIIll) {
        if (llllIIllllIlIlIIIIll != this.llllIIllllIlIlIIIIll) {
            this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
            try {
                if (this.llIllIIIIIllIlIIIIlI != null) {
                    this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll);
                }
            }
            catch (Exception ex) {
                this.IlIlIlIlIlllllllllIl(ex.toString());
            }
        }
    }
    
    public void IIlIIIIlllIlllllIlII() {
        if (this.lIIIlllIIIllIIIllIII != null && this.lIlIlIIIllIIllIIIllI) {
            this.llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII.pollTasks());
            if (this.IllIIlllIIIIlllIIlIl()) {
                this.IIlllIlIIllIlIlIlIIl.IllIIlllIIIIlllIIlIl();
                if (this.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI()) {
                    this.IIlllIlIIllIlIlIlIIl = null;
                    this.llllIIIIlIIIlIlllIll(net.minecraft.client.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI.lIIIlllIIIllIIIllIII);
                }
            }
            switch (lIllllllIIllIlIlIlII()[this.llllIIllllIlIlIIIIll.ordinal()]) {
                case 4: {
                    this.llllIIIIlIIIlIlllIll(net.minecraft.client.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI);
                    final ErrorCode login = this.lIIIlllIIIllIIIllIII.login(this.IIIlIIIlIlIIlllIIlll);
                    if (ErrorCode.failed(login)) {
                        this.IlIlIlIlIlllllllllIl(String.format("Error in TTV_Login: %s\n", ErrorCode.getString(login)));
                        break;
                    }
                    break;
                }
                case 6: {
                    this.llllIIIIlIIIlIlllIll(net.minecraft.client.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI.llllIIIlIlllIlIIIIIl);
                    final ErrorCode ingestServers = this.lIIIlllIIIllIIIllIII.getIngestServers(this.IIIlIIIlIlIIlllIIlll);
                    if (ErrorCode.failed(ingestServers)) {
                        this.llllIIIIlIIIlIlllIll(net.minecraft.client.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl);
                        this.IlIlIlIlIlllllllllIl(String.format("Error in TTV_GetIngestServers: %s\n", ErrorCode.getString(ingestServers)));
                        break;
                    }
                    break;
                }
                case 8: {
                    this.llllIIIIlIIIlIlllIll(net.minecraft.client.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI.lIIIlllIIIllIIIllIII);
                    final ErrorCode userInfo = this.lIIIlllIIIllIIIllIII.getUserInfo(this.IIIlIIIlIlIIlllIIlll);
                    if (ErrorCode.failed(userInfo)) {
                        this.IlIlIlIlIlllllllllIl(String.format("Error in TTV_GetUserInfo: %s\n", ErrorCode.getString(userInfo)));
                    }
                    this.IIIlIIlIIIIlllIlllII();
                    final ErrorCode archivingState = this.lIIIlllIIIllIIIllIII.getArchivingState(this.IIIlIIIlIlIIlllIIlll);
                    if (ErrorCode.failed(archivingState)) {
                        this.IlIlIlIlIlllllllllIl(String.format("Error in TTV_GetArchivingState: %s\n", ErrorCode.getString(archivingState)));
                        break;
                    }
                    break;
                }
                case 11:
                case 13: {
                    this.IIIlIIlIIIIlllIlllII();
                    break;
                }
            }
        }
    }
    
    protected void IIIlIIlIIIIlllIlllII() {
        final long nanoTime = System.nanoTime();
        if ((nanoTime - this.IlIlIllllllllIIIIlII) / 1000000000L >= 30L) {
            this.IlIlIllllllllIIIIlII = nanoTime;
            final ErrorCode streamInfo = this.lIIIlllIIIllIIIllIII.getStreamInfo(this.IIIlIIIlIlIIlllIIlll, this.IlIllIlIlIIIlIlIlIII);
            if (ErrorCode.failed(streamInfo)) {
                this.IlIlIlIlIlllllllllIl(String.format("Error in TTV_GetStreamInfo: %s", ErrorCode.getString(streamInfo)));
            }
        }
    }
    
    public llllIIllllIlIlIIIIll IlIlIllllllllIIIIlII() {
        if (!this.IlIlIIIllIllIIIIIllI() || this.IlIlIIIIIIlllIlIllIl == null) {
            return null;
        }
        if (this.IllIIlllIIIIlllIIlIl()) {
            return null;
        }
        (this.IIlllIlIIllIlIlIlIIl = new llllIIllllIlIlIIIIll(this.lIIIlllIIIllIIIllIII, this.IlIlIIIIIIlllIlIllIl)).IlIlIIIllIllIIIIIllI();
        this.llllIIIIlIIIlIlllIll(net.minecraft.client.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI.IIIIlllIIIIIIlIIIlll);
        return this.IIlllIlIIllIlIlIlIIl;
    }
    
    protected boolean IIlllIlIIllIlIlIlIIl() {
        for (int i = 0; i < 3; ++i) {
            final FrameBuffer allocateFrameBuffer = this.lIIIlllIIIllIIIllIII.allocateFrameBuffer(this.IIlllIIlIllIllIlIIll.outputWidth * this.IIlllIIlIllIllIlIIll.outputHeight * 4);
            if (!allocateFrameBuffer.getIsValid()) {
                this.IlIlIlIlIlllllllllIl(String.format("Error while allocating frame buffer", new Object[0]));
                return false;
            }
            this.llIIlIIIlIIIllIlIIIl.add(allocateFrameBuffer);
            this.llIllIlIIIIllIlIIllI.add(allocateFrameBuffer);
        }
        return true;
    }
    
    protected void llIIIlIlIllIIlIlIlII() {
        for (int i = 0; i < this.llIIlIIIlIIIllIlIIIl.size(); ++i) {
            ((FrameBuffer)this.llIIlIIIlIIIllIlIIIl.get(i)).free();
        }
        this.llIllIlIIIIllIlIIllI.clear();
        this.llIIlIIIlIIIllIlIIIl.clear();
    }
    
    public FrameBuffer lllllIlIIIlIlIIlllII() {
        if (this.llIllIlIIIIllIlIIllI.size() == 0) {
            this.IlIlIlIlIlllllllllIl(String.format("Out of free buffers, this should never happen", new Object[0]));
            return null;
        }
        final FrameBuffer frameBuffer = this.llIllIlIIIIllIlIIllI.get(this.llIllIlIIIIllIlIIllI.size() - 1);
        this.llIllIlIIIIllIlIIllI.remove(this.llIllIlIIIIllIlIIllI.size() - 1);
        return frameBuffer;
    }
    
    public void llllIIIIlIIIlIlllIll(final FrameBuffer frameBuffer) {
        try {
            this.lIIIlllIIIllIIIllIII.captureFrameBuffer_ReadPixels(frameBuffer);
        }
        catch (Throwable t) {
            final net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t, "Trying to submit a frame to Twitch");
            final lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("Broadcast State");
            llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Last reported errors", Arrays.toString(net.minecraft.client.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll.llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl()));
            llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Buffer", frameBuffer);
            llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Free buffer count", this.llIllIlIIIIllIlIIllI.size());
            llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Capture buffer count", this.llIIlIIIlIIIllIlIIIl.size());
            throw new IIlIlllIlIlllIlIllll(llllIIIIlIIIlIlllIll);
        }
    }
    
    public ErrorCode IlIlIlIlIlllllllllIl(final FrameBuffer frameBuffer) {
        if (this.llllIIIlIlllIlIIIIIl()) {
            this.IlllllllIIIlIIIlIlII();
        }
        else if (!this.IlIIIlIlIIIllIlIlIIl()) {
            return ErrorCode.TTV_EC_STREAM_NOT_STARTED;
        }
        final ErrorCode submitVideoFrame = this.lIIIlllIIIllIIIllIII.submitVideoFrame(frameBuffer);
        if (submitVideoFrame != ErrorCode.TTV_EC_SUCCESS) {
            final String string = ErrorCode.getString(submitVideoFrame);
            if (ErrorCode.succeeded(submitVideoFrame)) {
                this.llIllIIIIIllIlIIIIlI(String.format("Warning in SubmitTexturePointer: %s\n", string));
            }
            else {
                this.IlIlIlIlIlllllllllIl(String.format("Error in SubmitTexturePointer: %s\n", string));
                this.IIIlIIIlIlIIlllIIlll();
            }
            if (this.llIllIIIIIllIlIIIIlI != null) {
                this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(submitVideoFrame);
            }
        }
        return submitVideoFrame;
    }
    
    protected boolean llllIIIIlIIIlIlllIll(final ErrorCode errorCode) {
        if (ErrorCode.failed(errorCode)) {
            this.IlIlIlIlIlllllllllIl(ErrorCode.getString(errorCode));
            return false;
        }
        return true;
    }
    
    protected void IlIlIlIlIlllllllllIl(final String iIlllIIIlIlllIIlllII) {
        this.IIlllIIIlIlllIIlllII = iIlllIIIlIlllIIlllII;
        net.minecraft.client.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll("<Error> " + iIlllIIIlIlllIIlllII);
        net.minecraft.client.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII.error(net.minecraft.client.IlIlIIIllIIllIlllllI.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll, "[Broadcast controller] {}", new Object[] { iIlllIIIlIlllIIlllII });
    }
    
    protected void llIllIIIIIllIlIIIIlI(final String s) {
        net.minecraft.client.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll("<Warning> " + s);
        net.minecraft.client.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII.warn(net.minecraft.client.IlIlIIIllIIllIlllllI.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll, "[Broadcast controller] {}", new Object[] { s });
    }
    
    static /* synthetic */ int[] lIllllllIIllIlIlIlII() {
        final int[] llllllIllIllIlIllllI = llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI;
        if (llllllIllIllIlIllllI != null) {
            return llllllIllIllIlIllllI;
        }
        final int[] llllllIllIllIlIllllI2 = new int[IlIlIIIllIllIIIIIllI.values().length];
        try {
            llllllIllIllIlIllllI2[IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            llllllIllIllIlIllllI2[IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            llllllIllIllIlIllllI2[IlIlIIIllIllIIIIIllI.llIllIlIIIIllIlIIllI.ordinal()] = 11;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            llllllIllIllIlIllllI2[IlIlIIIllIllIIIIIllI.llllIIIlIlllIlIIIIIl.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            llllllIllIllIlIllllI2[IlIlIIIllIllIIIIIllI.IIIIlllIIIIIIlIIIlll.ordinal()] = 14;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            llllllIllIllIlIllllI2[IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        try {
            llllllIllIllIlIllllI2[IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError7) {}
        try {
            llllllIllIllIlIllllI2[IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError8) {}
        try {
            llllllIllIllIlIllllI2[IlIlIIIllIllIIIIIllI.IlIlIIIllIIllIlllllI.ordinal()] = 13;
        }
        catch (NoSuchFieldError noSuchFieldError9) {}
        try {
            llllllIllIllIlIllllI2[IlIlIIIllIllIIIIIllI.lIIIlllIIIllIIIllIII.ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError10) {}
        try {
            llllllIllIllIlIllllI2[IlIlIIIllIllIIIIIllI.lIIIIlIIIIIlllIllIII.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError11) {}
        try {
            llllllIllIllIlIllllI2[IlIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl.ordinal()] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError12) {}
        try {
            llllllIllIllIlIllllI2[IlIlIIIllIllIIIIIllI.lIlIlIIIllIIllIIIllI.ordinal()] = 12;
        }
        catch (NoSuchFieldError noSuchFieldError13) {}
        try {
            llllllIllIllIlIllllI2[IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError14) {}
        return llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI = llllllIllIllIlIllllI2;
    }
}
