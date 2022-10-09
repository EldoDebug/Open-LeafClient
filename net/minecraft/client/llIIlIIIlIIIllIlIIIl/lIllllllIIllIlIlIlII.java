package net.minecraft.client.llIIlIIIlIIIllIlIIIl;

import net.minecraft.client.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll.*;
import org.apache.logging.log4j.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.io.*;
import com.google.common.collect.*;
import com.google.common.base.*;

public class lIllllllIIllIlIlIlII implements llIllIlIIIIllIlIIllI
{
    private static final Logger llllIIIIlIIIlIlllIll;
    private static final Joiner IlIlIlIlIlllllllllIl;
    private final Map llIllIIIIIllIlIIIIlI;
    private final List IlIIIlIlIIIllIlIlIIl;
    private final Set IlIlIIIllIllIIIIIllI;
    private final lIIIlllIIIllIIIllIII IllIIlllIIIIlllIIlIl;
    
    static {
        llllIIIIlIIIlIlllIll = LogManager.getLogger();
        IlIlIlIlIlllllllllIl = Joiner.on(", ");
    }
    
    public lIllllllIIllIlIlIlII(final lIIIlllIIIllIIIllIII illIIlllIIIIlllIIlIl) {
        this.llIllIIIIIllIlIIIIlI = Maps.newHashMap();
        this.IlIIIlIlIIIllIlIlIIl = Lists.newArrayList();
        this.IlIlIIIllIllIIIIIllI = Sets.newLinkedHashSet();
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll) {
        for (final String s : llllIIllllIlIlIIIIll.llIllIIIIIllIlIIIIlI()) {
            this.IlIlIIIllIllIIIIIllI.add(s);
            IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = this.llIllIIIIIllIlIIIIlI.get(s);
            if (ilIIIlIlIIIllIlIlIIl == null) {
                ilIIIlIlIIIllIlIlIIl = new IlIIIlIlIIIllIlIlIIl(this.IllIIlllIIIIlllIIlIl);
                this.llIllIIIIIllIlIIIIlI.put(s, ilIIIlIlIIIllIlIlIIl);
            }
            ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll);
        }
    }
    
    @Override
    public Set llllIIIIlIIIlIlllIll() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    @Override
    public lIlIlIIIllIIllIIIllI llllIIIIlIIIlIlllIll(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI = this.llIllIIIIIllIlIIIIlI.get(lIllllIllIllIIllllll.llIllIIIIIllIlIIIIlI());
        if (ilIlIIIllIIllIlllllI != null) {
            return ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll);
        }
        throw new FileNotFoundException(lIllllIllIllIIllllll.toString());
    }
    
    @Override
    public List IlIlIlIlIlllllllllIl(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI = this.llIllIIIIIllIlIIIIlI.get(lIllllIllIllIIllllll.llIllIIIIIllIlIIIIlI());
        if (ilIlIIIllIIllIlllllI != null) {
            return ilIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl(lIllllIllIllIIllllll);
        }
        throw new FileNotFoundException(lIllllIllIllIIllllll.toString());
    }
    
    private void IlIlIlIlIlllllllllIl() {
        this.llIllIIIIIllIlIIIIlI.clear();
        this.IlIlIIIllIllIIIIIllI.clear();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final List list) {
        this.IlIlIlIlIlllllllllIl();
        lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll.info("Reloading ResourceManager: " + lIllllllIIllIlIlIlII.IlIlIlIlIlllllllllIl.join(Iterables.transform((Iterable)list, (Function)new llIIlllIIlllIIllIllI(this))));
        final Iterator<llllIIllllIlIlIIIIll> iterator = list.iterator();
        while (iterator.hasNext()) {
            this.llllIIIIlIIIlIlllIll(iterator.next());
        }
        this.llIllIIIIIllIlIIIIlI();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        this.IlIIIlIlIIIllIlIlIIl.add(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(this);
    }
    
    private void llIllIIIIIllIlIIIIlI() {
        final Iterator<IIIIlllIIIIIIlIIIlll> iterator = this.IlIIIlIlIIIllIlIlIIl.iterator();
        while (iterator.hasNext()) {
            iterator.next().llllIIIIlIIIlIlllIll(this);
        }
    }
}
