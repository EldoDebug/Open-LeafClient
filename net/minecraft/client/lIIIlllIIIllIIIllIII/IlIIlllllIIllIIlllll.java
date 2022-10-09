package net.minecraft.client.lIIIlllIIIllIIIllIII;

import java.util.concurrent.atomic.*;
import java.awt.image.*;
import org.apache.logging.log4j.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.optifine.shaders.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import javax.imageio.*;
import net.minecraft.client.*;
import java.net.*;
import org.apache.commons.io.*;
import java.io.*;
import net.optifine.IlIIIlIlIIIllIlIlIIl.*;

public class IlIIlllllIIllIIlllll extends lIIIlllIIIllIIIllIII
{
    private static final Logger lIlIlIIIllIIllIIIllI;
    private static final AtomicInteger IlIlIIIllIIllIlllllI;
    private final File IIIIlllIIIIIIlIIIlll;
    private final String llllIIllllIlIlIIIIll;
    private final IlIIlIlIIIlIIlIlIlII IlIllIlIlIIIlIlIlIII;
    private BufferedImage IIlllIIlIllIllIlIIll;
    private Thread lllIIIIlllllIlIIllIl;
    private boolean IlIlIIIIIIlllIlIllIl;
    public Boolean llllIIIIlIIIlIlllIll;
    public boolean IlIlIlIlIlllllllllIl;
    
    static {
        lIlIlIIIllIIllIIIllI = LogManager.getLogger();
        IlIlIIIllIIllIlllllI = new AtomicInteger(0);
    }
    
    public IlIIlllllIIllIIlllll(final File iiiIlllIIIIIIlIIIlll, final String llllIIllllIlIlIIIIll, final lIllllIllIllIIllllll lIllllIllIllIIllllll, final IlIIlIlIIIlIIlIlIlII ilIllIlIlIIIlIlIlIII) {
        super(lIllllIllIllIIllllll);
        this.llllIIIIlIIIlIlllIll = null;
        this.IlIlIlIlIlllllllllIl = false;
        this.IIIIlllIIIIIIlIIIlll = iiiIlllIIIIIIlIIIlll;
        this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
        this.IlIllIlIlIIIlIlIlIII = ilIllIlIlIIIlIlIlIII;
    }
    
    private void lIIIIlIIIIIlllIllIII() {
        if (!this.IlIlIIIIIIlllIlIllIl && this.IIlllIIlIllIllIlIIll != null) {
            this.IlIlIIIIIIlllIlIllIl = true;
            if (this.lIIIlllIIIllIIIllIII != null) {
                this.IllIIlllIIIIlllIIlIl();
            }
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
                IIlIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll(super.llllIIIIlIIIlIlllIll(), this.IIlllIIlIllIllIlIIll, false, false, net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIllIIllIIllIIlIIl(), this.lIIIlllIIIllIIIllIII, this.llllIIIlIlllIlIIIIIl());
            }
            else {
                IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(super.llllIIIIlIIIlIlllIll(), this.IIlllIIlIllIllIlIIll);
            }
        }
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        this.lIIIIlIIIIIlllIllIII();
        return super.llllIIIIlIIIlIlllIll();
    }
    
    public void llllIIIIlIIIlIlllIll(final BufferedImage iIlllIIlIllIllIlIIll) {
        this.IIlllIIlIllIllIlIIll = iIlllIIlIllIllIlIIll;
        if (this.IlIllIlIlIIIlIlIlIII != null) {
            this.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll();
        }
        this.llllIIIIlIIIlIlllIll = (this.IIlllIIlIllIllIlIIll != null);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        if (this.IIlllIIlIllIllIlIIll == null && this.lIIIlllIIIllIIIllIII != null) {
            super.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI);
        }
        if (this.lllIIIIlllllIlIIllIl == null) {
            if (this.IIIIlllIIIIIIlIIIlll != null && this.IIIIlllIIIIIIlIIIlll.isFile()) {
                IlIIlllllIIllIIlllll.lIlIlIIIllIIllIIIllI.debug("Loading http texture from local cache ({})", new Object[] { this.IIIIlllIIIIIIlIIIlll });
                try {
                    this.IIlllIIlIllIllIlIIll = ImageIO.read(this.IIIIlllIIIIIIlIIIlll);
                    if (this.IlIllIlIlIIIlIlIlIII != null) {
                        this.llllIIIIlIIIlIlllIll(this.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(this.IIlllIIlIllIllIlIIll));
                    }
                    this.llIllIlIIIIllIlIIllI();
                }
                catch (IOException ex) {
                    IlIIlllllIIllIIlllll.lIlIlIIIllIIllIIIllI.error("Couldn't load skin " + this.IIIIlllIIIIIIlIIIlll, (Throwable)ex);
                    this.IlIlIlIlIlllllllllIl();
                }
            }
            else {
                this.IlIlIlIlIlllllllllIl();
            }
        }
    }
    
    protected void IlIlIlIlIlllllllllIl() {
        (this.lllIIIIlllllIlIIllIl = new lllllIIlIlIIIlIlIIIl(this, "Texture Downloader #" + IlIIlllllIIllIIlllll.IlIlIIIllIIllIlllllI.incrementAndGet())).setDaemon(true);
        this.lllIIIIlllllIlIIllIl.start();
    }
    
    private boolean lIIIlllIIIllIIIllIII() {
        if (!this.IlIlIlIlIlllllllllIl) {
            return false;
        }
        final Proxy illlIIIIlIIIlIlIlIIl = Minecraft.getMinecraft().IlllIIIIlIIIlIlIlIIl();
        return (illlIIIIlIIIlIlIlIIl.type() == Proxy.Type.DIRECT || illlIIIIlIIIlIlIlIIl.type() == Proxy.Type.SOCKS) && this.llllIIllllIlIlIIIIll.startsWith("http://");
    }
    
    private void llIIlIIIlIIIllIlIIIl() {
        try {
            final llIllIlIIIIllIlIIllI llllIIIIlIIIlIlllIll = net.optifine.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.optifine.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.llllIIllllIlIlIIIIll, Minecraft.getMinecraft().IlllIIIIlIIIlIlIlIIl()));
            if (llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll() / 100 != 2) {
                return;
            }
            final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl());
            BufferedImage bufferedImage;
            if (this.IIIIlllIIIIIIlIIIlll != null) {
                FileUtils.copyInputStreamToFile((InputStream)byteArrayInputStream, this.IIIIlllIIIIIIlIIIlll);
                bufferedImage = ImageIO.read(this.IIIIlllIIIIIIlIIIlll);
            }
            else {
                bufferedImage = IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(byteArrayInputStream);
            }
            if (this.IlIllIlIlIIIlIlIlIII != null) {
                bufferedImage = this.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(bufferedImage);
            }
            this.llllIIIIlIIIlIlllIll(bufferedImage);
        }
        catch (Exception ex) {
            IlIIlllllIIllIIlllll.lIlIlIIIllIIllIIIllI.error("Couldn't download http texture: " + ex.getClass().getName() + ": " + ex.getMessage());
            return;
        }
        finally {
            this.llIllIlIIIIllIlIIllI();
        }
        this.llIllIlIIIIllIlIIllI();
    }
    
    private void llIllIlIIIIllIlIIllI() {
        this.llllIIIIlIIIlIlllIll = (this.IIlllIIlIllIllIlIIll != null);
        if (this.IlIllIlIlIIIlIlIlIII instanceof net.optifine.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll) {
            ((net.optifine.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll)this.IlIllIlIlIIIlIlIlIII).IlIlIlIlIlllllllllIl();
        }
    }
    
    public IlIIlIlIIIlIIlIlIlII llIllIIIIIllIlIIIIlI() {
        return this.IlIllIlIlIIIlIlIlIII;
    }
}
