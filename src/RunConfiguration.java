package merv_1_0_3;

import com.anylogic.engine.AgentConstants;
import com.anylogic.engine.AnyLogicInternalAPI;
import com.anylogic.engine.AnyLogicInternalCodegenAPI;
import com.anylogic.engine.Engine;
import com.anylogic.engine.IRunConfiguration;
import com.anylogic.engine.IRunOutputsConsumer;
import com.anylogic.engine.IRunValueAccessor;
import com.anylogic.engine.Utilities;




























































public class RunConfiguration
  implements IRunConfiguration<Main>
{
  public RunConfiguration() {}
  
  @AnyLogicInternalCodegenAPI
  public void setupEngine(Engine engine)
  {
    engine.setATOL(1.0E-5D);
    engine.setRTOL(1.0E-5D);
    engine.setTTOL(1.0E-5D);
    engine.setHTOL(0.001D);
    engine.setSolverODE(Engine.SOLVER_ODE_EULER);
    engine.setSolverNAE(Engine.SOLVER_NAE_MODIFIED_NEWTON);
    engine.setSolverDAE(Engine.SOLVER_DAE_RK45_NEWTON);
    engine.setVMethods(Integer.valueOf(427313));
    
    engine.setSimultaneousEventsSelectionMode(Engine.EVENT_SELECTION_LIFO);
    
    engine.setStartTime(0.0D);
    engine.setTimeUnit(AgentConstants.HOUR);
    engine.setStartDate(Utilities.toDate(2015, 10, 17, 0, 0, 0));
    engine.setStopTime(100.0D);
  }
  
  public Main createRootAgent(Engine engine)
  {
    return new Main(engine, null, null);
  }
  


  @AnyLogicInternalCodegenAPI
  public void setupRootParameters(Main root, boolean callOnChangeActions, IRunValueAccessor parameterSource)
  {
    double group_ID_percentOfPopInMajority_xjal = 
      root._group_ID_percentOfPopInMajority_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_group_ID_percentOfPopInMajority(group_ID_percentOfPopInMajority_xjal);
    } else {
      group_ID_percentOfPopInMajority = group_ID_percentOfPopInMajority_xjal;
    }
    double prior_anthropomorphic_promiscuity_min_xjal = 
      root._prior_anthropomorphic_promiscuity_min_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_prior_anthropomorphic_promiscuity_min(prior_anthropomorphic_promiscuity_min_xjal);
    } else {
      prior_anthropomorphic_promiscuity_min = prior_anthropomorphic_promiscuity_min_xjal;
    }
    double prior_anthropomorphic_promiscuity_max_xjal = 
      root._prior_anthropomorphic_promiscuity_max_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_prior_anthropomorphic_promiscuity_max(prior_anthropomorphic_promiscuity_max_xjal);
    } else {
      prior_anthropomorphic_promiscuity_max = prior_anthropomorphic_promiscuity_max_xjal;
    }
    double prior_anthropomorphic_promiscuity_mode_xjal = 
      root._prior_anthropomorphic_promiscuity_mode_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_prior_anthropomorphic_promiscuity_mode(prior_anthropomorphic_promiscuity_mode_xjal);
    } else {
      prior_anthropomorphic_promiscuity_mode = prior_anthropomorphic_promiscuity_mode_xjal;
    }
    double sociographic_prudery_min_xjal = 
      root._sociographic_prudery_min_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_sociographic_prudery_min(sociographic_prudery_min_xjal);
    } else {
      sociographic_prudery_min = sociographic_prudery_min_xjal;
    }
    double sociographic_prudery_max_xjal = 
      root._sociographic_prudery_max_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_sociographic_prudery_max(sociographic_prudery_max_xjal);
    } else {
      sociographic_prudery_max = sociographic_prudery_max_xjal;
    }
    double sociographic_prudery_mode_xjal = 
      root._sociographic_prudery_mode_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_sociographic_prudery_mode(sociographic_prudery_mode_xjal);
    } else {
      sociographic_prudery_mode = sociographic_prudery_mode_xjal;
    }
    double anthropomorphic_promiscuity_min_xjal = 
      root._anthropomorphic_promiscuity_min_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_anthropomorphic_promiscuity_min(anthropomorphic_promiscuity_min_xjal);
    } else {
      anthropomorphic_promiscuity_min = anthropomorphic_promiscuity_min_xjal;
    }
    double anthropomorphic_promiscuity_max_xjal = 
      root._anthropomorphic_promiscuity_max_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_anthropomorphic_promiscuity_max(anthropomorphic_promiscuity_max_xjal);
    } else {
      anthropomorphic_promiscuity_max = anthropomorphic_promiscuity_max_xjal;
    }
    double anthropomorphic_promiscuity_mode_xjal = 
      root._anthropomorphic_promiscuity_mode_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_anthropomorphic_promiscuity_mode(anthropomorphic_promiscuity_mode_xjal);
    } else {
      anthropomorphic_promiscuity_mode = anthropomorphic_promiscuity_mode_xjal;
    }
    double predation_tolerance_min_xjal = 
      root._predation_tolerance_min_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_predation_tolerance_min(predation_tolerance_min_xjal);
    } else {
      predation_tolerance_min = predation_tolerance_min_xjal;
    }
    double predation_tolerance_max_xjal = 
      root._predation_tolerance_max_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_predation_tolerance_max(predation_tolerance_max_xjal);
    } else {
      predation_tolerance_max = predation_tolerance_max_xjal;
    }
    double predation_tolerance_mode_xjal = 
      root._predation_tolerance_mode_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_predation_tolerance_mode(predation_tolerance_mode_xjal);
    } else {
      predation_tolerance_mode = predation_tolerance_mode_xjal;
    }
    double natural_tolerance_min_xjal = 
      root._natural_tolerance_min_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_natural_tolerance_min(natural_tolerance_min_xjal);
    } else {
      natural_tolerance_min = natural_tolerance_min_xjal;
    }
    double natural_tolerance_max_xjal = 
      root._natural_tolerance_max_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_natural_tolerance_max(natural_tolerance_max_xjal);
    } else {
      natural_tolerance_max = natural_tolerance_max_xjal;
    }
    double natural_tolerance_mode_xjal = 
      root._natural_tolerance_mode_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_natural_tolerance_mode(natural_tolerance_mode_xjal);
    } else {
      natural_tolerance_mode = natural_tolerance_mode_xjal;
    }
    double contagion_tolerance_min_xjal = 
      root._contagion_tolerance_min_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_contagion_tolerance_min(contagion_tolerance_min_xjal);
    } else {
      contagion_tolerance_min = contagion_tolerance_min_xjal;
    }
    double contagion_tolerance_max_xjal = 
      root._contagion_tolerance_max_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_contagion_tolerance_max(contagion_tolerance_max_xjal);
    } else {
      contagion_tolerance_max = contagion_tolerance_max_xjal;
    }
    double contagion_tolerance_mode_xjal = 
      root._contagion_tolerance_mode_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_contagion_tolerance_mode(contagion_tolerance_mode_xjal);
    } else {
      contagion_tolerance_mode = contagion_tolerance_mode_xjal;
    }
    double social_tolerance_min_xjal = 
      root._social_tolerance_min_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_social_tolerance_min(social_tolerance_min_xjal);
    } else {
      social_tolerance_min = social_tolerance_min_xjal;
    }
    double social_tolerance_max_xjal = 
      root._social_tolerance_max_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_social_tolerance_max(social_tolerance_max_xjal);
    } else {
      social_tolerance_max = social_tolerance_max_xjal;
    }
    double social_tolerance_mode_xjal = 
      root._social_tolerance_mode_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_social_tolerance_mode(social_tolerance_mode_xjal);
    } else {
      social_tolerance_mode = social_tolerance_mode_xjal;
    }
    double contagion_probability_min_xjal = 
      root._contagion_probability_min_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_contagion_probability_min(contagion_probability_min_xjal);
    } else {
      contagion_probability_min = contagion_probability_min_xjal;
    }
    double contagion_probability_max_xjal = 
      root._contagion_probability_max_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_contagion_probability_max(contagion_probability_max_xjal);
    } else {
      contagion_probability_max = contagion_probability_max_xjal;
    }
    double contagion_probability_mode_xjal = 
      root._contagion_probability_mode_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_contagion_probability_mode(contagion_probability_mode_xjal);
    } else {
      contagion_probability_mode = contagion_probability_mode_xjal;
    }
    double predation_probability_min_xjal = 
      root._predation_probability_min_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_predation_probability_min(predation_probability_min_xjal);
    } else {
      predation_probability_min = predation_probability_min_xjal;
    }
    double predation_probability_max_xjal = 
      root._predation_probability_max_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_predation_probability_max(predation_probability_max_xjal);
    } else {
      predation_probability_max = predation_probability_max_xjal;
    }
    double predation_probability_mode_xjal = 
      root._predation_probability_mode_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_predation_probability_mode(predation_probability_mode_xjal);
    } else {
      predation_probability_mode = predation_probability_mode_xjal;
    }
    double social_probability_min_xjal = 
      root._social_probability_min_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_social_probability_min(social_probability_min_xjal);
    } else {
      social_probability_min = social_probability_min_xjal;
    }
    double social_probability_max_xjal = 
      root._social_probability_max_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_social_probability_max(social_probability_max_xjal);
    } else {
      social_probability_max = social_probability_max_xjal;
    }
    double social_probability_mode_xjal = 
      root._social_probability_mode_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_social_probability_mode(social_probability_mode_xjal);
    } else {
      social_probability_mode = social_probability_mode_xjal;
    }
    double chanceForNaturalHazardToOccur_xjal = 
      root._chanceForNaturalHazardToOccur_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_chanceForNaturalHazardToOccur(chanceForNaturalHazardToOccur_xjal);
    } else {
      chanceForNaturalHazardToOccur = chanceForNaturalHazardToOccur_xjal;
    }
    double group_distance_anthropomorphic_min_xjal = 
      root._group_distance_anthropomorphic_min_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_group_distance_anthropomorphic_min(group_distance_anthropomorphic_min_xjal);
    } else {
      group_distance_anthropomorphic_min = group_distance_anthropomorphic_min_xjal;
    }
    double group_distance_anthropomorphic_max_xjal = 
      root._group_distance_anthropomorphic_max_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_group_distance_anthropomorphic_max(group_distance_anthropomorphic_max_xjal);
    } else {
      group_distance_anthropomorphic_max = group_distance_anthropomorphic_max_xjal;
    }
    double prior_sociographic_promiscuity_min_xjal = 
      root._prior_sociographic_promiscuity_min_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_prior_sociographic_promiscuity_min(prior_sociographic_promiscuity_min_xjal);
    } else {
      prior_sociographic_promiscuity_min = prior_sociographic_promiscuity_min_xjal;
    }
    double prior_sociographic_promiscuity_max_xjal = 
      root._prior_sociographic_promiscuity_max_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_prior_sociographic_promiscuity_max(prior_sociographic_promiscuity_max_xjal);
    } else {
      prior_sociographic_promiscuity_max = prior_sociographic_promiscuity_max_xjal;
    }
    double prior_sociographic_promiscuity_mode_xjal = 
      root._prior_sociographic_promiscuity_mode_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_prior_sociographic_promiscuity_mode(prior_sociographic_promiscuity_mode_xjal);
    } else {
      prior_sociographic_promiscuity_mode = prior_sociographic_promiscuity_mode_xjal;
    }
    double group_distance_sociographic_min_xjal = 
      root._group_distance_sociographic_min_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_group_distance_sociographic_min(group_distance_sociographic_min_xjal);
    } else {
      group_distance_sociographic_min = group_distance_sociographic_min_xjal;
    }
    double group_distance_sociographic_max_xjal = 
      root._group_distance_sociographic_max_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_group_distance_sociographic_max(group_distance_sociographic_max_xjal);
    } else {
      group_distance_sociographic_max = group_distance_sociographic_max_xjal;
    }
    double group_distance_contagionHazard_min_xjal = 
      root._group_distance_contagionHazard_min_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_group_distance_contagionHazard_min(group_distance_contagionHazard_min_xjal);
    } else {
      group_distance_contagionHazard_min = group_distance_contagionHazard_min_xjal;
    }
    double group_distance_contagionHazard_max_xjal = 
      root._group_distance_contagionHazard_max_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_group_distance_contagionHazard_max(group_distance_contagionHazard_max_xjal);
    } else {
      group_distance_contagionHazard_max = group_distance_contagionHazard_max_xjal;
    }
    double group_distance_socialHazard_min_xjal = 
      root._group_distance_socialHazard_min_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_group_distance_socialHazard_min(group_distance_socialHazard_min_xjal);
    } else {
      group_distance_socialHazard_min = group_distance_socialHazard_min_xjal;
    }
    double group_distance_socialHazard_max_xjal = 
      root._group_distance_socialHazard_max_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_group_distance_socialHazard_max(group_distance_socialHazard_max_xjal);
    } else {
      group_distance_socialHazard_max = group_distance_socialHazard_max_xjal;
    }
    double beta_coeff_xjal = 
      root._beta_coeff_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_beta_coeff(beta_coeff_xjal);
    } else {
      beta_coeff = beta_coeff_xjal;
    }
    double prob_link_reassignment_xjal = 
      root._prob_link_reassignment_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_prob_link_reassignment(prob_link_reassignment_xjal);
    } else {
      prob_link_reassignment = prob_link_reassignment_xjal;
    }
    int pop_xjal = 
      root._pop_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_pop(pop_xjal);
    } else {
      pop = pop_xjal;
    }
    long seed_xjal = 
      root._seed_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_seed(seed_xjal);
    } else {
      seed = seed_xjal;
    }
    int length_of_memory_xjal = 
      root._length_of_memory_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_length_of_memory(length_of_memory_xjal);
    } else {
      length_of_memory = length_of_memory_xjal;
    }
    double num_beliefs_xjal = 
      root._num_beliefs_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_num_beliefs(num_beliefs_xjal);
    } else {
      num_beliefs = num_beliefs_xjal;
    }
    double cultural_dissonance_xjal = 
      root._cultural_dissonance_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_cultural_dissonance(cultural_dissonance_xjal);
    } else {
      cultural_dissonance = cultural_dissonance_xjal;
    }
    double extinction_rate_xjal = 
      root._extinction_rate_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_extinction_rate(extinction_rate_xjal);
    } else {
      extinction_rate = extinction_rate_xjal;
    }
    double weight_second_order_connection_xjal = 
      root._weight_second_order_connection_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_weight_second_order_connection(weight_second_order_connection_xjal);
    } else {
      weight_second_order_connection = weight_second_order_connection_xjal;
    }
    double weight_third_order_connection_xjal = 
      root._weight_third_order_connection_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_weight_third_order_connection(weight_third_order_connection_xjal);
    } else {
      weight_third_order_connection = weight_third_order_connection_xjal;
    }
    double threshold_xjal = 
      root._threshold_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_threshold(threshold_xjal);
    } else {
      threshold = threshold_xjal;
    }
    double vision_xjal = 
      root._vision_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_vision(vision_xjal);
    } else {
      vision = vision_xjal;
    }
    int Violence_Counter_Update_Interval_xjal = 
      root._Violence_Counter_Update_Interval_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_Violence_Counter_Update_Interval(Violence_Counter_Update_Interval_xjal);
    } else {
      Violence_Counter_Update_Interval = Violence_Counter_Update_Interval_xjal;
    }
    int Affect_Counter_Update_Interval_xjal = 
      root._Affect_Counter_Update_Interval_DefaultValue_xjal();
    if (callOnChangeActions) {
      root.set_Affect_Counter_Update_Interval(Affect_Counter_Update_Interval_xjal);
    } else {
      Affect_Counter_Update_Interval = Affect_Counter_Update_Interval_xjal;
    }
  }
  
  @AnyLogicInternalAPI
  public void getOutputValues(Main root, IRunOutputsConsumer outputsConsumer) {}
}
