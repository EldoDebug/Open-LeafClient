package net.minecraft.client.llllIIIIlIIIlIlllIll;

import net.minecraft.client.llIllIlIIIIllIlIIllI.*;
import org.apache.logging.log4j.*;
import com.google.common.collect.*;
import paulscode.sound.libraries.*;
import paulscode.sound.codecs.*;
import paulscode.sound.*;
import io.netty.util.internal.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.net.*;

public class IlllllllIIIlIIIlIlII
{
    private static final Marker llllIIIIlIIIlIlllIll;
    private static final Logger IlIlIlIlIlllllllllIl;
    private final IlIllIlIlIIIlIlIlIII llIllIIIIIllIlIIIIlI;
    private final llllIIIIlIIIlIlllIll IlIIIlIlIIIllIlIlIIl;
    private llIIIlIlIllIIlIlIlII IlIlIIIllIllIIIIIllI;
    private boolean IllIIlllIIIIlllIIlIl;
    private int llllIIIlIlllIlIIIIIl;
    private final Map lIIIIlIIIIIlllIllIII;
    private final Map lIIIlllIIIllIIIllIII;
    private Map llIIlIIIlIIIllIlIIIl;
    private final Multimap llIllIlIIIIllIlIIllI;
    private final List lIlIlIIIllIIllIIIllI;
    private final Map IlIlIIIllIIllIlllllI;
    private final Map IIIIlllIIIIIIlIIIlll;
    
    static {
        llllIIIIlIIIlIlllIll = MarkerManager.getMarker("SOUNDS");
        IlIlIlIlIlllllllllIl = LogManager.getLogger();
    }
    
    public IlllllllIIIlIIIlIlII(final IlIllIlIlIIIlIlIlIII llIllIIIIIllIlIIIIlI, final llllIIIIlIIIlIlllIll ilIIIlIlIIIllIlIlIIl) {
        this.llllIIIlIlllIlIIIIIl = 0;
        this.lIIIIlIIIIIlllIllIII = (Map)HashBiMap.create();
        this.lIIIlllIIIllIIIllIII = (Map)((BiMap)this.lIIIIlIIIIIlllIllIII).inverse();
        this.llIIlIIIlIIIllIlIIIl = Maps.newHashMap();
        this.llIllIlIIIIllIlIIllI = (Multimap)HashMultimap.create();
        this.lIlIlIIIllIIllIIIllI = Lists.newArrayList();
        this.IlIlIIIllIIllIlllllI = Maps.newHashMap();
        this.IIIIlllIIIIIIlIIIlll = Maps.newHashMap();
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        try {
            SoundSystemConfig.addLibrary((Class)LibraryLWJGLOpenAL.class);
            SoundSystemConfig.setCodec("ogg", (Class)CodecJOrbis.class);
        }
        catch (SoundSystemException ex) {
            IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.error(IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll, "Error linking with the LibraryJavaSound plug-in", (Throwable)ex);
        }
    }
    
    public void llllIIIIlIIIlIlllIll() {
        this.IlIlIlIlIlllllllllIl();
        this.lIIIlllIIIllIIIllIII();
    }
    
    private synchronized void lIIIlllIIIllIIIllIII() {
        if (!this.IllIIlllIIIIlllIIlIl) {
            try {
                new Thread(new IIlIIIIlllIlllllIlII(this), "Sound Library Loader").start();
            }
            catch (RuntimeException ex) {
                IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.error(IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll, "Error starting SoundSystem. Turning off sounds & music", (Throwable)ex);
                this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.client.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll, 0.0f);
                this.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl();
            }
        }
    }
    
    private float llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        return (ilIlIIIllIIllIlllllI != null && ilIlIIIllIIllIlllllI != net.minecraft.client.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll) ? this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI) : 1.0f;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final float masterVolume) {
        if (this.IllIIlllIIIIlllIIlIl) {
            if (ilIlIIIllIIllIlllllI == net.minecraft.client.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll) {
                this.IlIlIIIllIllIIIIIllI.setMasterVolume(masterVolume);
            }
            else {
                for (final String s : this.llIllIlIIIIllIlIIllI.get((Object)ilIlIIIllIIllIlllllI)) {
                    final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = this.lIIIIlIIIIIlllIllIII.get(s);
                    final float llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, this.llIIlIIIlIIIllIlIIIl.get(ilIlIlIlIlllllllllIl), ilIlIIIllIIllIlllllI);
                    if (llllIIIIlIIIlIlllIll <= 0.0f) {
                        this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
                    }
                    else {
                        this.IlIlIIIllIllIIIIIllI.setVolume(s, llllIIIIlIIIlIlllIll);
                    }
                }
            }
        }
    }
    
    public void IlIlIlIlIlllllllllIl() {
        if (this.IllIIlllIIIIlllIIlIl) {
            this.llIllIIIIIllIlIIIIlI();
            this.IlIlIIIllIllIIIIIllI.cleanup();
            this.IllIIlllIIIIlllIIlIl = false;
        }
    }
    
    public void llIllIIIIIllIlIIIIlI() {
        if (this.IllIIlllIIIIlllIIlIl) {
            final Iterator<String> iterator = this.lIIIIlIIIIIlllIllIII.keySet().iterator();
            while (iterator.hasNext()) {
                this.IlIlIIIllIllIIIIIllI.stop((String)iterator.next());
            }
            this.lIIIIlIIIIIlllIllIII.clear();
            this.IlIlIIIllIIllIlllllI.clear();
            this.lIlIlIIIllIIllIIIllI.clear();
            this.llIllIlIIIIllIlIIllI.clear();
            this.llIIlIIIlIIIllIlIIIl.clear();
            this.IIIIlllIIIIIIlIIIlll.clear();
        }
    }
    
    public void IlIIIlIlIIIllIlIlIIl() {
        ++this.llllIIIlIlllIlIIIIIl;
        for (final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI : this.lIlIlIIIllIIllIIIllI) {
            ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll();
            if (ilIlIIIllIllIIIIIllI.llIllIlIIIIllIlIIllI()) {
                this.IlIlIlIlIlllllllllIl(ilIlIIIllIllIIIIIllI);
            }
            else {
                final String s = this.lIIIlllIIIllIIIllIII.get(ilIlIIIllIllIIIIIllI);
                this.IlIlIIIllIllIIIIIllI.setVolume(s, this.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, this.llIIlIIIlIIIllIlIIIl.get(ilIlIIIllIllIIIIIllI), this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl()).IlIlIIIllIllIIIIIllI()));
                this.IlIlIIIllIllIIIIIllI.setPitch(s, this.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, this.llIIlIIIlIIIllIlIIIl.get(ilIlIIIllIllIIIIIllI)));
                this.IlIlIIIllIllIIIIIllI.setPosition(s, ilIlIIIllIllIIIIIllI.llllIIIlIlllIlIIIIIl(), ilIlIIIllIllIIIIIllI.lIIIIlIIIIIlllIllIII(), ilIlIIIllIllIIIIIllI.lIIIlllIIIllIIIllIII());
            }
        }
        final Iterator<Map.Entry<String, V>> iterator2 = this.lIIIIlIIIIIlllIllIII.entrySet().iterator();
        while (iterator2.hasNext()) {
            final Map.Entry<String, V> entry = iterator2.next();
            final String s2 = entry.getKey();
            final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = (IlIlIlIlIlllllllllIl)entry.getValue();
            if (!this.IlIlIIIllIllIIIIIllI.playing(s2) && (int)this.IIIIlllIIIIIIlIIIlll.get(s2) <= this.llllIIIlIlllIlIIIIIl) {
                final int ilIIIlIlIIIllIlIlIIl = ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl();
                if (ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI() && ilIIIlIlIIIllIlIlIIl > 0) {
                    this.IlIlIIIllIIllIlllllI.put(ilIlIlIlIlllllllllIl, this.llllIIIlIlllIlIIIIIl + ilIIIlIlIIIllIlIlIIl);
                }
                iterator2.remove();
                IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.debug(IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll, "Removed channel {} because it's not playing anymore", new Object[] { s2 });
                this.IlIlIIIllIllIIIIIllI.removeSource(s2);
                this.IIIIlllIIIIIIlIIIlll.remove(s2);
                this.llIIlIIIlIIIllIlIIIl.remove(ilIlIlIlIlllllllllIl);
                try {
                    this.llIllIlIIIIllIlIIllI.remove((Object)this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()).IlIlIIIllIllIIIIIllI(), (Object)s2);
                }
                catch (RuntimeException ex) {}
                if (!(ilIlIlIlIlllllllllIl instanceof IlIlIIIllIllIIIIIllI)) {
                    continue;
                }
                this.lIlIlIIIllIIllIIIllI.remove(ilIlIlIlIlllllllllIl);
            }
        }
        final Iterator<Map.Entry<K, Integer>> iterator3 = this.IlIlIIIllIIllIlllllI.entrySet().iterator();
        while (iterator3.hasNext()) {
            final Map.Entry<K, Integer> entry2 = iterator3.next();
            if (this.llllIIIlIlllIlIIIIIl >= entry2.getValue()) {
                final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = (IlIlIlIlIlllllllllIl)entry2.getKey();
                if (ilIlIlIlIlllllllllIl2 instanceof IlIlIIIllIllIIIIIllI) {
                    ((IlIlIIIllIllIIIIIllI)ilIlIlIlIlllllllllIl2).llllIIIIlIIIlIlllIll();
                }
                this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl2);
                iterator3.remove();
            }
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (!this.IllIIlllIIIIlllIIlIl) {
            return false;
        }
        final String s = this.lIIIlllIIIllIIIllIII.get(ilIlIlIlIlllllllllIl);
        return s != null && (this.IlIlIIIllIllIIIIIllI.playing(s) || (this.IIIIlllIIIIIIlIIIlll.containsKey(s) && (int)this.IIIIlllIIIIIIlIIIlll.get(s) <= this.llllIIIlIlllIlIIIIIl));
    }
    
    public void IlIlIlIlIlllllllllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (this.IllIIlllIIIIlllIIlIl) {
            final String s = this.lIIIlllIIIllIIIllIII.get(ilIlIlIlIlllllllllIl);
            if (s != null) {
                this.IlIlIIIllIllIIIIIllI.stop(s);
            }
        }
    }
    
    public void llIllIIIIIllIlIIIIlI(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (this.IllIIlllIIIIlllIIlIl) {
            if (this.IlIlIIIllIllIIIIIllI.getMasterVolume() <= 0.0f) {
                IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.debug(IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll, "Skipped playing soundEvent: {}, master volume was zero", new Object[] { ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl() });
            }
            else {
                final llllIIllllIlIlIIIIll llllIIIIlIIIlIlllIll = this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl());
                if (llllIIIIlIIIlIlllIll == null) {
                    IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.warn(IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll, "Unable to play unknown soundEvent: {}", new Object[] { ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl() });
                }
                else {
                    final lllllIlIIIlIlIIlllII llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
                    if (llIllIIIIIllIlIIIIlI == IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll) {
                        IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.warn(IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll, "Unable to play empty soundEvent: {}", new Object[] { llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl() });
                    }
                    else {
                        final float ilIlIIIllIllIIIIIllI = ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI();
                        float n = 16.0f;
                        if (ilIlIIIllIllIIIIIllI > 1.0f) {
                            n *= ilIlIIIllIllIIIIIllI;
                        }
                        final IlIlIIIllIIllIlllllI ilIlIIIllIllIIIIIllI2 = llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI();
                        final float llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llIllIIIIIllIlIIIIlI, ilIlIIIllIllIIIIIllI2);
                        final double n2 = this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llIllIIIIIllIlIIIIlI);
                        final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll3 = llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll();
                        if (llllIIIIlIIIlIlllIll2 == 0.0f) {
                            IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.debug(IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll, "Skipped playing sound {}, volume was zero.", new Object[] { llllIIIIlIIIlIlllIll3 });
                        }
                        else {
                            final boolean b = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI() && ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl() == 0;
                            final String string = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(ThreadLocalRandom.current()).toString();
                            if (llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl()) {
                                this.IlIlIIIllIllIIIIIllI.newStreamingSource(false, string, llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3), llllIIIIlIIIlIlllIll3.toString(), b, ilIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl(), ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(), ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(), ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl().llllIIIIlIIIlIlllIll(), n);
                            }
                            else {
                                this.IlIlIIIllIllIIIIIllI.newSource(false, string, llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3), llllIIIIlIIIlIlllIll3.toString(), b, ilIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl(), ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(), ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(), ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl().llllIIIIlIIIlIlllIll(), n);
                            }
                            IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.debug(IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll, "Playing sound {} for event {} as channel {}", new Object[] { llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(), llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(), string });
                            this.IlIlIIIllIllIIIIIllI.setPitch(string, (float)n2);
                            this.IlIlIIIllIllIIIIIllI.setVolume(string, llllIIIIlIIIlIlllIll2);
                            this.IlIlIIIllIllIIIIIllI.play(string);
                            this.IIIIlllIIIIIIlIIIlll.put(string, this.llllIIIlIlllIlIIIIIl + 20);
                            this.lIIIIlIIIIIlllIllIII.put(string, ilIlIlIlIlllllllllIl);
                            this.llIIlIIIlIIIllIlIIIl.put(ilIlIlIlIlllllllllIl, llIllIIIIIllIlIIIIlI);
                            if (ilIlIIIllIllIIIIIllI2 != net.minecraft.client.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll) {
                                this.llIllIlIIIIllIlIIllI.put((Object)ilIlIIIllIllIIIIIllI2, (Object)string);
                            }
                            if (ilIlIlIlIlllllllllIl instanceof IlIlIIIllIllIIIIIllI) {
                                this.lIlIlIIIllIIllIIIllI.add(ilIlIlIlIlllllllllIl);
                            }
                        }
                    }
                }
            }
        }
    }
    
    private float llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII) {
        return (float)llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl() * lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(), 0.5, 2.0);
    }
    
    private float llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        return (float)llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI() * lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(), 0.0, 1.0) * this.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI);
    }
    
    public void IlIlIIIllIllIIIIIllI() {
        for (final String s : this.lIIIIlIIIIIlllIllIII.keySet()) {
            IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.debug(IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll, "Pausing channel {}", new Object[] { s });
            this.IlIlIIIllIllIIIIIllI.pause(s);
        }
    }
    
    public void IllIIlllIIIIlllIIlIl() {
        for (final String s : this.lIIIIlIIIIIlllIllIII.keySet()) {
            IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.debug(IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll, "Resuming channel {}", new Object[] { s });
            this.IlIlIIIllIllIIIIIllI.play(s);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n) {
        this.IlIlIIIllIIllIlllllI.put(ilIlIlIlIlllllllllIl, this.llllIIIlIlllIlIIIIIl + n);
    }
    
    private static URL llllIIIIlIIIlIlllIll(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        final String format = String.format("%s:%s:%s", "mcsounddomain", lIllllIllIllIIllllll.llIllIIIIIllIlIIIIlI(), lIllllIllIllIIllllll.IlIlIlIlIlllllllllIl());
        final IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII = new IlIlIllllllllIIIIlII(lIllllIllIllIIllllll);
        try {
            return new URL(null, format, ilIlIllllllllIIIIlII);
        }
        catch (MalformedURLException ex) {
            throw new Error("TODO: Sanely handle url exception! :D");
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final float n) {
        if (this.IllIIlllIIIIlllIIlIl && llllIIIIlIIIlIlllIll != null) {
            final float n2 = llllIIIIlIIIlIlllIll.IlIIIlIIIllllIlIlIlI + (llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI - llllIIIIlIIIlIlllIll.IlIIIlIIIllllIlIlIlI) * n;
            final float n3 = llllIIIIlIIIlIlllIll.IIIllllllIllIIIlllIl + (llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll - llllIIIIlIIIlIlllIll.IIIllllllIllIIIlllIl) * n;
            final double n4 = llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII + (llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl - llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII) * n;
            final double n5 = llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII + (llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII - llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII) * n + llllIIIIlIIIlIlllIll.llllIlIllllIIlIIlIlI();
            final double n6 = llllIIIIlIIIlIlllIll.IlIlIllllllllIIIIlII + (llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII - llllIIIIlIIIlIlllIll.IlIlIllllllllIIIIlII) * n;
            final float ilIlIlIlIlllllllllIl = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl((n3 + 90.0f) * 0.017453292f);
            final float llllIIIIlIIIlIlllIll2 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((n3 + 90.0f) * 0.017453292f);
            final float ilIlIlIlIlllllllllIl2 = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(-n2 * 0.017453292f);
            final float llllIIIIlIIIlIlllIll3 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(-n2 * 0.017453292f);
            final float ilIlIlIlIlllllllllIl3 = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl((-n2 + 90.0f) * 0.017453292f);
            final float llllIIIIlIIIlIlllIll4 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((-n2 + 90.0f) * 0.017453292f);
            final float n7 = ilIlIlIlIlllllllllIl * ilIlIlIlIlllllllllIl2;
            final float n8 = llllIIIIlIIIlIlllIll2 * ilIlIlIlIlllllllllIl2;
            final float n9 = ilIlIlIlIlllllllllIl * ilIlIlIlIlllllllllIl3;
            final float n10 = llllIIIIlIIIlIlllIll2 * ilIlIlIlIlllllllllIl3;
            this.IlIlIIIllIllIIIIIllI.setListenerPosition((float)n4, (float)n5, (float)n6);
            this.IlIlIIIllIllIIIIIllI.setListenerOrientation(n7, llllIIIIlIIIlIlllIll3, n8, n9, llllIIIIlIIIlIlllIll4, n10);
        }
    }
}
