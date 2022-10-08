package net.minecraft.IIIlIIIlIlIIlllIIlll;

import net.minecraft.IlIlIIIIIIlllIlIllIl.*;
import org.apache.logging.log4j.*;
import org.apache.commons.io.*;
import java.io.*;
import com.google.common.collect.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.google.gson.*;
import java.util.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class llllIIllllIlIlIIIIll extends IlIlIIIllIIllIlllllI
{
    private static final Logger IlIlIlIlIlllllllllIl;
    private final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI;
    private final File IlIIIlIlIIIllIlIlIIl;
    private final Set IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    private boolean llllIIIlIlllIlIIIIIl;
    
    static {
        IlIlIlIlIlllllllllIl = LogManager.getLogger();
    }
    
    public llllIIllllIlIlIIIIll(final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI, final File ilIIIlIlIIIllIlIlIIl) {
        this.IlIlIIIllIllIIIIIllI = Sets.newHashSet();
        this.IllIIlllIIIIlllIIlIl = -300;
        this.llllIIIlIlllIlIIIIIl = false;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public void llllIIIIlIIIlIlllIll() {
        if (this.IlIIIlIlIIIllIlIlIIl.isFile()) {
            try {
                this.llllIIIIlIIIlIlllIll.clear();
                this.llllIIIIlIIIlIlllIll.putAll(this.llllIIIIlIIIlIlllIll(FileUtils.readFileToString(this.IlIIIlIlIIIllIlIlIIl)));
            }
            catch (IOException ex) {
                llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl.error("Couldn't read statistics file " + this.IlIIIlIlIIIllIlIlIIl, (Throwable)ex);
            }
            catch (JsonParseException ex2) {
                llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl.error("Couldn't parse statistics file " + this.IlIIIlIlIIIllIlIlIIl, (Throwable)ex2);
            }
        }
    }
    
    public void IlIlIlIlIlllllllllIl() {
        try {
            FileUtils.writeStringToFile(this.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll));
        }
        catch (IOException ex) {
            llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl.error("Couldn't save stats", (Throwable)ex);
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final int n) {
        final int n2 = illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl() ? this.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl) : 0;
        super.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll, illIIlllIIIIlllIIlIl, n);
        this.IlIlIIIllIllIIIIIllI.add(illIIlllIIIIlllIIlIl);
        if (illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl() && n2 == 0 && n > 0) {
            this.llllIIIlIlllIlIIIIIl = true;
            if (this.llIllIIIIIllIlIIIIlI.IllllIIlIlIllIIIllII()) {
                this.llIllIIIIIllIlIIIIlI.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(new IIllIIllIIIlIlIIIIlI("chat.type.achievement", new Object[] { llllIIIIlIIIlIlllIll.v_(), illIIlllIIIIlllIIlIl.llIIlIIIlIIIllIlIIIl() }));
            }
        }
        if (illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl() && n2 > 0 && n == 0) {
            this.llllIIIlIlllIlIIIIIl = true;
            if (this.llIllIIIIIllIlIIIIlI.IllllIIlIlIllIIIllII()) {
                this.llIllIIIIIllIlIIIIlI.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(new IIllIIllIIIlIlIIIIlI("chat.type.achievement.taken", new Object[] { llllIIIIlIIIlIlllIll.v_(), illIIlllIIIIlllIIlIl.llIIlIIIlIIIllIlIIIl() }));
            }
        }
    }
    
    public Set llIllIIIIIllIlIIIIlI() {
        final HashSet hashSet = Sets.newHashSet((Iterable)this.IlIlIIIllIllIIIIIllI);
        this.IlIlIIIllIllIIIIIllI.clear();
        this.llllIIIlIlllIlIIIIIl = false;
        return hashSet;
    }
    
    public Map llllIIIIlIIIlIlllIll(final String s) {
        final JsonElement parse = new JsonParser().parse(s);
        if (!parse.isJsonObject()) {
            return Maps.newHashMap();
        }
        final JsonObject asJsonObject = parse.getAsJsonObject();
        final HashMap hashMap = Maps.newHashMap();
        for (final Map.Entry<String, V> entry : asJsonObject.entrySet()) {
            final IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll = IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(entry.getKey());
            if (llllIIIIlIIIlIlllIll != null) {
                final b b = new b();
                if (((JsonElement)entry.getValue()).isJsonPrimitive() && ((JsonElement)entry.getValue()).getAsJsonPrimitive().isNumber()) {
                    b.llllIIIIlIIIlIlllIll(((JsonElement)entry.getValue()).getAsInt());
                }
                else if (((JsonElement)entry.getValue()).isJsonObject()) {
                    final JsonObject asJsonObject2 = ((JsonElement)entry.getValue()).getAsJsonObject();
                    if (asJsonObject2.has("value") && asJsonObject2.get("value").isJsonPrimitive() && asJsonObject2.get("value").getAsJsonPrimitive().isNumber()) {
                        b.llllIIIIlIIIlIlllIll(asJsonObject2.getAsJsonPrimitive("value").getAsInt());
                    }
                    if (asJsonObject2.has("progress") && llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI() != null) {
                        try {
                            final llIIIlIlllIllIIlIllI llIIIlIlllIllIIlIllI = llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI().getConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
                            llIIIlIlllIllIIlIllI.llllIIIIlIIIlIlllIll(asJsonObject2.get("progress"));
                            b.llllIIIIlIIIlIlllIll(llIIIlIlllIllIIlIllI);
                        }
                        catch (Throwable t) {
                            llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl.warn("Invalid statistic progress in " + this.IlIIIlIlIIIllIlIlIIl, t);
                        }
                    }
                }
                hashMap.put(llllIIIIlIIIlIlllIll, b);
            }
            else {
                llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl.warn("Invalid statistic in " + this.IlIIIlIlIIIllIlIlIIl + ": Don't know what " + entry.getKey() + " is");
            }
        }
        return hashMap;
    }
    
    public static String llllIIIIlIIIlIlllIll(final Map map) {
        final JsonObject jsonObject = new JsonObject();
        for (final Map.Entry<K, b> entry : map.entrySet()) {
            if (entry.getValue().IlIlIlIlIlllllllllIl() != null) {
                final JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty("value", (Number)entry.getValue().llllIIIIlIIIlIlllIll());
                try {
                    jsonObject2.add("progress", entry.getValue().IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll());
                }
                catch (Throwable t) {
                    llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl.warn("Couldn't save statistic " + ((IllIIlllIIIIlllIIlIl)entry.getKey()).IlIlIIIllIllIIIIIllI() + ": error serializing progress", t);
                }
                jsonObject.add(((IllIIlllIIIIlllIIlIl)entry.getKey()).IlIlIIIllIllIIIIIllI, (JsonElement)jsonObject2);
            }
            else {
                jsonObject.addProperty(((IllIIlllIIIIlllIIlIl)entry.getKey()).IlIlIIIllIllIIIIIllI, (Number)entry.getValue().llllIIIIlIIIlIlllIll());
            }
        }
        return jsonObject.toString();
    }
    
    public void IlIIIlIlIIIllIlIlIIl() {
        final Iterator<IllIIlllIIIIlllIIlIl> iterator = this.llllIIIIlIIIlIlllIll.keySet().iterator();
        while (iterator.hasNext()) {
            this.IlIlIIIllIllIIIIIllI.add(iterator.next());
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        final int llllIllllIllllIlIlII = this.llIllIIIIIllIlIIIIlI.llllIllllIllllIlIlII();
        final HashMap hashMap = Maps.newHashMap();
        if (this.llllIIIlIlllIlIIIIIl || llllIllllIllllIlIlII - this.IllIIlllIIIIlllIIlIl > 300) {
            this.IllIIlllIIIIlllIIlIl = llllIllllIllllIlIlII;
            for (final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl : this.llIllIIIIIllIlIIIIlI()) {
                hashMap.put(illIIlllIIIIlllIIlIl, this.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl));
            }
        }
        ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new lIlIIlllIIlIIlIlllIl(hashMap));
    }
    
    public void IlIlIlIlIlllllllllIl(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        final HashMap hashMap = Maps.newHashMap();
        for (final net.minecraft.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll : net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI) {
            if (this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll)) {
                hashMap.put(llllIIIIlIIIlIlllIll, this.llllIIIIlIIIlIlllIll((IllIIlllIIIIlllIIlIl)llllIIIIlIIIlIlllIll));
                this.IlIlIIIllIllIIIIIllI.remove(llllIIIIlIIIlIlllIll);
            }
        }
        ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new lIlIIlllIIlIIlIlllIl(hashMap));
    }
    
    public boolean IlIlIIIllIllIIIIIllI() {
        return this.llllIIIlIlllIlIIIIIl;
    }
}
