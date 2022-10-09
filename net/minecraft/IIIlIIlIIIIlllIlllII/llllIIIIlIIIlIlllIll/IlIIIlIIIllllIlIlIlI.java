package net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class IlIIIlIIIllllIlIlIlI extends IIIllllllIllIIIlllIl
{
    private llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll;
    private float IlIlIlIlIlllllllllIl;
    
    public IlIIIlIIIllllIlIlIlI(final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll, final float ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl[] llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl[] array, final int n, final int n2, final int n3, final int n4) {
        if (array == null || array.length < n3 * n4) {
            array = new llIIlIIIlIIIllIlIIIl[n3 * n4];
        }
        Arrays.fill(array, 0, n3 * n4, this.llllIIIIlIIIlIlllIll);
        return array;
    }
    
    @Override
    public float[] llllIIIIlIIIlIlllIll(float[] array, final int n, final int n2, final int n3, final int n4) {
        if (array == null || array.length < n3 * n4) {
            array = new float[n3 * n4];
        }
        Arrays.fill(array, 0, n3 * n4, this.IlIlIlIlIlllllllllIl);
        return array;
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl[] IlIlIlIlIlllllllllIl(llIIlIIIlIIIllIlIIIl[] array, final int n, final int n2, final int n3, final int n4) {
        if (array == null || array.length < n3 * n4) {
            array = new llIIlIIIlIIIllIlIIIl[n3 * n4];
        }
        Arrays.fill(array, 0, n3 * n4, this.llllIIIIlIIIlIlllIll);
        return array;
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl[] llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl[] array, final int n, final int n2, final int n3, final int n4, final boolean b) {
        return this.IlIlIlIlIlllllllllIl(array, n, n2, n3, n4);
    }
    
    @Override
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final List list, final Random random) {
        return list.contains(this.llllIIIIlIIIlIlllIll) ? new IlIlIlIlIlllllllllIl(n - n3 + random.nextInt(n3 * 2 + 1), 0, n2 - n3 + random.nextInt(n3 * 2 + 1)) : null;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final List list) {
        return list.contains(this.llllIIIIlIIIlIlllIll);
    }
}
