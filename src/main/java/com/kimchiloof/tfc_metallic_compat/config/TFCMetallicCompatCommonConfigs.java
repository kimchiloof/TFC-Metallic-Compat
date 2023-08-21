package com.kimchiloof.tfc_metallic_compat.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class TFCMetallicCompatCommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Boolean> ALUMINUM_ENABLED;
    public static final ForgeConfigSpec.ConfigValue<Boolean> COMPRESSED_IRON_ENABLED;
    public static final ForgeConfigSpec.ConfigValue<Boolean> CONSTANTAN_ENABLED;
    public static final ForgeConfigSpec.ConfigValue<Boolean> ELECTRUM_ENABLED;
    public static final ForgeConfigSpec.ConfigValue<Boolean> INVAR_ENABLED;
    public static final ForgeConfigSpec.ConfigValue<Boolean> LEAD_ENABLED;
    public static final ForgeConfigSpec.ConfigValue<Boolean> OSMIUM_ENABLED;
    public static final ForgeConfigSpec.ConfigValue<Boolean> REFINED_GLOWSTONE_ENABLED;
    public static final ForgeConfigSpec.ConfigValue<Boolean> REFINED_OBSIDIAN_ENABLED;
    public static final ForgeConfigSpec.ConfigValue<Boolean> URANIUM_ENABLED;


    static {
        BUILDER.push("Configs for TFC Metallic Compat");

        ALUMINUM_ENABLED = BUILDER.comment("Whether to load aluminum materials and ore").define("Enable aluminum", true);
        COMPRESSED_IRON_ENABLED = BUILDER.comment("Whether to load compressed iron materials").define("Enable compressed iron", true);
        CONSTANTAN_ENABLED = BUILDER.comment("Whether to load constantan materials").define("Enable constantan", true);
        ELECTRUM_ENABLED = BUILDER.comment("Whether to load electrum materials").define("Enable electrum", true);
        INVAR_ENABLED = BUILDER.comment("Whether to load invar materials").define("Enable invar", true);
        LEAD_ENABLED = BUILDER.comment("Whether to load lead materials and ore").define("Enable lead", true);
        OSMIUM_ENABLED = BUILDER.comment("Whether to load osmium materials and ore").define("Enable osmium", true);
        REFINED_GLOWSTONE_ENABLED = BUILDER.comment("Whether to load refined glowstone materials").define("Enable refined glowstone", true);
        REFINED_OBSIDIAN_ENABLED = BUILDER.comment("Whether to load refined obsidian materials").define("Enable refined obsidian", true);
        URANIUM_ENABLED = BUILDER.comment("Whether to load uranium materials and ore").define("Enable uranium", true);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }


}
