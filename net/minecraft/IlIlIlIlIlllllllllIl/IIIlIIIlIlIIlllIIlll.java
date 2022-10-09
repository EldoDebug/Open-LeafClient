package net.minecraft.IlIlIlIlIlllllllllIl;

import org.apache.logging.log4j.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.google.common.collect.*;
import java.util.*;

public class IIIlIIIlIlIIlllIIlll implements IlIIlIlIIIlIIlIlIlII
{
    private static final Logger llllIIIIlIIIlIlllIll;
    private final Map IlIlIlIlIlllllllllIl;
    private final Set llIllIIIIIllIlIIIIlI;
    
    static {
        llllIIIIlIIIlIlllIll = LogManager.getLogger();
    }
    
    public IIIlIIIlIlIIlllIIlll() {
        this.IlIlIlIlIlllllllllIl = Maps.newHashMap();
        this.llIllIIIIIllIlIIIIlI = Sets.newHashSet();
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, String s) {
        s = s.trim();
        if (s.startsWith("/")) {
            s = s.substring(1);
        }
        final String[] split = s.split(" ");
        final String s2 = split[0];
        final String[] llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(split);
        final llIlIIIIIlIIlIlIIlll llIlIIIIIlIIlIlIIlll = this.IlIlIlIlIlllllllllIl.get(s2);
        final int llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll, llllIIIIlIIIlIlllIll);
        int n = 0;
        if (llIlIIIIIlIIlIlIIlll == null) {
            final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI = new IIllIIllIIIlIlIIIIlI("commands.generic.notFound", new Object[0]);
            illIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(IlllIIIIlIIIlIlIlIIl.IlIlIIIllIIllIlllllI);
            illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(illIIllIIIlIlIIIIlI);
        }
        else if (llIlIIIIIlIIlIlIIlll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII)) {
            if (llllIIIIlIIIlIlllIll2 > -1) {
                final List ilIlIlIlIlllllllllIl = lIlIlIlllIIlIlIlllIl.IlIlIlIlIlllllllllIl(illIlIIllIllIIlIllII, llllIIIIlIIIlIlllIll[llllIIIIlIIIlIlllIll2], llIllIIIIIllIlIIIIlI.class);
                final String s3 = llllIIIIlIIIlIlllIll[llllIIIIlIIIlIlllIll2];
                illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI, ilIlIlIlIlllllllllIl.size());
                final Iterator<llIllIIIIIllIlIIIIlI> iterator = ilIlIlIlIlllllllllIl.iterator();
                while (iterator.hasNext()) {
                    llllIIIIlIIIlIlllIll[llllIIIIlIIIlIlllIll2] = iterator.next().lllIIIIlIlIllIIlIIIl().toString();
                    if (this.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, llllIIIIlIIIlIlllIll, llIlIIIIIlIIlIlIIlll, s)) {
                        ++n;
                    }
                }
                llllIIIIlIIIlIlllIll[llllIIIIlIIIlIlllIll2] = s3;
            }
            else {
                illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI, 1);
                if (this.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, llllIIIIlIIIlIlllIll, llIlIIIIIlIIlIlIIlll, s)) {
                    ++n;
                }
            }
        }
        else {
            final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI2 = new IIllIIllIIIlIlIIIIlI("commands.generic.permission", new Object[0]);
            illIIllIIIlIlIIIIlI2.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(IlllIIIIlIIIlIlIlIIl.IlIlIIIllIIllIlllllI);
            illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(illIIllIIIlIlIIIIlI2);
        }
        illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll, n);
        return n;
    }
    
    protected boolean llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final llIlIIIIIlIIlIlIIlll llIlIIIIIlIIlIlIIlll, final String s) {
        try {
            llIlIIIIIlIIlIlIIlll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, array);
            return true;
        }
        catch (llllIllllIllllIlIlII llllIllllIllllIlIlII) {
            final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI = new IIllIIllIIIlIlIIIIlI("commands.generic.usage", new Object[] { new IIllIIllIIIlIlIIIIlI(llllIllllIllllIlIlII.getMessage(), llllIllllIllllIlIlII.llllIIIIlIIIlIlllIll()) });
            illIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(IlllIIIIlIIIlIlIlIIl.IlIlIIIllIIllIlllllI);
            illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(illIIllIIIlIlIIIIlI);
        }
        catch (IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
            final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI2 = new IIllIIllIIIlIlIIIIlI(iiiIlllIIIIIIlIIIlll.getMessage(), iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll());
            illIIllIIIlIlIIIIlI2.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(IlllIIIIlIIIlIlIlIIl.IlIlIIIllIIllIlllllI);
            illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(illIIllIIIlIlIIIIlI2);
        }
        catch (Throwable t) {
            final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI3 = new IIllIIllIIIlIlIIIIlI("commands.generic.exception", new Object[0]);
            illIIllIIIlIlIIIIlI3.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(IlllIIIIlIIIlIlIlIIl.IlIlIIIllIIllIlllllI);
            illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(illIIllIIIlIlIIIIlI3);
            IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll.warn("Couldn't process command: '" + s + "'");
        }
        return false;
    }
    
    public llIlIIIIIlIIlIlIIlll llllIIIIlIIIlIlllIll(final llIlIIIIIlIIlIlIIlll llIlIIIIIlIIlIlIIlll) {
        this.IlIlIlIlIlllllllllIl.put(llIlIIIIIlIIlIlIIlll.llIllIIIIIllIlIIIIlI(), llIlIIIIIlIIlIlIIlll);
        this.llIllIIIIIllIlIIIIlI.add(llIlIIIIIlIIlIlIIlll);
        for (final String s : llIlIIIIIlIIlIlIIlll.IlIlIlIlIlllllllllIl()) {
            final llIlIIIIIlIIlIlIIlll llIlIIIIIlIIlIlIIlll2 = this.IlIlIlIlIlllllllllIl.get(s);
            if (llIlIIIIIlIIlIlIIlll2 == null || !llIlIIIIIlIIlIlIIlll2.llIllIIIIIllIlIIIIlI().equals(s)) {
                this.IlIlIlIlIlllllllllIl.put(s, llIlIIIIIlIIlIlIIlll);
            }
        }
        return llIlIIIIIlIIlIlIIlll;
    }
    
    private static String[] llllIIIIlIIIlIlllIll(final String[] array) {
        final String[] array2 = new String[array.length - 1];
        System.arraycopy(array, 1, array2, 0, array.length - 1);
        return array2;
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String s, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final String[] split = s.split(" ", -1);
        final String s2 = split[0];
        if (split.length == 1) {
            final ArrayList arrayList = Lists.newArrayList();
            for (final Map.Entry<String, V> entry : this.IlIlIlIlIlllllllllIl.entrySet()) {
                if (net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s2, entry.getKey()) && ((llIlIIIIIlIIlIlIIlll)entry.getValue()).llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII)) {
                    arrayList.add(entry.getKey());
                }
            }
            return arrayList;
        }
        if (split.length > 1) {
            final llIlIIIIIlIIlIlIIlll llIlIIIIIlIIlIlIIlll = this.IlIlIlIlIlllllllllIl.get(s2);
            if (llIlIIIIIlIIlIlIIlll != null && llIlIIIIIlIIlIlIIlll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII)) {
                return llIlIIIIIlIIlIlIIlll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, llllIIIIlIIIlIlllIll(split), ilIlIlIlIlllllllllIl);
            }
        }
        return null;
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        final ArrayList arrayList = Lists.newArrayList();
        for (final llIlIIIIIlIIlIlIIlll llIlIIIIIlIIlIlIIlll : this.llIllIIIIIllIlIIIIlI) {
            if (llIlIIIIIlIIlIlIIlll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII)) {
                arrayList.add(llIlIIIIIlIIlIlIIlll);
            }
        }
        return arrayList;
    }
    
    @Override
    public Map llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    private int llllIIIIlIIIlIlllIll(final llIlIIIIIlIIlIlIIlll llIlIIIIIlIIlIlIIlll, final String[] array) {
        if (llIlIIIIIlIIlIlIIlll == null) {
            return -1;
        }
        for (int i = 0; i < array.length; ++i) {
            if (llIlIIIIIlIIlIlIIlll.IlIlIlIlIlllllllllIl(array, i) && lIlIlIlllIIlIlIlllIl.llllIIIIlIIIlIlllIll(array[i])) {
                return i;
            }
        }
        return -1;
    }
}
