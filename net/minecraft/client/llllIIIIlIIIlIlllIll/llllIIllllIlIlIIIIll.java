package net.minecraft.client.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.google.common.collect.*;
import java.util.*;

public class llllIIllllIlIlIIIIll implements IlIIIlIlIIIllIlIlIIl
{
    private final List llllIIIIlIIIlIlllIll;
    private final Random IlIlIlIlIlllllllllIl;
    private final lIllllIllIllIIllllll llIllIIIIIllIlIIIIlI;
    private final IlIlIIIllIIllIlllllI IlIIIlIlIIIllIlIlIIl;
    private double IlIlIIIllIllIIIIIllI;
    private double IllIIlllIIIIlllIIlIl;
    
    public llllIIllllIlIlIIIIll(final lIllllIllIllIIllllll llIllIIIIIllIlIIIIlI, final double ilIlIIIllIllIIIIIllI, final double illIIlllIIIIlllIIlIl, final IlIlIIIllIIllIlllllI ilIIIlIlIIIllIlIlIIl) {
        this.llllIIIIlIIIlIlllIll = Lists.newArrayList();
        this.IlIlIlIlIlllllllllIl = new Random();
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        int n = 0;
        final Iterator<IlIIIlIlIIIllIlIlIIl> iterator = this.llllIIIIlIIIlIlllIll.iterator();
        while (iterator.hasNext()) {
            n += iterator.next().llllIIIIlIIIlIlllIll();
        }
        return n;
    }
    
    public lllllIlIIIlIlIIlllII llIllIIIIIllIlIIIIlI() {
        final int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll();
        if (!this.llllIIIIlIIIlIlllIll.isEmpty() && llllIIIIlIIIlIlllIll != 0) {
            int nextInt = this.IlIlIlIlIlllllllllIl.nextInt(llllIIIIlIIIlIlllIll);
            for (final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl : this.llllIIIIlIIIlIlllIll) {
                nextInt -= ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll();
                if (nextInt < 0) {
                    final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII = (lllllIlIIIlIlIIlllII)ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl();
                    lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl() * this.IlIlIIIllIllIIIIIllI);
                    lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI() * this.IllIIlllIIIIlllIIlIl);
                    return lllllIlIIIlIlIIlllII;
                }
            }
            return IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll;
        }
        return IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        this.llllIIIIlIIIlIlllIll.add(ilIIIlIlIIIllIlIlIIl);
    }
    
    public lIllllIllIllIIllllll IlIIIlIlIIIllIlIlIIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public IlIlIIIllIIllIlllllI IlIlIIIllIllIIIIIllI() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
}
