package net.minecraft.client.llIIlIIIlIIIllIlIIIl;

import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.google.common.collect.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll.*;
import java.io.*;
import com.google.gson.*;
import org.apache.commons.io.*;

public class IIlllIIIlIlllIIlllII implements lIlIlIIIllIIllIIIllI
{
    private final Map llllIIIIlIIIlIlllIll;
    private final String IlIlIlIlIlllllllllIl;
    private final lIllllIllIllIIllllll llIllIIIIIllIlIIIIlI;
    private final InputStream IlIIIlIlIIIllIlIlIIl;
    private final InputStream IlIlIIIllIllIIIIIllI;
    private final lIIIlllIIIllIIIllIII IllIIlllIIIIlllIIlIl;
    private boolean llllIIIlIlllIlIIIIIl;
    private JsonObject lIIIIlIIIIIlllIllIII;
    
    public IIlllIIIlIlllIIlllII(final String ilIlIlIlIlllllllllIl, final lIllllIllIllIIllllll llIllIIIIIllIlIIIIlI, final InputStream ilIIIlIlIIIllIlIlIIl, final InputStream ilIlIIIllIllIIIIIllI, final lIIIlllIIIllIIIllIII illIIlllIIIIlllIIlIl) {
        this.llllIIIIlIIIlIlllIll = Maps.newHashMap();
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    @Override
    public lIllllIllIllIIllllll llllIIIIlIIIlIlllIll() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public InputStream IlIlIlIlIlllllllllIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public boolean llIllIIIIIllIlIIIIlI() {
        return this.IlIlIIIllIllIIIIIllI != null;
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final String s) {
        if (!this.llIllIIIIIllIlIIIIlI()) {
            return null;
        }
        if (this.lIIIIlIIIIIlllIllIII == null && !this.llllIIIlIlllIlIIIIIl) {
            this.llllIIIlIlllIlIIIIIl = true;
            Reader reader = null;
            try {
                reader = new BufferedReader(new InputStreamReader(this.IlIlIIIllIllIIIIIllI));
                this.lIIIIlIIIIIlllIllIII = new JsonParser().parse(reader).getAsJsonObject();
            }
            finally {
                IOUtils.closeQuietly(reader);
            }
            IOUtils.closeQuietly(reader);
        }
        llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.get(s);
        if (llllIIIIlIIIlIlllIll == null) {
            llllIIIIlIIIlIlllIll = this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(s, this.lIIIIlIIIIIlllIllIII);
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public String IlIIIlIlIIIllIlIlIIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IIlllIIIlIlllIIlllII)) {
            return false;
        }
        final IIlllIIIlIlllIIlllII illlIIIlIlllIIlllII = (IIlllIIIlIlllIIlllII)o;
        if (this.llIllIIIIIllIlIIIIlI != null) {
            if (!this.llIllIIIIIllIlIIIIlI.equals(illlIIIlIlllIIlllII.llIllIIIIIllIlIIIIlI)) {
                return false;
            }
        }
        else if (illlIIIlIlllIIlllII.llIllIIIIIllIlIIIIlI != null) {
            return false;
        }
        if (this.IlIlIlIlIlllllllllIl != null) {
            if (!this.IlIlIlIlIlllllllllIl.equals(illlIIIlIlllIIlllII.IlIlIlIlIlllllllllIl)) {
                return false;
            }
        }
        else if (illlIIIlIlllIIlllII.IlIlIlIlIlllllllllIl != null) {
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return 31 * ((this.IlIlIlIlIlllllllllIl != null) ? this.IlIlIlIlIlllllllllIl.hashCode() : 0) + ((this.llIllIIIIIllIlIIIIlI != null) ? this.llIllIIIIIllIlIIIIlI.hashCode() : 0);
    }
}
