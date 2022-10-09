package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;

import io.netty.util.internal.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import org.apache.commons.lang3.*;

public class llllIIIIlIIIlIlllIll
{
    private final double llllIIIIlIIIlIlllIll;
    private final int IlIlIlIlIlllllllllIl;
    private final String llIllIIIIIllIlIIIIlI;
    private final UUID IlIIIlIlIIIllIlIlIIl;
    private boolean IlIlIIIllIllIIIIIllI;
    
    public llllIIIIlIIIlIlllIll(final String s, final double n, final int n2) {
        this(llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(ThreadLocalRandom.current()), s, n, n2);
    }
    
    public llllIIIIlIIIlIlllIll(final UUID ilIIIlIlIIIllIlIlIIl, final String llIllIIIIIllIlIIIIlI, final double llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl) {
        this.IlIlIIIllIllIIIIIllI = true;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        Validate.notEmpty((CharSequence)llIllIIIIIllIlIIIIlI, "Modifier name cannot be empty", new Object[0]);
        Validate.inclusiveBetween(0L, 2L, (long)ilIlIlIlIlllllllllIl, "Invalid operation");
    }
    
    public UUID llllIIIIlIIIlIlllIll() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public String IlIlIlIlIlllllllllIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public double IlIIIlIlIIIllIlIlIIl() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public boolean IlIlIIIllIllIIIIIllI() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final boolean ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        return this;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = (llllIIIIlIIIlIlllIll)o;
            if (this.IlIIIlIlIIIllIlIlIIl != null) {
                if (!this.IlIIIlIlIIIllIlIlIIl.equals(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl)) {
                    return false;
                }
            }
            else if (llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl != null) {
                return false;
            }
            return true;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return (this.IlIIIlIlIIIllIlIlIIl != null) ? this.IlIIIlIlIIIllIlIlIIl.hashCode() : 0;
    }
    
    @Override
    public String toString() {
        return "AttributeModifier{amount=" + this.llllIIIIlIIIlIlllIll + ", operation=" + this.IlIlIlIlIlllllllllIl + ", name='" + this.llIllIIIIIllIlIIIIlI + '\'' + ", id=" + this.IlIIIlIlIIIllIlIlIIl + ", serialize=" + this.IlIlIIIllIllIIIIIllI + '}';
    }
}
