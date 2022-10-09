package net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;

import org.lwjgl.util.vector.*;

public class IIlllIIlIllIllIlIIll
{
    public static final IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll;
    public final Vector3f IlIlIlIlIlllllllllIl;
    public final Vector3f llIllIIIIIllIlIIIIlI;
    public final Vector3f IlIIIlIlIIIllIlIlIIl;
    
    static {
        llllIIIIlIIIlIlllIll = new IIlllIIlIllIllIlIIll(new Vector3f(), new Vector3f(), new Vector3f(1.0f, 1.0f, 1.0f));
    }
    
    public IIlllIIlIllIllIlIIll(final Vector3f vector3f, final Vector3f vector3f2, final Vector3f vector3f3) {
        this.IlIlIlIlIlllllllllIl = new Vector3f((ReadableVector3f)vector3f);
        this.llIllIIIIIllIlIIIIlI = new Vector3f((ReadableVector3f)vector3f2);
        this.IlIIIlIlIIIllIlIlIIl = new Vector3f((ReadableVector3f)vector3f3);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (this.getClass() != o.getClass()) {
            return false;
        }
        final IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll = (IIlllIIlIllIllIlIIll)o;
        return this.IlIlIlIlIlllllllllIl.equals((Object)illlIIlIllIllIlIIll.IlIlIlIlIlllllllllIl) && this.IlIIIlIlIIIllIlIlIIl.equals((Object)illlIIlIllIllIlIIll.IlIIIlIlIIIllIlIlIIl) && this.llIllIIIIIllIlIIIIlI.equals((Object)illlIIlIllIllIlIIll.llIllIIIIIllIlIIIIlI);
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * this.IlIlIlIlIlllllllllIl.hashCode() + this.llIllIIIIIllIlIIIIlI.hashCode()) + this.IlIIIlIlIIIllIlIlIIl.hashCode();
    }
}
