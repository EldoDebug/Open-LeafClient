package net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.IlIlIlIlIlllllllllIl.*;
import com.mojang.authlib.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class lIllllllIIllIlIlIlII extends llllIIIIlIIIlIlllIll
{
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "whitelist";
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 3;
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.whitelist.usage";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        if (array.length < 1) {
            throw new llllIllllIllllIlIlII("commands.whitelist.usage", new Object[0]);
        }
        final net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll iiiiIllIIIIlIIIIllIl = net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl();
        if (array[0].equals("on")) {
            iiiiIllIIIIlIIIIllIl.IIlllIIlllIIIlIlllII().IlIlIlIlIlllllllllIl(true);
            net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.whitelist.enabled", new Object[0]);
        }
        else if (array[0].equals("off")) {
            iiiiIllIIIIlIIIIllIl.IIlllIIlllIIIlIlllII().IlIlIlIlIlllllllllIl(false);
            net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.whitelist.disabled", new Object[0]);
        }
        else if (array[0].equals("list")) {
            illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(new IIllIIllIIIlIlIIIIlI("commands.whitelist.list", new Object[] { iiiiIllIIIIlIIIIllIl.IIlllIIlllIIIlIlllII().lIlIlIIIllIIllIIIllI().length, iiiiIllIIIIlIIIIllIl.IIlllIIlllIIIlIlllII().lllIIIIlllllIlIIllIl().length }));
            illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(new IlIlIIIIIIlllIlIllIl(net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll((Object[])iiiiIllIIIIlIIIIllIl.IIlllIIlllIIIlIlllII().lIlIlIIIllIIllIIIllI())));
        }
        else if (array[0].equals("add")) {
            if (array.length < 2) {
                throw new llllIllllIllllIlIlII("commands.whitelist.add.usage", new Object[0]);
            }
            final GameProfile llllIIIIlIIIlIlllIll = iiiiIllIIIIlIIIIllIl.lIIIIIlIlIIIlIIIIlIl().llllIIIIlIIIlIlllIll(array[1]);
            if (llllIIIIlIIIlIlllIll == null) {
                throw new IIIIlllIIIIIIlIIIlll("commands.whitelist.add.failed", new Object[] { array[1] });
            }
            iiiiIllIIIIlIIIIllIl.IIlllIIlllIIIlIlllII().IllIIlllIIIIlllIIlIl(llllIIIIlIIIlIlllIll);
            net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.whitelist.add.success", array[1]);
        }
        else if (array[0].equals("remove")) {
            if (array.length < 2) {
                throw new llllIllllIllllIlIlII("commands.whitelist.remove.usage", new Object[0]);
            }
            final GameProfile llllIIIIlIIIlIlllIll2 = iiiiIllIIIIlIIIIllIl.IIlllIIlllIIIlIlllII().llIllIlIIIIllIlIIllI().llllIIIIlIIIlIlllIll(array[1]);
            if (llllIIIIlIIIlIlllIll2 == null) {
                throw new IIIIlllIIIIIIlIIIlll("commands.whitelist.remove.failed", new Object[] { array[1] });
            }
            iiiiIllIIIIlIIIIllIl.IIlllIIlllIIIlIlllII().llllIIIlIlllIlIIIIIl(llllIIIIlIIIlIlllIll2);
            net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.whitelist.remove.success", array[1]);
        }
        else if (array[0].equals("reload")) {
            iiiiIllIIIIlIIIIllIl.IIlllIIlllIIIlIlllII().llllIIllllIlIlIIIIll();
            net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.whitelist.reloaded", new Object[0]);
        }
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (array.length == 1) {
            return net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, "on", "off", "list", "add", "remove", "reload");
        }
        if (array.length == 2) {
            if (array[0].equals("remove")) {
                return net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().IIlllIIlllIIIlIlllII().lIlIlIIIllIIllIIIllI());
            }
            if (array[0].equals("add")) {
                return net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().lIIIIIlIlIIIlIIIIlIl().llllIIIIlIIIlIlllIll());
            }
        }
        return null;
    }
}
