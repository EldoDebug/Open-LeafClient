package net.minecraft.llIllIlIIIIllIlIIllI;

import com.google.common.collect.*;
import net.minecraft.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IlIllllIIIlIllIlIIll extends IlIIIlIlIIIllIlIlIIl
{
    private static final Map lIIIIlIIIIIlllIllIII;
    public final String llllIIIlIlllIlIIIIIl;
    
    static {
        lIIIIlIIIIIlllIllIII = Maps.newHashMap();
    }
    
    protected IlIllllIIIlIllIlIIll(final String llllIIIlIlllIlIIIIIl) {
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.IlIIIlIlIIIllIlIlIIl = 1;
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl);
        IlIllllIIIlIllIlIIll.lIIIIlIIIIIlllIllIII.put("records." + llllIIIlIlllIlIIIIIl, this);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3) {
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        if (ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI() != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlIlIllIIlIIIl || (boolean)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll.IIIIIIIIIlllIllIlIlI)) {
            return false;
        }
        if (illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            return true;
        }
        ((lIllllIllIllIIllllll)net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlIlIllIIlIIIl).llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2, lllIIIIlIlIllIIlIIIl);
        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(null, 1005, ilIlIlIlIlllllllllIl, net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this));
        --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IIIIlllIIIIIIlIIIlll.lIIlIIIlIllIlIllIIIl);
        return true;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final List list, final boolean b) {
        list.add(this.lllIIIIlllllIlIIllIl());
    }
    
    public String lllIIIIlllllIlIIllIl() {
        return lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("item.record." + this.llllIIIlIlllIlIIIIIl + ".desc");
    }
    
    @Override
    public llIllIIIIIllIlIIIIlI lIIIlllIIIllIIIllIII(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return net.minecraft.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI;
    }
    
    public static IlIllllIIIlIllIlIIll IlIIIlIlIIIllIlIlIIl(final String s) {
        return IlIllllIIIlIllIlIIll.lIIIIlIIIIIlllIllIII.get(s);
    }
}
