package me.sfiguz7.extratools.lists;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.sfiguz7.extratools.ExtraTools;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public final class ETItems {

    /* Category */
    public static final ItemGroup extra_tools = new ItemGroup(new NamespacedKey(ExtraTools.getInstance(),
        "extra_tools"),
        new CustomItemStack(Material.DIAMOND_AXE, "&4Extra Tools")
    );
    /* Items */
    public static final SlimefunItemStack HAMMER = new SlimefunItemStack("EXTRATOOLS_HAMMER",
        Material.IRON_PICKAXE,
        "&cHammer",
        "",
        "&9Pulverizes blocks"
    );
    /* Machines */
    public static final SlimefunItemStack GOLD_TRANSMUTER = new SlimefunItemStack("EXTRATOOLS_GOLD_TRANSMUTER",
        Material.YELLOW_TERRACOTTA,
        "&6Gold Transmuter",
        "",
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
        LoreBuilder.powerBuffer(256),
        LoreBuilder.powerPerSecond(18)
    );
    public static final SlimefunItemStack ELECTRIC_COMPOSTER = new SlimefunItemStack("EXTRATOOLS_ELECTRIC_COMPOSTER",
        Material.MAGENTA_TERRACOTTA,
        "&cElectric Composter",
        "",
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
        "&8\u21E8 &7Speed: 1x",
        LoreBuilder.powerBuffer(256),
        LoreBuilder.powerPerSecond(18)
    );
    public static final SlimefunItemStack ELECTRIC_COMPOSTER_2 = new SlimefunItemStack("EXTRATOOLS_ELECTRIC_COMPOSTER_2",
        Material.MAGENTA_TERRACOTTA,
        "&cElectric Composter &7(&eII&7)",
        "",
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
        "&8\u21E8 &7Speed: 4x",
        LoreBuilder.powerBuffer(256),
        LoreBuilder.powerPerSecond(50)
    );
    public static final SlimefunItemStack COBBLESTONE_GENERATOR = new SlimefunItemStack("EXTRATOOLS_COBBLESTONE_GENERATOR",
        Material.POLISHED_ANDESITE,
        "&cCobblestone Generator",
        "",
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
        LoreBuilder.powerBuffer(256),
        LoreBuilder.powerPerSecond(36)
    );
    public static final SlimefunItemStack VAPORIZER = new SlimefunItemStack("EXTRATOOLS_VAPORIZER",
        Material.RED_STAINED_GLASS,
        "&cVaporizer",
        "",
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
        LoreBuilder.powerBuffer(256),
        LoreBuilder.powerPerSecond(32)
    );
    public static final SlimefunItemStack CONCRETE_FACTORY = new SlimefunItemStack("EXTRATOOLS_CONCRETE_FACTORY",
        Material.BLACK_CONCRETE,
        "&4Concrete Factory",
        "",
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
        LoreBuilder.powerBuffer(256),
        LoreBuilder.powerPerSecond(16)
    );
    public static final SlimefunItemStack PULVERIZER = new SlimefunItemStack("EXTRATOOLS_PULVERIZER",
        Material.ORANGE_TERRACOTTA,
        "&cPulverizer",
        "",
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
        "&8\u21E8 &7Speed: 1x",
        LoreBuilder.powerBuffer(256),
        LoreBuilder.powerPerSecond(18)
    );
    private ETItems() {
    }
}