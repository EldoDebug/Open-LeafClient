package net.minecraft.llllIIIlIlllIlIIIIIl;

import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;

public enum IIlllIlIIllIlIlIlIIl
{
    llllIIIIlIIIlIlllIll("MONSTER", 0, (Class)IllIlIIllIllIIlIllII.class, 70, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll, false, false), 
    IlIlIlIlIlllllllllIl("CREATURE", 1, (Class)net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl.class, 10, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll, true, true), 
    llIllIIIIIllIlIIIIlI("AMBIENT", 2, (Class)llllIIIIlIIIlIlllIll.class, 15, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll, true, false), 
    IlIIIlIlIIIllIlIlIIl("WATER_CREATURE", 3, (Class)llllllIllIllIlIllllI.class, 5, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII, true, false);
    
    private final Class IlIlIIIllIllIIIIIllI;
    private final int IllIIlllIIIIlllIIlIl;
    private final IlIlIlIlIlllllllllIl llllIIIlIlllIlIIIIIl;
    private final boolean lIIIIlIIIIIlllIllIII;
    private final boolean lIIIlllIIIllIIIllIII;
    
    static {
        llIIlIIIlIIIllIlIIIl = new IIlllIlIIllIlIlIlIIl[] { IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll, IIlllIlIIllIlIlIlIIl.IlIlIlIlIlllllllllIl, IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI, IIlllIlIIllIlIlIlIIl.IlIIIlIlIIIllIlIlIIl };
    }
    
    private IIlllIlIIllIlIlIlIIl(final String s, final int n, final Class ilIlIIIllIllIIIIIllI, final int illIIlllIIIIlllIIlIl, final IlIlIlIlIlllllllllIl llllIIIlIlllIlIIIIIl, final boolean liiiIlIIIIIlllIllIII, final boolean liiIlllIIIllIIIllIII) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
    }
    
    public Class llllIIIIlIIIlIlllIll() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public boolean llIllIIIIIllIlIIIIlI() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl() {
        return this.lIIIlllIIIllIIIllIII;
    }
}
