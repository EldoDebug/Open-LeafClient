package net.minecraft.client.llllIIIIlIIIlIlllIll;

import org.apache.logging.log4j.*;
import com.google.gson.*;
import java.lang.reflect.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.llIllIlIIIIllIlIIllI.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import org.apache.commons.io.*;
import java.io.*;
import com.google.common.collect.*;
import org.apache.commons.lang3.*;
import java.util.*;

public class IlIllIlIlIIIlIlIlIII implements llIIIllIlIllIllIIIIl, IIIIlllIIIIIIlIIIlll
{
    private static final Logger IlIlIlIlIlllllllllIl;
    private static final Gson llIllIIIIIllIlIIIIlI;
    private static final ParameterizedType IlIIIlIlIIIllIlIlIIl;
    public static final lllllIlIIIlIlIIlllII llllIIIIlIIIlIlllIll;
    private final lIllllllIIllIlIlIlII IlIlIIIllIllIIIIIllI;
    private final IlllllllIIIlIIIlIlII IllIIlllIIIIlllIIlIl;
    private final IlIlIIIllIIllIlllllI llllIIIlIlllIlIIIIIl;
    private static volatile /* synthetic */ int[] lIIIIlIIIIIlllIllIII;
    
    static {
        IlIlIlIlIlllllllllIl = LogManager.getLogger();
        llIllIIIIIllIlIIIIlI = new GsonBuilder().registerTypeAdapter((Type)IlIlIIIIIIlllIlIllIl.class, (Object)new IlIlIIIlIIlIlIIlllIl()).create();
        IlIIIlIlIIIllIlIlIIl = new IIlllIIlIllIllIlIIll();
        llllIIIIlIIIlIlllIll = new lllllIlIIIlIlIIlllII(new lIllllIllIllIIllllll("meta:missing_sound"), 0.0, 0.0, false);
    }
    
    public IlIllIlIlIIIlIlIlIII(final IlIlIIIllIIllIlllllI llllIIIlIlllIlIIIIIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.IlIlIIIllIllIIIIIllI = new lIllllllIIllIlIlIlII();
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.IllIIlllIIIIlllIIlIl = new IlllllllIIIlIIIlIlII(this, llllIIIIlIIIlIlllIll);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll();
        this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl();
        for (final String s : ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll()) {
            try {
                for (final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI : ilIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl(new lIllllIllIllIIllllll(s, "sounds.json"))) {
                    try {
                        for (final Map.Entry<String, V> entry : this.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl()).entrySet()) {
                            this.llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll(s, entry.getKey()), (IlIlIIIIIIlllIlIllIl)entry.getValue());
                        }
                    }
                    catch (RuntimeException ex) {
                        IlIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl.warn("Invalid sounds.json", (Throwable)ex);
                    }
                }
            }
            catch (IOException ex2) {}
        }
    }
    
    protected Map llllIIIIlIIIlIlllIll(final InputStream inputStream) {
        Map map;
        try {
            map = (Map)IlIllIlIlIIIlIlIlIII.llIllIIIIIllIlIIIIlI.fromJson((Reader)new InputStreamReader(inputStream), (Type)IlIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl);
        }
        finally {
            IOUtils.closeQuietly(inputStream);
        }
        IOUtils.closeQuietly(inputStream);
        return map;
    }
    
    private void llllIIIIlIIIlIlllIll(final lIllllIllIllIIllllll lIllllIllIllIIllllll, final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl) {
        final boolean b = !this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI(lIllllIllIllIIllllll);
        llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll;
        if (!b && !ilIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl()) {
            llllIIllllIlIlIIIIll = (llllIIllllIlIlIIIIll)this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll);
        }
        else {
            if (!b) {
                IlIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl.debug("Replaced sound event location {}", new Object[] { lIllllIllIllIIllllll });
            }
            llllIIllllIlIlIIIIll = new llllIIllllIlIlIIIIll(lIllllIllIllIIllllll, 1.0, 1.0, ilIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI());
            this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll);
        }
        for (final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI : ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll()) {
            final String llllIIIIlIIIlIlllIll = illIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll();
            final lIllllIllIllIIllllll lIllllIllIllIIllllll2 = new lIllllIllIllIIllllll(llllIIIIlIIIlIlllIll);
            final String s = llllIIIIlIIIlIlllIll.contains(":") ? lIllllIllIllIIllllll2.llIllIIIIIllIlIIIIlI() : lIllllIllIllIIllllll.llIllIIIIIllIlIIIIlI();
            IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = null;
            switch (IllIIlllIIIIlllIIlIl()[illIIllIIIlIlIIIIlI.IlIlIIIllIllIIIIIllI().ordinal()]) {
                case 1: {
                    final lIllllIllIllIIllllll lIllllIllIllIIllllll3 = new lIllllIllIllIIllllll(s, "sounds/" + lIllllIllIllIIllllll2.IlIlIlIlIlllllllllIl() + ".ogg");
                    InputStream ilIlIlIlIlllllllllIl = null;
                    try {
                        ilIlIlIlIlllllllllIl = this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll3).IlIlIlIlIlllllllllIl();
                    }
                    catch (FileNotFoundException ex2) {
                        IlIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl.warn("File {} does not exist, cannot add it to event {}", new Object[] { lIllllIllIllIIllllll3, lIllllIllIllIIllllll });
                    }
                    catch (IOException ex) {
                        IlIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl.warn("Could not load sound file " + lIllllIllIllIIllllll3 + ", cannot add it to event " + lIllllIllIllIIllllll, (Throwable)ex);
                    }
                    finally {
                        IOUtils.closeQuietly(ilIlIlIlIlllllllllIl);
                    }
                    IOUtils.closeQuietly(ilIlIlIlIlllllllllIl);
                    ilIIIlIlIIIllIlIlIIl = new net.minecraft.client.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll(new lllllIlIIIlIlIIlllII(lIllllIllIllIIllllll3, illIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI(), illIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl(), illIIllIIIlIlIIIIlI.IllIIlllIIIIlllIIlIl()), illIIllIIIlIlIIIIlI.IlIIIlIlIIIllIlIlIIl());
                    break;
                }
                case 2: {
                    ilIIIlIlIIIllIlIlIIl = new lllIIIIlllllIlIIllIl(this, s, illIIllIIIlIlIIIIlI);
                    break;
                }
                default: {
                    throw new IllegalStateException("IN YOU FACE");
                }
            }
            llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl);
        }
    }
    
    public llllIIllllIlIlIIIIll llllIIIIlIIIlIlllIll(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        return (llllIIllllIlIlIIIIll)this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll);
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl);
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n) {
        this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, n);
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final float n) {
        this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, n);
    }
    
    public void IlIlIlIlIlllllllllIl() {
        this.IllIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI();
    }
    
    public void llIllIIIIIllIlIIIIlI() {
        this.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI();
    }
    
    public void IlIIIlIlIIIllIlIlIIl() {
        this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
        this.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl();
    }
    
    public void IlIlIIIllIllIIIIIllI() {
        this.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl();
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.client.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final float n) {
        if (ilIlIIIllIIllIlllllI == net.minecraft.client.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll && n <= 0.0f) {
            this.llIllIIIIIllIlIIIIlI();
        }
        this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI, n);
    }
    
    public void IlIlIlIlIlllllllllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
    }
    
    public llllIIllllIlIlIIIIll llllIIIIlIIIlIlllIll(final net.minecraft.client.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI... array) {
        final ArrayList arrayList = Lists.newArrayList();
        final Iterator<lIllllIllIllIIllllll> iterator = this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI().iterator();
        while (iterator.hasNext()) {
            final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll = (llllIIllllIlIlIIIIll)this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(iterator.next());
            if (ArrayUtils.contains((Object[])array, (Object)llllIIllllIlIlIIIIll.IlIlIIIllIllIIIIIllI())) {
                arrayList.add(llllIIllllIlIlIIIIll);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (llllIIllllIlIlIIIIll)arrayList.get(new Random().nextInt(arrayList.size()));
    }
    
    public boolean llIllIIIIIllIlIIIIlI(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
    }
    
    static /* synthetic */ int[] IllIIlllIIIIlllIIlIl() {
        final int[] liiiIlIIIIIlllIllIII = IlIllIlIlIIIlIlIlIII.lIIIIlIIIIIlllIllIII;
        if (liiiIlIIIIIlllIllIII != null) {
            return liiiIlIIIIIlllIllIII;
        }
        final int[] liiiIlIIIIIlllIllIII2 = new int[IIIlIIIlIlIIlllIIlll.values().length];
        try {
            liiiIlIIIIIlllIllIII2[IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            liiiIlIIIIIlllIllIII2[IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        return IlIllIlIlIIIlIlIlIII.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII2;
    }
}
