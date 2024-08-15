package data.missions.kingsbane;

import com.fs.starfarer.api.combat.BattleObjectiveAPI;
import com.fs.starfarer.api.campaign.CargoAPI.CrewXPLevel;
import com.fs.starfarer.api.fleet.FleetGoal;
import com.fs.starfarer.api.fleet.FleetMemberType;
import com.fs.starfarer.api.mission.FleetSide;
import com.fs.starfarer.api.mission.MissionDefinitionAPI;
import com.fs.starfarer.api.mission.MissionDefinitionPlugin;

public class MissionDefinition implements MissionDefinitionPlugin {

	public void defineMission(MissionDefinitionAPI api) {

		// Set up the fleets so we can add ships and fighter wings to them.
		// In this scenario, the fleets are attacking each other, but
		// in other scenarios, a fleet may be defending or trying to escape
		api.initFleet(FleetSide.PLAYER, "ISS", FleetGoal.ATTACK, false);
		api.initFleet(FleetSide.ENEMY, "VKS", FleetGoal.ATTACK, true);

		// Set a small blurb for each fleet that shows up on the mission detail and
		// mission results screens to identify each side.
		api.setFleetTagline(FleetSide.PLAYER, "雇佣军突袭舰队");
		api.setFleetTagline(FleetSide.ENEMY, "VKS Exile 与重型护卫编队");
		
		// These show up as items in the bulleted list under 
		// "Tactical Objectives" on the mission detail screen
		api.addBriefingItem("击毁Exile");
		
		// Set up the player's fleet.  Variant names come from the
		// files in data/variants and data/variants/fighters
		api.addToFleet(FleetSide.PLAYER, "aurora_Balanced", FleetMemberType.SHIP, true, CrewXPLevel.ELITE);
		api.addToFleet(FleetSide.PLAYER, "eagle_Balanced", FleetMemberType.SHIP, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.PLAYER, "falcon_CS", FleetMemberType.SHIP, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.PLAYER, "falcon_CS", FleetMemberType.SHIP, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.PLAYER, "heron_Standard", FleetMemberType.SHIP, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.PLAYER, "hammerhead_Balanced", FleetMemberType.SHIP, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.PLAYER, "sunder_CS", FleetMemberType.SHIP, false, CrewXPLevel.VETERAN);			
		api.addToFleet(FleetSide.PLAYER, "afflictor_Strike", FleetMemberType.SHIP, false, CrewXPLevel.ELITE);
		api.addToFleet(FleetSide.PLAYER, "shade_Assault", FleetMemberType.SHIP, false, CrewXPLevel.ELITE);
		api.addToFleet(FleetSide.PLAYER, "shade_Assault", FleetMemberType.SHIP, false, CrewXPLevel.ELITE);
		api.addToFleet(FleetSide.PLAYER, "xyphos_wing", FleetMemberType.FIGHTER_WING, false, CrewXPLevel.ELITE);
		api.addToFleet(FleetSide.PLAYER, "gladius_wing", FleetMemberType.FIGHTER_WING, false, CrewXPLevel.REGULAR);
		api.addToFleet(FleetSide.PLAYER, "gladius_wing", FleetMemberType.FIGHTER_WING, false, CrewXPLevel.REGULAR);		
		api.addToFleet(FleetSide.PLAYER, "broadsword_wing", FleetMemberType.FIGHTER_WING, false, CrewXPLevel.REGULAR);
		api.addToFleet(FleetSide.PLAYER, "wasp_wing", FleetMemberType.FIGHTER_WING, false, CrewXPLevel.REGULAR);		
		api.addToFleet(FleetSide.PLAYER, "wasp_wing", FleetMemberType.FIGHTER_WING, false, CrewXPLevel.REGULAR);
		api.addToFleet(FleetSide.PLAYER, "wasp_wing", FleetMemberType.FIGHTER_WING, false, CrewXPLevel.REGULAR);		
		
		// Mark both ships as essential - losing either one results
		// in mission failure. Could also be set on an enemy ship,
		// in which case destroying it would result in a win.
		api.defeatOnShipLoss("VKS Exile");
		//api.defeatOnShipLoss("HSS Abel");
		
		// Set up the enemy fleet.
		// It's got more ships than the player's, and are stronger, but hey they are computer controled.
		// api.addToFleet(FleetSide.ENEMY, "onslaught_Reconditioned", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "valk_yoshura_AS", FleetMemberType.SHIP, "VKS Exile", true, CrewXPLevel.ELITE);
		api.addToFleet(FleetSide.ENEMY, "valk_cherberos_A", FleetMemberType.SHIP, "VKS Titania", false, CrewXPLevel.ELITE);
		api.addToFleet(FleetSide.ENEMY, "valk_heron_B", FleetMemberType.SHIP, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.ENEMY, "valk_elfheim_A", FleetMemberType.SHIP, false, CrewXPLevel.VETERAN);	
		api.addToFleet(FleetSide.ENEMY, "valk_jenova_ECM", FleetMemberType.SHIP, false, CrewXPLevel.ELITE);
		api.addToFleet(FleetSide.ENEMY, "valk_yuusha_A", FleetMemberType.SHIP, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.ENEMY, "valk_yuusha_A", FleetMemberType.SHIP, false, CrewXPLevel.VETERAN);			
		api.addToFleet(FleetSide.ENEMY, "valk_firefly_wing", FleetMemberType.FIGHTER_WING, false, CrewXPLevel.ELITE);
		api.addToFleet(FleetSide.ENEMY, "valk_firefly_wing", FleetMemberType.FIGHTER_WING, false, CrewXPLevel.ELITE);
		api.addToFleet(FleetSide.ENEMY, "valk_firefly_wing", FleetMemberType.FIGHTER_WING, false, CrewXPLevel.ELITE);
		api.addToFleet(FleetSide.ENEMY, "valk_azgard_wing", FleetMemberType.FIGHTER_WING, false, CrewXPLevel.REGULAR);
		api.addToFleet(FleetSide.ENEMY, "valk_azgard_wing", FleetMemberType.FIGHTER_WING, false, CrewXPLevel.REGULAR);		
		api.addToFleet(FleetSide.ENEMY, "valk_lightning_wing", FleetMemberType.FIGHTER_WING, false, CrewXPLevel.ELITE);
		api.addToFleet(FleetSide.ENEMY, "valk_lightning_wing", FleetMemberType.FIGHTER_WING, false, CrewXPLevel.ELITE);

		
		
		// Set up the map.
		// 12000x8000 is actually somewhat small, making for a faster-paced mission.
		float width = 15000f;
		float height =17500f;
		api.initMap((float)-width/2f, (float)width/2f, (float)-height/2f, (float)height/2f);
		
		float minX = -width/2;
		float minY = -height/2;
		
		// All the addXXX methods take a pair of coordinates followed by data for
		// whatever object is being added.
		
		// Add two big nebula clouds
		api.addNebula(minX + width * 0.2f, minY + height * 0.8f, 1500);
		api.addNebula(minX + width * 0.4f, minY + height * 0.6f, 1500);
		api.addNebula(minX + width * 0.6f, minY + height * 0.4f, 1500);
		
		// And a few random ones to spice up the playing field.
		// A similar approach can be used to randomize everything
		// else, including fleet composition.
		for (int i = 0; i < 5; i++) {
			float x = (float) Math.random() * width - width/2;
			float y = (float) Math.random() * height - height/2;
			float radius = 100f + (float) Math.random() * 400f; 
			api.addNebula(x, y, radius);
		}
		
		// Add objectives. These can be captured by each side
		// and provide stat bonuses and extra command points to
		// bring in reinforcements.
		// Reinforcements only matter for large fleets - in this
		// case, assuming a 100 command point battle size,
		// both fleets will be able to deploy fully right away.
		api.addObjective(minX + width * 0.80f, minY + height * 0.80f, 
						 "nav_buoy", BattleObjectiveAPI.Importance.NORMAL);
		api.addObjective(minX + width * 0.50f, minY + height * 0.50f, 
						 "sensor_array", BattleObjectiveAPI.Importance.NORMAL);
		api.addObjective(minX + width * 0.20f, minY + height * 0.20f, 
						 "nav_buoy", BattleObjectiveAPI.Importance.NORMAL);					 
		
		// Add an asteroid field going diagonally across the
		// battlefield, 2000 pixels wide, with a maximum of 
		// 100 asteroids in it.
		// 20-70 is the range of asteroid speeds.
		//api.addAsteroidField(minY, minY, 45, 12500f,
		//						20, 60f, 500);
		
		// Add some planets.  These are defined in data/config/planets.json.
		//api.addPlanet(minX + width * 0.1f, minY + height * 0.1f, 1000f, "barren", 1000f);
	}

}
