package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import java.util.*;
import com.google.common.collect.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IlIIlllllIIllIIlllll
{
    IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll;
    List IlIlIlIlIlllllllllIl;
    List llIllIIIIIllIlIIIIlI;
    
    public IlIIlllllIIllIIlllll(final IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll) {
        this.IlIlIlIlIlllllllllIl = Lists.newArrayList();
        this.llIllIIIIIllIlIIIIlI = Lists.newArrayList();
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public void llllIIIIlIIIlIlllIll() {
        this.IlIlIlIlIlllllllllIl.clear();
        this.llIllIIIIIllIlIIIIlI.clear();
    }
    
    public boolean llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        if (this.IlIlIlIlIlllllllllIl.contains(llIllIIIIIllIlIIIIlI)) {
            return true;
        }
        if (this.llIllIIIIIllIlIIIIlI.contains(llIllIIIIIllIlIIIIlI)) {
            return false;
        }
        this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll("canSee");
        final boolean iIlllIIlIllIllIlIIll = this.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll(llIllIIIIIllIlIIIIlI);
        this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl();
        if (iIlllIIlIllIllIlIIll) {
            this.IlIlIlIlIlllllllllIl.add(llIllIIIIIllIlIIIIlI);
        }
        else {
            this.llIllIIIIIllIlIIIIlI.add(llIllIIIIIllIlIIIIlI);
        }
        return iIlllIIlIllIllIlIIll;
    }
}
