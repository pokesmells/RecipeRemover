package net.reciperemover.config;

import java.util.ArrayList;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "reciperemover")
@Config.Gui.Background("minecraft:textures/block/stone.png")
public class RecipeRemoverConfig implements ConfigData {

    public int inventoryRecipeBookX = 0;
    public int inventoryRecipeBookY = 0;

    @Comment("If identifier could not be found")
    public boolean printErrorMessage = false;
    @Comment("Print when joining world")
    public boolean printRecipesAndAdvancements = false;

    @ConfigEntry.Gui.RequiresRestart
    public boolean removeAllVanillaAdvancements = false;
    @ConfigEntry.Gui.RequiresRestart
    public boolean removeAllAdvancements = false;

    @Comment("Recipe identifier list (modid only for all mod recipes)")
    @ConfigEntry.Gui.RequiresRestart
    public ArrayList<String> recipeList = new ArrayList<String>();
    @Comment("Advancement identifier list")
    @ConfigEntry.Gui.RequiresRestart
    public ArrayList<String> advancementList = new ArrayList<String>();

    @Comment("Item removal identifier list ")
    @ConfigEntry.Gui.RequiresRestart
    public ArrayList<String> itemList = new ArrayList<String>();
}
