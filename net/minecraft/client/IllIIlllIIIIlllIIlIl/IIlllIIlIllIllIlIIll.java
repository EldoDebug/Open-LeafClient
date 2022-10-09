package net.minecraft.client.IllIIlllIIIIlllIIlIl;

import net.minecraft.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import org.apache.commons.lang3.*;
import net.minecraft.client.*;
import net.minecraft.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import com.mojang.authlib.*;

class IIlllIIlIllIllIlIIll implements llllIIIIlIIIlIlllIll
{
    private boolean IlIlIlIlIlllllllllIl;
    private boolean llIllIIIIIllIlIIIIlI;
    private long IlIIIlIlIIIllIlIlIIl;
    final /* synthetic */ IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll;
    private final /* synthetic */ net.minecraft.IlIlIIIllIIllIlllllI.IIlllIIlIllIllIlIIll IlIlIIIllIllIIIIIllI;
    private final /* synthetic */ IllIIlllIIIIlllIIlIl IllIIlllIIIIlllIIlIl;
    
    IIlllIIlIllIllIlIIll(final IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll, final net.minecraft.IlIlIIIllIIllIlllllI.IIlllIIlIllIllIlIIll ilIlIIIllIllIIIIIllI, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.IlIlIlIlIlllllllllIl = false;
        this.llIllIIIIIllIlIIIIlI = false;
        this.IlIIIlIlIIIllIlIlIIl = 0L;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (this.llIllIIIIIllIlIIIIlI) {
            this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(new IlIlIIIIIIlllIlIllIl("Received unrequested status"));
        }
        else {
            this.llIllIIIIIllIlIIIIlI = true;
            final IIIIIIIIIlllIllIlIlI llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
            if (llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll() != null) {
                this.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll().lIIIlllIIIllIIIllIII();
            }
            else {
                this.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl = "";
            }
            if (llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI() != null) {
                this.IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl = llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll();
                this.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl = llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI().IlIlIlIlIlllllllllIl();
            }
            else {
                this.IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl = "Old";
                this.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl = 0;
            }
            if (llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl() != null) {
                this.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI = new StringBuilder().append(IlllIIIIlIIIlIlIlIIl.lIIIIlIIIIIlllIllIII).append(llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl().IlIlIlIlIlllllllllIl()).append(IlllIIIIlIIIlIlIlIIl.lIIIlllIIIllIIIllIII).append("/").append(IlllIIIIlIIIlIlIlIIl.lIIIIlIIIIIlllIllIII).append(llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll()).toString();
                if (ArrayUtils.isNotEmpty((Object[])llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl().llIllIIIIIllIlIIIIlI())) {
                    final StringBuilder sb = new StringBuilder();
                    GameProfile[] llIllIIIIIllIlIIIIlI;
                    for (int length = (llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl().llIllIIIIIllIlIIIIlI()).length, i = 0; i < length; ++i) {
                        final GameProfile gameProfile = llIllIIIIIllIlIIIIlI[i];
                        if (sb.length() > 0) {
                            sb.append("\n");
                        }
                        sb.append(gameProfile.getName());
                    }
                    if (llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl().llIllIIIIIllIlIIIIlI().length < llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl().IlIlIlIlIlllllllllIl()) {
                        if (sb.length() > 0) {
                            sb.append("\n");
                        }
                        sb.append("... and ").append(llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl().IlIlIlIlIlllllllllIl() - llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl().llIllIIIIIllIlIIIIlI().length).append(" more ...");
                    }
                    this.IllIIlllIIIIlllIIlIl.lIIIlllIIIllIIIllIII = sb.toString();
                }
            }
            else {
                this.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI = IlllIIIIlIIIlIlIlIIl.lIIIlllIIIllIIIllIII + "???";
            }
            if (llllIIIIlIIIlIlllIll2.IlIIIlIlIIIllIlIlIIl() != null) {
                final String ilIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll2.IlIIIlIlIIIllIlIlIIl();
                if (ilIIIlIlIIIllIlIlIIl.startsWith("data:image/png;base64,")) {
                    this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.substring("data:image/png;base64,".length()));
                }
                else {
                    IlIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl.error("Invalid server icon (unknown format)");
                }
            }
            else {
                this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll((String)null);
            }
            this.IlIIIlIlIIIllIlIlIIl = Minecraft.IIIllllllIllIIIlllIl();
            this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(new IlIlIlIlIlllllllllIl(this.IlIIIlIlIIIllIlIlIIl));
            this.IlIlIlIlIlllllllllIl = true;
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this.IllIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI = Minecraft.IIIllllllIllIIIlllIl() - this.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(new IlIlIIIIIIlllIlIllIl("Finished"));
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll) {
        if (!this.IlIlIlIlIlllllllllIl) {
            IlIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl.error("Can't ping " + this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl + ": " + llIIIIIIlIllIIlIIIll.lIIIIlIIIIIlllIllIII());
            this.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl = IlllIIIIlIIIlIlIlIIl.IlIlIIIllIllIIIIIllI + "Can't connect to server.";
            this.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI = "";
            this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.IllIIlllIIIIlllIIlIl);
        }
    }
}
