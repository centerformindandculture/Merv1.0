package merv_1_0_3;

import com.anylogic.engine.AnyLogicInternalCodegenAPI;
import com.anylogic.engine.analysis.DataSet;
import com.anylogic.engine.presentation.Panel;
import java.util.List;

public class Main extends com.anylogic.engine.Agent
{
  public double group_ID_percentOfPopInMajority;
  public double prior_anthropomorphic_promiscuity_min;
  public double prior_anthropomorphic_promiscuity_max;
  public double prior_anthropomorphic_promiscuity_mode;
  public double sociographic_prudery_min;
  public double sociographic_prudery_max;
  public double sociographic_prudery_mode;
  public double anthropomorphic_promiscuity_min;
  public double anthropomorphic_promiscuity_max;
  public double anthropomorphic_promiscuity_mode;
  public double predation_tolerance_min;
  public double predation_tolerance_max;
  public double predation_tolerance_mode;
  public double natural_tolerance_min;
  public double natural_tolerance_max;
  public double natural_tolerance_mode;
  public double contagion_tolerance_min;
  public double contagion_tolerance_max;
  public double contagion_tolerance_mode;
  public double social_tolerance_min;
  public double social_tolerance_max;
  public double social_tolerance_mode;
  public double contagion_probability_min;
  public double contagion_probability_max;
  public double contagion_probability_mode;
  public double predation_probability_min;
  public double predation_probability_max;
  public double predation_probability_mode;
  public double social_probability_min;
  public double social_probability_max;
  public double social_probability_mode;
  public double chanceForNaturalHazardToOccur;
  public double group_distance_anthropomorphic_min;
  public double group_distance_anthropomorphic_max;
  public double prior_sociographic_promiscuity_min;
  public double prior_sociographic_promiscuity_max;
  public double prior_sociographic_promiscuity_mode;
  public double group_distance_sociographic_min;
  public double group_distance_sociographic_max;
  public double group_distance_contagionHazard_min;
  public double group_distance_contagionHazard_max;
  public double group_distance_socialHazard_min;
  public double group_distance_socialHazard_max;
  public double beta_coeff;
  public double prob_link_reassignment;
  public int pop;
  public long seed;
  public int length_of_memory;
  public double num_beliefs;
  public double cultural_dissonance;
  public double extinction_rate;
  public double weight_second_order_connection;
  public double weight_third_order_connection;
  public double threshold;
  public double vision;
  public int Violence_Counter_Update_Interval;
  public int Affect_Counter_Update_Interval;
  @AnyLogicInternalCodegenAPI
  private static String[] _parameterNames_xjal;
  public double Total_Group_1_Sociographic_Prudery;
  public double Total_Group_2_Anthropomorphic_Promiscuity;
  public double Total_Group_1_Anthropomorphic_Promiscuity;
  public double Total_Group_2_Sociographic_Prudery;
  public boolean Natural_Hazard_Present;
  public int Max_Group_Size_in_Ritual;
  public String csv_PopulationLevel;
  public String csv_IndividualLevel;
  public int Total_Number_of_Groups;
  public int pop_group_1;
  public int pop_group_2;
  public double[][] social_network_1;
  public double[][] social_network_2;
  public double[] group_1_values;
  public double[] group_2_values;
  public int Number_of_Consecutive_Increases_Maximum;
  public int Number_of_Consecutive_Increases_Second_Highest;
  public int Number_of_Consecutive_Increases_Current;
  public int Number_of_Consecutive_Affect_Increases_Maximum;
  public int Number_of_Consecutive_Affect_Increases_Second_Highest;
  public int Number_of_Consecutive_Affect_Increases_Current;
  
  @AnyLogicInternalCodegenAPI
  public double _group_ID_percentOfPopInMajority_DefaultValue_xjal()
  {
    Main self = this;
    return 
      50.0D;
  }
  
  public void set_group_ID_percentOfPopInMajority(double group_ID_percentOfPopInMajority)
  {
    if (group_ID_percentOfPopInMajority == this.group_ID_percentOfPopInMajority) {
      return;
    }
    double _oldValue_xjal = this.group_ID_percentOfPopInMajority;
    this.group_ID_percentOfPopInMajority = group_ID_percentOfPopInMajority;
    onChange_group_ID_percentOfPopInMajority_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_group_ID_percentOfPopInMajority()
  {
    onChange_group_ID_percentOfPopInMajority_xjal(group_ID_percentOfPopInMajority);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _prior_anthropomorphic_promiscuity_min_DefaultValue_xjal()
  {
    Main self = this;
    return 
      1.0D;
  }
  
  public void set_prior_anthropomorphic_promiscuity_min(double prior_anthropomorphic_promiscuity_min)
  {
    if (prior_anthropomorphic_promiscuity_min == this.prior_anthropomorphic_promiscuity_min) {
      return;
    }
    double _oldValue_xjal = this.prior_anthropomorphic_promiscuity_min;
    this.prior_anthropomorphic_promiscuity_min = prior_anthropomorphic_promiscuity_min;
    onChange_prior_anthropomorphic_promiscuity_min_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_prior_anthropomorphic_promiscuity_min()
  {
    onChange_prior_anthropomorphic_promiscuity_min_xjal(prior_anthropomorphic_promiscuity_min);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _prior_anthropomorphic_promiscuity_max_DefaultValue_xjal()
  {
    Main self = this;
    return 
      10.0D;
  }
  
  public void set_prior_anthropomorphic_promiscuity_max(double prior_anthropomorphic_promiscuity_max)
  {
    if (prior_anthropomorphic_promiscuity_max == this.prior_anthropomorphic_promiscuity_max) {
      return;
    }
    double _oldValue_xjal = this.prior_anthropomorphic_promiscuity_max;
    this.prior_anthropomorphic_promiscuity_max = prior_anthropomorphic_promiscuity_max;
    onChange_prior_anthropomorphic_promiscuity_max_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_prior_anthropomorphic_promiscuity_max()
  {
    onChange_prior_anthropomorphic_promiscuity_max_xjal(prior_anthropomorphic_promiscuity_max);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _prior_anthropomorphic_promiscuity_mode_DefaultValue_xjal()
  {
    Main self = this;
    return 
      5.0D;
  }
  
  public void set_prior_anthropomorphic_promiscuity_mode(double prior_anthropomorphic_promiscuity_mode)
  {
    if (prior_anthropomorphic_promiscuity_mode == this.prior_anthropomorphic_promiscuity_mode) {
      return;
    }
    double _oldValue_xjal = this.prior_anthropomorphic_promiscuity_mode;
    this.prior_anthropomorphic_promiscuity_mode = prior_anthropomorphic_promiscuity_mode;
    onChange_prior_anthropomorphic_promiscuity_mode_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_prior_anthropomorphic_promiscuity_mode()
  {
    onChange_prior_anthropomorphic_promiscuity_mode_xjal(prior_anthropomorphic_promiscuity_mode);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _sociographic_prudery_min_DefaultValue_xjal()
  {
    Main self = this;
    return 
      0.0D;
  }
  
  public void set_sociographic_prudery_min(double sociographic_prudery_min)
  {
    if (sociographic_prudery_min == this.sociographic_prudery_min) {
      return;
    }
    double _oldValue_xjal = this.sociographic_prudery_min;
    this.sociographic_prudery_min = sociographic_prudery_min;
    onChange_sociographic_prudery_min_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_sociographic_prudery_min()
  {
    onChange_sociographic_prudery_min_xjal(sociographic_prudery_min);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _sociographic_prudery_max_DefaultValue_xjal()
  {
    Main self = this;
    return 
      10.0D;
  }
  
  public void set_sociographic_prudery_max(double sociographic_prudery_max)
  {
    if (sociographic_prudery_max == this.sociographic_prudery_max) {
      return;
    }
    double _oldValue_xjal = this.sociographic_prudery_max;
    this.sociographic_prudery_max = sociographic_prudery_max;
    onChange_sociographic_prudery_max_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_sociographic_prudery_max()
  {
    onChange_sociographic_prudery_max_xjal(sociographic_prudery_max);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _sociographic_prudery_mode_DefaultValue_xjal()
  {
    Main self = this;
    return 
      5.0D;
  }
  
  public void set_sociographic_prudery_mode(double sociographic_prudery_mode)
  {
    if (sociographic_prudery_mode == this.sociographic_prudery_mode) {
      return;
    }
    double _oldValue_xjal = this.sociographic_prudery_mode;
    this.sociographic_prudery_mode = sociographic_prudery_mode;
    onChange_sociographic_prudery_mode_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_sociographic_prudery_mode()
  {
    onChange_sociographic_prudery_mode_xjal(sociographic_prudery_mode);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _anthropomorphic_promiscuity_min_DefaultValue_xjal()
  {
    Main self = this;
    return 
      0.0D;
  }
  
  public void set_anthropomorphic_promiscuity_min(double anthropomorphic_promiscuity_min)
  {
    if (anthropomorphic_promiscuity_min == this.anthropomorphic_promiscuity_min) {
      return;
    }
    double _oldValue_xjal = this.anthropomorphic_promiscuity_min;
    this.anthropomorphic_promiscuity_min = anthropomorphic_promiscuity_min;
    onChange_anthropomorphic_promiscuity_min_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_anthropomorphic_promiscuity_min()
  {
    onChange_anthropomorphic_promiscuity_min_xjal(anthropomorphic_promiscuity_min);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _anthropomorphic_promiscuity_max_DefaultValue_xjal()
  {
    Main self = this;
    return 
      10.0D;
  }
  
  public void set_anthropomorphic_promiscuity_max(double anthropomorphic_promiscuity_max)
  {
    if (anthropomorphic_promiscuity_max == this.anthropomorphic_promiscuity_max) {
      return;
    }
    double _oldValue_xjal = this.anthropomorphic_promiscuity_max;
    this.anthropomorphic_promiscuity_max = anthropomorphic_promiscuity_max;
    onChange_anthropomorphic_promiscuity_max_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_anthropomorphic_promiscuity_max()
  {
    onChange_anthropomorphic_promiscuity_max_xjal(anthropomorphic_promiscuity_max);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _anthropomorphic_promiscuity_mode_DefaultValue_xjal()
  {
    Main self = this;
    return 
      5.0D;
  }
  
  public void set_anthropomorphic_promiscuity_mode(double anthropomorphic_promiscuity_mode)
  {
    if (anthropomorphic_promiscuity_mode == this.anthropomorphic_promiscuity_mode) {
      return;
    }
    double _oldValue_xjal = this.anthropomorphic_promiscuity_mode;
    this.anthropomorphic_promiscuity_mode = anthropomorphic_promiscuity_mode;
    onChange_anthropomorphic_promiscuity_mode_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_anthropomorphic_promiscuity_mode()
  {
    onChange_anthropomorphic_promiscuity_mode_xjal(anthropomorphic_promiscuity_mode);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _predation_tolerance_min_DefaultValue_xjal()
  {
    Main self = this;
    return 
      0.0D;
  }
  
  public void set_predation_tolerance_min(double predation_tolerance_min)
  {
    if (predation_tolerance_min == this.predation_tolerance_min) {
      return;
    }
    double _oldValue_xjal = this.predation_tolerance_min;
    this.predation_tolerance_min = predation_tolerance_min;
    onChange_predation_tolerance_min_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_predation_tolerance_min()
  {
    onChange_predation_tolerance_min_xjal(predation_tolerance_min);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _predation_tolerance_max_DefaultValue_xjal()
  {
    Main self = this;
    return 
      100.0D;
  }
  
  public void set_predation_tolerance_max(double predation_tolerance_max)
  {
    if (predation_tolerance_max == this.predation_tolerance_max) {
      return;
    }
    double _oldValue_xjal = this.predation_tolerance_max;
    this.predation_tolerance_max = predation_tolerance_max;
    onChange_predation_tolerance_max_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_predation_tolerance_max()
  {
    onChange_predation_tolerance_max_xjal(predation_tolerance_max);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _predation_tolerance_mode_DefaultValue_xjal()
  {
    Main self = this;
    return 
      50.0D;
  }
  
  public void set_predation_tolerance_mode(double predation_tolerance_mode)
  {
    if (predation_tolerance_mode == this.predation_tolerance_mode) {
      return;
    }
    double _oldValue_xjal = this.predation_tolerance_mode;
    this.predation_tolerance_mode = predation_tolerance_mode;
    onChange_predation_tolerance_mode_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_predation_tolerance_mode()
  {
    onChange_predation_tolerance_mode_xjal(predation_tolerance_mode);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _natural_tolerance_min_DefaultValue_xjal()
  {
    Main self = this;
    return 
      0.0D;
  }
  
  public void set_natural_tolerance_min(double natural_tolerance_min)
  {
    if (natural_tolerance_min == this.natural_tolerance_min) {
      return;
    }
    double _oldValue_xjal = this.natural_tolerance_min;
    this.natural_tolerance_min = natural_tolerance_min;
    onChange_natural_tolerance_min_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_natural_tolerance_min()
  {
    onChange_natural_tolerance_min_xjal(natural_tolerance_min);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _natural_tolerance_max_DefaultValue_xjal()
  {
    Main self = this;
    return 
      100.0D;
  }
  
  public void set_natural_tolerance_max(double natural_tolerance_max)
  {
    if (natural_tolerance_max == this.natural_tolerance_max) {
      return;
    }
    double _oldValue_xjal = this.natural_tolerance_max;
    this.natural_tolerance_max = natural_tolerance_max;
    onChange_natural_tolerance_max_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_natural_tolerance_max()
  {
    onChange_natural_tolerance_max_xjal(natural_tolerance_max);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _natural_tolerance_mode_DefaultValue_xjal()
  {
    Main self = this;
    return 
      50.0D;
  }
  
  public void set_natural_tolerance_mode(double natural_tolerance_mode)
  {
    if (natural_tolerance_mode == this.natural_tolerance_mode) {
      return;
    }
    double _oldValue_xjal = this.natural_tolerance_mode;
    this.natural_tolerance_mode = natural_tolerance_mode;
    onChange_natural_tolerance_mode_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_natural_tolerance_mode()
  {
    onChange_natural_tolerance_mode_xjal(natural_tolerance_mode);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _contagion_tolerance_min_DefaultValue_xjal()
  {
    Main self = this;
    return 
      0.0D;
  }
  
  public void set_contagion_tolerance_min(double contagion_tolerance_min)
  {
    if (contagion_tolerance_min == this.contagion_tolerance_min) {
      return;
    }
    double _oldValue_xjal = this.contagion_tolerance_min;
    this.contagion_tolerance_min = contagion_tolerance_min;
    onChange_contagion_tolerance_min_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_contagion_tolerance_min()
  {
    onChange_contagion_tolerance_min_xjal(contagion_tolerance_min);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _contagion_tolerance_max_DefaultValue_xjal()
  {
    Main self = this;
    return 
      100.0D;
  }
  
  public void set_contagion_tolerance_max(double contagion_tolerance_max)
  {
    if (contagion_tolerance_max == this.contagion_tolerance_max) {
      return;
    }
    double _oldValue_xjal = this.contagion_tolerance_max;
    this.contagion_tolerance_max = contagion_tolerance_max;
    onChange_contagion_tolerance_max_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_contagion_tolerance_max()
  {
    onChange_contagion_tolerance_max_xjal(contagion_tolerance_max);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _contagion_tolerance_mode_DefaultValue_xjal()
  {
    Main self = this;
    return 
      50.0D;
  }
  
  public void set_contagion_tolerance_mode(double contagion_tolerance_mode)
  {
    if (contagion_tolerance_mode == this.contagion_tolerance_mode) {
      return;
    }
    double _oldValue_xjal = this.contagion_tolerance_mode;
    this.contagion_tolerance_mode = contagion_tolerance_mode;
    onChange_contagion_tolerance_mode_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_contagion_tolerance_mode()
  {
    onChange_contagion_tolerance_mode_xjal(contagion_tolerance_mode);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _social_tolerance_min_DefaultValue_xjal()
  {
    Main self = this;
    return 
      0.0D;
  }
  
  public void set_social_tolerance_min(double social_tolerance_min)
  {
    if (social_tolerance_min == this.social_tolerance_min) {
      return;
    }
    double _oldValue_xjal = this.social_tolerance_min;
    this.social_tolerance_min = social_tolerance_min;
    onChange_social_tolerance_min_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_social_tolerance_min()
  {
    onChange_social_tolerance_min_xjal(social_tolerance_min);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _social_tolerance_max_DefaultValue_xjal()
  {
    Main self = this;
    return 
      100.0D;
  }
  
  public void set_social_tolerance_max(double social_tolerance_max)
  {
    if (social_tolerance_max == this.social_tolerance_max) {
      return;
    }
    double _oldValue_xjal = this.social_tolerance_max;
    this.social_tolerance_max = social_tolerance_max;
    onChange_social_tolerance_max_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_social_tolerance_max()
  {
    onChange_social_tolerance_max_xjal(social_tolerance_max);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _social_tolerance_mode_DefaultValue_xjal()
  {
    Main self = this;
    return 
      50.0D;
  }
  
  public void set_social_tolerance_mode(double social_tolerance_mode)
  {
    if (social_tolerance_mode == this.social_tolerance_mode) {
      return;
    }
    double _oldValue_xjal = this.social_tolerance_mode;
    this.social_tolerance_mode = social_tolerance_mode;
    onChange_social_tolerance_mode_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_social_tolerance_mode()
  {
    onChange_social_tolerance_mode_xjal(social_tolerance_mode);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _contagion_probability_min_DefaultValue_xjal()
  {
    Main self = this;
    return 
      0.0D;
  }
  
  public void set_contagion_probability_min(double contagion_probability_min)
  {
    if (contagion_probability_min == this.contagion_probability_min) {
      return;
    }
    double _oldValue_xjal = this.contagion_probability_min;
    this.contagion_probability_min = contagion_probability_min;
    onChange_contagion_probability_min_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_contagion_probability_min()
  {
    onChange_contagion_probability_min_xjal(contagion_probability_min);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _contagion_probability_max_DefaultValue_xjal()
  {
    Main self = this;
    return 
      100.0D;
  }
  
  public void set_contagion_probability_max(double contagion_probability_max)
  {
    if (contagion_probability_max == this.contagion_probability_max) {
      return;
    }
    double _oldValue_xjal = this.contagion_probability_max;
    this.contagion_probability_max = contagion_probability_max;
    onChange_contagion_probability_max_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_contagion_probability_max()
  {
    onChange_contagion_probability_max_xjal(contagion_probability_max);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _contagion_probability_mode_DefaultValue_xjal()
  {
    Main self = this;
    return 
      50.0D;
  }
  
  public void set_contagion_probability_mode(double contagion_probability_mode)
  {
    if (contagion_probability_mode == this.contagion_probability_mode) {
      return;
    }
    double _oldValue_xjal = this.contagion_probability_mode;
    this.contagion_probability_mode = contagion_probability_mode;
    onChange_contagion_probability_mode_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_contagion_probability_mode()
  {
    onChange_contagion_probability_mode_xjal(contagion_probability_mode);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _predation_probability_min_DefaultValue_xjal()
  {
    Main self = this;
    return 
      0.0D;
  }
  
  public void set_predation_probability_min(double predation_probability_min)
  {
    if (predation_probability_min == this.predation_probability_min) {
      return;
    }
    double _oldValue_xjal = this.predation_probability_min;
    this.predation_probability_min = predation_probability_min;
    onChange_predation_probability_min_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_predation_probability_min()
  {
    onChange_predation_probability_min_xjal(predation_probability_min);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _predation_probability_max_DefaultValue_xjal()
  {
    Main self = this;
    return 
      100.0D;
  }
  
  public void set_predation_probability_max(double predation_probability_max)
  {
    if (predation_probability_max == this.predation_probability_max) {
      return;
    }
    double _oldValue_xjal = this.predation_probability_max;
    this.predation_probability_max = predation_probability_max;
    onChange_predation_probability_max_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_predation_probability_max()
  {
    onChange_predation_probability_max_xjal(predation_probability_max);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _predation_probability_mode_DefaultValue_xjal()
  {
    Main self = this;
    return 
      50.0D;
  }
  
  public void set_predation_probability_mode(double predation_probability_mode)
  {
    if (predation_probability_mode == this.predation_probability_mode) {
      return;
    }
    double _oldValue_xjal = this.predation_probability_mode;
    this.predation_probability_mode = predation_probability_mode;
    onChange_predation_probability_mode_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_predation_probability_mode()
  {
    onChange_predation_probability_mode_xjal(predation_probability_mode);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _social_probability_min_DefaultValue_xjal()
  {
    Main self = this;
    return 
      0.0D;
  }
  
  public void set_social_probability_min(double social_probability_min)
  {
    if (social_probability_min == this.social_probability_min) {
      return;
    }
    double _oldValue_xjal = this.social_probability_min;
    this.social_probability_min = social_probability_min;
    onChange_social_probability_min_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_social_probability_min()
  {
    onChange_social_probability_min_xjal(social_probability_min);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _social_probability_max_DefaultValue_xjal()
  {
    Main self = this;
    return 
      100.0D;
  }
  
  public void set_social_probability_max(double social_probability_max)
  {
    if (social_probability_max == this.social_probability_max) {
      return;
    }
    double _oldValue_xjal = this.social_probability_max;
    this.social_probability_max = social_probability_max;
    onChange_social_probability_max_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_social_probability_max()
  {
    onChange_social_probability_max_xjal(social_probability_max);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _social_probability_mode_DefaultValue_xjal()
  {
    Main self = this;
    return 
      50.0D;
  }
  
  public void set_social_probability_mode(double social_probability_mode)
  {
    if (social_probability_mode == this.social_probability_mode) {
      return;
    }
    double _oldValue_xjal = this.social_probability_mode;
    this.social_probability_mode = social_probability_mode;
    onChange_social_probability_mode_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_social_probability_mode()
  {
    onChange_social_probability_mode_xjal(social_probability_mode);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _chanceForNaturalHazardToOccur_DefaultValue_xjal()
  {
    Main self = this;
    return 
      50.0D;
  }
  
  public void set_chanceForNaturalHazardToOccur(double chanceForNaturalHazardToOccur)
  {
    if (chanceForNaturalHazardToOccur == this.chanceForNaturalHazardToOccur) {
      return;
    }
    double _oldValue_xjal = this.chanceForNaturalHazardToOccur;
    this.chanceForNaturalHazardToOccur = chanceForNaturalHazardToOccur;
    onChange_chanceForNaturalHazardToOccur_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_chanceForNaturalHazardToOccur()
  {
    onChange_chanceForNaturalHazardToOccur_xjal(chanceForNaturalHazardToOccur);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _group_distance_anthropomorphic_min_DefaultValue_xjal()
  {
    Main self = this;
    return 
      1.0D;
  }
  
  public void set_group_distance_anthropomorphic_min(double group_distance_anthropomorphic_min)
  {
    if (group_distance_anthropomorphic_min == this.group_distance_anthropomorphic_min) {
      return;
    }
    double _oldValue_xjal = this.group_distance_anthropomorphic_min;
    this.group_distance_anthropomorphic_min = group_distance_anthropomorphic_min;
    onChange_group_distance_anthropomorphic_min_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_group_distance_anthropomorphic_min()
  {
    onChange_group_distance_anthropomorphic_min_xjal(group_distance_anthropomorphic_min);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _group_distance_anthropomorphic_max_DefaultValue_xjal()
  {
    Main self = this;
    return 
      10.0D;
  }
  
  public void set_group_distance_anthropomorphic_max(double group_distance_anthropomorphic_max)
  {
    if (group_distance_anthropomorphic_max == this.group_distance_anthropomorphic_max) {
      return;
    }
    double _oldValue_xjal = this.group_distance_anthropomorphic_max;
    this.group_distance_anthropomorphic_max = group_distance_anthropomorphic_max;
    onChange_group_distance_anthropomorphic_max_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_group_distance_anthropomorphic_max()
  {
    onChange_group_distance_anthropomorphic_max_xjal(group_distance_anthropomorphic_max);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _prior_sociographic_promiscuity_min_DefaultValue_xjal()
  {
    Main self = this;
    return 
      1.0D;
  }
  
  public void set_prior_sociographic_promiscuity_min(double prior_sociographic_promiscuity_min)
  {
    if (prior_sociographic_promiscuity_min == this.prior_sociographic_promiscuity_min) {
      return;
    }
    double _oldValue_xjal = this.prior_sociographic_promiscuity_min;
    this.prior_sociographic_promiscuity_min = prior_sociographic_promiscuity_min;
    onChange_prior_sociographic_promiscuity_min_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_prior_sociographic_promiscuity_min()
  {
    onChange_prior_sociographic_promiscuity_min_xjal(prior_sociographic_promiscuity_min);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _prior_sociographic_promiscuity_max_DefaultValue_xjal()
  {
    Main self = this;
    return 
      10.0D;
  }
  
  public void set_prior_sociographic_promiscuity_max(double prior_sociographic_promiscuity_max)
  {
    if (prior_sociographic_promiscuity_max == this.prior_sociographic_promiscuity_max) {
      return;
    }
    double _oldValue_xjal = this.prior_sociographic_promiscuity_max;
    this.prior_sociographic_promiscuity_max = prior_sociographic_promiscuity_max;
    onChange_prior_sociographic_promiscuity_max_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_prior_sociographic_promiscuity_max()
  {
    onChange_prior_sociographic_promiscuity_max_xjal(prior_sociographic_promiscuity_max);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _prior_sociographic_promiscuity_mode_DefaultValue_xjal()
  {
    Main self = this;
    return 
      5.0D;
  }
  
  public void set_prior_sociographic_promiscuity_mode(double prior_sociographic_promiscuity_mode)
  {
    if (prior_sociographic_promiscuity_mode == this.prior_sociographic_promiscuity_mode) {
      return;
    }
    double _oldValue_xjal = this.prior_sociographic_promiscuity_mode;
    this.prior_sociographic_promiscuity_mode = prior_sociographic_promiscuity_mode;
    onChange_prior_sociographic_promiscuity_mode_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_prior_sociographic_promiscuity_mode()
  {
    onChange_prior_sociographic_promiscuity_mode_xjal(prior_sociographic_promiscuity_mode);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _group_distance_sociographic_min_DefaultValue_xjal()
  {
    Main self = this;
    return 
      1.0D;
  }
  
  public void set_group_distance_sociographic_min(double group_distance_sociographic_min)
  {
    if (group_distance_sociographic_min == this.group_distance_sociographic_min) {
      return;
    }
    double _oldValue_xjal = this.group_distance_sociographic_min;
    this.group_distance_sociographic_min = group_distance_sociographic_min;
    onChange_group_distance_sociographic_min_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_group_distance_sociographic_min()
  {
    onChange_group_distance_sociographic_min_xjal(group_distance_sociographic_min);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _group_distance_sociographic_max_DefaultValue_xjal()
  {
    Main self = this;
    return 
      10.0D;
  }
  
  public void set_group_distance_sociographic_max(double group_distance_sociographic_max)
  {
    if (group_distance_sociographic_max == this.group_distance_sociographic_max) {
      return;
    }
    double _oldValue_xjal = this.group_distance_sociographic_max;
    this.group_distance_sociographic_max = group_distance_sociographic_max;
    onChange_group_distance_sociographic_max_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_group_distance_sociographic_max()
  {
    onChange_group_distance_sociographic_max_xjal(group_distance_sociographic_max);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _group_distance_contagionHazard_min_DefaultValue_xjal()
  {
    Main self = this;
    return 
      1.0D;
  }
  
  public void set_group_distance_contagionHazard_min(double group_distance_contagionHazard_min)
  {
    if (group_distance_contagionHazard_min == this.group_distance_contagionHazard_min) {
      return;
    }
    double _oldValue_xjal = this.group_distance_contagionHazard_min;
    this.group_distance_contagionHazard_min = group_distance_contagionHazard_min;
    onChange_group_distance_contagionHazard_min_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_group_distance_contagionHazard_min()
  {
    onChange_group_distance_contagionHazard_min_xjal(group_distance_contagionHazard_min);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _group_distance_contagionHazard_max_DefaultValue_xjal()
  {
    Main self = this;
    return 
      10.0D;
  }
  
  public void set_group_distance_contagionHazard_max(double group_distance_contagionHazard_max)
  {
    if (group_distance_contagionHazard_max == this.group_distance_contagionHazard_max) {
      return;
    }
    double _oldValue_xjal = this.group_distance_contagionHazard_max;
    this.group_distance_contagionHazard_max = group_distance_contagionHazard_max;
    onChange_group_distance_contagionHazard_max_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_group_distance_contagionHazard_max()
  {
    onChange_group_distance_contagionHazard_max_xjal(group_distance_contagionHazard_max);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _group_distance_socialHazard_min_DefaultValue_xjal()
  {
    Main self = this;
    return 
      1.0D;
  }
  
  public void set_group_distance_socialHazard_min(double group_distance_socialHazard_min)
  {
    if (group_distance_socialHazard_min == this.group_distance_socialHazard_min) {
      return;
    }
    double _oldValue_xjal = this.group_distance_socialHazard_min;
    this.group_distance_socialHazard_min = group_distance_socialHazard_min;
    onChange_group_distance_socialHazard_min_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_group_distance_socialHazard_min()
  {
    onChange_group_distance_socialHazard_min_xjal(group_distance_socialHazard_min);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _group_distance_socialHazard_max_DefaultValue_xjal()
  {
    Main self = this;
    return 
      10.0D;
  }
  
  public void set_group_distance_socialHazard_max(double group_distance_socialHazard_max)
  {
    if (group_distance_socialHazard_max == this.group_distance_socialHazard_max) {
      return;
    }
    double _oldValue_xjal = this.group_distance_socialHazard_max;
    this.group_distance_socialHazard_max = group_distance_socialHazard_max;
    onChange_group_distance_socialHazard_max_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_group_distance_socialHazard_max()
  {
    onChange_group_distance_socialHazard_max_xjal(group_distance_socialHazard_max);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _beta_coeff_DefaultValue_xjal()
  {
    Main self = this;
    return 
      2.0D;
  }
  
  public void set_beta_coeff(double beta_coeff)
  {
    if (beta_coeff == this.beta_coeff) {
      return;
    }
    double _oldValue_xjal = this.beta_coeff;
    this.beta_coeff = beta_coeff;
    onChange_beta_coeff_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_beta_coeff()
  {
    onChange_beta_coeff_xjal(beta_coeff);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _prob_link_reassignment_DefaultValue_xjal()
  {
    Main self = this;
    return 
      0.5D;
  }
  
  public void set_prob_link_reassignment(double prob_link_reassignment)
  {
    if (prob_link_reassignment == this.prob_link_reassignment) {
      return;
    }
    double _oldValue_xjal = this.prob_link_reassignment;
    this.prob_link_reassignment = prob_link_reassignment;
    onChange_prob_link_reassignment_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_prob_link_reassignment()
  {
    onChange_prob_link_reassignment_xjal(prob_link_reassignment);
  }
  











  @AnyLogicInternalCodegenAPI
  public int _pop_DefaultValue_xjal()
  {
    Main self = this;
    return 
      100;
  }
  
  public void set_pop(int pop)
  {
    if (pop == this.pop) {
      return;
    }
    int _oldValue_xjal = this.pop;
    this.pop = pop;
    onChange_pop_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_pop()
  {
    onChange_pop_xjal(pop);
  }
  











  @AnyLogicInternalCodegenAPI
  public long _seed_DefaultValue_xjal()
  {
    Main self = this;
    return 
      24L;
  }
  
  public void set_seed(long seed)
  {
    if (seed == this.seed) {
      return;
    }
    long _oldValue_xjal = this.seed;
    this.seed = seed;
    onChange_seed_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_seed()
  {
    onChange_seed_xjal(seed);
  }
  











  @AnyLogicInternalCodegenAPI
  public int _length_of_memory_DefaultValue_xjal()
  {
    Main self = this;
    return 
      3;
  }
  
  public void set_length_of_memory(int length_of_memory)
  {
    if (length_of_memory == this.length_of_memory) {
      return;
    }
    int _oldValue_xjal = this.length_of_memory;
    this.length_of_memory = length_of_memory;
    onChange_length_of_memory_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_length_of_memory()
  {
    onChange_length_of_memory_xjal(length_of_memory);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _num_beliefs_DefaultValue_xjal()
  {
    Main self = this;
    return 
      10.0D;
  }
  
  public void set_num_beliefs(double num_beliefs)
  {
    if (num_beliefs == this.num_beliefs) {
      return;
    }
    double _oldValue_xjal = this.num_beliefs;
    this.num_beliefs = num_beliefs;
    onChange_num_beliefs_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_num_beliefs()
  {
    onChange_num_beliefs_xjal(num_beliefs);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _cultural_dissonance_DefaultValue_xjal()
  {
    Main self = this;
    return 
      50.0D;
  }
  
  public void set_cultural_dissonance(double cultural_dissonance)
  {
    if (cultural_dissonance == this.cultural_dissonance) {
      return;
    }
    double _oldValue_xjal = this.cultural_dissonance;
    this.cultural_dissonance = cultural_dissonance;
    onChange_cultural_dissonance_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_cultural_dissonance()
  {
    onChange_cultural_dissonance_xjal(cultural_dissonance);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _extinction_rate_DefaultValue_xjal()
  {
    Main self = this;
    return 
      0.1D;
  }
  
  public void set_extinction_rate(double extinction_rate)
  {
    if (extinction_rate == this.extinction_rate) {
      return;
    }
    double _oldValue_xjal = this.extinction_rate;
    this.extinction_rate = extinction_rate;
    onChange_extinction_rate_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_extinction_rate()
  {
    onChange_extinction_rate_xjal(extinction_rate);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _weight_second_order_connection_DefaultValue_xjal()
  {
    Main self = this;
    return 
      0.15D;
  }
  
  public void set_weight_second_order_connection(double weight_second_order_connection)
  {
    if (weight_second_order_connection == this.weight_second_order_connection) {
      return;
    }
    double _oldValue_xjal = this.weight_second_order_connection;
    this.weight_second_order_connection = weight_second_order_connection;
    onChange_weight_second_order_connection_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_weight_second_order_connection()
  {
    onChange_weight_second_order_connection_xjal(weight_second_order_connection);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _weight_third_order_connection_DefaultValue_xjal()
  {
    Main self = this;
    return 
      0.1D;
  }
  
  public void set_weight_third_order_connection(double weight_third_order_connection)
  {
    if (weight_third_order_connection == this.weight_third_order_connection) {
      return;
    }
    double _oldValue_xjal = this.weight_third_order_connection;
    this.weight_third_order_connection = weight_third_order_connection;
    onChange_weight_third_order_connection_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_weight_third_order_connection()
  {
    onChange_weight_third_order_connection_xjal(weight_third_order_connection);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _threshold_DefaultValue_xjal()
  {
    Main self = this;
    return 
      0.3D;
  }
  
  public void set_threshold(double threshold)
  {
    if (threshold == this.threshold) {
      return;
    }
    double _oldValue_xjal = this.threshold;
    this.threshold = threshold;
    onChange_threshold_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_threshold()
  {
    onChange_threshold_xjal(threshold);
  }
  











  @AnyLogicInternalCodegenAPI
  public double _vision_DefaultValue_xjal()
  {
    Main self = this;
    return 
      15.0D;
  }
  
  public void set_vision(double vision)
  {
    if (vision == this.vision) {
      return;
    }
    double _oldValue_xjal = this.vision;
    this.vision = vision;
    onChange_vision_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_vision()
  {
    onChange_vision_xjal(vision);
  }
  











  @AnyLogicInternalCodegenAPI
  public int _Violence_Counter_Update_Interval_DefaultValue_xjal()
  {
    Main self = this;
    return 
      2;
  }
  
  public void set_Violence_Counter_Update_Interval(int Violence_Counter_Update_Interval)
  {
    if (Violence_Counter_Update_Interval == this.Violence_Counter_Update_Interval) {
      return;
    }
    int _oldValue_xjal = this.Violence_Counter_Update_Interval;
    this.Violence_Counter_Update_Interval = Violence_Counter_Update_Interval;
    onChange_Violence_Counter_Update_Interval_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_Violence_Counter_Update_Interval()
  {
    onChange_Violence_Counter_Update_Interval_xjal(Violence_Counter_Update_Interval);
  }
  











  @AnyLogicInternalCodegenAPI
  public int _Affect_Counter_Update_Interval_DefaultValue_xjal()
  {
    Main self = this;
    return 
      2;
  }
  
  public void set_Affect_Counter_Update_Interval(int Affect_Counter_Update_Interval)
  {
    if (Affect_Counter_Update_Interval == this.Affect_Counter_Update_Interval) {
      return;
    }
    int _oldValue_xjal = this.Affect_Counter_Update_Interval;
    this.Affect_Counter_Update_Interval = Affect_Counter_Update_Interval;
    onChange_Affect_Counter_Update_Interval_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_Affect_Counter_Update_Interval()
  {
    onChange_Affect_Counter_Update_Interval_xjal(Affect_Counter_Update_Interval);
  }
  





  public void setParametersToDefaultValues()
  {
    super.setParametersToDefaultValues();
    group_ID_percentOfPopInMajority = _group_ID_percentOfPopInMajority_DefaultValue_xjal();
    prior_anthropomorphic_promiscuity_min = _prior_anthropomorphic_promiscuity_min_DefaultValue_xjal();
    prior_anthropomorphic_promiscuity_max = _prior_anthropomorphic_promiscuity_max_DefaultValue_xjal();
    prior_anthropomorphic_promiscuity_mode = _prior_anthropomorphic_promiscuity_mode_DefaultValue_xjal();
    sociographic_prudery_min = _sociographic_prudery_min_DefaultValue_xjal();
    sociographic_prudery_max = _sociographic_prudery_max_DefaultValue_xjal();
    sociographic_prudery_mode = _sociographic_prudery_mode_DefaultValue_xjal();
    anthropomorphic_promiscuity_min = _anthropomorphic_promiscuity_min_DefaultValue_xjal();
    anthropomorphic_promiscuity_max = _anthropomorphic_promiscuity_max_DefaultValue_xjal();
    anthropomorphic_promiscuity_mode = _anthropomorphic_promiscuity_mode_DefaultValue_xjal();
    predation_tolerance_min = _predation_tolerance_min_DefaultValue_xjal();
    predation_tolerance_max = _predation_tolerance_max_DefaultValue_xjal();
    predation_tolerance_mode = _predation_tolerance_mode_DefaultValue_xjal();
    natural_tolerance_min = _natural_tolerance_min_DefaultValue_xjal();
    natural_tolerance_max = _natural_tolerance_max_DefaultValue_xjal();
    natural_tolerance_mode = _natural_tolerance_mode_DefaultValue_xjal();
    contagion_tolerance_min = _contagion_tolerance_min_DefaultValue_xjal();
    contagion_tolerance_max = _contagion_tolerance_max_DefaultValue_xjal();
    contagion_tolerance_mode = _contagion_tolerance_mode_DefaultValue_xjal();
    social_tolerance_min = _social_tolerance_min_DefaultValue_xjal();
    social_tolerance_max = _social_tolerance_max_DefaultValue_xjal();
    social_tolerance_mode = _social_tolerance_mode_DefaultValue_xjal();
    contagion_probability_min = _contagion_probability_min_DefaultValue_xjal();
    contagion_probability_max = _contagion_probability_max_DefaultValue_xjal();
    contagion_probability_mode = _contagion_probability_mode_DefaultValue_xjal();
    predation_probability_min = _predation_probability_min_DefaultValue_xjal();
    predation_probability_max = _predation_probability_max_DefaultValue_xjal();
    predation_probability_mode = _predation_probability_mode_DefaultValue_xjal();
    social_probability_min = _social_probability_min_DefaultValue_xjal();
    social_probability_max = _social_probability_max_DefaultValue_xjal();
    social_probability_mode = _social_probability_mode_DefaultValue_xjal();
    chanceForNaturalHazardToOccur = _chanceForNaturalHazardToOccur_DefaultValue_xjal();
    group_distance_anthropomorphic_min = _group_distance_anthropomorphic_min_DefaultValue_xjal();
    group_distance_anthropomorphic_max = _group_distance_anthropomorphic_max_DefaultValue_xjal();
    prior_sociographic_promiscuity_min = _prior_sociographic_promiscuity_min_DefaultValue_xjal();
    prior_sociographic_promiscuity_max = _prior_sociographic_promiscuity_max_DefaultValue_xjal();
    prior_sociographic_promiscuity_mode = _prior_sociographic_promiscuity_mode_DefaultValue_xjal();
    group_distance_sociographic_min = _group_distance_sociographic_min_DefaultValue_xjal();
    group_distance_sociographic_max = _group_distance_sociographic_max_DefaultValue_xjal();
    group_distance_contagionHazard_min = _group_distance_contagionHazard_min_DefaultValue_xjal();
    group_distance_contagionHazard_max = _group_distance_contagionHazard_max_DefaultValue_xjal();
    group_distance_socialHazard_min = _group_distance_socialHazard_min_DefaultValue_xjal();
    group_distance_socialHazard_max = _group_distance_socialHazard_max_DefaultValue_xjal();
    beta_coeff = _beta_coeff_DefaultValue_xjal();
    prob_link_reassignment = _prob_link_reassignment_DefaultValue_xjal();
    pop = _pop_DefaultValue_xjal();
    seed = _seed_DefaultValue_xjal();
    length_of_memory = _length_of_memory_DefaultValue_xjal();
    num_beliefs = _num_beliefs_DefaultValue_xjal();
    cultural_dissonance = _cultural_dissonance_DefaultValue_xjal();
    extinction_rate = _extinction_rate_DefaultValue_xjal();
    weight_second_order_connection = _weight_second_order_connection_DefaultValue_xjal();
    weight_third_order_connection = _weight_third_order_connection_DefaultValue_xjal();
    threshold = _threshold_DefaultValue_xjal();
    vision = _vision_DefaultValue_xjal();
    Violence_Counter_Update_Interval = _Violence_Counter_Update_Interval_DefaultValue_xjal();
    Affect_Counter_Update_Interval = _Affect_Counter_Update_Interval_DefaultValue_xjal();
  }
  
  public boolean setParameter(String _name_xjal, Object _value_xjal, boolean _callOnChange_xjal) {
    String str;
    switch ((str = _name_xjal).hashCode()) {case -1992658265:  if (str.equals("predation_tolerance_max")) {} break; case -1992658027:  if (str.equals("predation_tolerance_min")) {} break; case -1945583445:  if (str.equals("chanceForNaturalHazardToOccur")) {} break; case -1902384740:  if (str.equals("contagion_probability_mode")) {} break; case -1865513488:  if (str.equals("cultural_dissonance")) {} break; case -1823421633:  if (str.equals("prior_anthropomorphic_promiscuity_mode")) {} break; case -1642851136:  if (str.equals("predation_tolerance_mode")) {} break; case -1550294677:  if (str.equals("natural_tolerance_mode")) {} break; case -1545477013:  if (str.equals("threshold")) {} break; case -1417636845:  if (str.equals("group_ID_percentOfPopInMajority")) break; break; case -1318320644:  if (str.equals("sociographic_prudery_max")) {} break; case -1318320406:  if (str.equals("sociographic_prudery_min")) {} break; case -1274704320:  if (str.equals("group_distance_anthropomorphic_max")) {} break; case -1274704082:  if (str.equals("group_distance_anthropomorphic_min")) {} break; case -1158388580:  if (str.equals("natural_tolerance_max")) {} break; case -1158388342:  if (str.equals("natural_tolerance_min")) {} break; case -937076502:  if (str.equals("beta_coeff")) {} break; case -816227352:  if (str.equals("vision")) {} break; case -744590937:  if (str.equals("social_tolerance_mode")) {} break; case -685526595:  if (str.equals("anthropomorphic_promiscuity_max")) {} break; case -685526357:  if (str.equals("anthropomorphic_promiscuity_min")) {} break; case -657697601:  if (str.equals("prior_sociographic_promiscuity_mode")) {} break; case -506659441:  if (str.equals("predation_probability_max")) {} break; case -506659203:  if (str.equals("predation_probability_min")) {} break; case -334422546:  if (str.equals("weight_third_order_connection")) {} break; case -301114144:  if (str.equals("social_tolerance_max")) {} break; case -301113906:  if (str.equals("social_tolerance_min")) {} break; case 111185:  if (str.equals("pop")) {} break; case 3526257:  if (str.equals("seed")) {} break; case 101120132:  if (str.equals("contagion_tolerance_mode")) {} break; case 223524970:  if (str.equals("anthropomorphic_promiscuity_mode")) {} break; case 247526139:  if (str.equals("prob_link_reassignment")) {} break; case 260293651:  if (str.equals("weight_second_order_connection")) {} break; case 557450851:  if (str.equals("contagion_tolerance_max")) {} break; case 557451089:  if (str.equals("contagion_tolerance_min")) {} break; case 948614856:  if (str.equals("prior_sociographic_promiscuity_max")) {} break; case 948615094:  if (str.equals("prior_sociographic_promiscuity_min")) {} break; case 980018580:  if (str.equals("Violence_Counter_Update_Interval")) {} break; case 1076346681:  if (str.equals("num_beliefs")) {} break; case 1348340304:  if (str.equals("length_of_memory")) {} break; case 1413064191:  if (str.equals("social_probability_mode")) {} break; case 1473439448:  if (str.equals("predation_probability_mode")) {} break; case 1569602952:  if (str.equals("social_probability_max")) {} break; case 1569603190:  if (str.equals("social_probability_min")) {} break; case 1659184586:  if (str.equals("group_distance_sociographic_max")) {} break; case 1659184824:  if (str.equals("group_distance_sociographic_min")) {} break; case 1740950653:  if (str.equals("group_distance_contagionHazard_max")) {} break; case 1740950891:  if (str.equals("group_distance_contagionHazard_min")) {} break; case 2005065806:  if (str.equals("group_distance_socialHazard_max")) {} break; case 2005066044:  if (str.equals("group_distance_socialHazard_min")) {} break; case 2016842315:  if (str.equals("contagion_probability_max")) {} break; case 2016842553:  if (str.equals("contagion_probability_min")) {} break; case 2019389512:  if (str.equals("prior_anthropomorphic_promiscuity_max")) {} break; case 2019389750:  if (str.equals("prior_anthropomorphic_promiscuity_min")) {} break; case 2074087438:  if (str.equals("Affect_Counter_Update_Interval")) {} break; case 2081745931:  if (str.equals("sociographic_prudery_mode")) {} break; case 2093302190:  if (!str.equals("extinction_rate")) {
        break label3037;
        if (_callOnChange_xjal) {
          set_group_ID_percentOfPopInMajority(((Number)_value_xjal).doubleValue());
        } else {
          group_ID_percentOfPopInMajority = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_prior_anthropomorphic_promiscuity_min(((Number)_value_xjal).doubleValue());
        } else {
          prior_anthropomorphic_promiscuity_min = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_prior_anthropomorphic_promiscuity_max(((Number)_value_xjal).doubleValue());
        } else {
          prior_anthropomorphic_promiscuity_max = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_prior_anthropomorphic_promiscuity_mode(((Number)_value_xjal).doubleValue());
        } else {
          prior_anthropomorphic_promiscuity_mode = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_sociographic_prudery_min(((Number)_value_xjal).doubleValue());
        } else {
          sociographic_prudery_min = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_sociographic_prudery_max(((Number)_value_xjal).doubleValue());
        } else {
          sociographic_prudery_max = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_sociographic_prudery_mode(((Number)_value_xjal).doubleValue());
        } else {
          sociographic_prudery_mode = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_anthropomorphic_promiscuity_min(((Number)_value_xjal).doubleValue());
        } else {
          anthropomorphic_promiscuity_min = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_anthropomorphic_promiscuity_max(((Number)_value_xjal).doubleValue());
        } else {
          anthropomorphic_promiscuity_max = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_anthropomorphic_promiscuity_mode(((Number)_value_xjal).doubleValue());
        } else {
          anthropomorphic_promiscuity_mode = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_predation_tolerance_min(((Number)_value_xjal).doubleValue());
        } else {
          predation_tolerance_min = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_predation_tolerance_max(((Number)_value_xjal).doubleValue());
        } else {
          predation_tolerance_max = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_predation_tolerance_mode(((Number)_value_xjal).doubleValue());
        } else {
          predation_tolerance_mode = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_natural_tolerance_min(((Number)_value_xjal).doubleValue());
        } else {
          natural_tolerance_min = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_natural_tolerance_max(((Number)_value_xjal).doubleValue());
        } else {
          natural_tolerance_max = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_natural_tolerance_mode(((Number)_value_xjal).doubleValue());
        } else {
          natural_tolerance_mode = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_contagion_tolerance_min(((Number)_value_xjal).doubleValue());
        } else {
          contagion_tolerance_min = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_contagion_tolerance_max(((Number)_value_xjal).doubleValue());
        } else {
          contagion_tolerance_max = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_contagion_tolerance_mode(((Number)_value_xjal).doubleValue());
        } else {
          contagion_tolerance_mode = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_social_tolerance_min(((Number)_value_xjal).doubleValue());
        } else {
          social_tolerance_min = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_social_tolerance_max(((Number)_value_xjal).doubleValue());
        } else {
          social_tolerance_max = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_social_tolerance_mode(((Number)_value_xjal).doubleValue());
        } else {
          social_tolerance_mode = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_contagion_probability_min(((Number)_value_xjal).doubleValue());
        } else {
          contagion_probability_min = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_contagion_probability_max(((Number)_value_xjal).doubleValue());
        } else {
          contagion_probability_max = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_contagion_probability_mode(((Number)_value_xjal).doubleValue());
        } else {
          contagion_probability_mode = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_predation_probability_min(((Number)_value_xjal).doubleValue());
        } else {
          predation_probability_min = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_predation_probability_max(((Number)_value_xjal).doubleValue());
        } else {
          predation_probability_max = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_predation_probability_mode(((Number)_value_xjal).doubleValue());
        } else {
          predation_probability_mode = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_social_probability_min(((Number)_value_xjal).doubleValue());
        } else {
          social_probability_min = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_social_probability_max(((Number)_value_xjal).doubleValue());
        } else {
          social_probability_max = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_social_probability_mode(((Number)_value_xjal).doubleValue());
        } else {
          social_probability_mode = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_chanceForNaturalHazardToOccur(((Number)_value_xjal).doubleValue());
        } else {
          chanceForNaturalHazardToOccur = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_group_distance_anthropomorphic_min(((Number)_value_xjal).doubleValue());
        } else {
          group_distance_anthropomorphic_min = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_group_distance_anthropomorphic_max(((Number)_value_xjal).doubleValue());
        } else {
          group_distance_anthropomorphic_max = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_prior_sociographic_promiscuity_min(((Number)_value_xjal).doubleValue());
        } else {
          prior_sociographic_promiscuity_min = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_prior_sociographic_promiscuity_max(((Number)_value_xjal).doubleValue());
        } else {
          prior_sociographic_promiscuity_max = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_prior_sociographic_promiscuity_mode(((Number)_value_xjal).doubleValue());
        } else {
          prior_sociographic_promiscuity_mode = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_group_distance_sociographic_min(((Number)_value_xjal).doubleValue());
        } else {
          group_distance_sociographic_min = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_group_distance_sociographic_max(((Number)_value_xjal).doubleValue());
        } else {
          group_distance_sociographic_max = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_group_distance_contagionHazard_min(((Number)_value_xjal).doubleValue());
        } else {
          group_distance_contagionHazard_min = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_group_distance_contagionHazard_max(((Number)_value_xjal).doubleValue());
        } else {
          group_distance_contagionHazard_max = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_group_distance_socialHazard_min(((Number)_value_xjal).doubleValue());
        } else {
          group_distance_socialHazard_min = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_group_distance_socialHazard_max(((Number)_value_xjal).doubleValue());
        } else {
          group_distance_socialHazard_max = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_beta_coeff(((Number)_value_xjal).doubleValue());
        } else {
          beta_coeff = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_prob_link_reassignment(((Number)_value_xjal).doubleValue());
        } else {
          prob_link_reassignment = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_pop(((Number)_value_xjal).intValue());
        } else {
          pop = ((Number)_value_xjal).intValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_seed(((Number)_value_xjal).longValue());
        } else {
          seed = ((Number)_value_xjal).longValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_length_of_memory(((Number)_value_xjal).intValue());
        } else {
          length_of_memory = ((Number)_value_xjal).intValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_num_beliefs(((Number)_value_xjal).doubleValue());
        } else {
          num_beliefs = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_cultural_dissonance(((Number)_value_xjal).doubleValue());
        } else {
          cultural_dissonance = ((Number)_value_xjal).doubleValue();
        }
        return true;
      } else {
        if (_callOnChange_xjal) {
          set_extinction_rate(((Number)_value_xjal).doubleValue());
        } else {
          extinction_rate = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_weight_second_order_connection(((Number)_value_xjal).doubleValue());
        } else {
          weight_second_order_connection = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_weight_third_order_connection(((Number)_value_xjal).doubleValue());
        } else {
          weight_third_order_connection = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_threshold(((Number)_value_xjal).doubleValue());
        } else {
          threshold = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_vision(((Number)_value_xjal).doubleValue());
        } else {
          vision = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_Violence_Counter_Update_Interval(((Number)_value_xjal).intValue());
        } else {
          Violence_Counter_Update_Interval = ((Number)_value_xjal).intValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_Affect_Counter_Update_Interval(((Number)_value_xjal).intValue());
        } else {
          Affect_Counter_Update_Interval = ((Number)_value_xjal).intValue();
        }
        return true; }
      break; }
    label3037: return super.setParameter(_name_xjal, _value_xjal, _callOnChange_xjal);
  }
  
  public <T> T getParameter(String _name_xjal)
  {
    String str;
    Object _result_xjal;
    switch ((str = _name_xjal).hashCode()) {case -1992658265:  if (str.equals("predation_tolerance_max")) {} break; case -1992658027:  if (str.equals("predation_tolerance_min")) {} break; case -1945583445:  if (str.equals("chanceForNaturalHazardToOccur")) {} break; case -1902384740:  if (str.equals("contagion_probability_mode")) {} break; case -1865513488:  if (str.equals("cultural_dissonance")) {} break; case -1823421633:  if (str.equals("prior_anthropomorphic_promiscuity_mode")) {} break; case -1642851136:  if (str.equals("predation_tolerance_mode")) {} break; case -1550294677:  if (str.equals("natural_tolerance_mode")) {} break; case -1545477013:  if (str.equals("threshold")) {} break; case -1417636845:  if (str.equals("group_ID_percentOfPopInMajority")) break; break; case -1318320644:  if (str.equals("sociographic_prudery_max")) {} break; case -1318320406:  if (str.equals("sociographic_prudery_min")) {} break; case -1274704320:  if (str.equals("group_distance_anthropomorphic_max")) {} break; case -1274704082:  if (str.equals("group_distance_anthropomorphic_min")) {} break; case -1158388580:  if (str.equals("natural_tolerance_max")) {} break; case -1158388342:  if (str.equals("natural_tolerance_min")) {} break; case -937076502:  if (str.equals("beta_coeff")) {} break; case -816227352:  if (str.equals("vision")) {} break; case -744590937:  if (str.equals("social_tolerance_mode")) {} break; case -685526595:  if (str.equals("anthropomorphic_promiscuity_max")) {} break; case -685526357:  if (str.equals("anthropomorphic_promiscuity_min")) {} break; case -657697601:  if (str.equals("prior_sociographic_promiscuity_mode")) {} break; case -506659441:  if (str.equals("predation_probability_max")) {} break; case -506659203:  if (str.equals("predation_probability_min")) {} break; case -334422546:  if (str.equals("weight_third_order_connection")) {} break; case -301114144:  if (str.equals("social_tolerance_max")) {} break; case -301113906:  if (str.equals("social_tolerance_min")) {} break; case 111185:  if (str.equals("pop")) {} break; case 3526257:  if (str.equals("seed")) {} break; case 101120132:  if (str.equals("contagion_tolerance_mode")) {} break; case 223524970:  if (str.equals("anthropomorphic_promiscuity_mode")) {} break; case 247526139:  if (str.equals("prob_link_reassignment")) {} break; case 260293651:  if (str.equals("weight_second_order_connection")) {} break; case 557450851:  if (str.equals("contagion_tolerance_max")) {} break; case 557451089:  if (str.equals("contagion_tolerance_min")) {} break; case 948614856:  if (str.equals("prior_sociographic_promiscuity_max")) {} break; case 948615094:  if (str.equals("prior_sociographic_promiscuity_min")) {} break; case 980018580:  if (str.equals("Violence_Counter_Update_Interval")) {} break; case 1076346681:  if (str.equals("num_beliefs")) {} break; case 1348340304:  if (str.equals("length_of_memory")) {} break; case 1413064191:  if (str.equals("social_probability_mode")) {} break; case 1473439448:  if (str.equals("predation_probability_mode")) {} break; case 1569602952:  if (str.equals("social_probability_max")) {} break; case 1569603190:  if (str.equals("social_probability_min")) {} break; case 1659184586:  if (str.equals("group_distance_sociographic_max")) {} break; case 1659184824:  if (str.equals("group_distance_sociographic_min")) {} break; case 1740950653:  if (str.equals("group_distance_contagionHazard_max")) {} break; case 1740950891:  if (str.equals("group_distance_contagionHazard_min")) {} break; case 2005065806:  if (str.equals("group_distance_socialHazard_max")) {} break; case 2005066044:  if (str.equals("group_distance_socialHazard_min")) {} break; case 2016842315:  if (str.equals("contagion_probability_max")) {} break; case 2016842553:  if (str.equals("contagion_probability_min")) {} break; case 2019389512:  if (str.equals("prior_anthropomorphic_promiscuity_max")) {} break; case 2019389750:  if (str.equals("prior_anthropomorphic_promiscuity_min")) {} break; case 2074087438:  if (str.equals("Affect_Counter_Update_Interval")) {} break; case 2081745931:  if (str.equals("sociographic_prudery_mode")) {} break; case 2093302190:  if (!str.equals("extinction_rate")) { break label1840;
        Object _result_xjal = Double.valueOf(group_ID_percentOfPopInMajority); return _result_xjal;
        Object _result_xjal = Double.valueOf(prior_anthropomorphic_promiscuity_min); return _result_xjal;
        Object _result_xjal = Double.valueOf(prior_anthropomorphic_promiscuity_max); return _result_xjal;
        Object _result_xjal = Double.valueOf(prior_anthropomorphic_promiscuity_mode); return _result_xjal;
        Object _result_xjal = Double.valueOf(sociographic_prudery_min); return _result_xjal;
        Object _result_xjal = Double.valueOf(sociographic_prudery_max); return _result_xjal;
        Object _result_xjal = Double.valueOf(sociographic_prudery_mode); return _result_xjal;
        Object _result_xjal = Double.valueOf(anthropomorphic_promiscuity_min); return _result_xjal;
        Object _result_xjal = Double.valueOf(anthropomorphic_promiscuity_max); return _result_xjal;
        Object _result_xjal = Double.valueOf(anthropomorphic_promiscuity_mode); return _result_xjal;
        Object _result_xjal = Double.valueOf(predation_tolerance_min); return _result_xjal;
        Object _result_xjal = Double.valueOf(predation_tolerance_max); return _result_xjal;
        Object _result_xjal = Double.valueOf(predation_tolerance_mode); return _result_xjal;
        Object _result_xjal = Double.valueOf(natural_tolerance_min); return _result_xjal;
        Object _result_xjal = Double.valueOf(natural_tolerance_max); return _result_xjal;
        Object _result_xjal = Double.valueOf(natural_tolerance_mode); return _result_xjal;
        Object _result_xjal = Double.valueOf(contagion_tolerance_min); return _result_xjal;
        Object _result_xjal = Double.valueOf(contagion_tolerance_max); return _result_xjal;
        Object _result_xjal = Double.valueOf(contagion_tolerance_mode); return _result_xjal;
        Object _result_xjal = Double.valueOf(social_tolerance_min); return _result_xjal;
        Object _result_xjal = Double.valueOf(social_tolerance_max); return _result_xjal;
        Object _result_xjal = Double.valueOf(social_tolerance_mode); return _result_xjal;
        Object _result_xjal = Double.valueOf(contagion_probability_min); return _result_xjal;
        Object _result_xjal = Double.valueOf(contagion_probability_max); return _result_xjal;
        Object _result_xjal = Double.valueOf(contagion_probability_mode); return _result_xjal;
        Object _result_xjal = Double.valueOf(predation_probability_min); return _result_xjal;
        Object _result_xjal = Double.valueOf(predation_probability_max); return _result_xjal;
        Object _result_xjal = Double.valueOf(predation_probability_mode); return _result_xjal;
        Object _result_xjal = Double.valueOf(social_probability_min); return _result_xjal;
        Object _result_xjal = Double.valueOf(social_probability_max); return _result_xjal;
        Object _result_xjal = Double.valueOf(social_probability_mode); return _result_xjal;
        Object _result_xjal = Double.valueOf(chanceForNaturalHazardToOccur); return _result_xjal;
        Object _result_xjal = Double.valueOf(group_distance_anthropomorphic_min); return _result_xjal;
        Object _result_xjal = Double.valueOf(group_distance_anthropomorphic_max); return _result_xjal;
        Object _result_xjal = Double.valueOf(prior_sociographic_promiscuity_min); return _result_xjal;
        Object _result_xjal = Double.valueOf(prior_sociographic_promiscuity_max); return _result_xjal;
        Object _result_xjal = Double.valueOf(prior_sociographic_promiscuity_mode); return _result_xjal;
        Object _result_xjal = Double.valueOf(group_distance_sociographic_min); return _result_xjal;
        Object _result_xjal = Double.valueOf(group_distance_sociographic_max); return _result_xjal;
        Object _result_xjal = Double.valueOf(group_distance_contagionHazard_min); return _result_xjal;
        Object _result_xjal = Double.valueOf(group_distance_contagionHazard_max); return _result_xjal;
        Object _result_xjal = Double.valueOf(group_distance_socialHazard_min); return _result_xjal;
        Object _result_xjal = Double.valueOf(group_distance_socialHazard_max); return _result_xjal;
        Object _result_xjal = Double.valueOf(beta_coeff); return _result_xjal;
        Object _result_xjal = Double.valueOf(prob_link_reassignment); return _result_xjal;
        Object _result_xjal = Integer.valueOf(pop); return _result_xjal;
        Object _result_xjal = Long.valueOf(seed); return _result_xjal;
        Object _result_xjal = Integer.valueOf(length_of_memory); return _result_xjal;
        Object _result_xjal = Double.valueOf(num_beliefs); return _result_xjal;
        Object _result_xjal = Double.valueOf(cultural_dissonance); return _result_xjal;
      } else { Object _result_xjal = Double.valueOf(extinction_rate); return _result_xjal;
        Object _result_xjal = Double.valueOf(weight_second_order_connection); return _result_xjal;
        Object _result_xjal = Double.valueOf(weight_third_order_connection); return _result_xjal;
        Object _result_xjal = Double.valueOf(threshold); return _result_xjal;
        Object _result_xjal = Double.valueOf(vision); return _result_xjal;
        Object _result_xjal = Integer.valueOf(Violence_Counter_Update_Interval); return _result_xjal;
        _result_xjal = Integer.valueOf(Affect_Counter_Update_Interval); }
      break; } label1840: Object _result_xjal = super.getParameter(_name_xjal);
    
    return _result_xjal;
  }
  



  public String[] getParameterNames()
  {
    String[] result = _parameterNames_xjal;
    if (result == null) {
      List<String> list = new java.util.ArrayList(java.util.Arrays.asList(super.getParameterNames()));
      list.add("group_ID_percentOfPopInMajority");
      list.add("prior_anthropomorphic_promiscuity_min");
      list.add("prior_anthropomorphic_promiscuity_max");
      list.add("prior_anthropomorphic_promiscuity_mode");
      list.add("sociographic_prudery_min");
      list.add("sociographic_prudery_max");
      list.add("sociographic_prudery_mode");
      list.add("anthropomorphic_promiscuity_min");
      list.add("anthropomorphic_promiscuity_max");
      list.add("anthropomorphic_promiscuity_mode");
      list.add("predation_tolerance_min");
      list.add("predation_tolerance_max");
      list.add("predation_tolerance_mode");
      list.add("natural_tolerance_min");
      list.add("natural_tolerance_max");
      list.add("natural_tolerance_mode");
      list.add("contagion_tolerance_min");
      list.add("contagion_tolerance_max");
      list.add("contagion_tolerance_mode");
      list.add("social_tolerance_min");
      list.add("social_tolerance_max");
      list.add("social_tolerance_mode");
      list.add("contagion_probability_min");
      list.add("contagion_probability_max");
      list.add("contagion_probability_mode");
      list.add("predation_probability_min");
      list.add("predation_probability_max");
      list.add("predation_probability_mode");
      list.add("social_probability_min");
      list.add("social_probability_max");
      list.add("social_probability_mode");
      list.add("chanceForNaturalHazardToOccur");
      list.add("group_distance_anthropomorphic_min");
      list.add("group_distance_anthropomorphic_max");
      list.add("prior_sociographic_promiscuity_min");
      list.add("prior_sociographic_promiscuity_max");
      list.add("prior_sociographic_promiscuity_mode");
      list.add("group_distance_sociographic_min");
      list.add("group_distance_sociographic_max");
      list.add("group_distance_contagionHazard_min");
      list.add("group_distance_contagionHazard_max");
      list.add("group_distance_socialHazard_min");
      list.add("group_distance_socialHazard_max");
      list.add("beta_coeff");
      list.add("prob_link_reassignment");
      list.add("pop");
      list.add("seed");
      list.add("length_of_memory");
      list.add("num_beliefs");
      list.add("cultural_dissonance");
      list.add("extinction_rate");
      list.add("weight_second_order_connection");
      list.add("weight_third_order_connection");
      list.add("threshold");
      list.add("vision");
      list.add("Violence_Counter_Update_Interval");
      list.add("Affect_Counter_Update_Interval");
      result = (String[])list.toArray(new String[list.size()]);
      _parameterNames_xjal = result;
    }
    return result;
  }
  




































































  public java.util.ArrayList<Person> collection_Group_ID_1 = new java.util.ArrayList();
  

  public java.util.ArrayList<Person> collection_Group_ID_2 = new java.util.ArrayList();
  @AnyLogicInternalCodegenAPI
  private static java.util.Map<String, com.anylogic.engine.elements.IElementDescriptor> elementDesciptors_xjal = createElementDescriptors(Main.class);
  


  @AnyLogicInternalCodegenAPI
  public java.util.Map<String, com.anylogic.engine.elements.IElementDescriptor> getElementDesciptors() { return elementDesciptors_xjal; }
  
  @com.anylogic.engine.AnyLogicCustomProposalPriority(type=com.anylogic.engine.AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final com.anylogic.engine.Scale scale = new com.anylogic.engine.Scale(10.0D);
  
  public com.anylogic.engine.Scale getScale()
  {
    return scale;
  }
  



  public com.anylogic.engine.EventTimeout HazardIncrease_Natural = new com.anylogic.engine.EventTimeout(this);
  public com.anylogic.engine.EventTimeout get_HistogramData_Anthropomorphic = new com.anylogic.engine.EventTimeout(this);
  public com.anylogic.engine.EventTimeout get_HistogramData_SociographicPrudery = new com.anylogic.engine.EventTimeout(this);
  public com.anylogic.engine.EventTimeout event_Update_Group_SP_AP = new com.anylogic.engine.EventTimeout(this);
  public com.anylogic.engine.EventTimeout collect_Group_IDs = new com.anylogic.engine.EventTimeout(this);
  @AnyLogicInternalCodegenAPI
  public com.anylogic.engine.EventTimeout _Anthropomorphic_HistogramData_autoUpdateEvent_xjal = new com.anylogic.engine.EventTimeout(this);
  @AnyLogicInternalCodegenAPI
  public com.anylogic.engine.EventTimeout _SociographicPrudery_Hdata_autoUpdateEvent_xjal = new com.anylogic.engine.EventTimeout(this);
  @AnyLogicInternalCodegenAPI
  public com.anylogic.engine.EventTimeout _AnthropomorphicPromiscuity_Hdata_autoUpdateEvent_xjal = new com.anylogic.engine.EventTimeout(this);
  @AnyLogicInternalCodegenAPI
  public com.anylogic.engine.EventTimeout _DS_Avg_Violence_Over_Population_autoUpdateEvent_xjal = new com.anylogic.engine.EventTimeout(this);
  @AnyLogicInternalCodegenAPI
  public com.anylogic.engine.EventTimeout _DS_Avg_Religiosity_Over_Population_autoUpdateEvent_xjal = new com.anylogic.engine.EventTimeout(this);
  @AnyLogicInternalCodegenAPI
  public com.anylogic.engine.EventTimeout _DS_Avg_Religiosity_Over_Group_1_autoUpdateEvent_xjal = new com.anylogic.engine.EventTimeout(this);
  @AnyLogicInternalCodegenAPI
  public com.anylogic.engine.EventTimeout _DS_Avg_Religiosity_Over_Group_2_autoUpdateEvent_xjal = new com.anylogic.engine.EventTimeout(this);
  @AnyLogicInternalCodegenAPI
  public com.anylogic.engine.EventTimeout _DS_Avg_Affect_Length_Over_Population_autoUpdateEvent_xjal = new com.anylogic.engine.EventTimeout(this);
  @AnyLogicInternalCodegenAPI
  public com.anylogic.engine.EventTimeout _DS_Avg_Current_Affect_Population_autoUpdateEvent_xjal = new com.anylogic.engine.EventTimeout(this);
  @AnyLogicInternalCodegenAPI
  public com.anylogic.engine.EventTimeout _DS_Avg_Current_Affect_Increase_Population_autoUpdateEvent_xjal = new com.anylogic.engine.EventTimeout(this);
  @AnyLogicInternalCodegenAPI
  public com.anylogic.engine.EventTimeout _chart_autoUpdateEvent_xjal = new com.anylogic.engine.EventTimeout(this);
  @AnyLogicInternalCodegenAPI
  public com.anylogic.engine.EventTimeout _chart1_autoUpdateEvent_xjal = new com.anylogic.engine.EventTimeout(this);
  @AnyLogicInternalCodegenAPI
  public com.anylogic.engine.EventTimeout _plot_autoUpdateEvent_xjal = new com.anylogic.engine.EventTimeout(this);
  @AnyLogicInternalCodegenAPI
  public com.anylogic.engine.EventTimeout _plot1_autoUpdateEvent_xjal = new com.anylogic.engine.EventTimeout(this);
  @AnyLogicInternalCodegenAPI
  public com.anylogic.engine.EventTimeout _chart2_autoUpdateEvent_xjal = new com.anylogic.engine.EventTimeout(this);
  
  @AnyLogicInternalCodegenAPI
  public String getNameOf(com.anylogic.engine.EventTimeout _e)
  {
    if (_e == HazardIncrease_Natural) return "HazardIncrease_Natural";
    if (_e == get_HistogramData_Anthropomorphic) return "get_HistogramData_Anthropomorphic";
    if (_e == get_HistogramData_SociographicPrudery) return "get_HistogramData_SociographicPrudery";
    if (_e == event_Update_Group_SP_AP) return "event_Update_Group_SP_AP";
    if (_e == collect_Group_IDs) return "collect_Group_IDs";
    if (_e == _Anthropomorphic_HistogramData_autoUpdateEvent_xjal) return "Anthropomorphic_HistogramData auto update event";
    if (_e == _SociographicPrudery_Hdata_autoUpdateEvent_xjal) return "SociographicPrudery_Hdata auto update event";
    if (_e == _AnthropomorphicPromiscuity_Hdata_autoUpdateEvent_xjal) return "AnthropomorphicPromiscuity_Hdata auto update event";
    if (_e == _DS_Avg_Violence_Over_Population_autoUpdateEvent_xjal) return "DS_Avg_Violence_Over_Population auto update event";
    if (_e == _DS_Avg_Religiosity_Over_Population_autoUpdateEvent_xjal) return "DS_Avg_Religiosity_Over_Population auto update event";
    if (_e == _DS_Avg_Religiosity_Over_Group_1_autoUpdateEvent_xjal) return "DS_Avg_Religiosity_Over_Group_1 auto update event";
    if (_e == _DS_Avg_Religiosity_Over_Group_2_autoUpdateEvent_xjal) return "DS_Avg_Religiosity_Over_Group_2 auto update event";
    if (_e == _DS_Avg_Affect_Length_Over_Population_autoUpdateEvent_xjal) return "DS_Avg_Affect_Length_Over_Population auto update event";
    if (_e == _DS_Avg_Current_Affect_Population_autoUpdateEvent_xjal) return "DS_Avg_Current_Affect_Population auto update event";
    if (_e == _DS_Avg_Current_Affect_Increase_Population_autoUpdateEvent_xjal) return "DS_Avg_Current_Affect_Increase_Population auto update event";
    if (_e == _chart_autoUpdateEvent_xjal) return "chart auto update event";
    if (_e == _chart1_autoUpdateEvent_xjal) return "chart1 auto update event";
    if (_e == _plot_autoUpdateEvent_xjal) return "plot auto update event";
    if (_e == _plot1_autoUpdateEvent_xjal) return "plot1 auto update event";
    if (_e == _chart2_autoUpdateEvent_xjal) return "chart2 auto update event";
    return super.getNameOf(_e);
  }
  
  @AnyLogicInternalCodegenAPI
  public com.anylogic.engine.EventTimeout.Mode getModeOf(com.anylogic.engine.EventTimeout _e)
  {
    if (_e == HazardIncrease_Natural) return EVENT_TIMEOUT_MODE_CYCLIC;
    if (_e == get_HistogramData_Anthropomorphic) return EVENT_TIMEOUT_MODE_CYCLIC;
    if (_e == get_HistogramData_SociographicPrudery) return EVENT_TIMEOUT_MODE_CYCLIC;
    if (_e == event_Update_Group_SP_AP) return EVENT_TIMEOUT_MODE_CYCLIC;
    if (_e == collect_Group_IDs) return EVENT_TIMEOUT_MODE_ONCE;
    if (_e == _Anthropomorphic_HistogramData_autoUpdateEvent_xjal) return EVENT_TIMEOUT_MODE_CYCLIC;
    if (_e == _SociographicPrudery_Hdata_autoUpdateEvent_xjal) return EVENT_TIMEOUT_MODE_CYCLIC;
    if (_e == _AnthropomorphicPromiscuity_Hdata_autoUpdateEvent_xjal) return EVENT_TIMEOUT_MODE_CYCLIC;
    if (_e == _DS_Avg_Violence_Over_Population_autoUpdateEvent_xjal) return EVENT_TIMEOUT_MODE_CYCLIC;
    if (_e == _DS_Avg_Religiosity_Over_Population_autoUpdateEvent_xjal) return EVENT_TIMEOUT_MODE_CYCLIC;
    if (_e == _DS_Avg_Religiosity_Over_Group_1_autoUpdateEvent_xjal) return EVENT_TIMEOUT_MODE_CYCLIC;
    if (_e == _DS_Avg_Religiosity_Over_Group_2_autoUpdateEvent_xjal) return EVENT_TIMEOUT_MODE_CYCLIC;
    if (_e == _DS_Avg_Affect_Length_Over_Population_autoUpdateEvent_xjal) return EVENT_TIMEOUT_MODE_CYCLIC;
    if (_e == _DS_Avg_Current_Affect_Population_autoUpdateEvent_xjal) return EVENT_TIMEOUT_MODE_CYCLIC;
    if (_e == _DS_Avg_Current_Affect_Increase_Population_autoUpdateEvent_xjal) return EVENT_TIMEOUT_MODE_CYCLIC;
    if (_e == _chart_autoUpdateEvent_xjal) return EVENT_TIMEOUT_MODE_CYCLIC;
    if (_e == _chart1_autoUpdateEvent_xjal) return EVENT_TIMEOUT_MODE_CYCLIC;
    if (_e == _plot_autoUpdateEvent_xjal) return EVENT_TIMEOUT_MODE_CYCLIC;
    if (_e == _plot1_autoUpdateEvent_xjal) return EVENT_TIMEOUT_MODE_CYCLIC;
    if (_e == _chart2_autoUpdateEvent_xjal) return EVENT_TIMEOUT_MODE_CYCLIC;
    return super.getModeOf(_e);
  }
  

  @AnyLogicInternalCodegenAPI
  public double getFirstOccurrenceTime(com.anylogic.engine.EventTimeout _e)
  {
    if (_e == HazardIncrease_Natural) {
      double _t = 
        0.0D;
      
      _t = toModelTime(_t, HOUR);
      return _t;
    }
    if (_e == get_HistogramData_Anthropomorphic) {
      double _t = 
        1.0D;
      
      _t = toModelTime(_t, HOUR);
      return _t;
    }
    if (_e == get_HistogramData_SociographicPrudery) {
      double _t = 
        1.0D;
      
      _t = toModelTime(_t, HOUR);
      return _t;
    }
    if (_e == event_Update_Group_SP_AP) {
      double _t = 
        0.0D;
      
      _t = toModelTime(_t, HOUR);
      return _t;
    }
    if (_e == collect_Group_IDs) {
      double _t = 
        0.1D;
      
      _t = toModelTime(_t, HOUR);
      return _t;
    }
    if (_e == _Anthropomorphic_HistogramData_autoUpdateEvent_xjal) {
      double _t = 
        0.0D;
      
      _t = toModelTime(_t, HOUR);
      return _t;
    }
    if (_e == _SociographicPrudery_Hdata_autoUpdateEvent_xjal) {
      double _t = 
        0.0D;
      
      _t = toModelTime(_t, HOUR);
      return _t;
    }
    if (_e == _AnthropomorphicPromiscuity_Hdata_autoUpdateEvent_xjal) {
      double _t = 
        0.0D;
      
      _t = toModelTime(_t, HOUR);
      return _t;
    }
    if (_e == _DS_Avg_Violence_Over_Population_autoUpdateEvent_xjal) {
      double _t = 
        Violence_Counter_Update_Interval;
      
      _t = toModelTime(_t, HOUR);
      return _t;
    }
    if (_e == _DS_Avg_Religiosity_Over_Population_autoUpdateEvent_xjal) {
      double _t = 
        1.0D;
      
      _t = toModelTime(_t, HOUR);
      return _t;
    }
    if (_e == _DS_Avg_Religiosity_Over_Group_1_autoUpdateEvent_xjal) {
      double _t = 
        1.0D;
      
      _t = toModelTime(_t, HOUR);
      return _t;
    }
    if (_e == _DS_Avg_Religiosity_Over_Group_2_autoUpdateEvent_xjal) {
      double _t = 
        1.0D;
      
      _t = toModelTime(_t, HOUR);
      return _t;
    }
    if (_e == _DS_Avg_Affect_Length_Over_Population_autoUpdateEvent_xjal) {
      double _t = 
        Affect_Counter_Update_Interval;
      
      _t = toModelTime(_t, HOUR);
      return _t;
    }
    if (_e == _DS_Avg_Current_Affect_Population_autoUpdateEvent_xjal) {
      double _t = 
        Affect_Counter_Update_Interval;
      
      _t = toModelTime(_t, HOUR);
      return _t;
    }
    if (_e == _DS_Avg_Current_Affect_Increase_Population_autoUpdateEvent_xjal) {
      double _t = 
        Affect_Counter_Update_Interval;
      
      _t = toModelTime(_t, HOUR);
      return _t;
    }
    if (_e == _chart_autoUpdateEvent_xjal) {
      double _t = 
        0.0D;
      
      _t = toModelTime(_t, HOUR);
      return _t;
    }
    if (_e == _chart1_autoUpdateEvent_xjal) {
      double _t = 
        0.0D;
      
      _t = toModelTime(_t, HOUR);
      return _t;
    }
    if (_e == _plot_autoUpdateEvent_xjal) {
      double _t = 
        0.0D;
      
      _t = toModelTime(_t, HOUR);
      return _t;
    }
    if (_e == _plot1_autoUpdateEvent_xjal) {
      double _t = 
        0.0D;
      
      _t = toModelTime(_t, HOUR);
      return _t;
    }
    if (_e == _chart2_autoUpdateEvent_xjal) {
      double _t = 
        0.0D;
      
      _t = toModelTime(_t, HOUR);
      return _t;
    }
    return super.getFirstOccurrenceTime(_e);
  }
  

  @AnyLogicInternalCodegenAPI
  public double evaluateTimeoutOf(com.anylogic.engine.EventTimeout _e)
  {
    if (_e == HazardIncrease_Natural) {
      double _t = 
        1.0D;
      
      _t = toModelTime(_t, HOUR);
      return _t;
    }
    if (_e == get_HistogramData_Anthropomorphic) {
      double _t = 
        1.0D;
      
      _t = toModelTime(_t, HOUR);
      return _t;
    }
    if (_e == get_HistogramData_SociographicPrudery) {
      double _t = 
        1.0D;
      
      _t = toModelTime(_t, HOUR);
      return _t;
    }
    if (_e == event_Update_Group_SP_AP) {
      double _t = 
        1.0D;
      
      _t = toModelTime(_t, HOUR);
      return _t;
    }
    if (_e == _Anthropomorphic_HistogramData_autoUpdateEvent_xjal) {
      double _t = 
        1.0D;
      
      _t = toModelTime(_t, HOUR);
      return _t;
    }
    if (_e == _SociographicPrudery_Hdata_autoUpdateEvent_xjal) {
      double _t = 
        1.0D;
      
      _t = toModelTime(_t, HOUR);
      return _t;
    }
    if (_e == _AnthropomorphicPromiscuity_Hdata_autoUpdateEvent_xjal) {
      double _t = 
        1.0D;
      
      _t = toModelTime(_t, HOUR);
      return _t;
    }
    if (_e == _DS_Avg_Violence_Over_Population_autoUpdateEvent_xjal) {
      double _t = 
        Violence_Counter_Update_Interval;
      
      _t = toModelTime(_t, HOUR);
      return _t;
    }
    if (_e == _DS_Avg_Religiosity_Over_Population_autoUpdateEvent_xjal) {
      double _t = 
        1.0D;
      
      _t = toModelTime(_t, HOUR);
      return _t;
    }
    if (_e == _DS_Avg_Religiosity_Over_Group_1_autoUpdateEvent_xjal) {
      double _t = 
        1.0D;
      
      _t = toModelTime(_t, HOUR);
      return _t;
    }
    if (_e == _DS_Avg_Religiosity_Over_Group_2_autoUpdateEvent_xjal) {
      double _t = 
        1.0D;
      
      _t = toModelTime(_t, HOUR);
      return _t;
    }
    if (_e == _DS_Avg_Affect_Length_Over_Population_autoUpdateEvent_xjal) {
      double _t = 
        Affect_Counter_Update_Interval;
      
      _t = toModelTime(_t, HOUR);
      return _t;
    }
    if (_e == _DS_Avg_Current_Affect_Population_autoUpdateEvent_xjal) {
      double _t = 
        Affect_Counter_Update_Interval;
      
      _t = toModelTime(_t, HOUR);
      return _t;
    }
    if (_e == _DS_Avg_Current_Affect_Increase_Population_autoUpdateEvent_xjal) {
      double _t = 
        Affect_Counter_Update_Interval;
      
      _t = toModelTime(_t, HOUR);
      return _t;
    }
    if (_e == _chart_autoUpdateEvent_xjal) {
      double _t = 
        1.0D;
      
      _t = toModelTime(_t, HOUR);
      return _t;
    }
    if (_e == _chart1_autoUpdateEvent_xjal) {
      double _t = 
        1.0D;
      
      _t = toModelTime(_t, HOUR);
      return _t;
    }
    if (_e == _plot_autoUpdateEvent_xjal) {
      double _t = 
        1.0D;
      
      _t = toModelTime(_t, HOUR);
      return _t;
    }
    if (_e == _plot1_autoUpdateEvent_xjal) {
      double _t = 
        1.0D;
      
      _t = toModelTime(_t, HOUR);
      return _t;
    }
    if (_e == _chart2_autoUpdateEvent_xjal) {
      double _t = 
        1.0D;
      
      _t = toModelTime(_t, HOUR);
      return _t;
    }
    return super.evaluateTimeoutOf(_e);
  }
  
  @AnyLogicInternalCodegenAPI
  public void executeActionOf(com.anylogic.engine.EventTimeout _e)
  {
    if (_e == HazardIncrease_Natural) {
      com.anylogic.engine.EventTimeout self = _e;
      
      double generateNaturalHazard = uniform(0.0D, 100.0D);
      
      if (chanceForNaturalHazardToOccur >= generateNaturalHazard) {
        Natural_Hazard_Present = true;
      }
      else {
        Natural_Hazard_Present = false;
      }
      
      return;
    }
    if (_e == get_HistogramData_Anthropomorphic) {
      com.anylogic.engine.EventTimeout self = _e;
      
      Anthropomorphic_HistogramData.reset();
      
      get_Anthropomorphic_HistogramData();
      
      return;
    }
    if (_e == get_HistogramData_SociographicPrudery) {
      com.anylogic.engine.EventTimeout self = _e;
      
      SociographicPrudery_Hdata.reset();
      AnthropomorphicPromiscuity_Hdata.reset();
      
      get_SociographicPrudery_HistogramData();
      get_anthropomorphic_promiscuity_HistogramData();
      
      return;
    }
    if (_e == event_Update_Group_SP_AP) {
      com.anylogic.engine.EventTimeout self = _e;
      
      double total_SP_G1 = 0.0D;
      double total_SP_G2 = 0.0D;
      double total_AP_G1 = 0.0D;
      double total_AP_G2 = 0.0D;
      
      for (int i = 0; i < collection_Group_ID_1.size(); i++) {
        total_SP_G1 += collection_Group_ID_1.get(i)).sociographic_prudery;
      }
      
      for (int i = 0; i < collection_Group_ID_2.size(); i++) {
        total_SP_G2 += collection_Group_ID_2.get(i)).sociographic_prudery;
      }
      
      DS_SP_Group_1.add(time(), total_SP_G1);
      DS_SP_Group_2.add(time(), total_SP_G2);
      
      for (int i = 0; i < collection_Group_ID_1.size(); i++) {
        total_AP_G1 += collection_Group_ID_1.get(i)).anthropomorphic_promiscuity;
      }
      
      for (int i = 0; i < collection_Group_ID_2.size(); i++) {
        total_AP_G2 += collection_Group_ID_2.get(i)).anthropomorphic_promiscuity;
      }
      
      DS_AP_Group_1.add(time(), total_AP_G1);
      DS_AP_Group_2.add(time(), total_AP_G2);
      

      return;
    }
    if (_e == collect_Group_IDs) {
      com.anylogic.engine.EventTimeout self = _e;
      
      for (int i = 0; i < person.size(); i++) {
        if (person.get(i)).group_ID == 1) {
          collection_Group_ID_1.add((Person)person.get(i));
        }
        else {
          collection_Group_ID_2.add((Person)person.get(i));
        }
      }
      
      return;
    }
    if (_e == _Anthropomorphic_HistogramData_autoUpdateEvent_xjal) {
      Anthropomorphic_HistogramData.update();
      return;
    }
    if (_e == _SociographicPrudery_Hdata_autoUpdateEvent_xjal) {
      SociographicPrudery_Hdata.update();
      return;
    }
    if (_e == _AnthropomorphicPromiscuity_Hdata_autoUpdateEvent_xjal) {
      AnthropomorphicPromiscuity_Hdata.update();
      return;
    }
    if (_e == _DS_Avg_Violence_Over_Population_autoUpdateEvent_xjal) {
      DS_Avg_Violence_Over_Population.update();
      return;
    }
    if (_e == _DS_Avg_Religiosity_Over_Population_autoUpdateEvent_xjal) {
      DS_Avg_Religiosity_Over_Population.update();
      return;
    }
    if (_e == _DS_Avg_Religiosity_Over_Group_1_autoUpdateEvent_xjal) {
      DS_Avg_Religiosity_Over_Group_1.update();
      return;
    }
    if (_e == _DS_Avg_Religiosity_Over_Group_2_autoUpdateEvent_xjal) {
      DS_Avg_Religiosity_Over_Group_2.update();
      return;
    }
    if (_e == _DS_Avg_Affect_Length_Over_Population_autoUpdateEvent_xjal) {
      DS_Avg_Affect_Length_Over_Population.update();
      return;
    }
    if (_e == _DS_Avg_Current_Affect_Population_autoUpdateEvent_xjal) {
      DS_Avg_Current_Affect_Population.update();
      return;
    }
    if (_e == _DS_Avg_Current_Affect_Increase_Population_autoUpdateEvent_xjal) {
      DS_Avg_Current_Affect_Increase_Population.update();
      return;
    }
    if (_e == _chart_autoUpdateEvent_xjal) {
      chart.updateData();
      return;
    }
    if (_e == _chart1_autoUpdateEvent_xjal) {
      chart1.updateData();
      return;
    }
    if (_e == _plot_autoUpdateEvent_xjal) {
      plot.updateData();
      return;
    }
    if (_e == _plot1_autoUpdateEvent_xjal) {
      plot1.updateData();
      return;
    }
    if (_e == _chart2_autoUpdateEvent_xjal) {
      chart2.updateData();
      return;
    }
    super.executeActionOf(_e);
  }
  





  @AnyLogicInternalCodegenAPI
  private static final com.anylogic.engine.presentation.AgentAnimationSettings _environment_animationSettings_xjal = new com.anylogic.engine.presentation.AgentAnimationSettings(1000L, 1000000000L);
  @AnyLogicInternalCodegenAPI
  private static final com.anylogic.engine.presentation.AgentAnimationSettings _person_animationSettings_xjal = new com.anylogic.engine.presentation.AgentAnimationSettings(1000L, 1000000000L);
  
  public String getNameOf(com.anylogic.engine.Agent ao) {
    return super.getNameOf(ao);
  }
  
  public com.anylogic.engine.presentation.AgentAnimationSettings getAnimationSettingsOf(com.anylogic.engine.Agent ao) {
    return super.getAnimationSettingsOf(ao);
  }
  
































  @com.anylogic.engine.AnyLogicCustomProposalType(value=com.anylogic.engine.AnyLogicCustomProposalType.Label.POPULATION, customText="environment")
  public Main._environment_Population environment = new Main._environment_Population(this, this);
  































  @com.anylogic.engine.AnyLogicCustomProposalType(value=com.anylogic.engine.AnyLogicCustomProposalType.Label.POPULATION, customText="Person")
  public Main._person_Population person = new Main._person_Population(this, this);
  
  public String getNameOf(com.anylogic.engine.AgentList<?> aolist) {
    if (aolist == environment) return "environment";
    if (aolist == person) return "person";
    return super.getNameOf(aolist);
  }
  
  public com.anylogic.engine.presentation.AgentAnimationSettings getAnimationSettingsOf(com.anylogic.engine.AgentList<?> aolist) {
    if (aolist == person) return _person_animationSettings_xjal;
    return super.getAnimationSettingsOf(aolist);
  }
  





  public environment environment(int index)
  {
    return (environment)environment.get(index);
  }
  



  public environment add_environment()
  {
    int index = environment.size();
    environment _result_xjal = instantiate_environment_xjal(index);
    environment.callSetupParameters(_result_xjal, index);
    environment.callCreate(_result_xjal, index);
    _result_xjal.start();
    return _result_xjal;
  }
  





  public boolean remove_environment(environment object)
  {
    if (!environment._remove(object)) {
      return false;
    }
    object.removeFromFlowchart();
    object.setDestroyed();
    return true;
  }
  




  public Person person(int index)
  {
    return (Person)person.get(index);
  }
  



  public Person add_person()
  {
    int index = person.size();
    Person _result_xjal = instantiate_person_xjal(index);
    person.callSetupParameters(_result_xjal, index);
    person.callCreate(_result_xjal, index);
    _result_xjal.start();
    return _result_xjal;
  }
  





  public boolean remove_person(Person object)
  {
    if (!person._remove(object)) {
      return false;
    }
    object.removeFromFlowchart();
    object.setDestroyed();
    return true;
  }
  



  protected environment instantiate_environment_xjal(int index)
  {
    environment _result_xjal = new environment(getEngine(), this, environment);
    
    environment._add(_result_xjal);
    
    return _result_xjal;
  }
  



  private void setupParameters_environment_xjal(environment self, int index)
  {
    setupParameters_environment_xjal(self, index, null);
  }
  



  @AnyLogicInternalCodegenAPI
  private void create_environment_xjal(environment self, int index)
  {
    create_environment_xjal(self, index, null);
  }
  











  @AnyLogicInternalCodegenAPI
  private void create_environment_xjal(environment self, int index, com.anylogic.engine.database.TableInput _t)
  {
    self.setEnvironment(this);
    self.create();
  }
  




  protected Person instantiate_person_xjal(int index)
  {
    Person _result_xjal = new Person(getEngine(), this, person);
    
    person._add(_result_xjal);
    
    return _result_xjal;
  }
  



  private void setupParameters_person_xjal(Person self, int index)
  {
    setupParameters_person_xjal(self, index, null);
  }
  



  @AnyLogicInternalCodegenAPI
  private void create_person_xjal(Person self, int index)
  {
    create_person_xjal(self, index, null);
  }
  











  @AnyLogicInternalCodegenAPI
  private void create_person_xjal(Person self, int index, com.anylogic.engine.database.TableInput _t)
  {
    self.setEnvironment(this);
    self.setXYZ(0.0D, 0.0D, 0.0D);
    self.create();
  }
  




  void get_SociographicPrudery_HistogramData()
  {
    for (int i = 0; i < person.size(); i++) {
      SociographicPrudery_Hdata.add(person.get(i)).prior_sociographic_prudery, person.get(i)).sociographic_prudery);
    }
  }
  

  void get_Anthropomorphic_HistogramData()
  {
    for (int i = 0; i < person.size(); i++) {
      Anthropomorphic_HistogramData.add(person.get(i)).anthropomorphic_promiscuity);
    }
  }
  
  void get_anthropomorphic_promiscuity_HistogramData()
  {
    for (int i = 0; i < person.size(); i++) {
      AnthropomorphicPromiscuity_Hdata.add(person.get(i)).prior_anthropomorphic_promiscuity, person.get(i)).anthropomorphic_promiscuity);
    }
  }
  
  void Update_CSV_Population_Level()
  {
    try
    {
      java.io.FileWriter pw = new java.io.FileWriter(csv_PopulationLevel, true);
      

      StringBuilder sb = new StringBuilder();
      
      sb.append(group_ID_percentOfPopInMajority);sb.append(',');
      sb.append(prior_anthropomorphic_promiscuity_min);sb.append(',');
      sb.append(prior_anthropomorphic_promiscuity_max);sb.append(',');
      sb.append(prior_anthropomorphic_promiscuity_mode);sb.append(',');
      sb.append(prior_sociographic_promiscuity_min);sb.append(',');
      sb.append(prior_sociographic_promiscuity_max);sb.append(',');
      sb.append(prior_sociographic_promiscuity_mode);sb.append(',');
      sb.append(predation_tolerance_min);sb.append(',');
      sb.append(predation_tolerance_max);sb.append(',');
      sb.append(predation_tolerance_mode);sb.append(',');
      sb.append(natural_tolerance_min);sb.append(',');
      sb.append(natural_tolerance_max);sb.append(',');
      sb.append(natural_tolerance_mode);sb.append(',');
      sb.append(contagion_tolerance_min);sb.append(',');
      sb.append(contagion_tolerance_max);sb.append(',');
      sb.append(contagion_tolerance_mode);sb.append(',');
      sb.append(social_tolerance_min);sb.append(',');
      sb.append(social_tolerance_max);sb.append(',');
      sb.append(social_tolerance_mode);sb.append(',');
      sb.append(contagion_probability_min);sb.append(',');
      sb.append(contagion_probability_max);sb.append(',');
      sb.append(contagion_probability_mode);sb.append(',');
      sb.append(predation_probability_min);sb.append(',');
      sb.append(predation_probability_max);sb.append(',');
      sb.append(predation_probability_mode);sb.append(',');
      sb.append(social_probability_min);sb.append(',');
      sb.append(social_probability_max);sb.append(',');
      sb.append(social_probability_mode);sb.append(',');
      sb.append(chanceForNaturalHazardToOccur);sb.append(',');
      sb.append(group_distance_anthropomorphic_min);sb.append(',');
      sb.append(group_distance_anthropomorphic_max);sb.append(',');
      sb.append(group_distance_sociographic_min);sb.append(',');
      sb.append(group_distance_sociographic_max);sb.append(',');
      sb.append(group_distance_contagionHazard_min);sb.append(',');
      sb.append(group_distance_contagionHazard_max);sb.append(',');
      sb.append(group_distance_socialHazard_min);sb.append(',');
      sb.append(group_distance_socialHazard_max);sb.append(',');
      

      get_Total_Group_1_Anthropomorphic_Promiscuity();
      sb.append(Total_Group_1_Anthropomorphic_Promiscuity);sb.append(',');
      get_Total_Group_2_Anthropomorphic_Promiscuity();
      sb.append(Total_Group_2_Anthropomorphic_Promiscuity);sb.append(',');
      get_Total_Group_1_Sociographic_Prudery();
      sb.append(Total_Group_1_Sociographic_Prudery);sb.append(',');
      get_Total_Group_2_Sociographic_Prudery();
      sb.append(Total_Group_2_Sociographic_Prudery);sb.append(',');
      sb.append(Max_Group_Size_in_Ritual);sb.append(',');
      sb.append(Total_Number_of_Groups);sb.append(',');
      
      sb.append(get_Average_Religiosity_Over_Population_for_Run());sb.append(',');
      sb.append(get_StDev_Religiosity_Over_Population_for_Run());sb.append(',');
      sb.append(get_Average_Violence_Over_Population_for_Run());sb.append(',');
      sb.append(get_StDev_Violence_Over_Population_for_Run());sb.append(',');
      
      sb.append(get_Average_Religiosity_Over_Group_1_for_Run());sb.append(',');
      sb.append(get_StDev_Religiosity_Over_Group_1_for_Run());sb.append(',');
      sb.append(get_Average_Violence_Over_Group_1_for_Run());sb.append(',');
      sb.append(get_StDev_Violence_Over_Group_1_for_Run());sb.append(',');
      
      sb.append(get_Average_Religiosity_Over_Group_2_for_Run());sb.append(',');
      sb.append(get_StDev_Religiosity_Over_Group_2_for_Run());sb.append(',');
      sb.append(get_Average_Violence_Over_Group_2_for_Run());sb.append(',');
      sb.append(get_StDev_Violence_Over_Group_2_for_Run());sb.append(',');
      
      sb.append(get_Number_of_Consecutive_Affect_Increases_Maximum());sb.append(',');
      sb.append(get_Number_of_Consecutive_Affect_Increases_Second_Highest());sb.append(',');
      
      sb.append(Affect_Counter_Update_Interval);sb.append(',');
      
      sb.append('\n');
      
      pw.append(sb);
      pw.flush();
      pw.close();
    }
    catch (java.io.IOException e) {
      e.printStackTrace();
    }
  }
  
  void Update_CSV_Individual_Level()
  {
    try
    {
      java.io.FileWriter pw = new java.io.FileWriter(csv_IndividualLevel, true);
      
      for (int i = 0; i < person.size(); i++)
      {
        StringBuilder sb = new StringBuilder();
        sb.append(person.get(i)).group_ID);sb.append(',');
        sb.append(person.get(i)).group_distance_anthropomorphic);sb.append(',');
        sb.append(person.get(i)).group_distance_sociographic);sb.append(',');
        sb.append(person.get(i)).socialH_distance);sb.append(',');
        sb.append(person.get(i)).contagionH_distance);sb.append(',');
        sb.append(person.get(i)).contagion_tolerance);sb.append(',');
        sb.append(person.get(i)).natural_tolerance);sb.append(',');
        sb.append(person.get(i)).predation_tolerance);sb.append(',');
        sb.append(person.get(i)).social_tolerance);sb.append(',');
        sb.append(person.get(i)).contagion_probability);sb.append(',');
        sb.append(person.get(i)).social_probability);sb.append(',');
        

        sb.append(person.get(i)).Number_of_Rituals);sb.append(',');
        sb.append(person.get(i)).Largest_Group_Size_for_Ritual);sb.append(',');
        sb.append(person.get(i)).prior_anthropomorphic_promiscuity);sb.append(',');
        sb.append(person.get(i)).anthropomorphic_promiscuity);sb.append(',');
        sb.append(person.get(i)).prior_sociographic_prudery);sb.append(',');
        sb.append(person.get(i)).sociographic_prudery);sb.append(',');
        

        sb.append('\n');
        
        pw.append(sb);
        pw.flush();
      }
      
      pw.close();
    }
    catch (java.io.IOException e) {
      e.printStackTrace();
    }
  }
  

  void get_Total_Group_1_Anthropomorphic_Promiscuity()
  {
    Total_Group_1_Anthropomorphic_Promiscuity = 0.0D;
    
    for (int i = 0; i < collection_Group_ID_1.size(); i++) {
      Total_Group_1_Anthropomorphic_Promiscuity += collection_Group_ID_1.get(i)).anthropomorphic_promiscuity;
    }
  }
  
  void get_Total_Group_2_Anthropomorphic_Promiscuity()
  {
    Total_Group_2_Anthropomorphic_Promiscuity = 0.0D;
    
    for (int i = 0; i < collection_Group_ID_2.size(); i++) {
      Total_Group_2_Anthropomorphic_Promiscuity += collection_Group_ID_2.get(i)).anthropomorphic_promiscuity;
    }
  }
  
  void get_Total_Group_1_Sociographic_Prudery()
  {
    Total_Group_1_Sociographic_Prudery = 0.0D;
    
    for (int i = 0; i < collection_Group_ID_1.size(); i++) {
      Total_Group_1_Sociographic_Prudery += collection_Group_ID_1.get(i)).sociographic_prudery;
    }
  }
  
  void get_Total_Group_2_Sociographic_Prudery()
  {
    Total_Group_2_Sociographic_Prudery = 0.0D;
    
    for (int i = 0; i < collection_Group_ID_2.size(); i++) {
      Total_Group_2_Sociographic_Prudery += collection_Group_ID_2.get(i)).sociographic_prudery;
    }
  }
  
  void Generate_social_network()
  {
    String sn1_type = "Small World";
    double[] sn1_params = { pop_group_1, 2.0D, 0.5D };
    
    String sn2_type = "Small World";
    double[] sn2_params = { pop_group_2, 2.0D, 0.5D };
    
    SocialNetwork sn1 = new SocialNetwork(sn1_type, sn1_params, seed);
    SocialNetwork sn2 = new SocialNetwork(sn2_type, sn2_params, seed);
    

    String cons_weightType = "Constant";
    double[] cons_params = { 0.3D };
    
    sn1.setWeights(cons_weightType, cons_params, seed);
    sn2.setWeights(cons_weightType, cons_params, seed);
    
    social_network_1 = network;
    social_network_2 = network;
  }
  














































































  void Initialize_social_network()
  {
    social_network_1 = new double[pop_group_1][pop_group_1];
    social_network_2 = new double[pop_group_2][pop_group_2];
  }
  
  void Generate_Agents()
  {
    for (int i = 0; i < pop; i++) {
      Person new_person = add_person();
      if (i < pop * (group_ID_percentOfPopInMajority / 100.0D)) {
        group_ID = 1;
        shapeBody.setFillColor(com.anylogic.engine.presentation.UtilitiesColor.red);
        new_person.setXY(uniform(0.0D, 500.0D), uniform(0.0D, 500.0D));
      }
      else {
        group_ID = 2;
        shapeBody.setFillColor(com.anylogic.engine.presentation.UtilitiesColor.blue);
        new_person.setXY(uniform(0.0D, 500.0D), uniform(0.0D, 500.0D));
      }
    }
    
    for (int k = 0; k < person.size(); k++) {}
  }
  


  void start_agents()
  {
    for (int i = 0; i < person.size(); i++) {
      person.get(i)).statechart.fireEvent("set_group_links");
    }
  }
  


  void set_group_1_values()
  {
    for (int i = 0; i < group_1_values.length; i++) {
      double rand = uniform_discr(0, 1);
      group_1_values[i] = rand;
    }
  }
  


  void set_group_2_values()
  {
    double num2change = num_beliefs * (cultural_dissonance / 100.0D);
    
    for (int i = 0; i < Math.round(num2change); i++) {
      if (group_1_values[i] == 1.0D) {
        group_2_values[i] = 0.0D;
      } else {
        group_2_values[i] = 1.0D;
      }
    }
  }
  


  double get_Average_Religiosity_Entire_Pop()
  {
    double average_Religiosity = 0.0D;
    

    get_Total_Group_1_Anthropomorphic_Promiscuity();
    get_Total_Group_2_Anthropomorphic_Promiscuity();
    get_Total_Group_1_Sociographic_Prudery();
    get_Total_Group_2_Sociographic_Prudery();
    

    double total_AP = Total_Group_1_Anthropomorphic_Promiscuity + Total_Group_2_Anthropomorphic_Promiscuity;
    double total_SP = Total_Group_1_Sociographic_Prudery + Total_Group_2_Sociographic_Prudery;
    

    average_Religiosity = (total_AP + total_SP) / person.size();
    
    return average_Religiosity;
  }
  


  double get_Average_Violence_All_Categories()
  {
    int total_Violence_Occurrences_Total_Pop = 0;
    int total_Violence_Occurrences_Group_1 = 0;
    int total_Violence_Occurrences_Group_2 = 0;
    double average_violence_Total_Pop = 0.0D;
    double average_violence_Group_1 = 0.0D;
    double average_violence_Group_2 = 0.0D;
    

    for (int i = 0; i < collection_Group_ID_1.size(); i++) {
      Person current_person = (Person)collection_Group_ID_1.get(i);
      total_Violence_Occurrences_Group_1 += violence_counter;
    }
    


    for (int i = 0; i < collection_Group_ID_2.size(); i++) {
      Person current_person = (Person)collection_Group_ID_2.get(i);
      total_Violence_Occurrences_Group_2 += violence_counter;
    }
    



    for (int i = 0; i < person.size(); i++) {
      Person current_person = (Person)person.get(i);
      total_Violence_Occurrences_Total_Pop += violence_counter;
      violence_counter = 0;
    }
    

    average_violence_Total_Pop = total_Violence_Occurrences_Total_Pop / person.size();
    average_violence_Group_1 = total_Violence_Occurrences_Group_1 / collection_Group_ID_1.size();
    average_violence_Group_2 = total_Violence_Occurrences_Group_2 / collection_Group_ID_2.size();
    

    DS_Avg_Violence_Over_Group_1.add(average_violence_Group_1);
    DS_Avg_Violence_Over_Group_2.add(average_violence_Group_2);
    



    time();
    



    if (DS_Avg_Violence_Over_Group_1.size() > 1)
    {
      int index = DS_Avg_Violence_Over_Group_1.size() - 1;
      
      if ((DS_Avg_Violence_Over_Group_1.getY(index) > DS_Avg_Violence_Over_Group_1.getY(index - 1)) && 
        (DS_Avg_Violence_Over_Group_2.getY(index) > DS_Avg_Violence_Over_Group_2.getY(index - 1))) {
        Number_of_Consecutive_Increases_Current += 1;
        
        if ((Number_of_Consecutive_Increases_Current > Number_of_Consecutive_Increases_Second_Highest) && 
          (Number_of_Consecutive_Increases_Current <= Number_of_Consecutive_Increases_Maximum)) {
          Number_of_Consecutive_Increases_Second_Highest = Number_of_Consecutive_Increases_Current;



        }
        else if (Number_of_Consecutive_Increases_Current > Number_of_Consecutive_Increases_Maximum) {
          Number_of_Consecutive_Increases_Maximum = Number_of_Consecutive_Increases_Current;
        }
        

      }
      else
      {

        Number_of_Consecutive_Increases_Current = 0;
      }
    }
    
    return average_violence_Total_Pop;
  }
  






  double get_StDev_Religiosity_Over_Population_for_Run()
  {
    double variance_sum = 0.0D;
    double variance_total = 0.0D;
    double stDev_Religiosity = 0.0D;
    
    for (int i = 0; i < DS_Avg_Religiosity_Over_Population.size(); i++) {
      variance_sum += Math.pow(DS_Avg_Religiosity_Over_Population.getY(i) - DS_Avg_Religiosity_Over_Population.getYMean(), 2.0D);
    }
    
    variance_total = variance_sum / DS_Avg_Religiosity_Over_Population.size();
    
    stDev_Religiosity = Math.sqrt(variance_total);
    
    return stDev_Religiosity;
  }
  


  double get_Average_Religiosity_Over_Population_for_Run()
  {
    double avg_Religiosity = 0.0D;
    

    avg_Religiosity = DS_Avg_Religiosity_Over_Population.getYMean();
    
    return avg_Religiosity;
  }
  


  double get_Average_Violence_Over_Population_for_Run()
  {
    double avg_Violence = 0.0D;
    

    avg_Violence = DS_Avg_Violence_Over_Population.getYMean();
    
    return avg_Violence;
  }
  


  double get_StDev_Violence_Over_Population_for_Run()
  {
    double variance_sum = 0.0D;
    double variance_total = 0.0D;
    double stDev_Violence = 0.0D;
    
    for (int i = 0; i < DS_Avg_Violence_Over_Population.size(); i++) {
      variance_sum += Math.pow(DS_Avg_Violence_Over_Population.getY(i) - DS_Avg_Violence_Over_Population.getYMean(), 2.0D);
    }
    
    variance_total = variance_sum / DS_Avg_Violence_Over_Population.size();
    
    stDev_Violence = Math.sqrt(variance_total);
    
    return stDev_Violence;
  }
  


  double get_Variance_Violence_Over_Population_for_Run()
  {
    double variance_sum = 0.0D;
    double variance_total = 0.0D;
    
    for (int i = 0; i < DS_Avg_Violence_Over_Population.size(); i++) {
      variance_sum += Math.pow(DS_Avg_Violence_Over_Population.getY(i) - DS_Avg_Violence_Over_Population.getYMean(), 2.0D);
    }
    
    variance_total = variance_sum / DS_Avg_Violence_Over_Population.size();
    
    return variance_total;
  }
  


  double get_Average_Religiosity_Group_1()
  {
    double average_Religiosity_Group_1 = 0.0D;
    int group_1_size = 0;
    

    get_Total_Group_1_Anthropomorphic_Promiscuity();
    get_Total_Group_1_Sociographic_Prudery();
    
    group_1_size = collection_Group_ID_1.size();
    

    average_Religiosity_Group_1 = (Total_Group_1_Anthropomorphic_Promiscuity + Total_Group_1_Sociographic_Prudery) / group_1_size;
    
    return average_Religiosity_Group_1;
  }
  


  double get_StDev_Religiosity_Over_Group_1_for_Run()
  {
    double variance_sum_Group_1 = 0.0D;
    double variance_total_Group_1 = 0.0D;
    double stDev_Religiosity_Group_1 = 0.0D;
    
    for (int i = 0; i < DS_Avg_Religiosity_Over_Group_1.size(); i++) {
      variance_sum_Group_1 += Math.pow(DS_Avg_Religiosity_Over_Group_1.getY(i) - DS_Avg_Religiosity_Over_Group_1.getYMean(), 2.0D);
    }
    
    variance_total_Group_1 = variance_sum_Group_1 / DS_Avg_Religiosity_Over_Group_1.size();
    
    stDev_Religiosity_Group_1 = Math.sqrt(variance_total_Group_1);
    
    return stDev_Religiosity_Group_1;
  }
  


  double get_Average_Religiosity_Over_Group_1_for_Run()
  {
    double avg_Religiosity_Group_1 = 0.0D;
    

    avg_Religiosity_Group_1 = DS_Avg_Religiosity_Over_Group_1.getYMean();
    
    return avg_Religiosity_Group_1;
  }
  


  double get_Average_Violence_Over_Group_1_for_Run()
  {
    double avg_Violence_Group_1 = 0.0D;
    

    avg_Violence_Group_1 = DS_Avg_Violence_Over_Group_1.getYMean();
    
    return avg_Violence_Group_1;
  }
  


  double get_StDev_Violence_Over_Group_1_for_Run()
  {
    double variance_sum_Group_1 = 0.0D;
    double variance_total_Group_1 = 0.0D;
    double stDev_Violence_Group_1 = 0.0D;
    
    for (int i = 0; i < DS_Avg_Violence_Over_Group_1.size(); i++) {
      variance_sum_Group_1 += Math.pow(DS_Avg_Violence_Over_Group_1.getY(i) - DS_Avg_Violence_Over_Group_1.getYMean(), 2.0D);
    }
    
    variance_total_Group_1 = variance_sum_Group_1 / DS_Avg_Violence_Over_Group_1.size();
    
    stDev_Violence_Group_1 = Math.sqrt(variance_total_Group_1);
    
    return stDev_Violence_Group_1;
  }
  


  double get_Variance_Violence_Over_Group_1_for_Run()
  {
    double variance_sum_Group_1 = 0.0D;
    double variance_total_Group_1 = 0.0D;
    
    for (int i = 0; i < DS_Avg_Violence_Over_Group_1.size(); i++) {
      variance_sum_Group_1 += Math.pow(DS_Avg_Violence_Over_Group_1.getY(i) - DS_Avg_Violence_Over_Group_1.getYMean(), 2.0D);
    }
    
    variance_total_Group_1 = variance_sum_Group_1 / DS_Avg_Violence_Over_Group_1.size();
    
    return variance_total_Group_1;
  }
  


  double get_Average_Religiosity_Group_2()
  {
    double average_Religiosity_Group_2 = 0.0D;
    int group_2_size = 0;
    

    get_Total_Group_2_Anthropomorphic_Promiscuity();
    get_Total_Group_2_Sociographic_Prudery();
    
    group_2_size = collection_Group_ID_2.size();
    


    average_Religiosity_Group_2 = (Total_Group_2_Anthropomorphic_Promiscuity + Total_Group_2_Sociographic_Prudery) / group_2_size;
    
    return average_Religiosity_Group_2;
  }
  


  double get_StDev_Religiosity_Over_Group_2_for_Run()
  {
    double variance_sum_Group_2 = 0.0D;
    double variance_total_Group_2 = 0.0D;
    double stDev_Religiosity_Group_2 = 0.0D;
    
    for (int i = 0; i < DS_Avg_Religiosity_Over_Group_2.size(); i++) {
      variance_sum_Group_2 += Math.pow(DS_Avg_Religiosity_Over_Group_2.getY(i) - DS_Avg_Religiosity_Over_Group_2.getYMean(), 2.0D);
    }
    
    variance_total_Group_2 = variance_sum_Group_2 / DS_Avg_Religiosity_Over_Group_2.size();
    
    stDev_Religiosity_Group_2 = Math.sqrt(variance_total_Group_2);
    
    return stDev_Religiosity_Group_2;
  }
  


  double get_Average_Religiosity_Over_Group_2_for_Run()
  {
    double avg_Religiosity_Group_2 = 0.0D;
    

    avg_Religiosity_Group_2 = DS_Avg_Religiosity_Over_Group_2.getYMean();
    
    return avg_Religiosity_Group_2;
  }
  


  double get_Average_Violence_Over_Group_2_for_Run()
  {
    double avg_Violence_Group_2 = 0.0D;
    

    avg_Violence_Group_2 = DS_Avg_Violence_Over_Group_2.getYMean();
    
    return avg_Violence_Group_2;
  }
  


  double get_StDev_Violence_Over_Group_2_for_Run()
  {
    double variance_sum_Group_2 = 0.0D;
    double variance_total_Group_2 = 0.0D;
    double stDev_Violence_Group_2 = 0.0D;
    
    for (int i = 0; i < DS_Avg_Violence_Over_Group_2.size(); i++) {
      variance_sum_Group_2 += Math.pow(DS_Avg_Violence_Over_Group_2.getY(i) - DS_Avg_Violence_Over_Group_2.getYMean(), 2.0D);
    }
    
    variance_total_Group_2 = variance_sum_Group_2 / DS_Avg_Violence_Over_Group_2.size();
    
    stDev_Violence_Group_2 = Math.sqrt(variance_total_Group_2);
    
    return stDev_Violence_Group_2;
  }
  


  double get_Variance_Violence_Over_Group_2_for_Run()
  {
    double variance_sum_Group_2 = 0.0D;
    double variance_total_Group_2 = 0.0D;
    
    for (int i = 0; i < DS_Avg_Violence_Over_Group_2.size(); i++) {
      variance_sum_Group_2 += Math.pow(DS_Avg_Violence_Over_Group_2.getY(i) - DS_Avg_Violence_Over_Group_2.getYMean(), 2.0D);
    }
    
    variance_total_Group_2 = variance_sum_Group_2 / DS_Avg_Violence_Over_Group_2.size();
    
    return variance_total_Group_2;
  }
  



  int get_Number_of_Consecutive_Increases_Maximum()
  {
    return Number_of_Consecutive_Increases_Maximum;
  }
  



  int get_Number_of_Consecutive_Increases_Second_Highest()
  {
    return Number_of_Consecutive_Increases_Second_Highest;
  }
  


  double get_Average_Affect_Increase_Count_All_Categories()
  {
    int total_Affect_Increase_Occurrences_Total_Pop = 0;
    int total_Affect_Increase_Occurrences_Group_1 = 0;
    int total_Affect_Increase_Occurrences_Group_2 = 0;
    double average_Affect_Increase_Total_Pop = 0.0D;
    double average_Affect_Increase_Group_1 = 0.0D;
    double average_Affect_Increase_Group_2 = 0.0D;
    

    for (int i = 0; i < collection_Group_ID_1.size(); i++) {
      Person current_person = (Person)collection_Group_ID_1.get(i);
      total_Affect_Increase_Occurrences_Group_1 += net_affect_increase_length;
    }
    

    for (int i = 0; i < collection_Group_ID_2.size(); i++) {
      Person current_person = (Person)collection_Group_ID_2.get(i);
      total_Affect_Increase_Occurrences_Group_2 += net_affect_increase_length;
    }
    

    for (int i = 0; i < person.size(); i++) {
      Person current_person = (Person)person.get(i);
      total_Affect_Increase_Occurrences_Total_Pop += net_affect_increase_length;
    }
    

    average_Affect_Increase_Total_Pop = total_Affect_Increase_Occurrences_Total_Pop / person.size();
    average_Affect_Increase_Group_1 = total_Affect_Increase_Occurrences_Group_1 / collection_Group_ID_1.size();
    average_Affect_Increase_Group_2 = total_Affect_Increase_Occurrences_Group_2 / collection_Group_ID_2.size();
    

    DS_Avg_Affect_Length_Over_Group_1.add(average_Affect_Increase_Group_1);
    DS_Avg_Affect_Length_Over_Group_2.add(average_Affect_Increase_Group_2);
    



    if (DS_Avg_Affect_Length_Over_Group_1.size() > 1)
    {
      int index = DS_Avg_Affect_Length_Over_Group_1.size() - 1;
      
      if ((DS_Avg_Affect_Length_Over_Group_1.getY(index) > DS_Avg_Affect_Length_Over_Group_1.getY(index - 1)) && 
        (DS_Avg_Affect_Length_Over_Group_2.getY(index) > DS_Avg_Affect_Length_Over_Group_2.getY(index - 1))) {
        Number_of_Consecutive_Affect_Increases_Current += 1;
        
        if ((Number_of_Consecutive_Affect_Increases_Current > Number_of_Consecutive_Affect_Increases_Second_Highest) && 
          (Number_of_Consecutive_Affect_Increases_Current <= Number_of_Consecutive_Affect_Increases_Maximum)) {
          Number_of_Consecutive_Affect_Increases_Second_Highest = Number_of_Consecutive_Affect_Increases_Current;



        }
        else if (Number_of_Consecutive_Affect_Increases_Current > Number_of_Consecutive_Affect_Increases_Maximum) {
          Number_of_Consecutive_Affect_Increases_Maximum = Number_of_Consecutive_Affect_Increases_Current;
        }
        

      }
      else
      {

        Number_of_Consecutive_Affect_Increases_Current = 0;
      }
    }
    

    return average_Affect_Increase_Total_Pop;
  }
  







  int get_Number_of_Consecutive_Affect_Increases_Maximum()
  {
    return Number_of_Consecutive_Affect_Increases_Maximum;
  }
  



  int get_Number_of_Consecutive_Affect_Increases_Second_Highest()
  {
    return Number_of_Consecutive_Affect_Increases_Second_Highest;
  }
  


  double get_Average_Current_Affect_Population()
  {
    double total_Affect_Population = 0.0D;
    double total_Affect_Group_1 = 0.0D;
    double total_Affect_Group_2 = 0.0D;
    double average_Affect_Population = 0.0D;
    double average_Affect_Group_1 = 0.0D;
    double average_Affect_Group_2 = 0.0D;
    

    for (int i = 0; i < collection_Group_ID_1.size(); i++) {
      Person current_person = (Person)collection_Group_ID_1.get(i);
      total_Affect_Group_1 += affect;
    }
    


    for (int i = 0; i < collection_Group_ID_2.size(); i++) {
      Person current_person = (Person)collection_Group_ID_2.get(i);
      total_Affect_Group_2 += affect;
    }
    

    for (int i = 0; i < person.size(); i++) {
      Person current_person = (Person)person.get(i);
      total_Affect_Population += affect;
    }
    

    average_Affect_Population = total_Affect_Population / person.size();
    average_Affect_Group_1 = total_Affect_Group_1 / collection_Group_ID_1.size();
    average_Affect_Group_2 = total_Affect_Group_2 / collection_Group_ID_2.size();
    

    DS_Avg_Current_Affect_Group_1.add(average_Affect_Group_1);
    DS_Avg_Current_Affect_Group_2.add(average_Affect_Group_2);
    

    return average_Affect_Population;
  }
  






  double get_Average_Current_Affect_Increase_Population()
  {
    double total_Affect_Increase_Population = 0.0D;
    double total_Affect_Increase_Group_1 = 0.0D;
    double total_Affect_Increase_Group_2 = 0.0D;
    double average_Affect_Increase_Population = 0.0D;
    double average_Affect_Increase_Group_1 = 0.0D;
    double average_Affect_Increase_Group_2 = 0.0D;
    

    for (int i = 0; i < collection_Group_ID_1.size(); i++) {
      Person current_person = (Person)collection_Group_ID_1.get(i);
      total_Affect_Increase_Group_1 += affect - affect_previous;
    }
    

    for (int i = 0; i < collection_Group_ID_2.size(); i++) {
      Person current_person = (Person)collection_Group_ID_2.get(i);
      total_Affect_Increase_Group_2 += affect - affect_previous;
    }
    

    for (int i = 0; i < person.size(); i++) {
      Person current_person = (Person)person.get(i);
      total_Affect_Increase_Population += affect - affect_previous;
    }
    

    average_Affect_Increase_Population = total_Affect_Increase_Population / person.size();
    average_Affect_Increase_Group_1 = total_Affect_Increase_Group_1 / collection_Group_ID_1.size();
    average_Affect_Increase_Group_2 = total_Affect_Increase_Group_2 / collection_Group_ID_2.size();
    

    DS_Avg_Current_Affect_Increase_Group_1.add(average_Affect_Increase_Group_1);
    DS_Avg_Current_Affect_Increase_Group_2.add(average_Affect_Increase_Group_2);
    

    return average_Affect_Increase_Population;
  }
  




  public com.anylogic.engine.analysis.HistogramSmartData Anthropomorphic_HistogramData = new com.anylogic.engine.analysis.HistogramSmartData(20, 
    1.0D, 
    true, false, 0.1D, 0.1D);
  
  @AnyLogicInternalCodegenAPI
  protected static double[] _SociographicPrudery_Hdata_envelopes = { 0.25D, 0.5D, 0.75D };
  public com.anylogic.engine.analysis.Histogram2DData SociographicPrudery_Hdata = new com.anylogic.engine.analysis.Histogram2DData(11, 
    0.0D, 
    
    10.0D, 
    20, 
    0.0D, 
    
    11.0D, 
    _SociographicPrudery_Hdata_envelopes);
  
  public DataSet DS_SP_Group_1 = new DataSet(100);
  
  public DataSet DS_SP_Group_2 = new DataSet(100);
  
  public DataSet DS_AP_Group_2 = new DataSet(100);
  
  public DataSet DS_AP_Group_1 = new DataSet(100);
  
  @AnyLogicInternalCodegenAPI
  protected static double[] _AnthropomorphicPromiscuity_Hdata_envelopes = { 0.25D, 0.5D, 0.75D };
  public com.anylogic.engine.analysis.Histogram2DData AnthropomorphicPromiscuity_Hdata = new com.anylogic.engine.analysis.Histogram2DData(11, 
    0.0D, 
    
    10.0D, 
    20, 
    0.0D, 
    
    11.0D, 
    _AnthropomorphicPromiscuity_Hdata_envelopes);
  
  public DataSet DS_Avg_Violence_Over_Population = new DataSet(10000, new Main.1(this));
  



















  @AnyLogicInternalCodegenAPI
  private double _DS_Avg_Violence_Over_Population_YValue()
  {
    return 
      get_Average_Violence_All_Categories();
  }
  

  public DataSet DS_Avg_Religiosity_Over_Population = new DataSet(10000, new Main.2(this));
  



















  @AnyLogicInternalCodegenAPI
  private double _DS_Avg_Religiosity_Over_Population_YValue()
  {
    return 
      get_Average_Religiosity_Entire_Pop();
  }
  

  public DataSet DS_Avg_Violence_Over_Group_1 = new DataSet(10000, new Main.3(this));
  

















  public DataSet DS_Avg_Religiosity_Over_Group_1 = new DataSet(10000, new Main.4(this));
  



















  @AnyLogicInternalCodegenAPI
  private double _DS_Avg_Religiosity_Over_Group_1_YValue()
  {
    return 
      get_Average_Religiosity_Group_1();
  }
  

  public DataSet DS_Avg_Violence_Over_Group_2 = new DataSet(10000, new Main.5(this));
  

















  public DataSet DS_Avg_Religiosity_Over_Group_2 = new DataSet(10000, new Main.6(this));
  



















  @AnyLogicInternalCodegenAPI
  private double _DS_Avg_Religiosity_Over_Group_2_YValue()
  {
    return 
      get_Average_Religiosity_Group_2();
  }
  

  public DataSet DS_Avg_Affect_Length_Over_Population = new DataSet(10000, new Main.7(this));
  



















  @AnyLogicInternalCodegenAPI
  private double _DS_Avg_Affect_Length_Over_Population_YValue()
  {
    return 
      get_Average_Affect_Increase_Count_All_Categories();
  }
  

  public DataSet DS_Avg_Affect_Length_Over_Group_1 = new DataSet(10000, new Main.8(this));
  

















  public DataSet DS_Avg_Affect_Length_Over_Group_2 = new DataSet(10000, new Main.9(this));
  

















  public DataSet DS_Avg_Current_Affect_Population = new DataSet(10000, new Main.10(this));
  



















  @AnyLogicInternalCodegenAPI
  private double _DS_Avg_Current_Affect_Population_YValue()
  {
    return 
      get_Average_Current_Affect_Population();
  }
  

  public DataSet DS_Avg_Current_Affect_Group_1 = new DataSet(10000, new Main.11(this));
  

















  public DataSet DS_Avg_Current_Affect_Group_2 = new DataSet(10000, new Main.12(this));
  

















  public DataSet DS_Avg_Current_Affect_Increase_Population = new DataSet(10000, new Main.13(this));
  



















  @AnyLogicInternalCodegenAPI
  private double _DS_Avg_Current_Affect_Increase_Population_YValue()
  {
    return 
      get_Average_Current_Affect_Increase_Population();
  }
  

  public DataSet DS_Avg_Current_Affect_Increase_Group_1 = new DataSet(10000, new Main.14(this));
  

















  public DataSet DS_Avg_Current_Affect_Increase_Group_2 = new DataSet(10000, new Main.15(this));
  


















  public com.anylogic.engine.presentation.ViewArea _origin_VA = new com.anylogic.engine.presentation.ViewArea(this, "[Origin]", 0.0D, 0.0D, 1000.0D, 800.0D);
  
  @AnyLogicInternalCodegenAPI
  public int getViewAreas(java.util.Map<String, com.anylogic.engine.presentation.ViewArea> _output) {
    if (_output != null) {
      _output.put("_origin_VA", _origin_VA);
    }
    return 1 + super.getViewAreas(_output); }
  
  @AnyLogicInternalCodegenAPI
  protected static final java.awt.Font _button_Font = new java.awt.Font("Dialog", 0, 11);
  @AnyLogicInternalCodegenAPI
  protected static final java.awt.Font _text_Font = new java.awt.Font("Times New Roman", 0, 12);
  @AnyLogicInternalCodegenAPI
  protected static final java.awt.Font _text1_Font = _text_Font;
  
  @AnyLogicInternalCodegenAPI
  protected static final int _button = 1;
  
  @AnyLogicInternalCodegenAPI
  protected static final int _person_presentation = 2;
  
  @AnyLogicInternalCodegenAPI
  protected static final int _text = 3;
  
  @AnyLogicInternalCodegenAPI
  protected static final int _text1 = 4;
  
  @AnyLogicInternalCodegenAPI
  protected static final int _chart = 5;
  
  @AnyLogicInternalCodegenAPI
  protected static final int _chart1 = 6;
  @AnyLogicInternalCodegenAPI
  protected static final int _plot = 7;
  @AnyLogicInternalCodegenAPI
  protected static final int _plot1 = 8;
  @AnyLogicInternalCodegenAPI
  protected static final int _chart2 = 9;
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 10;
  @AnyLogicInternalCodegenAPI
  protected static final int _presentation = 0;
  
  @AnyLogicInternalCodegenAPI
  public boolean isPublicPresentationDefined()
  {
    return true;
  }
  
  @AnyLogicInternalCodegenAPI
  public boolean isEmbeddedAgentPresentationVisible(com.anylogic.engine.Agent _a) {
    return super.isEmbeddedAgentPresentationVisible(_a);
  }
  






  @AnyLogicInternalCodegenAPI
  public void executeShapeControlAction(int _shape, int index)
  {
    switch (_shape) {
    case 1: 
      com.anylogic.engine.presentation.ShapeButton self = button;
      Update_CSV_Individual_Level();
      Update_CSV_Population_Level();
      
      break;
    default: 
      super.executeShapeControlAction(_shape, index);
    }
    
  }
  









  @AnyLogicInternalCodegenAPI
  protected com.anylogic.engine.presentation.ShapeEmbeddedObjectPresentation _person_presentation_createShapeWithStaticProperties_xjal(com.anylogic.engine.Agent _a, int _index)
  {
    com.anylogic.engine.presentation.ShapeEmbeddedObjectPresentation shape = new com.anylogic.engine.presentation.ShapeEmbeddedObjectPresentation(this, SHAPE_DRAW_2D3D, true, 0.0D, 0.0D, 0.0D, 0.0D, 
      false, true, _a);
    
    return shape;
  }
  


  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal()
  {
    button = new Main.16(this, 
      this, true, -190.0D, 170.0D, 
      140.0D, 30.0D, 
      com.anylogic.engine.presentation.UtilitiesColor.controlDefault, com.anylogic.engine.presentation.UtilitiesColor.controlDefault, true, 
      _button_Font, 
      "Update CSV Files");
    












    text = new com.anylogic.engine.presentation.ShapeText(
      SHAPE_DRAW_2D, true, -1460.0D, 1390.0D, 0.0D, 0.0D, 
      com.anylogic.engine.presentation.UtilitiesColor.black, "These variables track the number of consecutive time steps that the \r\naverage VIOLENCE Counter values for Group 1 and Group 2 both increase \r\nfrom the previous time step.", 
      _text_Font, ALIGNMENT_LEFT);
    
    text1 = new com.anylogic.engine.presentation.ShapeText(
      SHAPE_DRAW_2D, true, -1040.0D, 1750.0D, 0.0D, 0.0D, 
      com.anylogic.engine.presentation.UtilitiesColor.black, "These variables track the number of consecutive time steps that the \r\naverage AFFECT value for Group 1 and Group 2 both increase from \r\nthe previous time step.", 
      _text1_Font, ALIGNMENT_LEFT);
  }
  


  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal()
  {
    List<com.anylogic.engine.analysis.HistogramData> _items = new java.util.ArrayList(1);
    com.anylogic.engine.analysis.HistogramData _item = 
      Anthropomorphic_HistogramData;
    
    _items.add(_item);
    List<String> _titles = new java.util.ArrayList(1);
    _titles.add("Histogram Anthropomorphic");
    List<com.anylogic.engine.analysis.Histogram.Appearance> _appearances = new java.util.ArrayList(1);
    _appearances.add(new com.anylogic.engine.analysis.Histogram.Appearance(com.anylogic.engine.presentation.UtilitiesColor.coral, com.anylogic.engine.presentation.UtilitiesColor.mediumTurquoise, com.anylogic.engine.presentation.UtilitiesColor.gold, com.anylogic.engine.presentation.UtilitiesColor.mediumSeaGreen, 1.0F, com.anylogic.engine.presentation.UtilitiesColor.oliveDrab));
    chart = new com.anylogic.engine.analysis.Histogram(
      this, true, 0.0D, 560.0D, 
      400.0D, 210.0D, 
      null, null, 
      50.0D, 30.0D, 
      320.0D, 120.0D, com.anylogic.engine.presentation.UtilitiesColor.white, com.anylogic.engine.presentation.UtilitiesColor.black, com.anylogic.engine.presentation.UtilitiesColor.black, 
      30.0D, com.anylogic.engine.analysis.Chart.SOUTH, 
      com.anylogic.engine.analysis.Chart.GRID_DEFAULT, com.anylogic.engine.analysis.Chart.GRID_DEFAULT, 
      com.anylogic.engine.presentation.UtilitiesColor.darkGray, com.anylogic.engine.presentation.UtilitiesColor.darkGray, 
      true, false, false, 0.8D, 
      _items, _titles, _appearances);
    



    List<com.anylogic.engine.analysis.Histogram2DData> _items = new java.util.ArrayList(1);
    com.anylogic.engine.analysis.Histogram2DData _item = 
      SociographicPrudery_Hdata;
    
    _items.add(_item);
    List<String> _titles = new java.util.ArrayList(1);
    _titles.add("Histogram2D Data Title");
    List<com.anylogic.engine.analysis.Histogram2D.Appearance> _appearances = new java.util.ArrayList(1);
    _appearances.add(new com.anylogic.engine.analysis.Histogram2D.Appearance(com.anylogic.engine.presentation.UtilitiesColor.chocolate));
    chart1 = new com.anylogic.engine.analysis.Histogram2D(
      this, true, 400.0D, 570.0D, 
      400.0D, 210.0D, 
      null, null, 
      50.0D, 30.0D, 
      320.0D, 120.0D, com.anylogic.engine.presentation.UtilitiesColor.white, com.anylogic.engine.presentation.UtilitiesColor.black, com.anylogic.engine.presentation.UtilitiesColor.black, 
      30.0D, com.anylogic.engine.analysis.Chart.SOUTH, 
      com.anylogic.engine.analysis.Chart.GRID_DEFAULT, com.anylogic.engine.analysis.Chart.GRID_DEFAULT, 
      com.anylogic.engine.presentation.UtilitiesColor.darkGray, com.anylogic.engine.presentation.UtilitiesColor.darkGray, false, 
      _items, _titles, _appearances);
    



    List<DataSet> _items = new java.util.ArrayList(2);
    DataSet _item = 
      DS_SP_Group_1;
    
    _items.add(_item);
    _item = 
      DS_SP_Group_2;
    
    _items.add(_item);
    List<String> _titles = new java.util.ArrayList(2);
    _titles.add("SP Group 1");
    _titles.add("SP Group 2");
    List<com.anylogic.engine.analysis.Chart2DPlot.Appearance> _appearances = new java.util.ArrayList(2);
    _appearances.add(new com.anylogic.engine.analysis.Chart2DPlot.Appearance(com.anylogic.engine.presentation.UtilitiesColor.orange, true, com.anylogic.engine.analysis.Chart.INTERPOLATION_LINEAR, 1.0D, com.anylogic.engine.analysis.Chart.POINT_CIRCLE));
    _appearances.add(new com.anylogic.engine.analysis.Chart2DPlot.Appearance(com.anylogic.engine.presentation.UtilitiesColor.darkKhaki, true, com.anylogic.engine.analysis.Chart.INTERPOLATION_LINEAR, 1.0D, com.anylogic.engine.analysis.Chart.POINT_CIRCLE));
    plot = new com.anylogic.engine.analysis.Plot(
      this, true, 50.0D, 1250.0D, 
      450.0D, 220.0D, 
      null, null, 
      50.0D, 30.0D, 
      370.0D, 130.0D, com.anylogic.engine.presentation.UtilitiesColor.white, com.anylogic.engine.presentation.UtilitiesColor.black, com.anylogic.engine.presentation.UtilitiesColor.black, 
      30.0D, com.anylogic.engine.analysis.Chart.SOUTH, 
      com.anylogic.engine.analysis.Chart.SCALE_AUTO, 
      0.0D, 0.0D, com.anylogic.engine.analysis.Chart.SCALE_AUTO, 
      0.0D, 0.0D, com.anylogic.engine.analysis.Chart.GRID_DEFAULT, com.anylogic.engine.analysis.Chart.GRID_DEFAULT, 
      com.anylogic.engine.presentation.UtilitiesColor.darkGray, com.anylogic.engine.presentation.UtilitiesColor.darkGray, _items, _titles, _appearances);
    



    List<DataSet> _items = new java.util.ArrayList(2);
    DataSet _item = 
      DS_AP_Group_1;
    
    _items.add(_item);
    _item = 
      DS_AP_Group_2;
    
    _items.add(_item);
    List<String> _titles = new java.util.ArrayList(2);
    _titles.add("AP Group 1");
    _titles.add("AP Group 2");
    List<com.anylogic.engine.analysis.Chart2DPlot.Appearance> _appearances = new java.util.ArrayList(2);
    _appearances.add(new com.anylogic.engine.analysis.Chart2DPlot.Appearance(com.anylogic.engine.presentation.UtilitiesColor.orange, true, com.anylogic.engine.analysis.Chart.INTERPOLATION_LINEAR, 1.0D, com.anylogic.engine.analysis.Chart.POINT_CIRCLE));
    _appearances.add(new com.anylogic.engine.analysis.Chart2DPlot.Appearance(com.anylogic.engine.presentation.UtilitiesColor.darkKhaki, true, com.anylogic.engine.analysis.Chart.INTERPOLATION_LINEAR, 1.0D, com.anylogic.engine.analysis.Chart.POINT_CIRCLE));
    plot1 = new com.anylogic.engine.analysis.Plot(
      this, true, 50.0D, 1480.0D, 
      450.0D, 220.0D, 
      null, null, 
      50.0D, 30.0D, 
      370.0D, 130.0D, com.anylogic.engine.presentation.UtilitiesColor.white, com.anylogic.engine.presentation.UtilitiesColor.black, com.anylogic.engine.presentation.UtilitiesColor.black, 
      30.0D, com.anylogic.engine.analysis.Chart.SOUTH, 
      com.anylogic.engine.analysis.Chart.SCALE_AUTO, 
      0.0D, 0.0D, com.anylogic.engine.analysis.Chart.SCALE_AUTO, 
      0.0D, 0.0D, com.anylogic.engine.analysis.Chart.GRID_DEFAULT, com.anylogic.engine.analysis.Chart.GRID_DEFAULT, 
      com.anylogic.engine.presentation.UtilitiesColor.darkGray, com.anylogic.engine.presentation.UtilitiesColor.darkGray, _items, _titles, _appearances);
    



    List<com.anylogic.engine.analysis.Histogram2DData> _items = new java.util.ArrayList(1);
    com.anylogic.engine.analysis.Histogram2DData _item = 
      SociographicPrudery_Hdata;
    
    _items.add(_item);
    List<String> _titles = new java.util.ArrayList(1);
    _titles.add("Histogram2D Data Title");
    List<com.anylogic.engine.analysis.Histogram2D.Appearance> _appearances = new java.util.ArrayList(1);
    _appearances.add(new com.anylogic.engine.analysis.Histogram2D.Appearance(com.anylogic.engine.presentation.UtilitiesColor.chocolate));
    chart2 = new com.anylogic.engine.analysis.Histogram2D(
      this, true, 800.0D, 570.0D, 
      400.0D, 210.0D, 
      null, null, 
      50.0D, 30.0D, 
      320.0D, 120.0D, com.anylogic.engine.presentation.UtilitiesColor.white, com.anylogic.engine.presentation.UtilitiesColor.black, com.anylogic.engine.presentation.UtilitiesColor.black, 
      30.0D, com.anylogic.engine.analysis.Chart.SOUTH, 
      com.anylogic.engine.analysis.Chart.GRID_DEFAULT, com.anylogic.engine.analysis.Chart.GRID_DEFAULT, 
      com.anylogic.engine.presentation.UtilitiesColor.darkGray, com.anylogic.engine.presentation.UtilitiesColor.darkGray, false, 
      _items, _titles, _appearances);
    

    person_presentation = new Main.17(this, this, SHAPE_DRAW_2D3D, true, person);
  }
  

  @AnyLogicInternalCodegenAPI
  protected static final int _icon = -1;
  
  protected com.anylogic.engine.presentation.ShapeButton button;
  
  protected com.anylogic.engine.analysis.Histogram chart;
  
  protected com.anylogic.engine.analysis.Histogram2D chart1;
  
  protected com.anylogic.engine.analysis.Plot plot;
  
  protected com.anylogic.engine.analysis.Plot plot1;
  
  protected com.anylogic.engine.analysis.Histogram2D chart2;
  protected com.anylogic.engine.presentation.ShapeAgentPopulationGroup person_presentation;
  protected com.anylogic.engine.presentation.ShapeText text;
  protected com.anylogic.engine.presentation.ShapeText text1;
  protected com.anylogic.engine.presentation.ShapeTopLevelPresentationGroup presentation;
  protected com.anylogic.engine.presentation.ShapeModelElementsGroup icon;
  @AnyLogicInternalCodegenAPI
  public com.anylogic.engine.presentation.ShapeTopLevelPresentationGroup getPresentationShape()
  {
    return presentation;
  }
  
  @AnyLogicInternalCodegenAPI
  public com.anylogic.engine.presentation.ShapeModelElementsGroup getModelElementsShape()
  {
    return icon;
  }
  
  @AnyLogicInternalCodegenAPI
  public Object getPersistentShape(int _shape)
  {
    switch (_shape) {
    case 0:  return presentation;
    case -1:  return icon;
    case 1:  return button;
    case 5:  return chart;
    case 6:  return chart1;
    case 7:  return plot;
    case 8:  return plot1;
    case 9:  return chart2;
    case 2:  return person_presentation;
    case 3:  return text;
    case 4:  return text1; }
    return super.getPersistentShape(_shape);
  }
  
  @AnyLogicInternalCodegenAPI
  public String getNameOfShape_xjal(Object _shape)
  {
    try
    {
      if (_shape == null) { return null;
      }
      String _name_xjal = checkNameOfShape_xjal(_shape, presentation, "presentation"); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal(_shape, icon, "icon"); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal(_shape, button, "button"); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal(_shape, chart, "chart"); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal(_shape, chart1, "chart1"); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal(_shape, plot, "plot"); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal(_shape, plot1, "plot1"); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal(_shape, chart2, "chart2"); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal(_shape, person_presentation, "person_presentation"); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal(_shape, text, "text"); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal(_shape, text1, "text1"); if (_name_xjal != null) return _name_xjal;
    } catch (Exception e) {
      return null;
    }
    return super.getNameOfShape_xjal(_shape);
  }
  
  @AnyLogicInternalCodegenAPI
  private void drawModelElements_Events_xjal(Panel _panel, java.awt.Graphics2D _g, boolean _publicOnly, boolean _isSuperClass) {
    if (!_publicOnly) {
      drawEvent(_panel, _g, 65296, 910, 10, 0, "HazardIncrease_Natural", HazardIncrease_Natural);
    }
    if (!_publicOnly) {
      drawEvent(_panel, _g, 70, 900, 10, 0, "get_HistogramData_Anthropomorphic", get_HistogramData_Anthropomorphic);
    }
    if (!_publicOnly) {
      drawEvent(_panel, _g, 470, 940, 10, 0, "get_HistogramData_SociographicPrudery", get_HistogramData_SociographicPrudery);
    }
    if (!_publicOnly) {
      drawEvent(_panel, _g, 50, 1190, 10, 0, "event_Update_Group_SP_AP", event_Update_Group_SP_AP);
    }
    if (!_publicOnly) {
      drawEvent(_panel, _g, 65186, -50, 10, 0, "collect_Group_IDs", collect_Group_IDs);
    }
  }
  
  @AnyLogicInternalCodegenAPI
  private void drawModelElements_Parameters_xjal(Panel _panel, java.awt.Graphics2D _g, boolean _publicOnly, boolean _isSuperClass) {
    if (!_publicOnly) {
      drawParameter(_panel, _g, 64936, -70, 10, 0, "group_ID_percentOfPopInMajority", Double.valueOf(group_ID_percentOfPopInMajority), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 64836, 360, 10, 0, "prior_anthropomorphic_promiscuity_min", Double.valueOf(prior_anthropomorphic_promiscuity_min), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 65066, 360, 10, 0, "prior_anthropomorphic_promiscuity_max", Double.valueOf(prior_anthropomorphic_promiscuity_max), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 65296, 360, 10, 0, "prior_anthropomorphic_promiscuity_mode", Double.valueOf(prior_anthropomorphic_promiscuity_mode), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 64836, 440, 10, 0, "sociographic_prudery_min", Double.valueOf(sociographic_prudery_min), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 65066, 440, 10, 0, "sociographic_prudery_max", Double.valueOf(sociographic_prudery_max), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 65296, 440, 10, 0, "sociographic_prudery_mode", Double.valueOf(sociographic_prudery_mode), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 64836, 480, 10, 0, "anthropomorphic_promiscuity_min", Double.valueOf(anthropomorphic_promiscuity_min), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 65066, 480, 10, 0, "anthropomorphic_promiscuity_max", Double.valueOf(anthropomorphic_promiscuity_max), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 65296, 480, 10, 0, "anthropomorphic_promiscuity_mode", Double.valueOf(anthropomorphic_promiscuity_mode), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 64836, 520, 10, 0, "predation_tolerance_min", Double.valueOf(predation_tolerance_min), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 65066, 520, 10, 0, "predation_tolerance_max", Double.valueOf(predation_tolerance_max), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 65296, 520, 10, 0, "predation_tolerance_mode", Double.valueOf(predation_tolerance_mode), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 64836, 560, 10, 0, "natural_tolerance_min", Double.valueOf(natural_tolerance_min), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 65066, 560, 10, 0, "natural_tolerance_max", Double.valueOf(natural_tolerance_max), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 65296, 560, 10, 0, "natural_tolerance_mode", Double.valueOf(natural_tolerance_mode), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 64836, 600, 10, 0, "contagion_tolerance_min", Double.valueOf(contagion_tolerance_min), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 65066, 600, 10, 0, "contagion_tolerance_max", Double.valueOf(contagion_tolerance_max), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 65296, 600, 10, 0, "contagion_tolerance_mode", Double.valueOf(contagion_tolerance_mode), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 64836, 640, 10, 0, "social_tolerance_min", Double.valueOf(social_tolerance_min), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 65066, 640, 10, 0, "social_tolerance_max", Double.valueOf(social_tolerance_max), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 65296, 640, 10, 0, "social_tolerance_mode", Double.valueOf(social_tolerance_mode), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 64836, 680, 10, 0, "contagion_probability_min", Double.valueOf(contagion_probability_min), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 65066, 680, 10, 0, "contagion_probability_max", Double.valueOf(contagion_probability_max), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 65296, 680, 10, 0, "contagion_probability_mode", Double.valueOf(contagion_probability_mode), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 64836, 720, 10, 0, "predation_probability_min", Double.valueOf(predation_probability_min), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 65066, 720, 10, 0, "predation_probability_max", Double.valueOf(predation_probability_max), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 65296, 720, 10, 0, "predation_probability_mode", Double.valueOf(predation_probability_mode), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 64836, 760, 10, 0, "social_probability_min", Double.valueOf(social_probability_min), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 65066, 760, 10, 0, "social_probability_max", Double.valueOf(social_probability_max), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 65296, 760, 10, 0, "social_probability_mode", Double.valueOf(social_probability_mode), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 65296, 820, 10, 0, "chanceForNaturalHazardToOccur", Double.valueOf(chanceForNaturalHazardToOccur), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 64836, 100, 10, 0, "group_distance_anthropomorphic_min", Double.valueOf(group_distance_anthropomorphic_min), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 65086, 100, 10, 0, "group_distance_anthropomorphic_max", Double.valueOf(group_distance_anthropomorphic_max), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 64836, 400, 10, 0, "prior_sociographic_promiscuity_min", Double.valueOf(prior_sociographic_promiscuity_min), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 65066, 400, 10, 0, "prior_sociographic_promiscuity_max", Double.valueOf(prior_sociographic_promiscuity_max), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 65296, 400, 10, 0, "prior_sociographic_promiscuity_mode", Double.valueOf(prior_sociographic_promiscuity_mode), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 64836, 150, 10, 0, "group_distance_sociographic_min", Double.valueOf(group_distance_sociographic_min), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 65086, 150, 10, 0, "group_distance_sociographic_max", Double.valueOf(group_distance_sociographic_max), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 64836, 200, 10, 0, "group_distance_contagionHazard_min", Double.valueOf(group_distance_contagionHazard_min), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 65086, 200, 10, 0, "group_distance_contagionHazard_max", Double.valueOf(group_distance_contagionHazard_max), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 64836, 250, 10, 0, "group_distance_socialHazard_min", Double.valueOf(group_distance_socialHazard_min), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 65086, 250, 10, 0, "group_distance_socialHazard_max", Double.valueOf(group_distance_socialHazard_max), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 64766, -60, 10, 0, "beta_coeff", Double.valueOf(beta_coeff), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 64766, -80, 10, 0, "prob_link_reassignment", Double.valueOf(prob_link_reassignment), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 64936, 65386, 10, 0, "pop", Integer.valueOf(pop), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 64936, 65406, 10, 0, "seed", Long.valueOf(seed), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 65246, 65276, 10, 0, "length_of_memory", Integer.valueOf(length_of_memory), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 65246, 65246, 10, 0, "num_beliefs", Double.valueOf(num_beliefs), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 65246, 65216, 10, 0, "cultural_dissonance", Double.valueOf(cultural_dissonance), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 65246, 65306, 10, 0, "extinction_rate", Double.valueOf(extinction_rate), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 65336, 65336, 10, 0, "weight_second_order_connection", Double.valueOf(weight_second_order_connection), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 65336, 65366, 10, 0, "weight_third_order_connection", Double.valueOf(weight_third_order_connection), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 65246, 65186, 10, 0, "threshold", Double.valueOf(threshold), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 65246, 65156, 10, 0, "vision", Double.valueOf(vision), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 65186, 1680, 10, 0, "Violence_Counter_Update_Interval", Integer.valueOf(Violence_Counter_Update_Interval), 0);
    }
    if (!_publicOnly) {
      drawParameter(_panel, _g, 64956, 2000, 10, 0, "Affect_Counter_Update_Interval", Integer.valueOf(Affect_Counter_Update_Interval), 0);
    }
  }
  
  @AnyLogicInternalCodegenAPI
  private void drawModelElements_PlainVariables_xjal(Panel _panel, java.awt.Graphics2D _g, boolean _publicOnly, boolean _isSuperClass) {
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 65216, 1220, 10, 0, "Total_Group_1_Sociographic_Prudery", Double.valueOf(Total_Group_1_Sociographic_Prudery), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 65216, 1170, 10, 0, "Total_Group_2_Anthropomorphic_Promiscuity", Double.valueOf(Total_Group_2_Anthropomorphic_Promiscuity), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 65216, 1120, 10, 0, "Total_Group_1_Anthropomorphic_Promiscuity", Double.valueOf(Total_Group_1_Anthropomorphic_Promiscuity), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 65216, 1270, 10, 0, "Total_Group_2_Sociographic_Prudery", Double.valueOf(Total_Group_2_Sociographic_Prudery), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 65296, 860, 10, 0, "Natural_Hazard_Present", Boolean.valueOf(Natural_Hazard_Present), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 65186, 1000, 10, 0, "Max_Group_Size_in_Ritual", Integer.valueOf(Max_Group_Size_in_Ritual), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 65356, 250, 10, 0, "csv_PopulationLevel", csv_PopulationLevel, false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 65356, 310, 10, 0, "csv_IndividualLevel", csv_IndividualLevel, false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 65186, 1050, 10, 0, "Total_Number_of_Groups", Integer.valueOf(Total_Number_of_Groups), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 64936, -40, 10, 0, "pop_group_1", Integer.valueOf(pop_group_1), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 64936, -20, 10, 0, "pop_group_2", Integer.valueOf(pop_group_2), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 64886, 65276, 10, 0, "social_network_1", social_network_1, false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 64886, 65296, 10, 0, "social_network_2", social_network_2, false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 65036, 65036, 10, 0, "group_1_values", group_1_values, false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 65036, 65086, 10, 0, "group_2_values", group_2_values, false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 64136, 1450, 10, 0, "Number_of_Consecutive_Increases_Maximum", Integer.valueOf(Number_of_Consecutive_Increases_Maximum), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 64136, 1500, 10, 0, "Number_of_Consecutive_Increases_Second_Highest", Integer.valueOf(Number_of_Consecutive_Increases_Second_Highest), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 64136, 1550, 10, 0, "Number_of_Consecutive_Increases_Current", Integer.valueOf(Number_of_Consecutive_Increases_Current), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 64526, 1820, 10, 0, "Number_of_Consecutive_Affect_Increases_Maximum", Integer.valueOf(Number_of_Consecutive_Affect_Increases_Maximum), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 64526, 1870, 10, 0, "Number_of_Consecutive_Affect_Increases_Second_Highest", Integer.valueOf(Number_of_Consecutive_Affect_Increases_Second_Highest), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 64526, 1920, 10, 0, "Number_of_Consecutive_Affect_Increases_Current", Integer.valueOf(Number_of_Consecutive_Affect_Increases_Current), false);
    }
  }
  
  @AnyLogicInternalCodegenAPI
  private void drawModelElements_CollectionVariables_xjal(Panel _panel, java.awt.Graphics2D _g, boolean _publicOnly, boolean _isSuperClass) {
    if (!_publicOnly) {
      drawCollection(_panel, _g, 65166, 65396, 10, 0, "collection_Group_ID_1", collection_Group_ID_1);
    }
    if (!_publicOnly) {
      drawCollection(_panel, _g, 65166, -90, 10, 0, "collection_Group_ID_2", collection_Group_ID_2);
    }
  }
  
  @AnyLogicInternalCodegenAPI
  private void drawModelElements_Functions_xjal(Panel _panel, java.awt.Graphics2D _g, boolean _publicOnly, boolean _isSuperClass) {
    if (!_publicOnly) {
      drawFunction(_panel, _g, 450, 890, 10, 0, "get_SociographicPrudery_HistogramData");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 70, 850, 10, 0, "get_Anthropomorphic_HistogramData");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 850, 890, 10, 0, "get_anthropomorphic_promiscuity_HistogramData");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 65336, 220, 10, 0, "Update_CSV_Population_Level");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 65336, 280, 10, 0, "Update_CSV_Individual_Level");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 65186, 1100, 10, 0, "get_Total_Group_1_Anthropomorphic_Promiscuity");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 65186, 1150, 10, 0, "get_Total_Group_2_Anthropomorphic_Promiscuity");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 65186, 1200, 10, 0, "get_Total_Group_1_Sociographic_Prudery");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 65186, 1250, 10, 0, "get_Total_Group_2_Sociographic_Prudery");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 64886, 65256, 10, 0, "Generate_social_network");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 64886, 65226, 10, 0, "Initialize_social_network");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 64886, 65196, 10, 0, "Generate_Agents");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 64886, 65326, 10, 0, "start_agents");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 64886, 65036, 10, 0, "set_group_1_values");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 64886, 65086, 10, 0, "set_group_2_values");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 65186, 1350, 10, 0, "get_Average_Religiosity_Entire_Pop");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 65186, 1500, 10, 0, "get_Average_Violence_All_Categories");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 65216, 1430, 10, 0, "get_StDev_Religiosity_Over_Population_for_Run");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 65216, 1400, 10, 0, "get_Average_Religiosity_Over_Population_for_Run");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 65216, 1590, 10, 0, "get_StDev_Violence_Over_Population_for_Run");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 65216, 1620, 10, 0, "get_Variance_Violence_Over_Population_for_Run");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 64836, 1350, 10, 0, "get_Average_Religiosity_Group_1");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 64866, 1430, 10, 0, "get_StDev_Religiosity_Over_Group_1_for_Run");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 64866, 1400, 10, 0, "get_Average_Religiosity_Over_Group_1_for_Run");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 64866, 1590, 10, 0, "get_StDev_Violence_Over_Group_1_for_Run");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 64866, 1620, 10, 0, "get_Variance_Violence_Over_Group_1_for_Run");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 64486, 1350, 10, 0, "get_Average_Religiosity_Group_2");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 64516, 1430, 10, 0, "get_StDev_Religiosity_Over_Group_2_for_Run");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 64516, 1400, 10, 0, "get_Average_Religiosity_Over_Group_2_for_Run");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 64516, 1590, 10, 0, "get_StDev_Violence_Over_Group_2_for_Run");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 64516, 1620, 10, 0, "get_Variance_Violence_Over_Group_2_for_Run");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 64156, 1600, 10, 0, "get_Number_of_Consecutive_Increases_Maximum");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 64156, 1650, 10, 0, "get_Number_of_Consecutive_Increases_Second_Highest");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 64936, 1950, 10, 0, "get_Average_Affect_Increase_Count_All_Categories");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 64546, 1970, 10, 0, "get_Number_of_Consecutive_Affect_Increases_Maximum");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 64546, 2020, 10, 0, "get_Number_of_Consecutive_Affect_Increases_Second_Highest");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 64636, 2250, 10, 0, "get_Average_Current_Affect_Population");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 64986, 2250, 10, 0, "get_Average_Current_Affect_Increase_Population");
    }
  }
  
  @AnyLogicInternalCodegenAPI
  private void drawModelElements_DataElements_xjal(Panel _panel, java.awt.Graphics2D _g, boolean _publicOnly, boolean _isSuperClass) {
    if (!_publicOnly) {
      drawHistogramData(_panel, _g, 50, 820, 15, 0, "Anthropomorphic_HistogramData", Anthropomorphic_HistogramData);
    }
    if (!_publicOnly) {
      drawHistogram2DData(_panel, _g, 450, 850, 15, 0, "SociographicPrudery_Hdata", SociographicPrudery_Hdata);
    }
    if (!_publicOnly) {
      drawDataset(_panel, _g, 50, 1150, 15, 0, "DS_SP_Group_1", DS_SP_Group_1);
    }
    if (!_publicOnly) {
      drawDataset(_panel, _g, 50, 1120, 15, 0, "DS_SP_Group_2", DS_SP_Group_2);
    }
    if (!_publicOnly) {
      drawDataset(_panel, _g, 220, 1120, 15, 0, "DS_AP_Group_2", DS_AP_Group_2);
    }
    if (!_publicOnly) {
      drawDataset(_panel, _g, 220, 1150, 15, 0, "DS_AP_Group_1", DS_AP_Group_1);
    }
    if (!_publicOnly) {
      drawHistogram2DData(_panel, _g, 850, 850, 15, 0, "AnthropomorphicPromiscuity_Hdata", AnthropomorphicPromiscuity_Hdata);
    }
    if (!_publicOnly) {
      drawDataset(_panel, _g, 65216, 1530, 15, 0, "DS_Avg_Violence_Over_Population", DS_Avg_Violence_Over_Population);
    }
    if (!_publicOnly) {
      drawDataset(_panel, _g, 65216, 1370, 15, 0, "DS_Avg_Religiosity_Over_Population", DS_Avg_Religiosity_Over_Population);
    }
    if (!_publicOnly) {
      drawDataset(_panel, _g, 64866, 1530, 15, 0, "DS_Avg_Violence_Over_Group_1", DS_Avg_Violence_Over_Group_1);
    }
    if (!_publicOnly) {
      drawDataset(_panel, _g, 64866, 1370, 15, 0, "DS_Avg_Religiosity_Over_Group_1", DS_Avg_Religiosity_Over_Group_1);
    }
    if (!_publicOnly) {
      drawDataset(_panel, _g, 64516, 1530, 15, 0, "DS_Avg_Violence_Over_Group_2", DS_Avg_Violence_Over_Group_2);
    }
    if (!_publicOnly) {
      drawDataset(_panel, _g, 64516, 1370, 15, 0, "DS_Avg_Religiosity_Over_Group_2", DS_Avg_Religiosity_Over_Group_2);
    }
    if (!_publicOnly) {
      drawDataset(_panel, _g, 64886, 1800, 15, 0, "DS_Avg_Affect_Length_Over_Population", DS_Avg_Affect_Length_Over_Population);
    }
    if (!_publicOnly) {
      drawDataset(_panel, _g, 64886, 1850, 15, 0, "DS_Avg_Affect_Length_Over_Group_1", DS_Avg_Affect_Length_Over_Group_1);
    }
    if (!_publicOnly) {
      drawDataset(_panel, _g, 64886, 1900, 15, 0, "DS_Avg_Affect_Length_Over_Group_2", DS_Avg_Affect_Length_Over_Group_2);
    }
    if (!_publicOnly) {
      drawDataset(_panel, _g, 64586, 2100, 15, 0, "DS_Avg_Current_Affect_Population", DS_Avg_Current_Affect_Population);
    }
    if (!_publicOnly) {
      drawDataset(_panel, _g, 64586, 2150, 15, 0, "DS_Avg_Current_Affect_Group_1", DS_Avg_Current_Affect_Group_1);
    }
    if (!_publicOnly) {
      drawDataset(_panel, _g, 64586, 2200, 15, 0, "DS_Avg_Current_Affect_Group_2", DS_Avg_Current_Affect_Group_2);
    }
    if (!_publicOnly) {
      drawDataset(_panel, _g, 64936, 2100, 15, 0, "DS_Avg_Current_Affect_Increase_Population", DS_Avg_Current_Affect_Increase_Population);
    }
    if (!_publicOnly) {
      drawDataset(_panel, _g, 64936, 2150, 15, 0, "DS_Avg_Current_Affect_Increase_Group_1", DS_Avg_Current_Affect_Increase_Group_1);
    }
    if (!_publicOnly) {
      drawDataset(_panel, _g, 64936, 2200, 15, 0, "DS_Avg_Current_Affect_Increase_Group_2", DS_Avg_Current_Affect_Increase_Group_2);
    }
  }
  
  @AnyLogicInternalCodegenAPI
  private void drawModelElements_EmbeddeObjects_xjal(Panel _panel, java.awt.Graphics2D _g, boolean _publicOnly, boolean _isSuperClass)
  {
    if (!_publicOnly) {
      drawEmbeddedObjectModelDefault(_panel, _g, 65386, 100, -35, -30, "environment", environment);
    }
    
    if (!_publicOnly) {
      drawEmbeddedObjectModelDefault(_panel, _g, 65386, 150, -25, -25, "person", person);
    }
  }
  
  @AnyLogicInternalCodegenAPI
  private void drawModelElements_AgentLinks_xjal(Panel _panel, java.awt.Graphics2D _g, boolean _publicOnly, boolean _isSuperClass) {
    if (_publicOnly) return;
    drawLinkToAgent(_panel, _g, 50, -50, 15, 0, "connections", true, connections);
  }
  
  @AnyLogicInternalCodegenAPI
  public void drawModelElements(Panel _panel, java.awt.Graphics2D _g, boolean _publicOnly, boolean _isSuperClass)
  {
    super.drawModelElements(_panel, _g, _publicOnly, true);
    drawModelElements_Events_xjal(_panel, _g, _publicOnly, _isSuperClass);
    drawModelElements_Parameters_xjal(_panel, _g, _publicOnly, _isSuperClass);
    drawModelElements_PlainVariables_xjal(_panel, _g, _publicOnly, _isSuperClass);
    drawModelElements_CollectionVariables_xjal(_panel, _g, _publicOnly, _isSuperClass);
    drawModelElements_Functions_xjal(_panel, _g, _publicOnly, _isSuperClass);
    drawModelElements_DataElements_xjal(_panel, _g, _publicOnly, _isSuperClass);
    drawModelElements_EmbeddeObjects_xjal(_panel, _g, _publicOnly, _isSuperClass);
    drawModelElements_AgentLinks_xjal(_panel, _g, _publicOnly, _isSuperClass);
  }
  
  @AnyLogicInternalCodegenAPI
  private boolean onClickModelAt_EmbeddedObjects_xjal(Panel _panel, double _x, double _y, int _clickCount, boolean _publicOnly, boolean _isSuperClass) {
    if ((!environment.isEmpty()) && (modelElementContains(_x, _y, -150.0D, 100.0D))) {
      if (_clickCount == 2) {
        _panel.browseAgent_xjal(-150.0D, 100.0D, this, "environment");
      } else {
        _panel.addInspect(-150.0D, 100.0D, this, "environment");
      }
      return true;
    }
    if ((!person.isEmpty()) && (modelElementContains(_x, _y, -150.0D, 150.0D))) {
      if (_clickCount == 2) {
        _panel.browseAgent_xjal(-150.0D, 150.0D, this, "person");
      } else {
        _panel.addInspect(-150.0D, 150.0D, this, "person");
      }
      return true;
    }
    return false;
  }
  
  @AnyLogicInternalCodegenAPI
  private boolean onClickModelAt_AgentLinks_xjal(Panel _panel, double _x, double _y, int _clickCount, boolean _publicOnly, boolean _isSuperClass) {
    if (modelElementContains(_x, _y, 50.0D, -50.0D)) {
      _panel.addInspect_xjal(50.0D, -50.0D, this, "connections", 2);
      return true;
    }
    return false;
  }
  
  @AnyLogicInternalCodegenAPI
  private boolean onClickModelAt_Parameters_xjal(Panel _panel, double _x, double _y, int _clickCount, boolean _publicOnly, boolean _isSuperClass)
  {
    if ((!_publicOnly) && (modelElementContains(_x, _y, -600.0D, -70.0D))) {
      _panel.addInspect(-600.0D, -70.0D, this, "group_ID_percentOfPopInMajority");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -700.0D, 360.0D))) {
      _panel.addInspect(-700.0D, 360.0D, this, "prior_anthropomorphic_promiscuity_min");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -470.0D, 360.0D))) {
      _panel.addInspect(-470.0D, 360.0D, this, "prior_anthropomorphic_promiscuity_max");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -240.0D, 360.0D))) {
      _panel.addInspect(-240.0D, 360.0D, this, "prior_anthropomorphic_promiscuity_mode");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -700.0D, 440.0D))) {
      _panel.addInspect(-700.0D, 440.0D, this, "sociographic_prudery_min");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -470.0D, 440.0D))) {
      _panel.addInspect(-470.0D, 440.0D, this, "sociographic_prudery_max");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -240.0D, 440.0D))) {
      _panel.addInspect(-240.0D, 440.0D, this, "sociographic_prudery_mode");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -700.0D, 480.0D))) {
      _panel.addInspect(-700.0D, 480.0D, this, "anthropomorphic_promiscuity_min");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -470.0D, 480.0D))) {
      _panel.addInspect(-470.0D, 480.0D, this, "anthropomorphic_promiscuity_max");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -240.0D, 480.0D))) {
      _panel.addInspect(-240.0D, 480.0D, this, "anthropomorphic_promiscuity_mode");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -700.0D, 520.0D))) {
      _panel.addInspect(-700.0D, 520.0D, this, "predation_tolerance_min");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -470.0D, 520.0D))) {
      _panel.addInspect(-470.0D, 520.0D, this, "predation_tolerance_max");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -240.0D, 520.0D))) {
      _panel.addInspect(-240.0D, 520.0D, this, "predation_tolerance_mode");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -700.0D, 560.0D))) {
      _panel.addInspect(-700.0D, 560.0D, this, "natural_tolerance_min");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -470.0D, 560.0D))) {
      _panel.addInspect(-470.0D, 560.0D, this, "natural_tolerance_max");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -240.0D, 560.0D))) {
      _panel.addInspect(-240.0D, 560.0D, this, "natural_tolerance_mode");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -700.0D, 600.0D))) {
      _panel.addInspect(-700.0D, 600.0D, this, "contagion_tolerance_min");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -470.0D, 600.0D))) {
      _panel.addInspect(-470.0D, 600.0D, this, "contagion_tolerance_max");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -240.0D, 600.0D))) {
      _panel.addInspect(-240.0D, 600.0D, this, "contagion_tolerance_mode");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -700.0D, 640.0D))) {
      _panel.addInspect(-700.0D, 640.0D, this, "social_tolerance_min");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -470.0D, 640.0D))) {
      _panel.addInspect(-470.0D, 640.0D, this, "social_tolerance_max");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -240.0D, 640.0D))) {
      _panel.addInspect(-240.0D, 640.0D, this, "social_tolerance_mode");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -700.0D, 680.0D))) {
      _panel.addInspect(-700.0D, 680.0D, this, "contagion_probability_min");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -470.0D, 680.0D))) {
      _panel.addInspect(-470.0D, 680.0D, this, "contagion_probability_max");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -240.0D, 680.0D))) {
      _panel.addInspect(-240.0D, 680.0D, this, "contagion_probability_mode");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -700.0D, 720.0D))) {
      _panel.addInspect(-700.0D, 720.0D, this, "predation_probability_min");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -470.0D, 720.0D))) {
      _panel.addInspect(-470.0D, 720.0D, this, "predation_probability_max");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -240.0D, 720.0D))) {
      _panel.addInspect(-240.0D, 720.0D, this, "predation_probability_mode");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -700.0D, 760.0D))) {
      _panel.addInspect(-700.0D, 760.0D, this, "social_probability_min");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -470.0D, 760.0D))) {
      _panel.addInspect(-470.0D, 760.0D, this, "social_probability_max");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -240.0D, 760.0D))) {
      _panel.addInspect(-240.0D, 760.0D, this, "social_probability_mode");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -240.0D, 820.0D))) {
      _panel.addInspect(-240.0D, 820.0D, this, "chanceForNaturalHazardToOccur");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -700.0D, 100.0D))) {
      _panel.addInspect(-700.0D, 100.0D, this, "group_distance_anthropomorphic_min");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -450.0D, 100.0D))) {
      _panel.addInspect(-450.0D, 100.0D, this, "group_distance_anthropomorphic_max");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -700.0D, 400.0D))) {
      _panel.addInspect(-700.0D, 400.0D, this, "prior_sociographic_promiscuity_min");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -470.0D, 400.0D))) {
      _panel.addInspect(-470.0D, 400.0D, this, "prior_sociographic_promiscuity_max");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -240.0D, 400.0D))) {
      _panel.addInspect(-240.0D, 400.0D, this, "prior_sociographic_promiscuity_mode");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -700.0D, 150.0D))) {
      _panel.addInspect(-700.0D, 150.0D, this, "group_distance_sociographic_min");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -450.0D, 150.0D))) {
      _panel.addInspect(-450.0D, 150.0D, this, "group_distance_sociographic_max");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -700.0D, 200.0D))) {
      _panel.addInspect(-700.0D, 200.0D, this, "group_distance_contagionHazard_min");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -450.0D, 200.0D))) {
      _panel.addInspect(-450.0D, 200.0D, this, "group_distance_contagionHazard_max");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -700.0D, 250.0D))) {
      _panel.addInspect(-700.0D, 250.0D, this, "group_distance_socialHazard_min");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -450.0D, 250.0D))) {
      _panel.addInspect(-450.0D, 250.0D, this, "group_distance_socialHazard_max");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -770.0D, -60.0D))) {
      _panel.addInspect(-770.0D, -60.0D, this, "beta_coeff");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -770.0D, -80.0D))) {
      _panel.addInspect(-770.0D, -80.0D, this, "prob_link_reassignment");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -600.0D, -150.0D))) {
      _panel.addInspect(-600.0D, -150.0D, this, "pop");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -600.0D, -130.0D))) {
      _panel.addInspect(-600.0D, -130.0D, this, "seed");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -290.0D, -260.0D))) {
      _panel.addInspect(-290.0D, -260.0D, this, "length_of_memory");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -290.0D, -290.0D))) {
      _panel.addInspect(-290.0D, -290.0D, this, "num_beliefs");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -290.0D, -320.0D))) {
      _panel.addInspect(-290.0D, -320.0D, this, "cultural_dissonance");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -290.0D, -230.0D))) {
      _panel.addInspect(-290.0D, -230.0D, this, "extinction_rate");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -200.0D, -200.0D))) {
      _panel.addInspect(-200.0D, -200.0D, this, "weight_second_order_connection");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -200.0D, -170.0D))) {
      _panel.addInspect(-200.0D, -170.0D, this, "weight_third_order_connection");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -290.0D, -350.0D))) {
      _panel.addInspect(-290.0D, -350.0D, this, "threshold");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -290.0D, -380.0D))) {
      _panel.addInspect(-290.0D, -380.0D, this, "vision");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -350.0D, 1680.0D))) {
      _panel.addInspect(-350.0D, 1680.0D, this, "Violence_Counter_Update_Interval");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -580.0D, 2000.0D))) {
      _panel.addInspect(-580.0D, 2000.0D, this, "Affect_Counter_Update_Interval");
      return true;
    }
    return false;
  }
  
  @AnyLogicInternalCodegenAPI
  private boolean onClickModelAt_PlainVariables_xjal(Panel _panel, double _x, double _y, int _clickCount, boolean _publicOnly, boolean _isSuperClass) {
    if ((!_publicOnly) && (modelElementContains(_x, _y, -320.0D, 1220.0D))) {
      _panel.addInspect(-320.0D, 1220.0D, this, "Total_Group_1_Sociographic_Prudery");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -320.0D, 1170.0D))) {
      _panel.addInspect(-320.0D, 1170.0D, this, "Total_Group_2_Anthropomorphic_Promiscuity");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -320.0D, 1120.0D))) {
      _panel.addInspect(-320.0D, 1120.0D, this, "Total_Group_1_Anthropomorphic_Promiscuity");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -320.0D, 1270.0D))) {
      _panel.addInspect(-320.0D, 1270.0D, this, "Total_Group_2_Sociographic_Prudery");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -240.0D, 860.0D))) {
      _panel.addInspect(-240.0D, 860.0D, this, "Natural_Hazard_Present");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -350.0D, 1000.0D))) {
      _panel.addInspect(-350.0D, 1000.0D, this, "Max_Group_Size_in_Ritual");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -180.0D, 250.0D))) {
      _panel.addInspect(-180.0D, 250.0D, this, "csv_PopulationLevel");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -180.0D, 310.0D))) {
      _panel.addInspect(-180.0D, 310.0D, this, "csv_IndividualLevel");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -350.0D, 1050.0D))) {
      _panel.addInspect(-350.0D, 1050.0D, this, "Total_Number_of_Groups");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -600.0D, -40.0D))) {
      _panel.addInspect(-600.0D, -40.0D, this, "pop_group_1");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -600.0D, -20.0D))) {
      _panel.addInspect(-600.0D, -20.0D, this, "pop_group_2");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -650.0D, -260.0D))) {
      _panel.addInspect(-650.0D, -260.0D, this, "social_network_1");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -650.0D, -240.0D))) {
      _panel.addInspect(-650.0D, -240.0D, this, "social_network_2");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -500.0D, -500.0D))) {
      _panel.addInspect(-500.0D, -500.0D, this, "group_1_values");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -500.0D, -450.0D))) {
      _panel.addInspect(-500.0D, -450.0D, this, "group_2_values");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -1400.0D, 1450.0D))) {
      _panel.addInspect(-1400.0D, 1450.0D, this, "Number_of_Consecutive_Increases_Maximum");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -1400.0D, 1500.0D))) {
      _panel.addInspect(-1400.0D, 1500.0D, this, "Number_of_Consecutive_Increases_Second_Highest");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -1400.0D, 1550.0D))) {
      _panel.addInspect(-1400.0D, 1550.0D, this, "Number_of_Consecutive_Increases_Current");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -1010.0D, 1820.0D))) {
      _panel.addInspect(-1010.0D, 1820.0D, this, "Number_of_Consecutive_Affect_Increases_Maximum");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -1010.0D, 1870.0D))) {
      _panel.addInspect(-1010.0D, 1870.0D, this, "Number_of_Consecutive_Affect_Increases_Second_Highest");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -1010.0D, 1920.0D))) {
      _panel.addInspect(-1010.0D, 1920.0D, this, "Number_of_Consecutive_Affect_Increases_Current");
      return true;
    }
    return false;
  }
  
  @AnyLogicInternalCodegenAPI
  private boolean onClickModelAt_CollectionVariables_xjal(Panel _panel, double _x, double _y, int _clickCount, boolean _publicOnly, boolean _isSuperClass) {
    if ((!_publicOnly) && (modelElementContains(_x, _y, -370.0D, -140.0D))) {
      _panel.addInspect(-370.0D, -140.0D, this, "collection_Group_ID_1");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -370.0D, -90.0D))) {
      _panel.addInspect(-370.0D, -90.0D, this, "collection_Group_ID_2");
      return true;
    }
    return false;
  }
  
  @AnyLogicInternalCodegenAPI
  private boolean onClickModelAt_Events_xjal(Panel _panel, double _x, double _y, int _clickCount, boolean _publicOnly, boolean _isSuperClass) {
    if ((!_publicOnly) && (modelElementContains(_x, _y, -240.0D, 910.0D))) {
      _panel.addInspect(-240.0D, 910.0D, this, "HazardIncrease_Natural");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, 70.0D, 900.0D))) {
      _panel.addInspect(70.0D, 900.0D, this, "get_HistogramData_Anthropomorphic");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, 470.0D, 940.0D))) {
      _panel.addInspect(470.0D, 940.0D, this, "get_HistogramData_SociographicPrudery");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, 50.0D, 1190.0D))) {
      _panel.addInspect(50.0D, 1190.0D, this, "event_Update_Group_SP_AP");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -350.0D, -50.0D))) {
      _panel.addInspect(-350.0D, -50.0D, this, "collect_Group_IDs");
      return true;
    }
    return false;
  }
  
  @AnyLogicInternalCodegenAPI
  private boolean onClickModelAt_DataElements_xjal(Panel _panel, double _x, double _y, int _clickCount, boolean _publicOnly, boolean _isSuperClass) {
    if ((!_publicOnly) && (modelElementContains(_x, _y, 50.0D, 820.0D))) {
      _panel.addInspect(50.0D, 820.0D, this, "Anthropomorphic_HistogramData");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, 450.0D, 850.0D))) {
      _panel.addInspect(450.0D, 850.0D, this, "SociographicPrudery_Hdata");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, 50.0D, 1150.0D))) {
      _panel.addInspect(50.0D, 1150.0D, this, "DS_SP_Group_1");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, 50.0D, 1120.0D))) {
      _panel.addInspect(50.0D, 1120.0D, this, "DS_SP_Group_2");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, 220.0D, 1120.0D))) {
      _panel.addInspect(220.0D, 1120.0D, this, "DS_AP_Group_2");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, 220.0D, 1150.0D))) {
      _panel.addInspect(220.0D, 1150.0D, this, "DS_AP_Group_1");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, 850.0D, 850.0D))) {
      _panel.addInspect(850.0D, 850.0D, this, "AnthropomorphicPromiscuity_Hdata");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -320.0D, 1530.0D))) {
      _panel.addInspect(-320.0D, 1530.0D, this, "DS_Avg_Violence_Over_Population");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -320.0D, 1370.0D))) {
      _panel.addInspect(-320.0D, 1370.0D, this, "DS_Avg_Religiosity_Over_Population");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -670.0D, 1530.0D))) {
      _panel.addInspect(-670.0D, 1530.0D, this, "DS_Avg_Violence_Over_Group_1");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -670.0D, 1370.0D))) {
      _panel.addInspect(-670.0D, 1370.0D, this, "DS_Avg_Religiosity_Over_Group_1");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -1020.0D, 1530.0D))) {
      _panel.addInspect(-1020.0D, 1530.0D, this, "DS_Avg_Violence_Over_Group_2");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -1020.0D, 1370.0D))) {
      _panel.addInspect(-1020.0D, 1370.0D, this, "DS_Avg_Religiosity_Over_Group_2");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -650.0D, 1800.0D))) {
      _panel.addInspect(-650.0D, 1800.0D, this, "DS_Avg_Affect_Length_Over_Population");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -650.0D, 1850.0D))) {
      _panel.addInspect(-650.0D, 1850.0D, this, "DS_Avg_Affect_Length_Over_Group_1");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -650.0D, 1900.0D))) {
      _panel.addInspect(-650.0D, 1900.0D, this, "DS_Avg_Affect_Length_Over_Group_2");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -950.0D, 2100.0D))) {
      _panel.addInspect(-950.0D, 2100.0D, this, "DS_Avg_Current_Affect_Population");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -950.0D, 2150.0D))) {
      _panel.addInspect(-950.0D, 2150.0D, this, "DS_Avg_Current_Affect_Group_1");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -950.0D, 2200.0D))) {
      _panel.addInspect(-950.0D, 2200.0D, this, "DS_Avg_Current_Affect_Group_2");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -600.0D, 2100.0D))) {
      _panel.addInspect(-600.0D, 2100.0D, this, "DS_Avg_Current_Affect_Increase_Population");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -600.0D, 2150.0D))) {
      _panel.addInspect(-600.0D, 2150.0D, this, "DS_Avg_Current_Affect_Increase_Group_1");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -600.0D, 2200.0D))) {
      _panel.addInspect(-600.0D, 2200.0D, this, "DS_Avg_Current_Affect_Increase_Group_2");
      return true;
    }
    return false;
  }
  
  @AnyLogicInternalCodegenAPI
  public boolean onClickModelAt(Panel _panel, double _x, double _y, int _clickCount, boolean _publicOnly, boolean _isSuperClass)
  {
    if (onClickModelAt_EmbeddedObjects_xjal(_panel, _x, _y, _clickCount, _publicOnly, _isSuperClass)) return true;
    if (onClickModelAt_AgentLinks_xjal(_panel, _x, _y, _clickCount, _publicOnly, _isSuperClass)) return true;
    if (onClickModelAt_Parameters_xjal(_panel, _x, _y, _clickCount, _publicOnly, _isSuperClass)) return true;
    if (onClickModelAt_PlainVariables_xjal(_panel, _x, _y, _clickCount, _publicOnly, _isSuperClass)) return true;
    if (onClickModelAt_CollectionVariables_xjal(_panel, _x, _y, _clickCount, _publicOnly, _isSuperClass)) return true;
    if (onClickModelAt_Events_xjal(_panel, _x, _y, _clickCount, _publicOnly, _isSuperClass)) return true;
    if (onClickModelAt_DataElements_xjal(_panel, _x, _y, _clickCount, _publicOnly, _isSuperClass)) return true;
    return super.onClickModelAt(_panel, _x, _y, _clickCount, _publicOnly, true);
  }
  




  public Main(com.anylogic.engine.Engine engine, com.anylogic.engine.Agent owner, com.anylogic.engine.AgentList<? extends Main> ownerPopulation)
  {
    super(engine, owner, ownerPopulation);_createPersistentElementsBP0_xjal();
    
































































































































































































































































































    connections = new com.anylogic.engine.LinkToAgentStandardImpl(this, _connections_commonAnimationSettings_xjal);instantiateBaseStructureThis_xjal();
  }
  
  @AnyLogicInternalCodegenAPI
  public void onOwnerChanged_xjal() {
    super.onOwnerChanged_xjal();
    setupReferences_xjal();
  }
  
  @AnyLogicInternalCodegenAPI
  public void instantiateBaseStructure_xjal() {
    super.instantiateBaseStructure_xjal();
    instantiateBaseStructureThis_xjal();
  }
  
  @AnyLogicInternalCodegenAPI
  private void instantiateBaseStructureThis_xjal() {
    setupReferences_xjal();
  }
  
  public Main(double group_ID_percentOfPopInMajority, double prior_anthropomorphic_promiscuity_min, double prior_anthropomorphic_promiscuity_max, double prior_anthropomorphic_promiscuity_mode, double sociographic_prudery_min, double sociographic_prudery_max, double sociographic_prudery_mode, double anthropomorphic_promiscuity_min, double anthropomorphic_promiscuity_max, double anthropomorphic_promiscuity_mode, double predation_tolerance_min, double predation_tolerance_max, double predation_tolerance_mode, double natural_tolerance_min, double natural_tolerance_max, double natural_tolerance_mode, double contagion_tolerance_min, double contagion_tolerance_max, double contagion_tolerance_mode, double social_tolerance_min, double social_tolerance_max, double social_tolerance_mode, double contagion_probability_min, double contagion_probability_max, double contagion_probability_mode, double predation_probability_min, double predation_probability_max, double predation_probability_mode, double social_probability_min, double social_probability_max, double social_probability_mode, double chanceForNaturalHazardToOccur, double group_distance_anthropomorphic_min, double group_distance_anthropomorphic_max, double prior_sociographic_promiscuity_min, double prior_sociographic_promiscuity_max, double prior_sociographic_promiscuity_mode, double group_distance_sociographic_min, double group_distance_sociographic_max, double group_distance_contagionHazard_min, double group_distance_contagionHazard_max, double group_distance_socialHazard_min, double group_distance_socialHazard_max, double beta_coeff, double prob_link_reassignment, int pop, long seed, int length_of_memory, double num_beliefs, double cultural_dissonance, double extinction_rate, double weight_second_order_connection, double weight_third_order_connection, double threshold, double vision, int Violence_Counter_Update_Interval, int Affect_Counter_Update_Interval)
  {
    _createPersistentElementsBP0_xjal();
    





























































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































    connections = new com.anylogic.engine.LinkToAgentStandardImpl(this, _connections_commonAnimationSettings_xjal);markParametersAreSet();this.group_ID_percentOfPopInMajority = group_ID_percentOfPopInMajority;this.prior_anthropomorphic_promiscuity_min = prior_anthropomorphic_promiscuity_min;this.prior_anthropomorphic_promiscuity_max = prior_anthropomorphic_promiscuity_max;this.prior_anthropomorphic_promiscuity_mode = prior_anthropomorphic_promiscuity_mode;this.sociographic_prudery_min = sociographic_prudery_min;this.sociographic_prudery_max = sociographic_prudery_max;this.sociographic_prudery_mode = sociographic_prudery_mode;this.anthropomorphic_promiscuity_min = anthropomorphic_promiscuity_min;this.anthropomorphic_promiscuity_max = anthropomorphic_promiscuity_max;this.anthropomorphic_promiscuity_mode = anthropomorphic_promiscuity_mode;this.predation_tolerance_min = predation_tolerance_min;this.predation_tolerance_max = predation_tolerance_max;this.predation_tolerance_mode = predation_tolerance_mode;this.natural_tolerance_min = natural_tolerance_min;this.natural_tolerance_max = natural_tolerance_max;this.natural_tolerance_mode = natural_tolerance_mode;this.contagion_tolerance_min = contagion_tolerance_min;this.contagion_tolerance_max = contagion_tolerance_max;this.contagion_tolerance_mode = contagion_tolerance_mode;this.social_tolerance_min = social_tolerance_min;this.social_tolerance_max = social_tolerance_max;this.social_tolerance_mode = social_tolerance_mode;this.contagion_probability_min = contagion_probability_min;this.contagion_probability_max = contagion_probability_max;this.contagion_probability_mode = contagion_probability_mode;this.predation_probability_min = predation_probability_min;this.predation_probability_max = predation_probability_max;this.predation_probability_mode = predation_probability_mode;this.social_probability_min = social_probability_min;this.social_probability_max = social_probability_max;this.social_probability_mode = social_probability_mode;this.chanceForNaturalHazardToOccur = chanceForNaturalHazardToOccur;this.group_distance_anthropomorphic_min = group_distance_anthropomorphic_min;this.group_distance_anthropomorphic_max = group_distance_anthropomorphic_max;this.prior_sociographic_promiscuity_min = prior_sociographic_promiscuity_min;this.prior_sociographic_promiscuity_max = prior_sociographic_promiscuity_max;this.prior_sociographic_promiscuity_mode = prior_sociographic_promiscuity_mode;this.group_distance_sociographic_min = group_distance_sociographic_min;this.group_distance_sociographic_max = group_distance_sociographic_max;this.group_distance_contagionHazard_min = group_distance_contagionHazard_min;this.group_distance_contagionHazard_max = group_distance_contagionHazard_max;this.group_distance_socialHazard_min = group_distance_socialHazard_min;this.group_distance_socialHazard_max = group_distance_socialHazard_max;this.beta_coeff = beta_coeff;this.prob_link_reassignment = prob_link_reassignment;this.pop = pop;this.seed = seed;this.length_of_memory = length_of_memory;this.num_beliefs = num_beliefs;this.cultural_dissonance = cultural_dissonance;this.extinction_rate = extinction_rate;this.weight_second_order_connection = weight_second_order_connection;this.weight_third_order_connection = weight_third_order_connection;this.threshold = threshold;this.vision = vision;this.Violence_Counter_Update_Interval = Violence_Counter_Update_Interval;this.Affect_Counter_Update_Interval = Affect_Counter_Update_Interval;
  }
  



  @AnyLogicInternalCodegenAPI
  private void instantiatePopulations_xjal()
  {
    int _cnt = 
      0;
    
    for (int i = environment.size(); i < _cnt; i++) {
      instantiate_environment_xjal(i);
    }
  }
  

  @AnyLogicInternalCodegenAPI
  public void doCreate()
  {
    super.doCreate();
    
    instantiatePopulations_xjal();
    
    setupPlainVariables_Main_xjal();
    
    _createPersistentElementsAP0_xjal();
    presentation = new com.anylogic.engine.presentation.ShapeTopLevelPresentationGroup(this, true, 0.0D, 0.0D, 0.0D, 0.0D, new Object[] { person_presentation, text, text1, button, chart, chart1, plot, plot1, chart2 });
    
    person_presentation.createShapes();
    
    instantiatePopulations_xjal();
    icon = new com.anylogic.engine.presentation.ShapeModelElementsGroup(this, (com.anylogic.engine.presentation.ModelElementDescriptor[])getElementProperty("merv_1_0_3.Main.icon", "modelElementDescriptors"), new Object[0]);
    icon.setIconOffsets(0.0D, 0.0D);
    

    double _x_xjal = 
      500.0D;
    
    double _y_xjal = 
      500.0D;
    
    double _z_xjal = 
      0.0D;
    
    setupSpace(_x_xjal, _y_xjal, _z_xjal);
    
    disableSteps();
    setNetworkUserDefined();
    setLayoutType(LAYOUT_RANDOM);
    

    environment.setEnvironment(this);
    for (int i = 0; i < environment.size(); i++) {
      setupParameters_environment_xjal((environment)environment.get(i), i);
      create_environment_xjal((environment)environment.get(i), i);
    }
    person.setEnvironment(this);
    for (int i = 0; i < person.size(); i++) {
      setupParameters_person_xjal((Person)person.get(i), i);
      create_person_xjal((Person)person.get(i), i);
    }
    setupInitialConditions_xjal(Main.class);
  }
  
  @AnyLogicInternalCodegenAPI
  public void setupExt_xjal(com.anylogic.engine.AgentExtension _ext)
  {
    if (((_ext instanceof com.anylogic.engine.ExtAgentWithSpatialMetrics)) && ((_ext instanceof com.anylogic.engine.ExtWithSpaceType)))
    {
      double _value = 
        10.0D;
      
      ((com.anylogic.engine.ExtAgentWithSpatialMetrics)_ext).setSpeed(_value, MPS);
    }
  }
  
  @AnyLogicInternalCodegenAPI
  public void doStart()
  {
    super.doStart();
    HazardIncrease_Natural.start();
    get_HistogramData_Anthropomorphic.start();
    get_HistogramData_SociographicPrudery.start();
    event_Update_Group_SP_AP.start();
    collect_Group_IDs.start();
    _Anthropomorphic_HistogramData_autoUpdateEvent_xjal.start();
    _SociographicPrudery_Hdata_autoUpdateEvent_xjal.start();
    _AnthropomorphicPromiscuity_Hdata_autoUpdateEvent_xjal.start();
    _DS_Avg_Violence_Over_Population_autoUpdateEvent_xjal.start();
    _DS_Avg_Religiosity_Over_Population_autoUpdateEvent_xjal.start();
    _DS_Avg_Religiosity_Over_Group_1_autoUpdateEvent_xjal.start();
    _DS_Avg_Religiosity_Over_Group_2_autoUpdateEvent_xjal.start();
    _DS_Avg_Affect_Length_Over_Population_autoUpdateEvent_xjal.start();
    _DS_Avg_Current_Affect_Population_autoUpdateEvent_xjal.start();
    _DS_Avg_Current_Affect_Increase_Population_autoUpdateEvent_xjal.start();
    _chart_autoUpdateEvent_xjal.start();
    _chart1_autoUpdateEvent_xjal.start();
    _plot_autoUpdateEvent_xjal.start();
    _plot1_autoUpdateEvent_xjal.start();
    _chart2_autoUpdateEvent_xjal.start();
    applyLayout();
    for (com.anylogic.engine.Agent embeddedObject : environment) {
      embeddedObject.start();
    }
    for (com.anylogic.engine.Agent embeddedObject : person) {
      embeddedObject.start();
    }
  }
  
  @AnyLogicInternalCodegenAPI
  public void onStartup() {
    super.onStartup();
    
    Generate_Agents();
    Initialize_social_network();
    Generate_social_network();
    
    set_group_1_values();
    set_group_2_values();
    

    start_agents();
  }
  



  @AnyLogicInternalCodegenAPI
  public void setupPlainVariables_xjal()
  {
    setupPlainVariables_Main_xjal();
  }
  



  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_Main_xjal()
  {
    Natural_Hazard_Present = 
      false;
    
    Max_Group_Size_in_Ritual = 
      0;
    
    csv_PopulationLevel = 
      "TMT_ABM_PopulationLevel_ParamVariation_July_06_2016.csv";
    
    csv_IndividualLevel = 
      "Terror Management Theory ABM - Individual Level.csv";
    
    Total_Number_of_Groups = 
      0;
    
    pop_group_1 = 
      ((int)(group_ID_percentOfPopInMajority / 100.0D * pop));
    
    pop_group_2 = 
      (pop - pop_group_1);
    
    social_network_1 = 
      new double[pop_group_1][pop_group_1];
    
    social_network_2 = 
      new double[pop_group_2][pop_group_2];
    
    group_1_values = 
      new double[(int)num_beliefs];
    
    group_2_values = 
      new double[(int)num_beliefs];
    
    Number_of_Consecutive_Increases_Maximum = 
      0;
    
    Number_of_Consecutive_Increases_Second_Highest = 
      0;
    
    Number_of_Consecutive_Increases_Current = 
      0;
    
    Number_of_Consecutive_Affect_Increases_Maximum = 
      0;
    
    Number_of_Consecutive_Affect_Increases_Second_Highest = 
      0;
    
    Number_of_Consecutive_Affect_Increases_Current = 
      0;
  }
  


  @AnyLogicInternalCodegenAPI
  static com.anylogic.engine.LinkToAgentAnimationSettings _connections_commonAnimationSettings_xjal = new com.anylogic.engine.LinkToAgentAnimationSettingsImpl(true, com.anylogic.engine.presentation.UtilitiesColor.black, 1.0D, LINE_STYLE_SOLID, ARROW_THIN, 0.0D);
  public com.anylogic.engine.LinkToAgentCollection<com.anylogic.engine.Agent, com.anylogic.engine.Agent> connections;
  @AnyLogicInternalCodegenAPI
  private static final long serialVersionUID = -6149062923097817770L;
  
  public Main()
  {
    _createPersistentElementsBP0_xjal();
    





























































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































    connections = new com.anylogic.engine.LinkToAgentStandardImpl(this, _connections_commonAnimationSettings_xjal);
  }
  
  public com.anylogic.engine.LinkToAgentCollection<? extends com.anylogic.engine.Agent, ? extends com.anylogic.engine.Agent> getLinkToAgentStandard_xjal() { return connections; }
  

  @AnyLogicInternalCodegenAPI
  public void drawLinksToAgents(boolean _underAgents_xjal, com.anylogic.engine.presentation.LinkToAgentAnimator _animator_xjal)
  {
    super.drawLinksToAgents(_underAgents_xjal, _animator_xjal);
    if (_underAgents_xjal) {
      _animator_xjal.drawLink(this, connections, true, true);
    }
  }
  
  public List<Object> getEmbeddedObjects() {
    List<Object> list = super.getEmbeddedObjects();
    if (list == null) {
      list = new java.util.LinkedList();
    }
    list.add(environment);
    list.add(person);
    return list;
  }
  
  public com.anylogic.engine.AgentList<? extends Main> getPopulation() {
    return super.getPopulation();
  }
  
  public List<? extends Main> agentsInRange(double distance) {
    return super.agentsInRange(distance);
  }
  
  @AnyLogicInternalCodegenAPI
  public boolean isLoggingToDB(com.anylogic.engine.EventOriginator _e)
  {
    if (_e == _Anthropomorphic_HistogramData_autoUpdateEvent_xjal) return false;
    if (_e == _SociographicPrudery_Hdata_autoUpdateEvent_xjal) return false;
    if (_e == _AnthropomorphicPromiscuity_Hdata_autoUpdateEvent_xjal) return false;
    if (_e == _DS_Avg_Violence_Over_Population_autoUpdateEvent_xjal) return false;
    if (_e == _DS_Avg_Religiosity_Over_Population_autoUpdateEvent_xjal) return false;
    if (_e == _DS_Avg_Religiosity_Over_Group_1_autoUpdateEvent_xjal) return false;
    if (_e == _DS_Avg_Religiosity_Over_Group_2_autoUpdateEvent_xjal) return false;
    if (_e == _DS_Avg_Affect_Length_Over_Population_autoUpdateEvent_xjal) return false;
    if (_e == _DS_Avg_Current_Affect_Population_autoUpdateEvent_xjal) return false;
    if (_e == _DS_Avg_Current_Affect_Increase_Population_autoUpdateEvent_xjal) return false;
    if (_e == _chart_autoUpdateEvent_xjal) return false;
    if (_e == _chart1_autoUpdateEvent_xjal) return false;
    if (_e == _plot_autoUpdateEvent_xjal) return false;
    if (_e == _plot1_autoUpdateEvent_xjal) return false;
    if (_e == _chart2_autoUpdateEvent_xjal) return false;
    if (_e == HazardIncrease_Natural) return false;
    if (_e == get_HistogramData_Anthropomorphic) return false;
    if (_e == get_HistogramData_SociographicPrudery) return false;
    if (_e == event_Update_Group_SP_AP) return false;
    if (_e == collect_Group_IDs) return false;
    return super.isLoggingToDB(_e);
  }
  
  @AnyLogicInternalCodegenAPI
  public void onDestroy() {
    HazardIncrease_Natural.onDestroy();
    get_HistogramData_Anthropomorphic.onDestroy();
    get_HistogramData_SociographicPrudery.onDestroy();
    event_Update_Group_SP_AP.onDestroy();
    collect_Group_IDs.onDestroy();
    _Anthropomorphic_HistogramData_autoUpdateEvent_xjal.onDestroy();
    _SociographicPrudery_Hdata_autoUpdateEvent_xjal.onDestroy();
    _AnthropomorphicPromiscuity_Hdata_autoUpdateEvent_xjal.onDestroy();
    _DS_Avg_Violence_Over_Population_autoUpdateEvent_xjal.onDestroy();
    _DS_Avg_Religiosity_Over_Population_autoUpdateEvent_xjal.onDestroy();
    _DS_Avg_Religiosity_Over_Group_1_autoUpdateEvent_xjal.onDestroy();
    _DS_Avg_Religiosity_Over_Group_2_autoUpdateEvent_xjal.onDestroy();
    _DS_Avg_Affect_Length_Over_Population_autoUpdateEvent_xjal.onDestroy();
    _DS_Avg_Current_Affect_Population_autoUpdateEvent_xjal.onDestroy();
    _DS_Avg_Current_Affect_Increase_Population_autoUpdateEvent_xjal.onDestroy();
    _chart_autoUpdateEvent_xjal.onDestroy();
    _chart1_autoUpdateEvent_xjal.onDestroy();
    _plot_autoUpdateEvent_xjal.onDestroy();
    _plot1_autoUpdateEvent_xjal.onDestroy();
    _chart2_autoUpdateEvent_xjal.onDestroy();
    for (com.anylogic.engine.Agent _item : environment) {
      _item.onDestroy();
    }
    for (com.anylogic.engine.Agent _item : person) {
      _item.onDestroy();
    }
    
    Anthropomorphic_HistogramData.destroyUpdater_xjal();
    SociographicPrudery_Hdata.destroyUpdater_xjal();
    DS_SP_Group_1.destroyUpdater_xjal();
    DS_SP_Group_2.destroyUpdater_xjal();
    DS_AP_Group_2.destroyUpdater_xjal();
    DS_AP_Group_1.destroyUpdater_xjal();
    AnthropomorphicPromiscuity_Hdata.destroyUpdater_xjal();
    DS_Avg_Violence_Over_Population.destroyUpdater_xjal();
    DS_Avg_Religiosity_Over_Population.destroyUpdater_xjal();
    DS_Avg_Violence_Over_Group_1.destroyUpdater_xjal();
    DS_Avg_Religiosity_Over_Group_1.destroyUpdater_xjal();
    DS_Avg_Violence_Over_Group_2.destroyUpdater_xjal();
    DS_Avg_Religiosity_Over_Group_2.destroyUpdater_xjal();
    DS_Avg_Affect_Length_Over_Population.destroyUpdater_xjal();
    DS_Avg_Affect_Length_Over_Group_1.destroyUpdater_xjal();
    DS_Avg_Affect_Length_Over_Group_2.destroyUpdater_xjal();
    DS_Avg_Current_Affect_Population.destroyUpdater_xjal();
    DS_Avg_Current_Affect_Group_1.destroyUpdater_xjal();
    DS_Avg_Current_Affect_Group_2.destroyUpdater_xjal();
    DS_Avg_Current_Affect_Increase_Population.destroyUpdater_xjal();
    DS_Avg_Current_Affect_Increase_Group_1.destroyUpdater_xjal();
    DS_Avg_Current_Affect_Increase_Group_2.destroyUpdater_xjal();
    logToDB(Anthropomorphic_HistogramData, "Anthropomorphic_HistogramData");
    logToDB(DS_Avg_Violence_Over_Population, "DS_Avg_Violence_Over_Population");
    logToDB(DS_Avg_Religiosity_Over_Population, "DS_Avg_Religiosity_Over_Population");
    logToDB(DS_Avg_Violence_Over_Group_1, "DS_Avg_Violence_Over_Group_1");
    logToDB(DS_Avg_Religiosity_Over_Group_1, "DS_Avg_Religiosity_Over_Group_1");
    logToDB(DS_Avg_Violence_Over_Group_2, "DS_Avg_Violence_Over_Group_2");
    logToDB(DS_Avg_Religiosity_Over_Group_2, "DS_Avg_Religiosity_Over_Group_2");
    logToDB(DS_Avg_Affect_Length_Over_Population, "DS_Avg_Affect_Length_Over_Population");
    logToDB(DS_Avg_Affect_Length_Over_Group_1, "DS_Avg_Affect_Length_Over_Group_1");
    logToDB(DS_Avg_Affect_Length_Over_Group_2, "DS_Avg_Affect_Length_Over_Group_2");
    logToDB(DS_Avg_Current_Affect_Population, "DS_Avg_Current_Affect_Population");
    logToDB(DS_Avg_Current_Affect_Group_1, "DS_Avg_Current_Affect_Group_1");
    logToDB(DS_Avg_Current_Affect_Group_2, "DS_Avg_Current_Affect_Group_2");
    logToDB(DS_Avg_Current_Affect_Increase_Population, "DS_Avg_Current_Affect_Increase_Population");
    logToDB(DS_Avg_Current_Affect_Increase_Group_1, "DS_Avg_Current_Affect_Increase_Group_1");
    logToDB(DS_Avg_Current_Affect_Increase_Group_2, "DS_Avg_Current_Affect_Increase_Group_2");
    super.onDestroy();
  }
  
  @AnyLogicInternalCodegenAPI
  public void doFinish()
  {
    super.doFinish();
    for (com.anylogic.engine.Agent _item : environment) {
      _item.doFinish();
    }
    for (com.anylogic.engine.Agent _item : person) {
      _item.doFinish();
    }
  }
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_group_ID_percentOfPopInMajority_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_prior_anthropomorphic_promiscuity_min_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_prior_anthropomorphic_promiscuity_max_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_prior_anthropomorphic_promiscuity_mode_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_sociographic_prudery_min_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_sociographic_prudery_max_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_sociographic_prudery_mode_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_anthropomorphic_promiscuity_min_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_anthropomorphic_promiscuity_max_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_anthropomorphic_promiscuity_mode_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_predation_tolerance_min_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_predation_tolerance_max_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_predation_tolerance_mode_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_natural_tolerance_min_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_natural_tolerance_max_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_natural_tolerance_mode_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_contagion_tolerance_min_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_contagion_tolerance_max_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_contagion_tolerance_mode_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_social_tolerance_min_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_social_tolerance_max_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_social_tolerance_mode_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_contagion_probability_min_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_contagion_probability_max_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_contagion_probability_mode_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_predation_probability_min_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_predation_probability_max_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_predation_probability_mode_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_social_probability_min_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_social_probability_max_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_social_probability_mode_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_chanceForNaturalHazardToOccur_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_group_distance_anthropomorphic_min_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_group_distance_anthropomorphic_max_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_prior_sociographic_promiscuity_min_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_prior_sociographic_promiscuity_max_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_prior_sociographic_promiscuity_mode_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_group_distance_sociographic_min_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_group_distance_sociographic_max_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_group_distance_contagionHazard_min_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_group_distance_contagionHazard_max_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_group_distance_socialHazard_min_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_group_distance_socialHazard_max_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_beta_coeff_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_prob_link_reassignment_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_pop_xjal(int oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_seed_xjal(long oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_length_of_memory_xjal(int oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_num_beliefs_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_cultural_dissonance_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_extinction_rate_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_weight_second_order_connection_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_weight_third_order_connection_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_threshold_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_vision_xjal(double oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_Violence_Counter_Update_Interval_xjal(int oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_Affect_Counter_Update_Interval_xjal(int oldValue) {}
  
  private void setupParameters_environment_xjal(environment self, int index, com.anylogic.engine.database.TableInput _t) {}
  
  private void setupParameters_person_xjal(Person self, int index, com.anylogic.engine.database.TableInput _t) {}
  
  @AnyLogicInternalCodegenAPI
  private void setupReferences_xjal() {}
}
