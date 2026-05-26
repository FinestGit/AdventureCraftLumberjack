# AdventureCraft Lumberjack

The woodcutting skill mod for the AdventureCraft RPG pack. Players harvest wood, progress a dedicated Lumberjack skill, and eventually craft tiered lumberjack equipment from harvested and rare materials.

## Language

### Ecosystem

**AdventureCraft**:
The RPG mod pack made of cooperating skill mods that share conventions (tiering, rarity) but ship as separate mods.
_Avoid_: The mod, the pack (when meaning the whole ecosystem)

**AdventureCraft Lumberjack**:
The skill mod focused solely on woodcutting, lumberjack equipment, and Lumberjack progression.
_Avoid_: Lumberjack mod (ambiguous with the skill itself)

**Skill mod**:
A separate installable mod that owns one AdventureCraft skill and its content (items, recipes, mobs, advancements).
_Avoid_: Submod, plugin

### Skill & progression

**Lumberjack Skill**:
A per-player progression track with its own level and experience, earned only from woodcutting—not vanilla Minecraft experience.
_Avoid_: Profession, gathering skill (too generic)

**Lumberjack level**:
The current tier of a player's Lumberjack Skill; gates stats, recipes, and content over time.
_Avoid_: Player level, skill rank (unless explicitly the Lumberjack track)

**Lumberjack experience**:
Points toward the next Lumberjack level, granted by woodcutting actions.
_Avoid_: XP (alone—conflicts with vanilla), woodcutting XP (prefer **Lumberjack experience**)

### Woodcutting

**Woodcutting**:
The act of breaking log or wood blocks that count toward Lumberjack progression and (later) rare material drops.
_Avoid_: Logging, chopping (casual—use **Woodcutting** in docs and design)

**Log**:
A harvestable wood block in a tiered log family; the primary target of woodcutting.
_Avoid_: Tree (the whole structure), wood block (too vague)

**Log tier**:
A property of a log block that defines which axe tier may break it and how woodcutting rules apply.
_Avoid_: Wood tier, tree tier

**Vanilla Copycat Log**:
A Tier 1 log that behaves like early vanilla wood: any tool or bare hand can break it, grants normal Lumberjack experience, but breaks much slower without an axe.
_Avoid_: Starter log, vanilla log (implies actual vanilla blocks)

**Axe tier**:
The tier of an axe tool; a Tier N log requires a Tier (N−1) axe to break (Tier 2 log → Tier 1 axe, and so on).
_Avoid_: Tool level, axe level (unless meaning axe tier specifically)

### Stats

**Lumberjack stat**:
A numeric attribute on the player that modifies woodcutting outcomes; primarily scales with Lumberjack level, with gear and passives adding modifiers later.
_Avoid_: Attribute, skill stat (too generic)

**Bounty**:
The Lumberjack stat that increases harvest yield (extra log drops).
_Avoid_: Yield, loot bonus

**Fortune**:
The Lumberjack stat that increases the chance of rare material drops from woodcutting.
_Avoid_: Luck, rare drop rate (use **Fortune** for the stat name; note possible confusion with vanilla Fortune enchant when that exists)

**Felling**:
The Lumberjack stat that increases break speed on wood.
_Avoid_: Chop speed, mining speed

**Insight**:
The Lumberjack stat that increases Lumberjack experience gained from woodcutting.
_Avoid_: XP bonus, experience boost

### Rarity & materials

**Material rarity**:
A quality grade on materials and crafted gear: Common, Uncommon, Rare, Epic, Legendary.
_Avoid_: Item rarity (unless specifically **Material rarity**), quality tier

**Common** (rarity):
The baseline rarity; normal wood from woodcutting always drops as Common.
_Avoid_: Normal, white (color names are display, not the term)

**Uncommon** (rarity):
The first elevated rarity tier; rare drops use a cascading roll (~5% before higher tiers are considered).
_Avoid_: Green, magic

**Rare** (rarity):
The second elevated rarity tier (~1% in the cascade).
_Avoid_: Blue

**Epic** (rarity):
The third elevated rarity tier (~0.1% in the cascade).
_Avoid_: Purple

**Legendary** (rarity):
The highest rarity tier (~0.0001% in the cascade).
_Avoid_: Orange, gold

**Cascading rarity roll**:
A single drop check from highest to lowest rarity; if a higher tier wins, lower tiers are not rolled—except Common, which always drops.
_Avoid_: Independent rolls, layered drops

**Rare material**:
A woodcutting drop above Common, used in recipes and crafting; rarity follows **Material rarity**.
_Avoid_: Rare drop (the event), special item

**Rarity item**:
An ingredient with a fixed **Material rarity** placed in the special crafting station; the crafted item's rarity matches this item's rarity.
_Avoid_: Rarity token, essence (until a specific item is named)

### Crafting & parts

**Special crafting station**:
A dedicated block for assembling lumberjack axes and armor from parts; output rarity is determined by the **Rarity item** slot, not by averaging inputs.
_Avoid_: Lumberjack table, workbench (name not finalized—update glossary when chosen)

**Binding**:
A craft part for axes (and similar gear), normally produced by a future Crafting skill from flax; stubbed in this mod until that skill exists.
_Avoid_: Wrap, cord

**Shaft**:
The handle craft part for a lumberjack axe.
_Avoid_: Handle, stick (unless the item is literally a stick)

**Head**:
The blade or head craft part for a lumberjack axe.
_Avoid_: Axe head (redundant when context is axes), bit

**Lumberjack equipment**:
Wearable or held gear tied to the Lumberjack skill (axes, armor, etc.), crafted at the **Special crafting station** with a **Rarity item**.
_Avoid_: Lumberjack gear, tools (too broad)

**Lumberjack axe**:
An axe that participates in **Axe tier** gating and lumberjack crafting—not merely any axe used while woodcutting.
_Avoid_: Chopping axe, wood axe

### Content (deferred)

**Lumberjack passive**:
An always-on or triggered bonus tied to Lumberjack level or gear; lower priority than core progression and crafting.
_Avoid_: Perk, talent

**Lumberjack mob**:
Hostile or neutral creatures tied to lumberjack content (e.g. immobile tree roots, mobile tree monster).
_Avoid_: Tree enemy, wood mob

**Lumberjack advancement**:
A progression milestone for the Lumberjack skill (first chop, tier unlocks, etc.).
_Avoid_: Achievement (vanilla term)

**Lumberjack recipe**:
A recipe for lumberjack items, including those that reference parts from other skill mods (e.g. **Binding** from Crafting).
_Avoid_: Crafting recipe (too generic)

## Flagged ambiguities

**Tier**:
Used for **Log tier**, **Axe tier**, and (in the wider AdventureCraft ecosystem) other tier concepts not yet defined here. Always qualify: *log tier*, *axe tier*, or *ecosystem tier* until ecosystem tiering is documented.
_Avoid_: Using "tier" alone in design docs

**Fortune**:
The **Fortune** Lumberjack stat shares a name with vanilla's Fortune enchantment. In this context, **Fortune** means the Lumberjack stat unless explicitly referring to the enchantment.
_Avoid_: Fortune (unqualified) in mixed enchant/stat discussions

## Example dialogue

**Dev**: When a player punches a Vanilla Copycat Log, do they get Lumberjack experience?

**Expert**: Yes. Tier 1 logs grant normal Lumberjack experience with any tool or bare hand. Felling only makes it faster—they still earn the same experience per log.

**Dev**: What about a Tier 3 log with a Tier 1 axe?

**Expert**: That break shouldn't succeed. Tier 3 logs need a Tier 2 axe. Tier 2 needs Tier 1, and Tier 1 is where Vanilla Copycat Logs live.

**Dev**: The player got an Epic bark from woodcutting. Do they also get Uncommon and Rare?

**Expert**: No. Cascading rarity roll: Epic won, so we didn't roll Rare or Uncommon. Common wood still drops every time.

**Dev**: They craft an axe at the special crafting station with a Rare Rarity item, a Binding, a Shaft, and a Head. What's the axe's rarity?

**Expert**: Rare—the Rarity item sets it. The Binding might come from Crafting later; for now it's just another part in the station.
