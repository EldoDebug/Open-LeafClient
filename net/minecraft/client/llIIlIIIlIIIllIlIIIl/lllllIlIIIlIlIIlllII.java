package net.minecraft.client.llIIlIIIlIIIllIlIIIl;

import net.minecraft.client.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll.*;
import java.awt.image.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import java.io.*;
import org.apache.commons.io.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class lllllIlIIIlIlIIlllII
{
    private final File IlIlIlIlIlllllllllIl;
    private llllIIllllIlIlIIIIll llIllIIIIIllIlIIIIlI;
    private IlIlIIIllIIllIlllllI IlIIIlIlIIIllIlIlIIl;
    private BufferedImage IlIlIIIllIllIIIIIllI;
    private lIllllIllIllIIllllll IllIIlllIIIIlllIIlIl;
    final /* synthetic */ IIIlIIlIIIIlllIlllII llllIIIIlIIIlIlllIll;
    
    private lllllIlIIIlIlIIlllII(final IIIlIIlIIIIlllIlllII llllIIIIlIIIlIlllIll, final File ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public void llllIIIIlIIIlIlllIll() {
        this.llIllIIIIIllIlIIIIlI = (this.IlIlIlIlIlllllllllIl.isDirectory() ? new llllIIIlIlllIlIIIIIl(this.IlIlIlIlIlllllllllIl) : new IllIIlllIIIIlllIIlIl(this.IlIlIlIlIlllllllllIl));
        this.IlIIIlIlIIIllIlIlIIl = (IlIlIIIllIIllIlllllI)this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, "pack");
        try {
            this.IlIlIIIllIllIIIIIllI = this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll();
        }
        catch (IOException ex) {}
        if (this.IlIlIIIllIllIIIIIllI == null) {
            this.IlIlIIIllIllIIIIIllI = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
        }
        this.IlIlIlIlIlllllllllIl();
    }
    
    public void llllIIIIlIIIlIlllIll(final IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll) {
        if (this.IllIIlllIIIIlllIIlIl == null) {
            this.IllIIlllIIIIlllIIlIl = illlIIlIllIllIlIIll.llllIIIIlIIIlIlllIll("texturepackicon", new IlIlIlIlIlllllllllIl(this.IlIlIIIllIllIIIIIllI));
        }
        illlIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl);
    }
    
    public void IlIlIlIlIlllllllllIl() {
        if (this.llIllIIIIIllIlIIIIlI instanceof Closeable) {
            IOUtils.closeQuietly((Closeable)this.llIllIIIIIllIlIIIIlI);
        }
    }
    
    public llllIIllllIlIlIIIIll llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public String IlIIIlIlIIIllIlIlIIl() {
        return this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl();
    }
    
    public String IlIlIIIllIllIIIIIllI() {
        return (this.IlIIIlIlIIIllIlIlIIl == null) ? (IlllIIIIlIIIlIlIlIIl.IlIlIIIllIIllIlllllI + "Invalid pack.mcmeta (or missing 'pack' section)") : this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll().lIIIlllIIIllIIIllIII();
    }
    
    public int IllIIlllIIIIlllIIlIl() {
        return this.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl();
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof lllllIlIIIlIlIIlllII && this.toString().equals(o.toString()));
    }
    
    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }
    
    @Override
    public String toString() {
        return String.format("%s:%s:%d", this.IlIlIlIlIlllllllllIl.getName(), this.IlIlIlIlIlllllllllIl.isDirectory() ? "folder" : "zip", this.IlIlIlIlIlllllllllIl.lastModified());
    }
}
