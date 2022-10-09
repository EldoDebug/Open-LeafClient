package net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl;

import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import org.apache.logging.log4j.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import com.google.common.base.*;
import org.apache.commons.io.*;
import java.io.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.optifine.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import com.google.common.collect.*;
import java.util.*;
import net.optifine.util.*;

public class llIllIIIIIllIlIIIIlI
{
    private static final Set IlIlIlIlIlllllllllIl;
    private static final Logger llIllIIIIIllIlIIIIlI;
    protected static final llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll;
    private static final Map IlIIIlIlIIIllIlIlIIl;
    private static final Joiner IlIlIIIllIllIIIIIllI;
    private final IlIlIIIllIIllIlllllI IllIIlllIIIIlllIIlIl;
    private final Map llllIIIlIlllIlIIIIIl;
    private final Map lIIIIlIIIIIlllIllIII;
    private final Map lIIIlllIIIllIIIllIII;
    private final IlIlIIIIIIlllIlIllIl llIIlIIIlIIIllIlIIIl;
    private final lIIIIlIIIIIlllIllIII llIllIlIIIIllIlIIllI;
    private final llIIlIIIlIIIllIlIIIl lIlIlIIIllIIllIIIllI;
    private final IIIIlllIIIIIIlIIIlll IlIlIIIllIIllIlllllI;
    private llllllIIIIIIIlllIIll IIIIlllIIIIIIlIIIlll;
    private static final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl llllIIllllIlIlIIIIll;
    private static final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl IlIllIlIlIIIlIlIlIII;
    private static final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl IIlllIIlIllIllIlIIll;
    private static final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl lllIIIIlllllIlIIllIl;
    private Map IlIlIIIIIIlllIlIllIl;
    private final Map IIllIIllIIIlIlIIIIlI;
    private Map IIIlIIIlIlIIlllIIlll;
    private static Map IlIlIIIlIIlIlIIlllIl;
    
    static {
        IlIlIlIlIlllllllllIl = Sets.newHashSet((Object[])new lIllllIllIllIIllllll[] { new lIllllIllIllIIllllll("blocks/water_flow"), new lIllllIllIllIIllllll("blocks/water_still"), new lIllllIllIllIIllllll("blocks/lava_flow"), new lIllllIllIllIIllllll("blocks/lava_still"), new lIllllIllIllIIllllll("blocks/destroy_stage_0"), new lIllllIllIllIIllllll("blocks/destroy_stage_1"), new lIllllIllIllIIllllll("blocks/destroy_stage_2"), new lIllllIllIllIIllllll("blocks/destroy_stage_3"), new lIllllIllIllIIllllll("blocks/destroy_stage_4"), new lIllllIllIllIIllllll("blocks/destroy_stage_5"), new lIllllIllIllIIllllll("blocks/destroy_stage_6"), new lIllllIllIllIIllllll("blocks/destroy_stage_7"), new lIllllIllIllIIllllll("blocks/destroy_stage_8"), new lIllllIllIllIIllllll("blocks/destroy_stage_9"), new lIllllIllIllIIllllll("items/empty_armor_slot_helmet"), new lIllllIllIllIIllllll("items/empty_armor_slot_chestplate"), new lIllllIllIllIIllllll("items/empty_armor_slot_leggings"), new lIllllIllIllIIllllll("items/empty_armor_slot_boots") });
        llIllIIIIIllIlIIIIlI = LogManager.getLogger();
        llllIIIIlIIIlIlllIll = new llllIIIlIlllIlIIIIIl("builtin/missing", "missing");
        IlIIIlIlIIIllIlIlIIl = Maps.newHashMap();
        IlIlIIIllIllIIIIIllI = Joiner.on(" -> ");
        llllIIllllIlIlIIIIll = net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll("{\"elements\":[{  \"from\": [0, 0, 0],   \"to\": [16, 16, 16],   \"faces\": {       \"down\": {\"uv\": [0, 0, 16, 16], \"texture\":\"\"}   }}]}");
        IlIllIlIlIIIlIlIlIII = net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll("{\"elements\":[{  \"from\": [0, 0, 0],   \"to\": [16, 16, 16],   \"faces\": {       \"down\": {\"uv\": [0, 0, 16, 16], \"texture\":\"\"}   }}]}");
        IIlllIIlIllIllIlIIll = net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll("{\"elements\":[{  \"from\": [0, 0, 0],   \"to\": [16, 16, 16],   \"faces\": {       \"down\": {\"uv\": [0, 0, 16, 16], \"texture\":\"\"}   }}]}");
        lllIIIIlllllIlIIllIl = net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll("{\"elements\":[{  \"from\": [0, 0, 0],   \"to\": [16, 16, 16],   \"faces\": {       \"down\": {\"uv\": [0, 0, 16, 16], \"texture\":\"\"}   }}]}");
        net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.IlIlIIIlIIlIlIIlllIl = Maps.newHashMap();
        net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl.put("missing", "{ \"textures\": {   \"particle\": \"missingno\",   \"missingno\": \"missingno\"}, \"elements\": [ {     \"from\": [ 0, 0, 0 ],     \"to\": [ 16, 16, 16 ],     \"faces\": {         \"down\":  { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"down\", \"texture\": \"#missingno\" },         \"up\":    { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"up\", \"texture\": \"#missingno\" },         \"north\": { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"north\", \"texture\": \"#missingno\" },         \"south\": { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"south\", \"texture\": \"#missingno\" },         \"west\":  { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"west\", \"texture\": \"#missingno\" },         \"east\":  { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"east\", \"texture\": \"#missingno\" }    }}]}");
        net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl = "generation marker";
        net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.IlIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl = "compass generation marker";
        net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.IIlllIIlIllIllIlIIll.IlIlIlIlIlllllllllIl = "class generation marker";
        net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl = "block entity marker";
    }
    
    public llIllIIIIIllIlIIIIlI(final IlIlIIIllIIllIlllllI illIIlllIIIIlllIIlIl, final IlIlIIIIIIlllIlIllIl llIIlIIIlIIIllIlIIIl, final lIIIIlIIIIIlllIllIII llIllIlIIIIllIlIIllI) {
        this.llllIIIlIlllIlIIIIIl = Maps.newHashMap();
        this.lIIIIlIIIIIlllIllIII = Maps.newLinkedHashMap();
        this.lIIIlllIIIllIIIllIII = Maps.newLinkedHashMap();
        this.lIlIlIIIllIIllIIIllI = new llIIlIIIlIIIllIlIIIl();
        this.IlIlIIIllIIllIlllllI = new IIIIlllIIIIIIlIIIlll();
        this.IIIIlllIIIIIIlIIIlll = new llllllIIIIIIIlllIIll();
        this.IlIlIIIIIIlllIlIllIl = Maps.newLinkedHashMap();
        this.IIllIIllIIIlIlIIIIlI = Maps.newHashMap();
        this.IIIlIIIlIlIIlllIIlll = Maps.newIdentityHashMap();
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
    }
    
    public IllIIlllllIIllIIllIl llllIIIIlIIIlIlllIll() {
        this.IlIlIlIlIlllllllllIl();
        this.lIIIIlIIIIIlllIllIII();
        this.llIIlIIIlIIIllIlIIIl();
        this.lIlIlIIIllIIllIIIllI();
        this.IllIIlllIIIIlllIIlIl();
        return this.IIIIlllIIIIIIlIIIlll;
    }
    
    private void IlIlIlIlIlllllllllIl() {
        this.llllIIIIlIIIlIlllIll(this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll().values());
        this.lIIIlllIIIllIIIllIII.put(net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll, new llIIIlIlIllIIlIlIlII(net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(), Lists.newArrayList((Object[])new IlIlIllllllllIIIIlII[] { new IlIlIllllllllIIIIlII(new lIllllIllIllIIllllll(net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl()), net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll, false, 1) })));
        final lIllllIllIllIIllllll lIllllIllIllIIllllll = new lIllllIllIllIIllllll("item_frame");
        final IlllllllIIIlIIIlIlII ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl(lIllllIllIllIIllllll);
        this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, new llllIIIlIlllIlIIIIIl(lIllllIllIllIIllllll, "normal"));
        this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, new llllIIIlIlllIlIIIIIl(lIllllIllIllIIllllll, "map"));
        this.llIllIIIIIllIlIIIIlI();
        this.IlIIIlIlIIIllIlIlIIl();
    }
    
    private void llllIIIIlIIIlIlllIll(final Collection collection) {
        for (final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl : collection) {
            try {
                final IlllllllIIIlIIIlIlII ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl);
                try {
                    this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llllIIIlIlllIlIIIIIl);
                }
                catch (Exception ex) {
                    net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.warn("Unable to load variant: " + llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll() + " from " + llllIIIlIlllIlIIIIIl, (Throwable)ex);
                }
            }
            catch (Exception ex2) {
                net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.warn("Unable to load definition " + llllIIIlIlllIlIIIIIl, (Throwable)ex2);
            }
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        this.lIIIlllIIIllIIIllIII.put(llllIIIlIlllIlIIIIIl, illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll()));
    }
    
    private IlllllllIIIlIIIlIlII IlIlIlIlIlllllllllIl(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        final lIllllIllIllIIllllll llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI(lIllllIllIllIIllllll);
        IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII = this.IIllIIllIIIlIlIIIIlI.get(llIllIIIIIllIlIIIIlI);
        if (illlllllIIIlIIIlIlII == null) {
            final ArrayList arrayList = Lists.newArrayList();
            try {
                for (final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI : this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI)) {
                    InputStream ilIlIlIlIlllllllllIl = null;
                    try {
                        ilIlIlIlIlllllllllIl = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl();
                        arrayList.add(IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(new InputStreamReader(ilIlIlIlIlllllllllIl, Charsets.UTF_8)));
                    }
                    catch (Exception ex) {
                        throw new RuntimeException("Encountered an exception when loading model definition of '" + lIllllIllIllIIllllll + "' from: '" + lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() + "' in resourcepack: '" + lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl() + "'", ex);
                    }
                    finally {
                        IOUtils.closeQuietly(ilIlIlIlIlllllllllIl);
                    }
                    IOUtils.closeQuietly(ilIlIlIlIlllllllllIl);
                }
            }
            catch (IOException ex2) {
                throw new RuntimeException("Encountered an exception when loading model definition of model " + llIllIIIIIllIlIIIIlI.toString(), ex2);
            }
            illlllllIIIlIIIlIlII = new IlllllllIIIlIIIlIlII(arrayList);
            this.IIllIIllIIIlIlIIIIlI.put(llIllIIIIIllIlIIIIlI, illlllllIIIlIIIlIlII);
        }
        return illlllllIIIlIIIlIlII;
    }
    
    private lIllllIllIllIIllllll llIllIIIIIllIlIIIIlI(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        return new lIllllIllIllIIllllll(lIllllIllIllIIllllll.llIllIIIIIllIlIIIIlI(), "blockstates/" + lIllllIllIllIIllllll.IlIlIlIlIlllllllllIl() + ".json");
    }
    
    private void llIllIIIIIllIlIIIIlI() {
        for (final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl : this.lIIIlllIIIllIIIllIII.keySet()) {
            final Iterator iterator2 = this.lIIIlllIIIllIIIllIII.get(llllIIIlIlllIlIIIIIl).llllIIIIlIIIlIlllIll().iterator();
            while (iterator2.hasNext()) {
                final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll = iterator2.next().llllIIIIlIIIlIlllIll();
                if (this.lIIIIlIIIIIlllIllIII.get(llllIIIIlIIIlIlllIll) == null) {
                    try {
                        this.lIIIIlIIIIIlllIllIII.put(llllIIIIlIIIlIlllIll, this.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll));
                    }
                    catch (Exception ex) {
                        net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.warn("Unable to load block model: '" + llllIIIIlIIIlIlllIll + "' for variant: '" + llllIIIlIlllIlIIIIIl + "'", (Throwable)ex);
                    }
                }
            }
        }
    }
    
    private net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl IlIIIlIlIIIllIlIlIIl(lIllllIllIllIIllllll ilIlIIIllIllIIIIIllI) {
        final String ilIlIlIlIlllllllllIl = ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl();
        if ("builtin/generated".equals(ilIlIlIlIlllllllllIl)) {
            return net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.llllIIllllIlIlIIIIll;
        }
        if ("builtin/compass".equals(ilIlIlIlIlllllllllIl)) {
            return net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.IlIllIlIlIIIlIlIlIII;
        }
        if ("builtin/clock".equals(ilIlIlIlIlllllllllIl)) {
            return net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.IIlllIIlIllIllIlIIll;
        }
        if ("builtin/entity".equals(ilIlIlIlIlllllllllIl)) {
            return net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.lllIIIIlllllIlIIllIl;
        }
        Reader reader;
        if (ilIlIlIlIlllllllllIl.startsWith("builtin/")) {
            final Object o = ilIlIlIlIlllllllllIl.substring("builtin/".length());
            final String s = net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl.get(o);
            if (s == null) {
                throw new FileNotFoundException(ilIlIIIllIllIIIIIllI.toString());
            }
            reader = new StringReader(s);
        }
        else {
            ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI(ilIlIIIllIllIIIIIllI);
            final Object o = this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI);
            reader = new InputStreamReader(((lIlIlIIIllIIllIIIllI)o).IlIlIlIlIlllllllllIl(), Charsets.UTF_8);
        }
        Object o;
        try {
            final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl llllIIIIlIIIlIlllIll = net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(reader);
            llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl = ilIlIIIllIllIIIIIllI.toString();
            o = llllIIIIlIIIlIlllIll;
            llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl()));
        }
        finally {
            reader.close();
        }
        reader.close();
        return (net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl)o;
    }
    
    private lIllllIllIllIIllllll IlIlIIIllIllIIIIIllI(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        lIllllIllIllIIllllll lIllllIllIllIIllllll2 = lIllllIllIllIIllllll;
        final String ilIlIlIlIlllllllllIl = lIllllIllIllIIllllll.IlIlIlIlIlllllllllIl();
        if (!ilIlIlIlIlllllllllIl.startsWith("mcpatcher") && !ilIlIlIlIlllllllllIl.startsWith("optifine")) {
            return new lIllllIllIllIIllllll(lIllllIllIllIIllllll.llIllIIIIIllIlIIIIlI(), "models/" + lIllllIllIllIIllllll.IlIlIlIlIlllllllllIl() + ".json");
        }
        if (!ilIlIlIlIlllllllllIl.endsWith(".json")) {
            lIllllIllIllIIllllll2 = new lIllllIllIllIIllllll(lIllllIllIllIIllllll.llIllIIIIIllIlIIIIlI(), String.valueOf(ilIlIlIlIlllllllllIl) + ".json");
        }
        return lIllllIllIllIIllllll2;
    }
    
    private void IlIIIlIlIIIllIlIlIIl() {
        this.IlIlIIIllIllIIIIIllI();
        for (final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl : net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll) {
            for (final String s : this.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl)) {
                final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(s);
                this.IlIlIIIIIIlllIlIllIl.put(s, llllIIIIlIIIlIlllIll);
                if (this.lIIIIlIIIIIlllIllIII.get(llllIIIIlIIIlIlllIll) == null) {
                    try {
                        this.lIIIIlIIIIIlllIllIII.put(llllIIIIlIIIlIlllIll, this.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll));
                    }
                    catch (Exception ex) {
                        net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.warn("Unable to load item model: '" + llllIIIIlIIIlIlllIll + "' for item: '" + net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl) + "'", (Throwable)ex);
                    }
                }
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final String s, final lIllllIllIllIIllllll lIllllIllIllIIllllll, final lIllllIllIllIIllllll lIllllIllIllIIllllll2) {
        this.IlIlIIIIIIlllIlIllIl.put(s, lIllllIllIllIIllllll);
        if (this.lIIIIlIIIIIlllIllIII.get(lIllllIllIllIIllllll) == null) {
            try {
                this.lIIIIlIIIIIlllIllIII.put(lIllllIllIllIIllllll, this.IlIIIlIlIIIllIlIlIIl(lIllllIllIllIIllllll));
            }
            catch (Exception ex) {
                net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.warn("Unable to load item model: '{}' for item: '{}'", new Object[] { lIllllIllIllIIllllll, lIllllIllIllIIllllll2 });
                net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.warn(String.valueOf(ex.getClass().getName()) + ": " + ex.getMessage());
            }
        }
    }
    
    private void IlIlIIIllIllIIIIIllI() {
        this.IIIlIIIlIlIIlllIIlll.clear();
        this.IIIlIIIlIlIIlllIIlll.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl), Lists.newArrayList((Object[])new String[] { "stone", "granite", "granite_smooth", "diorite", "diorite_smooth", "andesite", "andesite_smooth" }));
        this.IIIlIIIlIlIIlllIIlll.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl), Lists.newArrayList((Object[])new String[] { "dirt", "coarse_dirt", "podzol" }));
        this.IIIlIIIlIlIIlllIIlll.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl), Lists.newArrayList((Object[])new String[] { "oak_planks", "spruce_planks", "birch_planks", "jungle_planks", "acacia_planks", "dark_oak_planks" }));
        this.IIIlIIIlIlIIlllIIlll.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl), Lists.newArrayList((Object[])new String[] { "oak_sapling", "spruce_sapling", "birch_sapling", "jungle_sapling", "acacia_sapling", "dark_oak_sapling" }));
        this.IIIlIIIlIlIIlllIIlll.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI), Lists.newArrayList((Object[])new String[] { "sand", "red_sand" }));
        this.IIIlIIIlIlIIlllIIlll.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl), Lists.newArrayList((Object[])new String[] { "oak_log", "spruce_log", "birch_log", "jungle_log" }));
        this.IIIlIIIlIlIIlllIIlll.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI), Lists.newArrayList((Object[])new String[] { "oak_leaves", "spruce_leaves", "birch_leaves", "jungle_leaves" }));
        this.IIIlIIIlIlIIlllIIlll.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIlIIlIlIIlllIl), Lists.newArrayList((Object[])new String[] { "sponge", "sponge_wet" }));
        this.IIIlIIIlIlIIlllIIlll.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl), Lists.newArrayList((Object[])new String[] { "sandstone", "chiseled_sandstone", "smooth_sandstone" }));
        this.IIIlIIIlIlIIlllIIlll.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aQ), Lists.newArrayList((Object[])new String[] { "red_sandstone", "chiseled_red_sandstone", "smooth_red_sandstone" }));
        this.IIIlIIIlIlIIlllIIlll.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI), Lists.newArrayList((Object[])new String[] { "dead_bush", "tall_grass", "fern" }));
        this.IIIlIIIlIlIIlllIIlll.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIllllllIllIIIlllIl), Lists.newArrayList((Object[])new String[] { "dead_bush" }));
        this.IIIlIIIlIlIIlllIIlll.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI), Lists.newArrayList((Object[])new String[] { "black_wool", "red_wool", "green_wool", "brown_wool", "blue_wool", "purple_wool", "cyan_wool", "silver_wool", "gray_wool", "pink_wool", "lime_wool", "yellow_wool", "light_blue_wool", "magenta_wool", "orange_wool", "white_wool" }));
        this.IIIlIIIlIlIIlllIIlll.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlllIIIIlIIIlIlIlIIl), Lists.newArrayList((Object[])new String[] { "dandelion" }));
        this.IIIlIIIlIlIIlllIIlll.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll), Lists.newArrayList((Object[])new String[] { "poppy", "blue_orchid", "allium", "houstonia", "red_tulip", "orange_tulip", "white_tulip", "pink_tulip", "oxeye_daisy" }));
        this.IIIlIIIlIlIIlllIIlll.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIlIIIIIlIIlIlIIlll), Lists.newArrayList((Object[])new String[] { "stone_slab", "sandstone_slab", "cobblestone_slab", "brick_slab", "stone_brick_slab", "nether_brick_slab", "quartz_slab" }));
        this.IIIlIIIlIlIIlllIIlll.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aT), Lists.newArrayList((Object[])new String[] { "red_sandstone_slab" }));
        this.IIIlIIIlIlIIlllIIlll.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aK), Lists.newArrayList((Object[])new String[] { "black_stained_glass", "red_stained_glass", "green_stained_glass", "brown_stained_glass", "blue_stained_glass", "purple_stained_glass", "cyan_stained_glass", "silver_stained_glass", "gray_stained_glass", "pink_stained_glass", "lime_stained_glass", "yellow_stained_glass", "light_blue_stained_glass", "magenta_stained_glass", "orange_stained_glass", "white_stained_glass" }));
        this.IIIlIIIlIlIIlllIIlll.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.i), Lists.newArrayList((Object[])new String[] { "stone_monster_egg", "cobblestone_monster_egg", "stone_brick_monster_egg", "mossy_brick_monster_egg", "cracked_brick_monster_egg", "chiseled_brick_monster_egg" }));
        this.IIIlIIIlIlIIlllIIlll.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.j), Lists.newArrayList((Object[])new String[] { "stonebrick", "mossy_stonebrick", "cracked_stonebrick", "chiseled_stonebrick" }));
        this.IIIlIIIlIlIIlllIIlll.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.Q), Lists.newArrayList((Object[])new String[] { "oak_slab", "spruce_slab", "birch_slab", "jungle_slab", "acacia_slab", "dark_oak_slab" }));
        this.IIIlIIIlIlIIlllIIlll.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ad), Lists.newArrayList((Object[])new String[] { "cobblestone_wall", "mossy_cobblestone_wall" }));
        this.IIIlIIIlIlIIlllIIlll.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aj), Lists.newArrayList((Object[])new String[] { "anvil_intact", "anvil_slightly_damaged", "anvil_very_damaged" }));
        this.IIIlIIIlIlIIlllIIlll.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.au), Lists.newArrayList((Object[])new String[] { "quartz_block", "chiseled_quartz_block", "quartz_column" }));
        this.IIIlIIIlIlIIlllIIlll.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay), Lists.newArrayList((Object[])new String[] { "black_stained_hardened_clay", "red_stained_hardened_clay", "green_stained_hardened_clay", "brown_stained_hardened_clay", "blue_stained_hardened_clay", "purple_stained_hardened_clay", "cyan_stained_hardened_clay", "silver_stained_hardened_clay", "gray_stained_hardened_clay", "pink_stained_hardened_clay", "lime_stained_hardened_clay", "yellow_stained_hardened_clay", "light_blue_stained_hardened_clay", "magenta_stained_hardened_clay", "orange_stained_hardened_clay", "white_stained_hardened_clay" }));
        this.IIIlIIIlIlIIlllIIlll.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aL), Lists.newArrayList((Object[])new String[] { "black_stained_glass_pane", "red_stained_glass_pane", "green_stained_glass_pane", "brown_stained_glass_pane", "blue_stained_glass_pane", "purple_stained_glass_pane", "cyan_stained_glass_pane", "silver_stained_glass_pane", "gray_stained_glass_pane", "pink_stained_glass_pane", "lime_stained_glass_pane", "yellow_stained_glass_pane", "light_blue_stained_glass_pane", "magenta_stained_glass_pane", "orange_stained_glass_pane", "white_stained_glass_pane" }));
        this.IIIlIIIlIlIIlllIIlll.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll), Lists.newArrayList((Object[])new String[] { "acacia_leaves", "dark_oak_leaves" }));
        this.IIIlIIIlIlIIlllIIlll.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl), Lists.newArrayList((Object[])new String[] { "acacia_log", "dark_oak_log" }));
        this.IIIlIIIlIlIIlllIIlll.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aM), Lists.newArrayList((Object[])new String[] { "prismarine", "prismarine_bricks", "dark_prismarine" }));
        this.IIIlIIIlIlIIlllIIlll.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aC), Lists.newArrayList((Object[])new String[] { "black_carpet", "red_carpet", "green_carpet", "brown_carpet", "blue_carpet", "purple_carpet", "cyan_carpet", "silver_carpet", "gray_carpet", "pink_carpet", "lime_carpet", "yellow_carpet", "light_blue_carpet", "magenta_carpet", "orange_carpet", "white_carpet" }));
        this.IIIlIIIlIlIIlllIIlll.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aJ), Lists.newArrayList((Object[])new String[] { "sunflower", "syringa", "double_grass", "double_fern", "double_rose", "paeonia" }));
        this.IIIlIIIlIlIIlllIIlll.put(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IllIIlllIIIIlllIIlIl, Lists.newArrayList((Object[])new String[] { "bow", "bow_pulling_0", "bow_pulling_1", "bow_pulling_2" }));
        this.IIIlIIIlIlIIlllIIlll.put(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lIIIIlIIIIIlllIllIII, Lists.newArrayList((Object[])new String[] { "coal", "charcoal" }));
        this.IIIlIIIlIlIIlllIIlll.put(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lIIlllIlllllIIlllIll, Lists.newArrayList((Object[])new String[] { "fishing_rod", "fishing_rod_cast" }));
        this.IIIlIIIlIlIIlllIIlll.put(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIIlllIIlIlllllIIlI, Lists.newArrayList((Object[])new String[] { "cod", "salmon", "clownfish", "pufferfish" }));
        this.IIIlIIIlIlIIlllIIlll.put(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llllIlIllllIIlIIlIlI, Lists.newArrayList((Object[])new String[] { "cooked_cod", "cooked_salmon" }));
        this.IIIlIIIlIlIIlllIIlll.put(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.a, Lists.newArrayList((Object[])new String[] { "dye_black", "dye_red", "dye_green", "dye_brown", "dye_blue", "dye_purple", "dye_cyan", "dye_silver", "dye_gray", "dye_pink", "dye_lime", "dye_yellow", "dye_light_blue", "dye_magenta", "dye_orange", "dye_white" }));
        this.IIIlIIIlIlIIlllIIlll.put(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.D, Lists.newArrayList((Object[])new String[] { "bottle_drinkable", "bottle_splash" }));
        this.IIIlIIIlIlIIlllIIlll.put(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ab, Lists.newArrayList((Object[])new String[] { "skull_skeleton", "skull_wither", "skull_zombie", "skull_char", "skull_creeper" }));
        this.IIIlIIIlIlIIlllIIlll.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.s), Lists.newArrayList((Object[])new String[] { "oak_fence_gate" }));
        this.IIIlIIIlIlIIlllIIlll.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIlllIllIIIIllllII), Lists.newArrayList((Object[])new String[] { "oak_fence" }));
        this.IIIlIIIlIlIIlllIIlll.put(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lIIllIIIllllIlllIllI, Lists.newArrayList((Object[])new String[] { "oak_door" }));
        for (final Map.Entry<net.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, V> entry : net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.IlIlIIIlIIlIlIIlllIl.entrySet()) {
            this.IIIlIIIlIlIIlllIIlll.put(entry.getKey().llllIIIIlIIIlIlllIll(), Lists.newArrayList((Iterator)((Set)entry.getValue()).iterator()));
        }
        lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll();
        lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll(this);
    }
    
    private List llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        List<String> singletonList = this.IIIlIIIlIlIIlllIIlll.get(ilIIIlIlIIIllIlIlIIl);
        if (singletonList == null) {
            singletonList = Collections.singletonList(((lIllllIllIllIIllllll)net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl)).toString());
        }
        return singletonList;
    }
    
    private lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final String s) {
        lIllllIllIllIIllllll lIllllIllIllIIllllll = new lIllllIllIllIIllllll(s);
        if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IIlIlllIlIlllIlIllll.llIllIIIIIllIlIIIIlI()) {
            lIllllIllIllIIllllll = new lIllllIllIllIIllllll(s.replaceAll("#.*", ""));
        }
        return new lIllllIllIllIIllllll(lIllllIllIllIIllllll.llIllIIIIIllIlIIIIlI(), "item/" + lIllllIllIllIIllllll.IlIlIlIlIlllllllllIl());
    }
    
    private void IllIIlllIIIIlllIIlIl() {
        for (final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl : this.lIIIlllIIIllIIIllIII.keySet()) {
            final net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI = new net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI();
            int n = 0;
            for (final IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII : this.lIIIlllIIIllIIIllIII.get(llllIIIlIlllIlIIIIIl).llllIIIIlIIIlIlllIll()) {
                final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl = this.lIIIIlIIIIIlllIllIII.get(ilIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll());
                if (ilIlIIIIIIlllIlIllIl != null && ilIlIIIIIIlllIlIllIl.IlIIIlIlIIIllIlIlIIl()) {
                    ++n;
                    lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl, ilIlIllllllllIIIIlII.IlIlIlIlIlllllllllIl(), ilIlIllllllllIIIIlII.llIllIIIIIllIlIIIIlI()), ilIlIllllllllIIIIlII.IlIIIlIlIIIllIlIlIIl());
                }
                else {
                    net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.warn("Missing model for: " + llllIIIlIlllIlIIIIIl);
                }
            }
            if (n == 0) {
                net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.warn("No weighted models for: " + llllIIIlIlllIlIIIIIl);
            }
            else if (n == 1) {
                this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl, lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl());
            }
            else {
                this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl, lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll());
            }
        }
        for (final Map.Entry<K, lIllllIllIllIIllllll> entry : this.IlIlIIIIIIlllIlIllIl.entrySet()) {
            final lIllllIllIllIIllllll lIllllIllIllIIllllll = entry.getValue();
            llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl2 = new llllIIIlIlllIlIIIIIl((String)entry.getKey(), "inventory");
            if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.at.llIllIIIIIllIlIIIIlI()) {
                llllIIIlIlllIlIIIIIl2 = (llllIIIlIlllIlIIIIIl)net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.at, entry.getKey());
            }
            final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl2 = this.lIIIIlIIIIIlllIllIII.get(lIllllIllIllIIllllll);
            if (ilIlIIIIIIlllIlIllIl2 != null && ilIlIIIIIIlllIlIllIl2.IlIIIlIlIIIllIlIlIIl()) {
                if (this.llIllIIIIIllIlIIIIlI(ilIlIIIIIIlllIlIllIl2)) {
                    this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl2, new net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl2.llllIIIlIlllIlIIIIIl()));
                }
                else {
                    this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl2, this.llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl2, net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll, false));
                }
            }
            else {
                net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.warn("Missing model for: " + lIllllIllIllIIllllll);
            }
        }
    }
    
    private Set llllIIIlIlllIlIIIIIl() {
        final HashSet hashSet = Sets.newHashSet();
        final ArrayList arrayList = Lists.newArrayList((Iterable)this.lIIIlllIIIllIIIllIII.keySet());
        Collections.sort((List<Object>)arrayList, new net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(this));
        for (final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl : arrayList) {
            final Iterator iterator2 = this.lIIIlllIIIllIIIllIII.get(llllIIIlIlllIlIIIIIl).llllIIIIlIIIlIlllIll().iterator();
            while (iterator2.hasNext()) {
                final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl = this.lIIIIlIIIIIlllIllIII.get(iterator2.next().llllIIIIlIIIlIlllIll());
                if (ilIlIIIIIIlllIlIllIl == null) {
                    net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.warn("Missing model for: " + llllIIIlIlllIlIIIIIl);
                }
                else {
                    hashSet.addAll(this.llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl));
                }
            }
        }
        hashSet.addAll(net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl);
        return hashSet;
    }
    
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl, final net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final boolean b) {
        return this.llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl, (net.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl)liiiIlIIIIIlllIllIII, b);
    }
    
    protected IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl, final net.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final boolean b) {
        final net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll = new net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl(ilIlIIIIIIlllIlIllIl).llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl.get(new lIllllIllIllIIllllll(ilIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI("particle"))));
        for (final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl2 : ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll()) {
            for (final lllIllIIIllllllIllll lllIllIIIllllllIllll : ilIIIlIlIIIllIlIlIIl2.llIllIIIIIllIlIIIIlI.keySet()) {
                final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl = ilIIIlIlIIIllIlIlIIl2.llIllIIIIIllIlIIIIlI.get(lllIllIIIllllllIllll);
                final net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI = this.llllIIIlIlllIlIIIIIl.get(new lIllllIllIllIIllllll(ilIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI(illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl)));
                boolean llllIIIIlIIIlIlllIll2 = true;
                if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IIlIlllIlIlllIlIllll.llIllIIIIIllIlIIIIlI()) {
                    llllIIIIlIIIlIlllIll2 = net.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl());
                }
                if (illIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl != null && llllIIIIlIIIlIlllIll2) {
                    llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(illIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl), this.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl2, illIIlllIIIIlllIIlIl, ilIlIIIllIIllIlllllI, lllIllIIIllllllIllll, ilIIIlIlIIIllIlIlIIl, b));
                }
                else {
                    llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl2, illIIlllIIIIlllIIlIl, ilIlIIIllIIllIlllllI, lllIllIIIllllllIllll, ilIIIlIlIIIllIlIlIIl, b));
                }
            }
        }
        return llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
    }
    
    private net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final boolean b) {
        return net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IIlIlllIlIlllIlIllll.llIllIIIIIllIlIIIIlI() ? this.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, illIIlllIIIIlllIIlIl, ilIlIIIllIIllIlllllI, lllIllIIIllllllIllll, liiiIlIIIIIlllIllIII, b) : this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll, ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl, illIIlllIIIIlllIIlIl, ilIlIIIllIIllIlllllI, lllIllIIIllllllIllll, liiiIlIIIIIlllIllIII, ilIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl, b, ilIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI);
    }
    
    protected net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final net.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl2, final boolean b) {
        return this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll, ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl, illIIlllIIIIlllIIlIl, ilIlIIIllIIllIlllllI, lllIllIIIllllllIllll, ilIIIlIlIIIllIlIlIIl2, ilIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl, b, ilIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI);
    }
    
    private void lIIIIlIIIIIlllIllIII() {
        this.lIIIlllIIIllIIIllIII();
        final Iterator<net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl> iterator = this.lIIIIlIIIIIlllIllIII.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII);
        }
        net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl(this.lIIIIlIIIIIlllIllIII);
    }
    
    private void lIIIlllIIIllIIIllIII() {
        final ArrayDeque arrayDeque = Queues.newArrayDeque();
        final HashSet hashSet = Sets.newHashSet();
        for (final lIllllIllIllIIllllll lIllllIllIllIIllllll : this.lIIIIlIIIIIlllIllIII.keySet()) {
            hashSet.add(lIllllIllIllIIllllll);
            final lIllllIllIllIIllllll ilIlIIIllIllIIIIIllI = this.lIIIIlIIIIIlllIllIII.get(lIllllIllIllIIllllll).IlIlIIIllIllIIIIIllI();
            if (ilIlIIIllIllIIIIIllI != null) {
                arrayDeque.add(ilIlIIIllIllIIIIIllI);
            }
        }
        while (!arrayDeque.isEmpty()) {
            final lIllllIllIllIIllllll lIllllIllIllIIllllll2 = arrayDeque.pop();
            try {
                if (this.lIIIIlIIIIIlllIllIII.get(lIllllIllIllIIllllll2) != null) {
                    continue;
                }
                final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl(lIllllIllIllIIllllll2);
                this.lIIIIlIIIIIlllIllIII.put(lIllllIllIllIIllllll2, ilIIIlIlIIIllIlIlIIl);
                final lIllllIllIllIIllllll ilIlIIIllIllIIIIIllI2 = ilIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI();
                if (ilIlIIIllIllIIIIIllI2 != null && !hashSet.contains(ilIlIIIllIllIIIIIllI2)) {
                    arrayDeque.add(ilIlIIIllIllIIIIIllI2);
                }
            }
            catch (Exception ex) {
                net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.warn("In parent chain: " + net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI.join((Iterable)this.IllIIlllIIIIlllIIlIl(lIllllIllIllIIllllll2)) + "; unable to load model: '" + lIllllIllIllIIllllll2 + "'");
            }
            hashSet.add(lIllllIllIllIIllllll2);
        }
    }
    
    private List IllIIlllIIIIlllIIlIl(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        final ArrayList arrayList = Lists.newArrayList((Object[])new lIllllIllIllIIllllll[] { lIllllIllIllIIllllll });
        lIllllIllIllIIllllll llllIIIlIlllIlIIIIIl = lIllllIllIllIIllllll;
        while ((llllIIIlIlllIlIIIIIl = this.llllIIIlIlllIlIIIIIl(llllIIIlIlllIlIIIIIl)) != null) {
            arrayList.add(0, llllIIIlIlllIlIIIIIl);
        }
        return arrayList;
    }
    
    private lIllllIllIllIIllllll llllIIIlIlllIlIIIIIl(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        for (final Map.Entry<K, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl> entry : this.lIIIIlIIIIIlllIllIII.entrySet()) {
            final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl = entry.getValue();
            if (ilIlIIIIIIlllIlIllIl != null && lIllllIllIllIIllllll.equals(ilIlIIIIIIlllIlIllIl.IlIlIIIllIllIIIIIllI())) {
                return (lIllllIllIllIIllllll)entry.getKey();
            }
        }
        return null;
    }
    
    private Set llllIIIIlIIIlIlllIll(final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl) {
        final HashSet hashSet = Sets.newHashSet();
        final Iterator<net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl> iterator = ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll().iterator();
        while (iterator.hasNext()) {
            final Iterator<IllIIlllIIIIlllIIlIl> iterator2 = iterator.next().llIllIIIIIllIlIIIIlI.values().iterator();
            while (iterator2.hasNext()) {
                hashSet.add(new lIllllIllIllIIllllll(ilIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI(iterator2.next().IlIIIlIlIIIllIlIlIIl)));
            }
        }
        hashSet.add(new lIllllIllIllIIllllll(ilIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI("particle")));
        return hashSet;
    }
    
    private void llIIlIIIlIIIllIlIIIl() {
        final Set llllIIIlIlllIlIIIIIl = this.llllIIIlIlllIlIIIIIl();
        llllIIIlIlllIlIIIIIl.addAll(this.llIllIlIIIIllIlIIllI());
        llllIIIlIlllIlIIIIIl.remove(net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll);
        this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl, new net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(this, llllIIIlIlllIlIIIIIl));
        this.llllIIIlIlllIlIIIIIl.put(new lIllllIllIllIIllllll("missingno"), this.llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl());
    }
    
    private Set llIllIlIIIIllIlIIllI() {
        final HashSet hashSet = Sets.newHashSet();
        final Iterator<lIllllIllIllIIllllll> iterator = this.IlIlIIIIIIlllIlIllIl.values().iterator();
        while (iterator.hasNext()) {
            final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl = this.lIIIIlIIIIIlllIllIII.get(iterator.next());
            if (ilIlIIIIIIlllIlIllIl != null) {
                hashSet.add(new lIllllIllIllIIllllll(ilIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI("particle")));
                if (this.IlIlIlIlIlllllllllIl(ilIlIIIIIIlllIlIllIl)) {
                    final Iterator<String> iterator2 = (Iterator<String>)net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll.iterator();
                    while (iterator2.hasNext()) {
                        final lIllllIllIllIIllllll lIllllIllIllIIllllll = new lIllllIllIllIIllllll(ilIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI(iterator2.next()));
                        if (ilIlIIIIIIlllIlIllIl.IllIIlllIIIIlllIIlIl() == net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.IlIllIlIlIIIlIlIlIII && !net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.equals(lIllllIllIllIIllllll)) {
                            net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl(lIllllIllIllIIllllll.toString());
                        }
                        else if (ilIlIIIIIIlllIlIllIl.IllIIlllIIIIlllIIlIl() == net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.IIlllIIlIllIllIlIIll && !net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.equals(lIllllIllIllIIllllll)) {
                            net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll.toString());
                        }
                        hashSet.add(lIllllIllIllIIllllll);
                    }
                }
                else {
                    if (this.llIllIIIIIllIlIIIIlI(ilIlIIIIIIlllIlIllIl)) {
                        continue;
                    }
                    final Iterator iterator3 = ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll().iterator();
                    while (iterator3.hasNext()) {
                        final Iterator<IllIIlllIIIIlllIIlIl> iterator4 = iterator3.next().llIllIIIIIllIlIIIIlI.values().iterator();
                        while (iterator4.hasNext()) {
                            hashSet.add(new lIllllIllIllIIllllll(ilIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI(iterator4.next().IlIIIlIlIIIllIlIlIIl)));
                        }
                    }
                }
            }
        }
        return hashSet;
    }
    
    private boolean IlIlIlIlIlllllllllIl(final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl) {
        if (ilIlIIIIIIlllIlIllIl == null) {
            return false;
        }
        final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl illIIlllIIIIlllIIlIl = ilIlIIIIIIlllIlIllIl.IllIIlllIIIIlllIIlIl();
        return illIIlllIIIIlllIIlIl == net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.llllIIllllIlIlIIIIll || illIIlllIIIIlllIIlIl == net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.IlIllIlIlIIIlIlIlIII || illIIlllIIIIlllIIlIl == net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.IIlllIIlIllIllIlIIll;
    }
    
    private boolean llIllIIIIIllIlIIIIlI(final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl) {
        return ilIlIIIIIIlllIlIllIl != null && ilIlIIIIIIlllIlIllIl.IllIIlllIIIIlllIIlIl() == net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.lllIIIIlllllIlIIllIl;
    }
    
    private void lIlIlIIIllIIllIIIllI() {
        for (final lIllllIllIllIIllllll lIllllIllIllIIllllll : this.IlIlIIIIIIlllIlIllIl.values()) {
            final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl = this.lIIIIlIIIIIlllIllIII.get(lIllllIllIllIIllllll);
            if (this.IlIlIlIlIlllllllllIl(ilIlIIIIIIlllIlIllIl)) {
                final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl(ilIlIIIIIIlllIlIllIl);
                if (ilIIIlIlIIIllIlIlIIl != null) {
                    ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl = lIllllIllIllIIllllll.toString();
                }
                this.lIIIIlIIIIIlllIllIII.put(lIllllIllIllIIllllll, ilIIIlIlIIIllIlIlIIl);
            }
            else {
                if (!this.llIllIIIIIllIlIIIIlI(ilIlIIIIIIlllIlIllIl)) {
                    continue;
                }
                this.lIIIIlIIIIIlllIllIII.put(lIllllIllIllIIllllll, ilIlIIIIIIlllIlIllIl);
            }
        }
        for (final net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI : this.llllIIIlIlllIlIIIIIl.values()) {
            if (!ilIlIIIllIIllIlllllI.IlIlIIIllIIllIlllllI()) {
                ilIlIIIllIIllIlllllI.lIlIlIIIllIIllIIIllI();
            }
        }
    }
    
    private net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl IlIIIlIlIIIllIlIlIIl(final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl) {
        return this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl, ilIlIIIIIIlllIlIllIl);
    }
    
    public net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl llllIIIIlIIIlIlllIll(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        return this.lIIIIlIIIIIlllIllIII.get(lIllllIllIllIIllllll);
    }
    
    public static void llllIIIIlIIIlIlllIll(final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl, final String s) {
        final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl.IlIlIIIllIllIIIIIllI(), s);
        if (llllIIIIlIIIlIlllIll != ilIlIIIIIIlllIlIllIl.IlIlIIIllIllIIIIIllI()) {
            net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.bs, llllIIIIlIIIlIlllIll);
        }
        final Map map = (Map)net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.bt);
        if (map != null) {
            for (final Map.Entry<K, String> entry : map.entrySet()) {
                final String s2 = entry.getValue();
                final String llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(s2, s);
                if (llllIIIIlIIIlIlllIll2 != s2) {
                    entry.setValue(llllIIIIlIIIlIlllIll2);
                }
            }
        }
    }
    
    public static lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll lIllllIllIllIIllllll, final String s) {
        if (lIllllIllIllIIllllll == null || s == null) {
            return lIllllIllIllIIllllll;
        }
        if (!lIllllIllIllIIllllll.llIllIIIIIllIlIIIIlI().equals("minecraft")) {
            return lIllllIllIllIIllllll;
        }
        final String ilIlIlIlIlllllllllIl = lIllllIllIllIIllllll.IlIlIlIlIlllllllllIl();
        final String llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, s);
        if (llllIIIIlIIIlIlllIll != ilIlIlIlIlllllllllIl) {
            lIllllIllIllIIllllll = new lIllllIllIllIIllllll(lIllllIllIllIIllllll.llIllIIIIIllIlIIIIlI(), llllIIIIlIIIlIlllIll);
        }
        return lIllllIllIllIIllllll;
    }
    
    private static String llllIIIIlIIIlIlllIll(String s, final String s2) {
        s = IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll(s, s2);
        s = IIIllllllIllIIIlllIl.IlIlIIIllIllIIIIIllI(s, ".json");
        s = IIIllllllIllIIIlllIl.IlIlIIIllIllIIIIIllI(s, ".png");
        return s;
    }
    
    public static void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final String... array) {
        final net.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = (net.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll)net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.o);
        if (net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.IlIlIIIlIIlIlIIlllIl.containsKey(llllIIIIlIIIlIlllIll)) {
            ((Set)net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.IlIlIIIlIIlIlIIlllIl.get(llllIIIIlIIIlIlllIll)).addAll(Lists.newArrayList((Object[])array));
        }
        else {
            net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.IlIlIIIlIIlIlIIlllIl.put(llllIIIIlIIIlIlllIll, Sets.newHashSet((Object[])array));
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final lIllllIllIllIIllllll... array) {
        final net.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = (net.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll)net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.o);
        if (!net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.IlIlIIIlIIlIlIIlllIl.containsKey(llllIIIIlIIIlIlllIll)) {
            net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.IlIlIIIlIIlIlIIlllIl.put(llllIIIIlIIIlIlllIll, Sets.newHashSet());
        }
        for (int length = array.length, i = 0; i < length; ++i) {
            net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.IlIlIIIlIIlIlIIlllIl.get(llllIIIIlIIIlIlllIll).add(array[i].toString());
        }
    }
}
