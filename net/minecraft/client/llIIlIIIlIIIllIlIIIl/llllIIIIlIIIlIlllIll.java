package net.minecraft.client.llIIlIIIlIIIllIlIIIl;

import org.apache.logging.log4j.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll.*;
import com.google.common.base.*;
import java.io.*;
import org.apache.commons.io.*;
import com.google.gson.*;
import java.awt.image.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;

public abstract class llllIIIIlIIIlIlllIll implements llllIIllllIlIlIIIIll
{
    private static final Logger IlIlIlIlIlllllllllIl;
    public final File llllIIIIlIIIlIlllIll;
    
    static {
        IlIlIlIlIlllllllllIl = LogManager.getLogger();
    }
    
    public llllIIIIlIIIlIlllIll(final File llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    private static String llIllIIIIIllIlIIIIlI(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        return String.format("%s/%s/%s", "assets", lIllllIllIllIIllllll.llIllIIIIIllIlIIIIlI(), lIllllIllIllIIllllll.IlIlIlIlIlllllllllIl());
    }
    
    protected static String llllIIIIlIIIlIlllIll(final File file, final File file2) {
        return file.toURI().relativize(file2.toURI()).getPath();
    }
    
    @Override
    public InputStream llllIIIIlIIIlIlllIll(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        return this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI(lIllllIllIllIIllllll));
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        return this.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI(lIllllIllIllIIllllll));
    }
    
    protected abstract InputStream llllIIIIlIIIlIlllIll(final String p0);
    
    protected abstract boolean IlIlIlIlIlllllllllIl(final String p0);
    
    protected void llIllIIIIIllIlIIIIlI(final String s) {
        net.minecraft.client.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.warn("ResourcePack: ignored non-lowercase namespace: {} in {}", new Object[] { s, this.llllIIIIlIIIlIlllIll });
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final String s) {
        return llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII, this.llllIIIIlIIIlIlllIll("pack.mcmeta"), s);
    }
    
    static llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final InputStream inputStream, final String s) {
        JsonObject asJsonObject = null;
        Reader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8));
            asJsonObject = new JsonParser().parse(reader).getAsJsonObject();
        }
        catch (RuntimeException ex) {
            throw new JsonParseException((Throwable)ex);
        }
        finally {
            IOUtils.closeQuietly(reader);
        }
        IOUtils.closeQuietly(reader);
        return liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(s, asJsonObject);
    }
    
    @Override
    public BufferedImage llllIIIIlIIIlIlllIll() {
        return IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll("pack.png"));
    }
    
    @Override
    public String IlIlIlIlIlllllllllIl() {
        return this.llllIIIIlIIIlIlllIll.getName();
    }
}
