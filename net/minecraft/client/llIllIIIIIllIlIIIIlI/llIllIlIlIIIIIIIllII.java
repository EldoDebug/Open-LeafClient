package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;

public class llIllIlIlIIIIIIIllII extends lIIllIIIllllIlllIllI
{
    @Override
    public void n_() {
        this.IIlllIIlIllIllIlIIll.clear();
        this.IIlllIIlIllIllIlIIll.add(new llIlIIIIIlIIlIlIIlll(0, this.llllIIllllIlIlIIIIll / 2 - 155, this.IlIllIlIlIIIlIlIlIII / 4 + 120 + 12, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.toTitle", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(new llIlIIIIIlIIlIlIIlll(1, this.llllIIllllIlIlIIIIll / 2 - 155 + 160, this.IlIllIlIlIIIlIlIlIII / 4 + 120 + 12, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("menu.quit", new Object[0])));
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 0) {
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new lllIllIIIllllllIllll());
        }
        else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 1) {
            this.IlIlIIIllIIllIlllllI.IlIlIIIllIIllIlllllI();
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final char c, final int n) {
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.IlIlIIIllIIllIlllllI();
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, "Out of memory!", this.llllIIllllIlIlIIIIll / 2, this.IlIllIlIlIIIlIlIlIII / 4 - 60 + 20, 16777215);
        this.IlIlIlIlIlllllllllIl(this.IIllIIllIIIlIlIIIIlI, "Minecraft has run out of memory.", this.llllIIllllIlIlIIIIll / 2 - 140, this.IlIllIlIlIIIlIlIlIII / 4 - 60 + 60 + 0, 10526880);
        this.IlIlIlIlIlllllllllIl(this.IIllIIllIIIlIlIIIIlI, "This could be caused by a bug in the game or by the", this.llllIIllllIlIlIIIIll / 2 - 140, this.IlIllIlIlIIIlIlIlIII / 4 - 60 + 60 + 18, 10526880);
        this.IlIlIlIlIlllllllllIl(this.IIllIIllIIIlIlIIIIlI, "Java Virtual Machine not being allocated enough", this.llllIIllllIlIlIIIIll / 2 - 140, this.IlIllIlIlIIIlIlIlIII / 4 - 60 + 60 + 27, 10526880);
        this.IlIlIlIlIlllllllllIl(this.IIllIIllIIIlIlIIIIlI, "memory.", this.llllIIllllIlIlIIIIll / 2 - 140, this.IlIllIlIlIIIlIlIlIII / 4 - 60 + 60 + 36, 10526880);
        this.IlIlIlIlIlllllllllIl(this.IIllIIllIIIlIlIIIIlI, "To prevent level corruption, the current game has quit.", this.llllIIllllIlIlIIIIll / 2 - 140, this.IlIllIlIlIIIlIlIlIII / 4 - 60 + 60 + 54, 10526880);
        this.IlIlIlIlIlllllllllIl(this.IIllIIllIIIlIlIIIIlI, "We've tried to free up enough memory to let you go back to", this.llllIIllllIlIlIIIIll / 2 - 140, this.IlIllIlIlIIIlIlIlIII / 4 - 60 + 60 + 63, 10526880);
        this.IlIlIlIlIlllllllllIl(this.IIllIIllIIIlIlIIIIlI, "the main menu and back to playing, but this may not have worked.", this.llllIIllllIlIlIIIIll / 2 - 140, this.IlIllIlIlIIIlIlIlIII / 4 - 60 + 60 + 72, 10526880);
        this.IlIlIlIlIlllllllllIl(this.IIllIIllIIIlIlIIIIlI, "Please restart the game if you see this message again.", this.llllIIllllIlIlIIIIll / 2 - 140, this.IlIllIlIlIIIlIlIlIII / 4 - 60 + 60 + 81, 10526880);
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
}
