package net.optifine.shaders;

import net.optifine.llllIIIIlIIIlIlllIll.*;
import java.util.*;

public class llllIIIIlIIIlIlllIll
{
    private int llllIIIIlIIIlIlllIll;
    private llIIlIIIlIIIllIlIIIl[] IlIlIlIlIlllllllllIl;
    
    public llllIIIIlIIIlIlllIll(final int llllIIIIlIIIlIlllIll, final llIIlIIIlIIIllIlIIIl[] ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final int n, final int n2) {
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl.length; ++i) {
            if (this.IlIlIlIlIlllllllllIl[i].llllIIIIlIIIlIlllIll(n, n2)) {
                return true;
            }
        }
        return false;
    }
    
    public int[] IlIlIlIlIlllllllllIl() {
        final HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl.length; ++i) {
            set.add(this.IlIlIlIlIlllllllllIl[i].llllIIIIlIIIlIlllIll());
        }
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(set.toArray(new Integer[set.size()]));
    }
    
    public llIIlIIIlIIIllIlIIIl[] llllIIIIlIIIlIlllIll(final int n) {
        final ArrayList<llIIlIIIlIIIllIlIIIl> list = new ArrayList<llIIlIIIlIIIllIlIIIl>();
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl.length; ++i) {
            final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = this.IlIlIlIlIlllllllllIl[i];
            if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll() == n) {
                list.add(llIIlIIIlIIIllIlIIIl);
            }
        }
        return list.toArray(new llIIlIIIlIIIllIlIIIl[list.size()]);
    }
    
    @Override
    public String toString() {
        return "block." + this.llllIIIIlIIIlIlllIll + "=" + net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
    }
}
