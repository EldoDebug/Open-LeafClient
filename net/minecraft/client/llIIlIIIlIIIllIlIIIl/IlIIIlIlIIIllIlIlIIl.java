package net.minecraft.client.llIIlIIIlIIIllIlIIIl;

import net.minecraft.client.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll.*;
import org.apache.logging.log4j.*;
import com.google.common.collect.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.io.*;
import java.util.*;

public class IlIIIlIlIIIllIlIlIIl implements IlIlIIIllIIllIlllllI
{
    private static final Logger IlIlIlIlIlllllllllIl;
    protected final List llllIIIIlIIIlIlllIll;
    private final lIIIlllIIIllIIIllIII llIllIIIIIllIlIIIIlI;
    
    static {
        IlIlIlIlIlllllllllIl = LogManager.getLogger();
    }
    
    public IlIIIlIlIIIllIlIlIIl(final lIIIlllIIIllIIIllIII llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = Lists.newArrayList();
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll) {
        this.llllIIIIlIIIlIlllIll.add(llllIIllllIlIlIIIIll);
    }
    
    @Override
    public Set llllIIIIlIIIlIlllIll() {
        return null;
    }
    
    @Override
    public lIlIlIIIllIIllIIIllI llllIIIIlIIIlIlllIll(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll = null;
        final lIllllIllIllIIllllll llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI(lIllllIllIllIIllllll);
        for (int i = this.llllIIIIlIIIlIlllIll.size() - 1; i >= 0; --i) {
            final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll2 = this.llllIIIIlIIIlIlllIll.get(i);
            if (llllIIllllIlIlIIIIll == null && llllIIllllIlIlIIIIll2.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI)) {
                llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll2;
            }
            if (llllIIllllIlIlIIIIll2.IlIlIlIlIlllllllllIl(lIllllIllIllIIllllll)) {
                InputStream llllIIIIlIIIlIlllIll = null;
                if (llllIIllllIlIlIIIIll != null) {
                    llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, llllIIllllIlIlIIIIll);
                }
                return new IIlllIIIlIlllIIlllII(llllIIllllIlIlIIIIll2.IlIlIlIlIlllllllllIl(), lIllllIllIllIIllllll, this.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll, llllIIllllIlIlIIIIll2), llllIIIIlIIIlIlllIll, this.llIllIIIIIllIlIIIIlI);
            }
        }
        throw new FileNotFoundException(lIllllIllIllIIllllll.toString());
    }
    
    protected InputStream llllIIIIlIIIlIlllIll(final lIllllIllIllIIllllll lIllllIllIllIIllllll, final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll) {
        final InputStream llllIIIIlIIIlIlllIll = llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll);
        return IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.isDebugEnabled() ? new IlIlIIIllIllIIIIIllI(llllIIIIlIIIlIlllIll, lIllllIllIllIIllllll, llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl()) : llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public List IlIlIlIlIlllllllllIl(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        final ArrayList arrayList = Lists.newArrayList();
        final lIllllIllIllIIllllll llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI(lIllllIllIllIIllllll);
        for (final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll : this.llllIIIIlIIIlIlllIll) {
            if (llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl(lIllllIllIllIIllllll)) {
                arrayList.add(new IIlllIIIlIlllIIlllII(llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl(), lIllllIllIllIIllllll, this.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll, llllIIllllIlIlIIIIll), llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI) ? this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, llllIIllllIlIlIIIIll) : null, this.llIllIIIIIllIlIIIIlI));
            }
        }
        if (arrayList.isEmpty()) {
            throw new FileNotFoundException(lIllllIllIllIIllllll.toString());
        }
        return arrayList;
    }
    
    static lIllllIllIllIIllllll llIllIIIIIllIlIIIIlI(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        return new lIllllIllIllIIllllll(lIllllIllIllIIllllll.llIllIIIIIllIlIIIIlI(), String.valueOf(lIllllIllIllIIllllll.IlIlIlIlIlllllllllIl()) + ".mcmeta");
    }
}
