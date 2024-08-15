package data.missions.stardestroyer;

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
		api.initFleet(FleetSide.PLAYER, "HSS", FleetGoal.ATTACK, false);
		api.initFleet(FleetSide.ENEMY, "VKS", FleetGoal.ATTACK, true);

		// Set a small blurb for each fleet that shows up on the mission detail and
		// mission results screens to identify each side.
		api.setFleetTagline(FleetSide.PLAYER, "霸主治安编队 第13编队");
		api.setFleetTagline(FleetSide.ENEMY, "Valkyrian 实验旗舰与装配区守备编队");
		
		// These show up as items in the bulleted list under 
		// "Tactical Objectives" on the mission detail screen
		api.addBriefingItem("干掉实验旗舰!");
		api.addBriefingItem("HSS Kaori 必须存活.");
		
		// Set up the player's fleet.  Variant names come from the
		// files in data/variants and data/variants/fighters
		api.addToFleet(FleetSide.PLAYER, "onslaught_Standard", FleetMemberType.SHIP, "HSS Kaori", true, CrewXPLevel.ELITE);
		api.addToFleet(FleetSide.PLAYER, "dominator_Support", FleetMemberType.SHIP, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.PLAYER, "dominator_Support", FleetMemberType.SHIP, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.PLAYER, "enforcer_Assault", FleetMemberType.SHIP, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.PLAYER, "enforcer_Assault", FleetMemberType.SHIP, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.PLAYER, "enforcer_CS", FleetMemberType.SHIP, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.PLAYER, "enforcer_CS", FleetMemberType.SHIP, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.PLAYER, "condor_FS", FleetMemberType.SHIP, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.PLAYER, "condor_FS", FleetMemberType.SHIP, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.PLAYER, "lasher_CS", FleetMemberType.SHIP, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.PLAYER, "lasher_CS", FleetMemberType.SHIP, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.PLAYER, "lasher_CS", FleetMemberType.SHIP, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.PLAYER, "hound_Standard", FleetMemberType.SHIP, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.PLAYER, "hound_Standard", FleetMemberType.SHIP, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.PLAYER, "broadsword_wing", FleetMemberType.FIGHTER_WING, false, CrewXPLevel.ELITE);
		api.addToFleet(FleetSide.PLAYER, "broadsword_wing", FleetMemberType.FIGHTER_WING, false, CrewXPLevel.ELITE);
		api.addToFleet(FleetSide.PLAYER, "piranha_wing", FleetMemberType.FIGHTER_WING, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.PLAYER, "piranha_wing", FleetMemberType.FIGHTER_WING, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.PLAYER, "piranha_wing", FleetMemberType.FIGHTER_WING, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.PLAYER, "piranha_wing", FleetMemberType.FIGHTER_WING, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.PLAYER, "piranha_wing", FleetMemberType.FIGHTER_WING, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.PLAYER, "piranha_wing", FleetMemberType.FIGHTER_WING, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.PLAYER, "talon_wing", FleetMemberType.FIGHTER_WING, false);
		api.addToFleet(FleetSide.PLAYER, "talon_wing", FleetMemberType.FIGHTER_WING, false);		
		api.addToFleet(FleetSide.PLAYER, "talon_wing", FleetMemberType.FIGHTER_WING, false);
		api.addToFleet(FleetSide.PLAYER, "talon_wing", FleetMemberType.FIGHTER_WING, false);
		
		
		
		// Mark both ships as essential - losing either one results
		// in mission failure. Could also be set on an enemy ship,
		// in which case destroying it would result in a win.
		api.defeatOnShipLoss("HSS Kaori");
		
		// Set up the enemy fleet.
		// It's got more ships than the player's, and are stronger, but hey they are computer controled.
		// api.addToFleet(FleetSide.ENEMY, "onslaught_Reconditioned", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "valk_azmodaeus_E", FleetMemberType.SHIP, "VKS Tera", true, CrewXPLevel.ELITE);
		api.addToFleet(FleetSide.ENEMY, "valk_nirvana_II_A", FleetMemberType.SHIP, false, CrewXPLevel.ELITE);
		api.addToFleet(FleetSide.ENEMY, "valk_heron_B", FleetMemberType.SHIP, false, CrewXPLevel.ELITE);
		api.addToFleet(FleetSide.ENEMY, "valk_elfheim_S", FleetMemberType.SHIP, false, CrewXPLevel.ELITE);
		api.addToFleet(FleetSide.ENEMY, "valk_elfheim_S", FleetMemberType.SHIP, false, CrewXPLevel.ELITE);
		api.addToFleet(FleetSide.ENEMY, "valk_yuusha_A", FleetMemberType.SHIP, false, CrewXPLevel.ELITE);
		api.addToFleet(FleetSide.ENEMY, "valk_yuusha_A", FleetMemberType.SHIP, false, CrewXPLevel.ELITE);
		api.addToFleet(FleetSide.ENEMY, "valk_yuusha_A", FleetMemberType.SHIP, false, CrewXPLevel.ELITE);
		api.addToFleet(FleetSide.ENEMY, "valk_excalibur_corv_wing", FleetMemberType.FIGHTER_WING, false, CrewXPLevel.ELITE);
		api.addToFleet(FleetSide.ENEMY, "valk_helia_corv_wing", FleetMemberType.FIGHTER_WING, false, CrewXPLevel.ELITE);
		api.addToFleet(FleetSide.ENEMY, "valk_helia_corv_wing", FleetMemberType.FIGHTER_WING, false, CrewXPLevel.ELITE);
		api.addToFleet(FleetSide.ENEMY, "valk_azgard_wing", FleetMemberType.FIGHTER_WING, false, CrewXPLevel.ELITE);
		api.addToFleet(FleetSide.ENEMY, "valk_azgard_wing", FleetMemberType.FIGHTER_WING, false, CrewXPLevel.ELITE);








		
		
		// Set up the map.
		// 12000x8000 is actually somewhat small, making for a faster-paced mission.
		float width = 15000f;
		float height =15000f;
		api.initMap((float)-width/2f, (float)width/2f, (float)-height/2f, (float)height/2f);
		
		float minX = -width/2;
		float minY = -height/2;
		
		// All the addXXX methods take a pair of coordinates followed by data for
		// whatever object is being added.
		
		// Add two big nebula clouds
		//api.addNebula(minX + width * 0.8f, minY + height * 0.4f, 1500);
		//api.addNebula(minX + width * 0.2f, minY + height * 0.5f, 1500);
		
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
		api.addObjective(minX + width * 0.50f, minY + height * 0.20f, 
						 "nav_buoy", BattleObjectiveAPI.Importance.NORMAL);
		api.addObjective(minX + width * 0.50f, minY + height * 0.80f, 
						 "nav_buoy", BattleObjectiveAPI.Importance.NORMAL);
		api.addObjective(minX + width * 0.50f, minY + height * 0.50f, 
						 "sensor_array", BattleObjectiveAPI.Importance.NORMAL);
		api.addObjective(minX + width * 0.80f, minY + height * 0.50f, 
						 "comm_relay", BattleObjectiveAPI.Importance.NORMAL);		
		api.addObjective(minX + width * 0.20f, minY + height * 0.50f, 
						 "comm_relay", BattleObjectiveAPI.Importance.NORMAL);						 
		
		// Add an asteroid field going diagonally across the
		// battlefield, 2000 pixels wide, with a maximum of 
		// 100 asteroids in it.
		// 20-70 is the range of asteroid speeds.
		api.addAsteroidField(minY, minY, 45, 12500f,
								20, 60f, 500);
		
		// Add some planets.  These are defined in data/config/planets.json.
		//api.addPlanet(minX + width * 0.1f, minY + height * 0.1f, 1000f, "barren", 1000f);
	}

}
