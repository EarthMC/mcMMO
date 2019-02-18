package com.gmail.nossr50.util;

import com.gmail.nossr50.config.MainConfig;
import com.gmail.nossr50.config.mods.CustomArmorConfig;
import com.gmail.nossr50.config.mods.CustomBlockConfig;
import com.gmail.nossr50.config.mods.CustomEntityConfig;
import com.gmail.nossr50.config.mods.CustomToolConfig;
import com.gmail.nossr50.datatypes.mods.CustomBlock;
import com.gmail.nossr50.datatypes.mods.CustomEntity;
import com.gmail.nossr50.datatypes.mods.CustomTool;
import com.gmail.nossr50.mcMMO;
import com.gmail.nossr50.skills.repair.repairables.Repairable;
import org.bukkit.Material;
import org.bukkit.block.BlockState;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Entity;
import org.bukkit.inventory.ItemStack;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ModManager {
    /*private List<Repairable> repairables = new ArrayList<Repairable>();

    // Armor Mods
    private List<Material> customBoots       = new ArrayList<Material>();
    private List<Material> customChestplates = new ArrayList<Material>();
    private List<Material> customHelmets     = new ArrayList<Material>();
    private List<Material> customLeggings    = new ArrayList<Material>();

    // Block Mods
    private List<Material> customExcavationBlocks  = new ArrayList<Material>();
    private List<Material> customHerbalismBlocks   = new ArrayList<Material>();
    private List<Material> customMiningBlocks      = new ArrayList<Material>();
    private List<Material> customOres              = new ArrayList<Material>();
    private List<Material> customLogs              = new ArrayList<Material>();
    private List<Material> customLeaves            = new ArrayList<Material>();
    private List<Material> customAbilityBlocks     = new ArrayList<Material>();
    private HashMap<Material, CustomBlock> customBlockMap = new HashMap<>();

    // Entity Mods
    private HashMap<String, CustomEntity> customEntityClassMap = new HashMap<String, CustomEntity>();
    private HashMap<String, CustomEntity> customEntityTypeMap  = new HashMap<String, CustomEntity>();

    // Tool Mods
    private List<Material> customAxes     = new ArrayList<Material>();
    private List<Material> customBows     = new ArrayList<Material>();
    private List<Material> customHoes     = new ArrayList<Material>();
    private List<Material> customPickaxes = new ArrayList<Material>();
    private List<Material> customShovels  = new ArrayList<Material>();
    private List<Material> customSwords   = new ArrayList<Material>();
    private HashMap<Material, CustomTool> customToolMap = new HashMap<Material, CustomTool>();

    public void registerCustomArmor(CustomArmorConfig config) {
        customBoots.addAll(config.customBoots);
        customChestplates.addAll(config.customChestplates);
        customHelmets.addAll(config.customHelmets);
        customLeggings.addAll(config.customLeggings);
        repairables.addAll(config.repairables);
    }

    public void registerCustomBlocks(CustomBlockConfig config) {
        customExcavationBlocks.addAll(config.customExcavationBlocks);
        customHerbalismBlocks.addAll(config.customHerbalismBlocks);
        customMiningBlocks.addAll(config.customMiningBlocks);
        customOres.addAll(config.customOres);
        customLogs.addAll(config.customLogs);
        customLeaves.addAll(config.customLeaves);
        customAbilityBlocks.addAll(config.customAbilityBlocks);
        customBlockMap.putAll(config.customBlockMap);
    }

    public void registerCustomEntities(CustomEntityConfig config) {
        customEntityClassMap.putAll(config.customEntityClassMap);
        customEntityTypeMap.putAll(config.customEntityTypeMap);
    }

    public void registerCustomTools(CustomToolConfig config) {
        customAxes.addAll(config.customAxes);
        customBows.addAll(config.customBows);
        customHoes.addAll(config.customHoes);
        customPickaxes.addAll(config.customPickaxes);
        customShovels.addAll(config.customShovels);
        customSwords.addAll(config.customSwords);
        customToolMap.putAll(config.customToolMap);
        repairables.addAll(config.repairables);
    }

    public boolean isCustomBoots(Material material) {
        return MainConfig.getInstance().getArmorModsEnabled() && customBoots.contains(material);
    }

    public boolean isCustomChestplate(Material material) {
        return MainConfig.getInstance().getArmorModsEnabled() && customChestplates.contains(material);
    }

    public boolean isCustomHelmet(Material material) {
        return MainConfig.getInstance().getArmorModsEnabled() && customHelmets.contains(material);
    }

    public boolean isCustomLeggings(Material material) {
        return MainConfig.getInstance().getArmorModsEnabled() && customLeggings.contains(material);
    }

    public boolean isCustomAxe(Material material) {
        return MainConfig.getInstance().getToolModsEnabled() && customAxes.contains(material);
    }

    public boolean isCustomBow(Material material) {
        return MainConfig.getInstance().getToolModsEnabled() && customBows.contains(material);
    }

    public boolean isCustomHoe(Material material) {
        return MainConfig.getInstance().getToolModsEnabled() && customHoes.contains(material);
    }

    public boolean isCustomPickaxe(Material material) {
        return MainConfig.getInstance().getToolModsEnabled() && customPickaxes.contains(material);
    }

    public boolean isCustomShovel(Material material) {
        return MainConfig.getInstance().getToolModsEnabled() && customShovels.contains(material);
    }

    public boolean isCustomSword(Material material) {
        return MainConfig.getInstance().getToolModsEnabled() && customSwords.contains(material);
    }

    public boolean isCustomOre(Material data) {
        return MainConfig.getInstance().getBlockModsEnabled() && customOres.contains(data);
    }

    public boolean isCustomLog(BlockState state) {
        return MainConfig.getInstance().getBlockModsEnabled() && customLogs.contains(state.getType());
    }

    public boolean isCustomLeaf(BlockState state) {
        return MainConfig.getInstance().getBlockModsEnabled() && customLeaves.contains(state.getType());
    }

    public boolean isCustomAbilityBlock(BlockState state) {
        return MainConfig.getInstance().getBlockModsEnabled() && customAbilityBlocks.contains(state.getType());
    }

    public boolean isCustomExcavationBlock(BlockState state) {
        return MainConfig.getInstance().getBlockModsEnabled() && customExcavationBlocks.contains(state.getType());
    }

    public boolean isCustomHerbalismBlock(BlockState state) {
        return MainConfig.getInstance().getBlockModsEnabled() && customHerbalismBlocks.contains(state.getType());
    }

    public boolean isCustomMiningBlock(BlockState state) {
        return MainConfig.getInstance().getBlockModsEnabled() && customMiningBlocks.contains(state.getType());
    }

    public CustomBlock getBlock(BlockState state) {
        return customBlockMap.get(state.getType());
    }

    public CustomBlock getBlock(Material data) {
        return customBlockMap.get(data);
    }

    *//**
     * Checks to see if an item is a custom tool.
     *
     * @param item Item to check
     * @return true if the item is a custom tool, false otherwise
     *//*
    public boolean isCustomTool(ItemStack item) {
        return MainConfig.getInstance().getToolModsEnabled() && item != null && customToolMap.containsKey(item.getType());
    }

    *//**
     * Get the custom tool associated with an item.
     *
     * @param item The item to check
     * @return the tool if it exists, null otherwise
     *//*
    public CustomTool getTool(ItemStack item) {
        return item == null ? null : customToolMap.get(item.getType());
    }

    public List<Repairable> getLoadedRepairables() {
        return repairables;
    }

    public boolean isCustomEntity(Entity entity) {
        if (!MainConfig.getInstance().getEntityModsEnabled()) {
            return false;
        }

        if (customEntityTypeMap.containsKey(entity.getType().toString())) {
            return true;
        }

        try {
            return customEntityClassMap.containsKey(((Class<?>) entity.getClass().getDeclaredField("entityClass").get(entity)).getName());
        }
        catch (Exception e) {
            if (e instanceof NoSuchFieldException || e instanceof IllegalArgumentException || e instanceof IllegalAccessException) {
                return customEntityClassMap.containsKey(entity.getClass().getName());
            }

            e.printStackTrace();
            return false;
        }
    }

    public CustomEntity getEntity(Entity entity) {
        CustomEntity customEntity = customEntityTypeMap.get(entity.getType().toString());

        if (customEntity == null) {
            try {
                customEntity = customEntityClassMap.get(((Class<?>) entity.getClass().getDeclaredField("entityClass").get(entity)).getName());
            }
            catch (Exception e) {
                if (e instanceof NoSuchFieldException || e instanceof IllegalArgumentException || e instanceof IllegalAccessException) {
                    customEntity = customEntityClassMap.get(entity.getClass().getName());
                }
                else {
                    e.printStackTrace();
                }
            }
        }

        return customEntity;
    }

    public void addCustomEntity(Entity entity) {
        if (!MainConfig.getInstance().getEntityModsEnabled()) {
            return;
        }

        File entityFile = new File(mcMMO.p.getDataFolder(), "mods" + File.separator + "entities.default.yml");
        YamlConfiguration entitiesFile = YamlConfiguration.loadConfiguration(entityFile);

        String entityName = entity.getType().toString();
        String sanitizedEntityName = entityName.replace(".", "_");

        if (entitiesFile.getKeys(false).contains(sanitizedEntityName)) {
            return;
        }

        entitiesFile.set(sanitizedEntityName + ".XP_Multiplier", 1.0D);
        entitiesFile.set(sanitizedEntityName + ".Tameable", false);
        entitiesFile.set(sanitizedEntityName + ".Taming_XP", 0);
        entitiesFile.set(sanitizedEntityName + ".CanBeSummoned", false);
        entitiesFile.set(sanitizedEntityName + ".COTW_Material", "");
        entitiesFile.set(sanitizedEntityName + ".COTW_Material_Data", 0);
        entitiesFile.set(sanitizedEntityName + ".COTW_Material_Amount", 0);

        String className = "";

        try {
            className = ((Class<?>) entity.getClass().getDeclaredField("entityClass").get(entity)).getName();
        }
        catch (Exception e) {
            if (e instanceof NoSuchFieldException || e instanceof IllegalArgumentException || e instanceof IllegalAccessException) {
                className = entity.getClass().getName();
            }
            else {
                e.printStackTrace();
            }
        }

        CustomEntity customEntity = new CustomEntity(1.0D, false, 0, false, null, 0);
        customEntityTypeMap.put(entityName, customEntity);
        customEntityClassMap.put(className, customEntity);

        try {
            entitiesFile.save(entityFile);
            mcMMO.p.debug(entity.getType().toString() + " was added to the custom entities file!");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }*/
}
