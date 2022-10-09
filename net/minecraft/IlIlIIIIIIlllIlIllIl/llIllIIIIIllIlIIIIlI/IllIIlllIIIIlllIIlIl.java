package net.minecraft.IlIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI;

import net.minecraft.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.IlIlIIIIIIlllIlIllIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class IllIIlllIIIIlllIIlIl implements IlIlIlIlIlllllllllIl
{
    private static final llIIIIIIlIllIIlIIIll llllIIIIlIIIlIlllIll;
    private final llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl;
    private final IIlllIIlIllIllIlIIll llIllIIIIIllIlIIIIlI;
    private boolean IlIIIlIlIIIllIlIlIIl;
    
    static {
        llllIIIIlIIIlIlllIll = new IlIlIIIIIIlllIlIllIl("Status request has been handled.");
    }
    
    public IllIIlllIIIIlllIIlIl(final llllIIIIlIIIlIlllIll ilIlIlIlIlllllllllIl, final IIlllIIlIllIllIlIIll llIllIIIIIllIlIIIIlI) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll) {
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (this.IlIIIlIlIIIllIlIlIIl) {
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll);
        }
        else {
            this.IlIIIlIlIIIllIlIlIIl = true;
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl.IIllIIIlIIIIlIIlIIII()));
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll()));
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll);
    }
}
