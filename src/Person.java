package merv_1_0_3;

import com.anylogic.engine.Agent;
import com.anylogic.engine.Agent.TransitionIcon;
import com.anylogic.engine.AgentExtension;
import com.anylogic.engine.AgentList;
import com.anylogic.engine.AnyLogicCustomProposalPriority;
import com.anylogic.engine.AnyLogicCustomProposalPriority.Type;
import com.anylogic.engine.AnyLogicCustomSerialization;
import com.anylogic.engine.AnyLogicCustomSerializationMode;
import com.anylogic.engine.AnyLogicInternalCodegenAPI;
import com.anylogic.engine.Engine;
import com.anylogic.engine.EventOriginator;
import com.anylogic.engine.EventTimeout;
import com.anylogic.engine.EventTimeout.Mode;
import com.anylogic.engine.ExtAgentContinuous;
import com.anylogic.engine.ExtAgentWithSpatialMetrics;
import com.anylogic.engine.ExtWithSpaceType;
import com.anylogic.engine.LinkToAgentAnimationSettings;
import com.anylogic.engine.LinkToAgentAnimationSettingsImpl;
import com.anylogic.engine.LinkToAgentCollection;
import com.anylogic.engine.LinkToAgentCollectionImpl;
import com.anylogic.engine.LinkToAgentStandardImpl;
import com.anylogic.engine.Scale;
import com.anylogic.engine.Statechart;
import com.anylogic.engine.Transition;
import com.anylogic.engine.TransitionMessage;
import com.anylogic.engine.TransitionTimeout;
import com.anylogic.engine.analysis.Chart;
import com.anylogic.engine.analysis.Chart2DPlot.Appearance;
import com.anylogic.engine.analysis.DataSet;
import com.anylogic.engine.analysis.Plot;
import com.anylogic.engine.elements.IElementDescriptor;
import com.anylogic.engine.presentation.LinkToAgentAnimator;
import com.anylogic.engine.presentation.ModelElementDescriptor;
import com.anylogic.engine.presentation.Panel;
import com.anylogic.engine.presentation.ShapeCurve;
import com.anylogic.engine.presentation.ShapeGroup;
import com.anylogic.engine.presentation.ShapeModelElementsGroup;
import com.anylogic.engine.presentation.ShapeText;
import com.anylogic.engine.presentation.ShapeTopLevelPresentationGroup;
import com.anylogic.engine.presentation.UtilitiesColor;
import com.anylogic.engine.presentation.ViewArea;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

































































































public class Person
  extends Agent
{
  public double predation_tolerance;
  public double natural_tolerance;
  public double contagion_tolerance;
  public double social_tolerance;
  public double anthropomorphic_promiscuity;
  public double sociographic_prudery;
  public int group_ID;
  public double contagion_probability;
  public double social_probability;
  public double prior_anthropomorphic_promiscuity;
  public double group_distance_anthropomorphic;
  public double prior_sociographic_prudery;
  public double contagionH_distance;
  public double socialH_distance;
  public double group_distance_sociographic;
  public double Largest_Group_Size_for_Ritual;
  public double my_extinction_rate;
  public boolean Available;
  public int Number_of_Rituals;
  public double[] my_links;
  public double affect;
  public ArrayList<Double> memory;
  public double disposition;
  public double probability;
  public double lambda;
  public double delta;
  public double learning_rate;
  public double[] my_affect_matrix;
  public double[] my_values;
  public double my_threshold;
  public boolean in_ritual;
  public int violence_counter;
  public double affect_previous;
  public int net_affect_increase_length;
  public int net_affect_increase_length_max;
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors(Person.class);
  


  @AnyLogicInternalCodegenAPI
  public Map<String, IElementDescriptor> getElementDesciptors() { return elementDesciptors_xjal; }
  
  @AnyLogicCustomProposalPriority(type=AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final Scale scale = new Scale(10.0D);
  
  public Scale getScale()
  {
    return scale;
  }
  



  public EventTimeout event = new EventTimeout(this);
  @AnyLogicInternalCodegenAPI
  public EventTimeout _plot_autoUpdateEvent_xjal = new EventTimeout(this);
  @AnyLogicInternalCodegenAPI
  public EventTimeout _plot1_autoUpdateEvent_xjal = new EventTimeout(this);
  
  @AnyLogicInternalCodegenAPI
  public String getNameOf(EventTimeout _e)
  {
    if (_e == event) return "event";
    if (_e == _plot_autoUpdateEvent_xjal) return "plot auto update event";
    if (_e == _plot1_autoUpdateEvent_xjal) return "plot1 auto update event";
    return super.getNameOf(_e);
  }
  
  @AnyLogicInternalCodegenAPI
  public EventTimeout.Mode getModeOf(EventTimeout _e)
  {
    if (_e == event) return EVENT_TIMEOUT_MODE_CYCLIC;
    if (_e == _plot_autoUpdateEvent_xjal) return EVENT_TIMEOUT_MODE_CYCLIC;
    if (_e == _plot1_autoUpdateEvent_xjal) return EVENT_TIMEOUT_MODE_CYCLIC;
    return super.getModeOf(_e);
  }
  

  @AnyLogicInternalCodegenAPI
  public double getFirstOccurrenceTime(EventTimeout _e)
  {
    if (_e == event) {
      double _t = 
        1.0D;
      
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
    return super.getFirstOccurrenceTime(_e);
  }
  

  @AnyLogicInternalCodegenAPI
  public double evaluateTimeoutOf(EventTimeout _e)
  {
    if (_e == event) {
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
    return super.evaluateTimeoutOf(_e);
  }
  
  @AnyLogicInternalCodegenAPI
  public void executeActionOf(EventTimeout _e)
  {
    if (_e == event) {
      EventTimeout self = _e;
      
      if (affect >= affect_previous) {
        net_affect_increase_length += 1;
        if (net_affect_increase_length > net_affect_increase_length_max) {
          net_affect_increase_length_max = net_affect_increase_length;
        }
      }
      else {
        net_affect_increase_length = 0;
      }
      




      affect_previous = affect;
      
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
    super.executeActionOf(_e);
  }
  




  public Statechart<Person.statechart_state> statechart = new Statechart(this, (short)3);
  
  @AnyLogicInternalCodegenAPI
  public String getNameOf(Statechart _s)
  {
    if (_s == statechart) return "statechart";
    return super.getNameOf(_s);
  }
  
  @AnyLogicInternalCodegenAPI
  public void executeActionOf(Statechart _s)
  {
    if (_s == statechart) {
      enterState(Initialization, true);
      return;
    }
    super.executeActionOf(_s);
  }
  




























































































































  @AnyLogicCustomProposalPriority(type=AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final Person.statechart_state Initialization = Person.statechart_state.Initialization;
  @AnyLogicCustomProposalPriority(type=AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final Person.statechart_state set_group_links = Person.statechart_state.set_group_links;
  @AnyLogicCustomProposalPriority(type=AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final Person.statechart_state Regular_Ritual_Engagement = Person.statechart_state.Regular_Ritual_Engagement;
  @AnyLogicCustomProposalPriority(type=AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final Person.statechart_state Assessment = Person.statechart_state.Assessment;
  @AnyLogicCustomProposalPriority(type=AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final Person.statechart_state Predation_Check = Person.statechart_state.Predation_Check;
  @AnyLogicCustomProposalPriority(type=AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final Person.statechart_state Natural_Check = Person.statechart_state.Natural_Check;
  @AnyLogicCustomProposalPriority(type=AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final Person.statechart_state Contagion_Check = Person.statechart_state.Contagion_Check;
  @AnyLogicCustomProposalPriority(type=AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final Person.statechart_state Social_Check = Person.statechart_state.Social_Check;
  @AnyLogicCustomProposalPriority(type=AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final Person.statechart_state Move = Person.statechart_state.Move;
  @AnyLogicCustomProposalPriority(type=AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final Person.statechart_state Enhanced_Ritual_Engagement = Person.statechart_state.Enhanced_Ritual_Engagement;
  @AnyLogicCustomProposalPriority(type=AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final Person.statechart_state Hyper_Vigilance = Person.statechart_state.Hyper_Vigilance;
  @AnyLogicCustomProposalPriority(type=AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final Person.statechart_state Scan = Person.statechart_state.Scan;
  @AnyLogicCustomProposalPriority(type=AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final Person.statechart_state Calmed_Period = Person.statechart_state.Calmed_Period;
  @AnyLogicCustomProposalPriority(type=AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final Person.statechart_state continue_enh_rit_engagement = Person.statechart_state.continue_enh_rit_engagement;
  @AnyLogicCustomProposalPriority(type=AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final Person.statechart_state branch = Person.statechart_state.branch;
  @AnyLogicCustomProposalPriority(type=AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final Person.statechart_state branch2 = Person.statechart_state.branch2;
  
  @AnyLogicInternalCodegenAPI
  private void enterState(Person.statechart_state _state, boolean _destination)
  {
    switch (_state) {
    case Assessment: 
      logToDBEnterState(statechart, _state);
      
      statechart.setActiveState_xjal(Initialization);
      


      set_prior_anthropomorphic_promiscuity();
      set_prior_sociographic_prudery();
      
      set_sociographic_prudery();
      set_anthropomorphic_promiscuity();
      set_predation_tolerance();
      set_natural_tolerance();
      set_contagion_tolerance();
      set_social_tolerance();
      
      set_contagion_probability();
      set_social_probability();
      


      set_contagionH_distance();
      set_socialH_distance();
      



      transition.start();
      return;
    case Calmed_Period: 
      logToDBEnterState(statechart, _state);
      
      statechart.setActiveState_xjal(set_group_links);
      

      set_my_affect_matrix();
      set_my_values();
      set_my_threshold();
      set_my_extinction_rate();
      
      set_link_list();
      
      statechart.fireEvent("Regular_Ritual_Engagement");
      
      transition15.start();
      return;
    case Contagion_Check: 
      logToDBEnterState(statechart, _state);
      
      statechart.setActiveState_xjal(Regular_Ritual_Engagement);
      
      Available = true;
      
      transition4.start();
      return;
    case Enhanced_Ritual_Engagement: 
      logToDBEnterState(statechart, _state);
      
      if (_destination) {
        enterState(Predation_Check, true);
      }
      return;
    case Hyper_Vigilance: 
      logToDBEnterState(statechart, _state);
      
      statechart.setActiveState_xjal(Predation_Check);
      
      double chanceToMeetPredator = uniform(0.0D, 100.0D);
      
      if (in_ritual) {
        statechart.fireEvent("join_ritual");
      }
      else {
        if (chanceToMeetPredator >= predation_tolerance)
        {

          update_affect_increase();
        }
        else
        {
          update_affect_decrease();
        }
        
        if (get_MainNatural_Hazard_Present)
        {
          statechart.fireEvent("natural_check");
        }
        else {
          statechart.fireEvent("contagion_check");
        }
      }
      
      transition12.start();
      transition18.start();
      transition2.start();
      return;
    case Initialization: 
      logToDBEnterState(statechart, _state);
      
      statechart.setActiveState_xjal(Natural_Check);
      
      double chanceToMeetNatural = uniform(0.0D, 100.0D);
      
      if (chanceToMeetNatural >= natural_tolerance)
      {

        update_affect_increase();
      }
      else
      {
        update_affect_decrease();
      }
      
      statechart.fireEvent("contagion_check");
      
      transition14.start();
      return;
    case Move: 
      logToDBEnterState(statechart, _state);
      
      statechart.setActiveState_xjal(Contagion_Check);
      

      boolean a_increase = false;
      
      if (group_ID == 1) {
        for (int i = 0; i < get_Maincollection_Group_ID_2.size(); i++) {
          if ((distanceTo((Agent)get_Maincollection_Group_ID_2.get(i)) < contagionH_distance) && 
            (contagion_tolerance <= get_Maincollection_Group_ID_2.get(i)).contagion_probability))
          {

            update_affect_increase();
            a_increase = true;
          }
          
        }
        
      } else {
        for (int i = 0; i < get_Maincollection_Group_ID_1.size(); i++) {
          if ((distanceTo((Agent)get_Maincollection_Group_ID_1.get(i)) < contagionH_distance) && 
            (contagion_tolerance <= get_Maincollection_Group_ID_1.get(i)).contagion_probability))
          {

            update_affect_increase();
            a_increase = true;
          }
        }
      }
      

      if (!a_increase) {
        update_affect_decrease();
      }
      
      statechart.fireEvent("social_check");
      
      transition13.start();
      return;
    case Natural_Check: 
      logToDBEnterState(statechart, _state);
      
      statechart.setActiveState_xjal(Social_Check);
      

      boolean a_increase = false;
      
      if (group_ID == 1) {
        for (int i = 0; i < get_Maincollection_Group_ID_2.size(); i++) {
          if ((distanceTo((Agent)get_Maincollection_Group_ID_2.get(i)) < socialH_distance) && 
            (social_tolerance <= get_Maincollection_Group_ID_2.get(i)).social_probability))
          {

            update_affect_increase();
            a_increase = true;
          }
          
        }
        
      } else {
        for (int i = 0; i < get_Maincollection_Group_ID_1.size(); i++) {
          if ((distanceTo((Agent)get_Maincollection_Group_ID_1.get(i)) < socialH_distance) && 
            (social_tolerance <= get_Maincollection_Group_ID_1.get(i)).social_probability))
          {

            update_affect_increase();
            a_increase = true;
          }
        }
      }
      

      if (!a_increase) {
        update_affect_decrease();
      }
      
      update_probability_and_memory();
      


      Links_Neighbors.disconnectFromAll();
      
      if (group_ID == 1) {
        for (int i = 0; i < get_Maincollection_Group_ID_1.size(); i++) {
          if ((get_Maincollection_Group_ID_1.get(i) != this) && 
            (distanceTo((Agent)get_Maincollection_Group_ID_1.get(i)) <= get_Mainvision))
          {
            if (get_Maincollection_Group_ID_1.get(i)).Available) {
              Links_Neighbors.connectTo((Person)get_Maincollection_Group_ID_1.get(i));
            }
          }
        }
        
        for (int i = 0; i < get_Maincollection_Group_ID_2.size(); i++) {
          if (distanceTo((Agent)get_Maincollection_Group_ID_2.get(i)) <= get_Mainvision)
          {
            if (get_Maincollection_Group_ID_2.get(i)).Available) {
              Links_Neighbors.connectTo((Person)get_Maincollection_Group_ID_2.get(i));
            }
          }
        }
      }
      else {
        for (int i = 0; i < get_Maincollection_Group_ID_2.size(); i++) {
          if ((get_Maincollection_Group_ID_2.get(i) != this) && 
            (distanceTo((Agent)get_Maincollection_Group_ID_2.get(i)) <= get_Mainvision))
          {
            if (get_Maincollection_Group_ID_2.get(i)).Available) {
              Links_Neighbors.connectTo((Person)get_Maincollection_Group_ID_2.get(i));
            }
          }
        }
        
        for (int i = 0; i < get_Maincollection_Group_ID_1.size(); i++) {
          if (distanceTo((Agent)get_Maincollection_Group_ID_1.get(i)) <= get_Mainvision)
          {
            if (get_Maincollection_Group_ID_1.get(i)).Available) {
              Links_Neighbors.connectTo((Person)get_Maincollection_Group_ID_1.get(i));
            }
          }
        }
      }
      
      if (Links_Neighbors.size() > 0) {
        Person random_Neighbor = (Person)Links_Neighbors.getRandomConnectedAgent();
        if (group_ID == 1) {
          if (group_ID == 1) {
            belief_affect_decrease(random_Neighbor);
          }
          else {
            belief_affect_increase(random_Neighbor);
          }
        }
        else if (group_ID == 2) {
          if (group_ID == 1) {
            belief_affect_increase(random_Neighbor);
          }
          else {
            belief_affect_decrease(random_Neighbor);
          }
        }
      }
      
      statechart.fireEvent("leave_assessment");
      
      transition10.start();
      return;
    case Predation_Check: 
      logToDBEnterState(statechart, _state);
      
      statechart.setActiveState_xjal(Move);
      
      double currentX = getX();
      double currentY = getY();
      double targetX = 0.0D;
      double targetY = 0.0D;
      
      targetX = Math.max(0.0D, Math.min(currentX + uniform(-15.0D, 15.0D), 500.0D));
      targetY = Math.max(0.0D, Math.min(currentY + uniform(-15.0D, 15.0D), 500.0D));
      
      jumpTo(targetX, targetY);
      
      if (in_ritual) {
        statechart.fireEvent("join_ritual");
      }
      

      transition16.start();
      transition20.start();
      return;
    case Regular_Ritual_Engagement: 
      logToDBEnterState(statechart, _state);
      
      statechart.setActiveState_xjal(Enhanced_Ritual_Engagement);
      
      int inGroupMembers = 0;
      int outGroupMembers = 0;
      double totalInGroupAnthropomorphicValue = 0.0D;
      double avgInGroupAnthropomorphicValue = 0.0D;
      double avgOutGroupAnthropomorphicValue = 0.0D;
      double totalInGroupSociographicPrudery = 0.0D;
      double avgInGroupSociographicPrudery = 0.0D;
      double avgOutGroupSociographicPrudery = 0.0D;
      double totalOutGroupAnthropomorphicValue = 0.0D;
      double totalOutGroupSociographicPrudery = 0.0D;
      
      if (group_ID == 1) {
        for (int i = 0; i < get_Maincollection_Group_ID_1.size(); i++) {
          inGroupMembers++;
          totalInGroupSociographicPrudery = get_Maincollection_Group_ID_1.get(i)).sociographic_prudery;
        }
        for (int i = 0; i < get_Maincollection_Group_ID_2.size(); i++) {
          outGroupMembers++;
          totalOutGroupSociographicPrudery = get_Maincollection_Group_ID_2.get(i)).sociographic_prudery;
        }
      }
      else {
        for (int i = 0; i < get_Maincollection_Group_ID_2.size(); i++) {
          inGroupMembers++;
          totalInGroupSociographicPrudery += get_Maincollection_Group_ID_2.get(i)).sociographic_prudery;
        }
        for (int i = 0; i < get_Maincollection_Group_ID_1.size(); i++) {
          outGroupMembers++;
          totalOutGroupSociographicPrudery += get_Maincollection_Group_ID_1.get(i)).sociographic_prudery;
        }
      }
      
      sociographic_prudery = (prior_sociographic_prudery + outGroupMembers * avgOutGroupSociographicPrudery / (1.0D + inGroupMembers * avgInGroupSociographicPrudery));
      


      for (int i = 0; i < Links_InGroupRitualMembers.size(); i++) {
        inGroupMembers++;
        totalInGroupAnthropomorphicValue += Links_InGroupRitualMembers.getConnectedAgent(i)).anthropomorphic_promiscuity;
      }
      

      totalInGroupAnthropomorphicValue += anthropomorphic_promiscuity;
      inGroupMembers++;
      

      avgInGroupAnthropomorphicValue = totalInGroupAnthropomorphicValue / inGroupMembers;
      

      anthropomorphic_promiscuity = (prior_anthropomorphic_promiscuity + avgInGroupAnthropomorphicValue / anthropomorphic_promiscuity);
      
      avgInGroupSociographicPrudery = totalInGroupSociographicPrudery / inGroupMembers;
      
      DS_Avg_AP.add(Number_of_Rituals, avgInGroupAnthropomorphicValue);
      DS_Avg_SP.add(Number_of_Rituals, avgInGroupSociographicPrudery);
      DS_Group_Size.add(Number_of_Rituals, Links_InGroupRitualMembers.size() + 1);
      
      if (Largest_Group_Size_for_Ritual < Links_InGroupRitualMembers.size() + 1) {
        Largest_Group_Size_for_Ritual = (Links_InGroupRitualMembers.size() + 1);
      }
      
      if (get_MainMax_Group_Size_in_Ritual < Links_InGroupRitualMembers.size() + 1) {
        get_MainMax_Group_Size_in_Ritual = (Links_InGroupRitualMembers.size() + 1);
      }
      


      update_affect_decrease();
      


      if (affect <= my_threshold * 2.0D / 3.0D) {
        int member_count = Links_InGroupRitualMembers.size();
        int num_below_thresh = 0;
        
        for (int i = 0; i < Links_InGroupRitualMembers.size(); i++) {
          Person target_ritual_member = (Person)Links_InGroupRitualMembers.getConnectedAgent(i);
          if (affect < my_threshold * 2.0D / 3.0D) {
            num_below_thresh++;
          }
        }
        




        if (num_below_thresh == member_count) {
          for (int i = 0; i < Links_InGroupRitualMembers.size(); i++) {
            ((Person)Links_InGroupRitualMembers.getConnectedAgent(i)).removeAgentFromContents(this);
          }
          
          Links_InGroupRitualMembers.disconnectFromAll();
          statechart.fireEvent("calmed_period");
        }
        else {
          statechart.fireEvent("continue_enhanced_ritual_engagement");
        }
      }
      else {
        statechart.fireEvent("continue_enhanced_ritual_engagement");
      }
      

      transition5.start();
      transition8.start();
      return;
    case Scan: 
      logToDBEnterState(statechart, _state);
      
      if (_destination) {
        enterState(Scan, true);
      }
      return;
    case Social_Check: 
      logToDBEnterState(statechart, _state);
      
      statechart.setActiveState_xjal(Scan);
      
      int inGroupMembers = 0;
      int outGroupMembers = 0;
      double totalInGroupAnthropomorphicValue = 0.0D;
      double avgInGroupAnthropomorphicValue = 0.0D;
      double avgOutGroupAnthropomorphicValue = 0.0D;
      double totalOutGroupAnthropomorphicValue = 0.0D;
      
      if (in_ritual) {
        statechart.fireEvent("enhanced_ritual_engagement");
      }
      else {
        Links_InGroupRitualMembers.disconnectFromAll();
        
        for (int i = 0; i < my_links.length; i++) {
          if (my_links[i] > 0.0D) {
            if (group_ID == 1) {
              if (get_Mainperson.get(i)).Available) {
                Links_InGroupRitualMembers.connectTo((Person)get_Mainperson.get(i));
                get_Mainperson.get(i)).Available = false;
              }
              
            }
            else if (group_ID == 2) {
              int index_g2 = i + get_Mainpop_group_1;
              if (get_Mainperson.get(index_g2)).Available) {
                Links_InGroupRitualMembers.connectTo((Person)get_Mainperson.get(index_g2));
                get_Mainperson.get(index_g2)).Available = false;
              }
            }
          }
        }
        

        if (Links_InGroupRitualMembers.size() >= 2)
        {








          for (int i = 0; i < Links_InGroupRitualMembers.size(); i++) {
            ((Person)Links_InGroupRitualMembers.getConnectedAgent(i)).join_ritual(this);
          }
          

          get_MainTotal_Number_of_Groups += 1;
          
          Number_of_Rituals += 1;
          Available = false;
          in_ritual = true;
          
          statechart.fireEvent("enhanced_ritual_engagement");
        }
        else
        {
          for (int i = 0; i < my_links.length; i++) {
            int group_index = 0;
            if (group_ID == 1) {
              group_index = i;
            }
            else if (group_ID == 2) {
              group_index = i + get_Mainpop_group_1;
            }
            

            if (my_links[i] > 0.0D) {
              for (int j = 0; j < get_Mainperson.get(group_index)).my_links.length; j++) {
                if ((get_Mainperson.get(group_index)).my_links.length > 0) && 
                  (get_Mainperson.get(group_index)).Available)) {
                  Links_InGroupRitualMembers.connectTo((Person)get_Mainperson.get(group_index));
                  get_Mainperson.get(group_index)).Available = false;
                  get_Mainperson.get(group_index)).Links_InGroupRitualMembers.connectTo(this);
                }
              }
            }
          }
          



          if (Links_InGroupRitualMembers.size() >= 2)
          {








            for (int i = 0; i < Links_InGroupRitualMembers.size(); i++) {
              ((Person)Links_InGroupRitualMembers.getConnectedAgent(i)).join_ritual(this);
            }
            

            get_MainTotal_Number_of_Groups += 1;
            
            Number_of_Rituals += 1;
            Available = false;
            in_ritual = true;
            
            statechart.fireEvent("enhanced_ritual_engagement");
          }
          else
          {
            for (int i = 0; i < Links_InGroupRitualMembers.size(); i++) {
              get_Mainperson.get(((Person)Links_InGroupRitualMembers.getConnectedAgent(i)).getIndex())).Available = true;
            }
            
            Available = true;
          }
        }
      }
      


      transition1.start();
      transition17.start();
      return;
    case branch: 
      logToDBEnterState(statechart, _state);
      
      statechart.setActiveState_xjal(Calmed_Period);
      
      int inGroupMembers = 0;
      double totalInGroupAnthropomorphicValue = 0.0D;
      double totalInGroupSociographicValue = 0.0D;
      double avgInGroupAnthropomorphicValue = 0.0D;
      double avgInGroupSociographicValue = 0.0D;
      

      for (int i = 0; i < Links_InGroupRitualMembers.size(); i++) {
        inGroupMembers++;
        totalInGroupAnthropomorphicValue += Links_InGroupRitualMembers.getConnectedAgent(i)).anthropomorphic_promiscuity;
        totalInGroupSociographicValue += Links_InGroupRitualMembers.getConnectedAgent(i)).sociographic_prudery;
      }
      

      totalInGroupAnthropomorphicValue += anthropomorphic_promiscuity;
      totalInGroupSociographicValue += sociographic_prudery;
      inGroupMembers++;
      



      avgInGroupAnthropomorphicValue = totalInGroupAnthropomorphicValue / inGroupMembers;
      avgInGroupSociographicValue = totalInGroupSociographicValue / inGroupMembers;
      
      prior_sociographic_prudery = avgInGroupSociographicValue;
      prior_anthropomorphic_promiscuity = avgInGroupAnthropomorphicValue;
      
      in_ritual = false;
      
      statechart.fireEvent("move");
      
      transition7.start();
      return;
    case branch2: 
      logToDBEnterState(statechart, _state);
      
      statechart.setActiveState_xjal(continue_enh_rit_engagement);
      

      for (int i = 0; i < Links_InGroupRitualMembers.size(); i++) {
        if (!Links_InGroupRitualMembers.getConnectedAgent(i)).in_ritual) {
          ((Person)Links_InGroupRitualMembers.getConnectedAgent(i)).join_ritual(this);
        }
      }
      
      transition19.start();
      return;
    case continue_enh_rit_engagement: 
      logToDBEnterState(statechart, _state);
      

      if (in_ritual)
      {
        exitState(Assessment, null, false);
        enterState(Hyper_Vigilance, false);
        enterState(Enhanced_Ritual_Engagement, true);
        return;
      }
      
      enterState(branch2, true);
      return;
    case set_group_links: 
      logToDBEnterState(statechart, _state);
      

      if (affect > my_threshold)
      {
        exitState(Assessment, null, false);
        enterState(Hyper_Vigilance, true);
        return;
      }
      
      exitState(Assessment, null, false);
      enterState(Move, true);
      return;
    }
    
  }
  
  @AnyLogicInternalCodegenAPI
  private void exitState(Person.statechart_state _state, Transition _t, boolean _source)
  {
    switch (_state) {
    case Assessment: 
      logToDBExitState(statechart, _state);
      logToDB(statechart, _t, _state);
      
      if ((!_source) || (_t != transition)) transition.cancel();
      return;
    case Calmed_Period: 
      logToDBExitState(statechart, _state);
      logToDB(statechart, _t, _state);
      
      if ((!_source) || (_t != transition15)) transition15.cancel();
      return;
    case Contagion_Check: 
      logToDBExitState(statechart, _state);
      logToDB(statechart, _t, _state);
      
      if ((!_source) || (_t != transition4)) transition4.cancel();
      return;
    case Enhanced_Ritual_Engagement: 
      logToDBExitState(statechart, _state);
      logToDB(statechart, _t, _state);
      
      if (_source) exitInnerStates(_state);
      return;
    case Hyper_Vigilance: 
      logToDBExitState(statechart, _state);
      logToDB(statechart, _t, _state);
      
      if ((!_source) || (_t != transition12)) transition12.cancel();
      if ((!_source) || (_t != transition18)) transition18.cancel();
      if ((!_source) || (_t != transition2)) transition2.cancel();
      return;
    case Initialization: 
      logToDBExitState(statechart, _state);
      logToDB(statechart, _t, _state);
      
      if ((!_source) || (_t != transition14)) transition14.cancel();
      return;
    case Move: 
      logToDBExitState(statechart, _state);
      logToDB(statechart, _t, _state);
      
      if ((!_source) || (_t != transition13)) transition13.cancel();
      return;
    case Natural_Check: 
      logToDBExitState(statechart, _state);
      logToDB(statechart, _t, _state);
      
      if ((!_source) || (_t != transition10)) transition10.cancel();
      return;
    case Predation_Check: 
      logToDBExitState(statechart, _state);
      logToDB(statechart, _t, _state);
      
      if ((!_source) || (_t != transition16)) transition16.cancel();
      if ((!_source) || (_t != transition20)) transition20.cancel();
      return;
    case Regular_Ritual_Engagement: 
      logToDBExitState(statechart, _state);
      logToDB(statechart, _t, _state);
      
      if ((!_source) || (_t != transition5)) transition5.cancel();
      if ((!_source) || (_t != transition8)) transition8.cancel();
      return;
    case Scan: 
      logToDBExitState(statechart, _state);
      logToDB(statechart, _t, _state);
      
      if (_source) exitInnerStates(_state);
      return;
    case Social_Check: 
      logToDBExitState(statechart, _state);
      logToDB(statechart, _t, _state);
      
      if ((!_source) || (_t != transition1)) transition1.cancel();
      if ((!_source) || (_t != transition17)) transition17.cancel();
      return;
    case branch: 
      logToDBExitState(statechart, _state);
      logToDB(statechart, _t, _state);
      
      if ((!_source) || (_t != transition7)) transition7.cancel();
      return;
    case branch2: 
      logToDBExitState(statechart, _state);
      logToDB(statechart, _t, _state);
      
      if ((!_source) || (_t != transition19)) transition19.cancel();
      return;
    }
    
  }
  
  @AnyLogicInternalCodegenAPI
  private void exitInnerStates(Person.statechart_state _destination)
  {
    Person.statechart_state _state = (Person.statechart_state)statechart.getActiveSimpleState();
    while (_state != _destination) {
      exitState(_state, null, false);
      _state = (Person.statechart_state)_state.getContainerState();
    }
  }
  
  public TransitionTimeout transition4 = new TransitionTimeout(this);
  public TransitionTimeout transition16 = new TransitionTimeout(this);
  public TransitionTimeout transition17 = new TransitionTimeout(this);
  public TransitionTimeout transition19 = new TransitionTimeout(this);
  
  @AnyLogicInternalCodegenAPI
  public String getNameOf(TransitionTimeout _t)
  {
    if (_t == transition4) return "transition4";
    if (_t == transition16) return "transition16";
    if (_t == transition17) return "transition17";
    if (_t == transition19) return "transition19";
    return super.getNameOf(_t);
  }
  
  @AnyLogicInternalCodegenAPI
  public Statechart getStatechartOf(TransitionTimeout _t)
  {
    if (_t == transition4) return statechart;
    if (_t == transition16) return statechart;
    if (_t == transition17) return statechart;
    if (_t == transition19) return statechart;
    return super.getStatechartOf(_t);
  }
  
  @AnyLogicInternalCodegenAPI
  public void executeActionOf(TransitionTimeout _t)
  {
    if (_t == transition4) {
      exitState(Regular_Ritual_Engagement, _t, true);
      enterState(Assessment, true);
      return;
    }
    if (_t == transition16) {
      exitState(Move, _t, true);
      enterState(Assessment, true);
      return;
    }
    if (_t == transition17) {
      exitState(Scan, _t, true);
      enterState(Scan, true);
      return;
    }
    if (_t == transition19) {
      exitState(continue_enh_rit_engagement, _t, true);
      enterState(Enhanced_Ritual_Engagement, true);
      return;
    }
    super.executeActionOf(_t);
  }
  
  @AnyLogicInternalCodegenAPI
  public double evaluateTimeoutOf(TransitionTimeout _t)
  {
    if (_t == transition4) {
      double _value = 
        1.0D;
      
      _value = toModelTime(_value, HOUR);
      return _value;
    }
    if (_t == transition16) {
      double _value = 
        1.0D;
      
      _value = toModelTime(_value, HOUR);
      return _value;
    }
    if (_t == transition17) {
      double _value = 
        1.0D;
      
      _value = toModelTime(_value, HOUR);
      return _value;
    }
    if (_t == transition19) {
      double _value = 
        1.0D;
      
      _value = toModelTime(_value, HOUR);
      return _value;
    }
    return super.evaluateTimeoutOf(_t);
  }
  


  public TransitionMessage transition = new TransitionMessage(this);
  public TransitionMessage transition15 = new TransitionMessage(this);
  public TransitionMessage transition12 = new TransitionMessage(this);
  public TransitionMessage transition14 = new TransitionMessage(this);
  public TransitionMessage transition13 = new TransitionMessage(this);
  public TransitionMessage transition10 = new TransitionMessage(this);
  public TransitionMessage transition20 = new TransitionMessage(this);
  public TransitionMessage transition1 = new TransitionMessage(this);
  public TransitionMessage transition5 = new TransitionMessage(this);
  public TransitionMessage transition7 = new TransitionMessage(this);
  public TransitionMessage transition8 = new TransitionMessage(this);
  public TransitionMessage transition18 = new TransitionMessage(this);
  public TransitionMessage transition2 = new TransitionMessage(this);
  
  @AnyLogicInternalCodegenAPI
  public String getNameOf(TransitionMessage _t)
  {
    if (_t == transition) return "transition";
    if (_t == transition15) return "transition15";
    if (_t == transition12) return "transition12";
    if (_t == transition14) return "transition14";
    if (_t == transition13) return "transition13";
    if (_t == transition10) return "transition10";
    if (_t == transition20) return "transition20";
    if (_t == transition1) return "transition1";
    if (_t == transition5) return "transition5";
    if (_t == transition7) return "transition7";
    if (_t == transition8) return "transition8";
    if (_t == transition18) return "transition18";
    if (_t == transition2) return "transition2";
    return super.getNameOf(_t);
  }
  
  @AnyLogicInternalCodegenAPI
  public Statechart getStatechartOf(TransitionMessage _t)
  {
    if (_t == transition) return statechart;
    if (_t == transition15) return statechart;
    if (_t == transition12) return statechart;
    if (_t == transition14) return statechart;
    if (_t == transition13) return statechart;
    if (_t == transition10) return statechart;
    if (_t == transition20) return statechart;
    if (_t == transition1) return statechart;
    if (_t == transition5) return statechart;
    if (_t == transition7) return statechart;
    if (_t == transition8) return statechart;
    if (_t == transition18) return statechart;
    if (_t == transition2) return statechart;
    return super.getStatechartOf(_t);
  }
  
  @AnyLogicInternalCodegenAPI
  public void executeActionOf(TransitionMessage _t, Object _msg)
  {
    if (_t == transition) {
      exitState(Initialization, _t, true);
      enterState(set_group_links, true);
      return;
    }
    if (_t == transition15) {
      exitState(set_group_links, _t, true);
      enterState(Regular_Ritual_Engagement, true);
      return;
    }
    if (_t == transition12) {
      exitState(Predation_Check, _t, true);
      enterState(Natural_Check, true);
      return;
    }
    if (_t == transition14) {
      exitState(Natural_Check, _t, true);
      enterState(Contagion_Check, true);
      return;
    }
    if (_t == transition13) {
      exitState(Contagion_Check, _t, true);
      enterState(Social_Check, true);
      return;
    }
    if (_t == transition10) {
      exitState(Social_Check, _t, true);
      enterState(branch, true);
      return;
    }
    if (_t == transition20) {
      exitState(Move, _t, true);
      enterState(Hyper_Vigilance, false);
      enterState(Enhanced_Ritual_Engagement, true);
      return;
    }
    if (_t == transition1) {
      exitState(Scan, _t, true);
      enterState(Enhanced_Ritual_Engagement, true);
      return;
    }
    if (_t == transition5) {
      exitState(Enhanced_Ritual_Engagement, _t, true);
      enterState(Calmed_Period, true);
      return;
    }
    if (_t == transition7) {
      exitState(Calmed_Period, _t, true);
      exitState(Hyper_Vigilance, _t, false);
      enterState(Move, true);
      return;
    }
    if (_t == transition8) {
      exitState(Enhanced_Ritual_Engagement, _t, true);
      enterState(continue_enh_rit_engagement, true);
      return;
    }
    if (_t == transition18) {
      exitState(Predation_Check, _t, true);
      enterState(Contagion_Check, true);
      return;
    }
    if (_t == transition2) {
      exitState(Predation_Check, _t, true);
      exitState(Assessment, _t, false);
      enterState(Hyper_Vigilance, false);
      enterState(Enhanced_Ritual_Engagement, true);
      return;
    }
    super.executeActionOf(_t, _msg);
  }
  
  @AnyLogicInternalCodegenAPI
  public boolean testMessageOf(TransitionMessage _t, Object _msg) {
    if (_t == transition)
    {

      Object msg = _msg;
      Object _g = 
        "set_group_links";
      
      return msg.equals(_g);
    }
    if (_t == transition15)
    {

      Object msg = _msg;
      Object _g = 
        "Regular_Ritual_Engagement";
      
      return msg.equals(_g);
    }
    if (_t == transition12)
    {

      Object msg = _msg;
      Object _g = 
        "natural_check";
      
      return msg.equals(_g);
    }
    if (_t == transition14)
    {

      Object msg = _msg;
      Object _g = 
        "contagion_check";
      
      return msg.equals(_g);
    }
    if (_t == transition13)
    {

      Object msg = _msg;
      Object _g = 
        "social_check";
      
      return msg.equals(_g);
    }
    if (_t == transition10)
    {

      Object msg = _msg;
      Object _g = 
        "leave_assessment";
      
      return msg.equals(_g);
    }
    if (_t == transition20)
    {

      Object msg = _msg;
      Object _g = 
        "join_ritual";
      
      return msg.equals(_g);
    }
    if (_t == transition1)
    {

      Object msg = _msg;
      Object _g = 
        "enhanced_ritual_engagement";
      
      return msg.equals(_g);
    }
    if (_t == transition5)
    {

      Object msg = _msg;
      Object _g = 
        "calmed_period";
      
      return msg.equals(_g);
    }
    if (_t == transition7)
    {

      Object msg = _msg;
      Object _g = 
        "move";
      
      return msg.equals(_g);
    }
    if (_t == transition8)
    {

      Object msg = _msg;
      Object _g = 
        "continue_enhanced_ritual_engagement";
      
      return msg.equals(_g);
    }
    if (_t == transition18)
    {

      Object msg = _msg;
      Object _g = 
        "contagion_check";
      
      return msg.equals(_g);
    }
    if (_t == transition2)
    {

      Object msg = _msg;
      Object _g = 
        "join_ritual";
      
      return msg.equals(_g);
    }
    return super.testMessageOf(_t, _msg);
  }
  




  void set_group_ID()
  {
    if (getIndex() < get_Mainpop * (get_Maingroup_ID_percentOfPopInMajority / 100.0D)) {
      group_ID = 1;
      shapeBody.setFillColor(UtilitiesColor.red);
    }
    else {
      group_ID = 2;
      shapeBody.setFillColor(UtilitiesColor.blue);
    }
  }
  

  void set_prior_anthropomorphic_promiscuity()
  {
    prior_anthropomorphic_promiscuity = ((int)triangular(get_Mainprior_anthropomorphic_promiscuity_min, get_Mainprior_anthropomorphic_promiscuity_max, get_Mainprior_anthropomorphic_promiscuity_mode));
  }
  

  void set_sociographic_prudery()
  {
    sociographic_prudery = prior_sociographic_prudery;
  }
  

  void set_anthropomorphic_promiscuity()
  {
    anthropomorphic_promiscuity = prior_anthropomorphic_promiscuity;
  }
  
  void set_predation_tolerance()
  {
    predation_tolerance = triangular(get_Mainpredation_tolerance_min, get_Mainpredation_tolerance_max, get_Mainpredation_tolerance_mode);
  }
  
  void set_natural_tolerance()
  {
    natural_tolerance = triangular(get_Mainnatural_tolerance_min, get_Mainnatural_tolerance_max, get_Mainnatural_tolerance_mode);
  }
  
  void set_contagion_tolerance()
  {
    contagion_tolerance = triangular(get_Maincontagion_tolerance_min, get_Maincontagion_tolerance_max, get_Maincontagion_tolerance_mode);
  }
  
  void set_social_tolerance()
  {
    social_tolerance = triangular(get_Mainsocial_tolerance_min, get_Mainsocial_tolerance_max, get_Mainsocial_tolerance_mode);
  }
  
  void set_contagion_probability()
  {
    contagion_probability = triangular(get_Maincontagion_probability_min, get_Maincontagion_probability_max, get_Maincontagion_probability_mode);
  }
  
  void set_social_probability()
  {
    social_probability = triangular(get_Mainsocial_probability_min, get_Mainsocial_probability_max, get_Mainsocial_probability_mode);
  }
  
  void set_contagionH_distance()
  {
    contagionH_distance = uniform(get_Maingroup_distance_contagionHazard_min, get_Maingroup_distance_contagionHazard_max);
  }
  
  void set_group_distance_anthropomorphic()
  {
    group_distance_anthropomorphic = uniform(get_Maingroup_distance_anthropomorphic_min, get_Maingroup_distance_anthropomorphic_max);
  }
  
  void join_ritual(Person RitualInitiator)
  {
    Links_InGroupRitualMembers.disconnectFromAll();
    
    Links_InGroupRitualMembers.connectTo(RitualInitiator);
    
    for (int i = 0; i < Links_InGroupRitualMembers.size(); i++) {
      if (Links_InGroupRitualMembers.getConnectedAgent(i) != this) {
        Links_InGroupRitualMembers.connectTo((Person)Links_InGroupRitualMembers.getConnectedAgent(i));
      }
    }
    
    Number_of_Rituals += 1;
    Available = false;
    in_ritual = true;
    
    statechart.fireEvent("join_ritual");
  }
  
  void set_prior_sociographic_prudery()
  {
    prior_sociographic_prudery = ((int)triangular(get_Mainprior_sociographic_promiscuity_min, get_Mainprior_sociographic_promiscuity_max, get_Mainprior_sociographic_promiscuity_mode));
  }
  
  void set_socialH_distance()
  {
    socialH_distance = uniform(get_Maingroup_distance_socialHazard_min, get_Maingroup_distance_socialHazard_max);
  }
  
  void set_group_distance_sociographic()
  {
    group_distance_sociographic = uniform(get_Maingroup_distance_sociographic_min, get_Maingroup_distance_sociographic_max);
  }
  
  void set_link_list()
  {
    for (int i = 0; i < main.social_network_1.length; i++)
    {
      for (int j = 0; j < main.social_network_1[0].length; j++) {}
    }
    



    int myID = getIndex();
    

    if (group_ID == 1)
    {
      my_links = main.social_network_1[myID];
    }
    else
    {
      int index = myID - main.pop_group_1;
      

      my_links = main.social_network_2[index];
    }
    
    update_link_text();
  }
  
  void update_link_text()
  {
    String text_myLinks = "Agent Links _ Group " + group_ID + ":\n";
    
    if (group_ID == 1) {
      for (int i = 0; i < my_links.length; i++)
      {
        String s = my_links[i];
        text_myLinks = text_myLinks + i + ": " + s + '\n';
      }
    }
    if (group_ID == 2) {
      for (int i = 0; i < my_links.length; i++)
      {
        String s = my_links[i];
        text_myLinks = text_myLinks + (i + main.pop_group_1) + ": " + s + '\n';
      }
    }
    text_Links.setText(text_myLinks);
  }
  









  void belief_affect_increase(Person target_agent)
  {
    int random_belief = uniform_discr(0, my_affect_matrix.length - 1);
    
    if (my_values[random_belief] != my_values[random_belief]) {
      double my_val = my_affect_matrix[random_belief];
      
      my_val += learning_rate * Math.pow(my_val, delta) * my_extinction_rate * (lambda - my_val);
      
      my_affect_matrix[random_belief] = my_val;
    }
  }
  









  void belief_affect_decrease(Person target_agent)
  {
    int random_belief = uniform_discr(0, my_affect_matrix.length - 1);
    
    if (my_values[random_belief] == my_values[random_belief]) {
      double my_val = my_affect_matrix[random_belief];
      
      my_val += learning_rate * Math.pow(my_val, delta) * my_extinction_rate * (0.0D - my_val);
      
      my_affect_matrix[random_belief] = my_val;
    }
  }
  














































  void update_disposition()
  {
    double sum_of_inGroupRitualMembers_contribution = 0.0D;
    
    for (int i = 0; i < Links_InGroupRitualMembers.size(); i++) {
      sum_of_inGroupRitualMembers_contribution += ((Person)Links_InGroupRitualMembers.getConnectedAgent(i)).getConnectedAgentsWeight(this) * (Links_InGroupRitualMembers.getConnectedAgent(i)).affect + Links_InGroupRitualMembers.getConnectedAgent(i)).probability);
    }
    
    disposition = (affect + probability - my_threshold + sum_of_inGroupRitualMembers_contribution);
  }
  















  void update_probability_and_memory()
  {
    double current_propability = 0.0D;
    double new_memory = 0.0D;
    
    int count_inGroup_nearby = 0;
    int count_outGroup_nearby = 0;
    
    if (group_ID == 1) {
      for (int i = 0; i < get_Maincollection_Group_ID_1.size(); i++) {
        if ((get_Maincollection_Group_ID_1.get(i) != this) && 
          (distanceTo((Agent)get_Maincollection_Group_ID_1.get(i)) <= get_Mainvision)) {
          count_inGroup_nearby++;
        }
      }
      
      for (int i = 0; i < get_Maincollection_Group_ID_2.size(); i++) {
        if (distanceTo((Agent)get_Maincollection_Group_ID_2.get(i)) <= get_Mainvision) {
          count_outGroup_nearby++;
        }
      }
    }
    else {
      for (int i = 0; i < get_Maincollection_Group_ID_2.size(); i++) {
        if ((get_Maincollection_Group_ID_2.get(i) != this) && 
          (distanceTo((Agent)get_Maincollection_Group_ID_2.get(i)) <= get_Mainvision)) {
          count_inGroup_nearby++;
        }
      }
      
      for (int i = 0; i < get_Maincollection_Group_ID_1.size(); i++) {
        if (distanceTo((Agent)get_Maincollection_Group_ID_1.get(i)) <= get_Mainvision) {
          count_outGroup_nearby++;
        }
      }
    }
    
    current_propability = count_outGroup_nearby / (count_inGroup_nearby + 1);
    
    if (memory.size() >= get_Mainlength_of_memory) {
      memory.remove(0);
    }
    
    memory.add(Double.valueOf(current_propability));
    
    for (int i = 0; i < memory.size(); i++) {
      new_memory += ((Double)memory.get(i)).doubleValue();
    }
    
    if (memory.size() > 0) {
      probability = (new_memory / memory.size());
    }
    else {
      System.out.println("memory.size(): 0");
      probability = 0.0D;
    }
  }
  

  void set_my_threshold()
  {
    my_threshold = get_Mainthreshold;
  }
  




  void set_my_values()
  {
    if (group_ID == 1) {
      for (int i = 0; i < get_Maingroup_1_values.length; i++) {
        my_values[i] = get_Maingroup_1_values[i];
        System.out.println(i);
      }
      
    } else if (group_ID == 2) {
      for (int i = 0; i < get_Maingroup_2_values.length; i++) {
        my_values[i] = get_Maingroup_2_values[i];
      }
    }
  }
  

  void set_my_affect_matrix()
  {
    for (int i = 0; i < my_affect_matrix.length; i++) {
      my_affect_matrix[i] = 0.001D;
    }
  }
  














  void update_affect_increase()
  {
    affect += learning_rate * Math.pow(affect, delta) * (lambda - affect);
    violence_counter += 1;
  }
  
  void set_my_extinction_rate()
  {
    my_extinction_rate = main.extinction_rate;
  }
  














  void update_affect_decrease()
  {
    affect += learning_rate * Math.pow(affect, delta) * my_extinction_rate * (0.0D - affect);
  }
  


  double getConnectedAgentsWeight(Person target_ritual_member)
  {
    int connection_index = 0;
    
    if (group_ID == 1) {
      connection_index = target_ritual_member.getIndex();
    }
    else
    {
      connection_index = target_ritual_member.getIndex() - get_Mainpop_group_1;
    }
    

    if (my_links[connection_index] > 0.0D) {
      return my_links[connection_index];
    }
    
    if (is2ndOrderConnection(target_ritual_member)) {
      return get_Mainweight_second_order_connection;
    }
    

    return get_Mainweight_third_order_connection;
  }
  



  boolean is2ndOrderConnection(Person target_ritual_member)
  {
    int target_member_index = 0;
    if (group_ID == 1) {
      target_member_index = target_ritual_member.getIndex();
    }
    else {
      target_member_index = target_ritual_member.getIndex() - get_Mainpop_group_1;
    }
    

    for (int i = 0; i < my_links.length; i++) {
      if (my_links[i] > 0.0D) {
        int selected_connection = i;
        if (group_ID == 2) {
          selected_connection += get_Mainpop_group_1;
        }
        if (get_Mainperson.get(selected_connection)).my_links[i] > 0.0D) {
          return true;
        }
      }
    }
    
    return false;
  }
  
  public DataSet DS_Avg_SP = new DataSet(100);
  
  public DataSet DS_Avg_AP = new DataSet(100);
  
  public DataSet DS_Group_Size = new DataSet(100);
  

  public ViewArea _origin_VA = new ViewArea(this, "[Origin]", 0.0D, 0.0D, 1000.0D, 800.0D);
  
  @AnyLogicInternalCodegenAPI
  public int getViewAreas(Map<String, ViewArea> _output) {
    if (_output != null) {
      _output.put("_origin_VA", _origin_VA);
    }
    return 1 + super.getViewAreas(_output); }
  
  @AnyLogicInternalCodegenAPI
  protected static final Font _text_Links_Font = new Font("SansSerif", 0, 10);
  @AnyLogicInternalCodegenAPI
  protected static final Font _text_Font = new Font("SansSerif", 1, 14);
  @AnyLogicInternalCodegenAPI
  protected static final Font _text1_Font = new Font("SansSerif", 1, 16);
  @AnyLogicInternalCodegenAPI
  protected static final Font _text2_Font = _text1_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text3_Font = _text1_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text5_Font = _text1_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text6_Font = _text1_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text4_Font = new Font("Times New Roman", 1, 12);
  
  @AnyLogicInternalCodegenAPI
  protected static final int _shapeBody = 1;
  
  @AnyLogicInternalCodegenAPI
  protected static final int _person = 2;
  
  @AnyLogicInternalCodegenAPI
  protected static final int _text_Links = 3;
  
  @AnyLogicInternalCodegenAPI
  protected static final int _text = 4;
  
  @AnyLogicInternalCodegenAPI
  protected static final int _text1 = 5;
  
  @AnyLogicInternalCodegenAPI
  protected static final int _text2 = 6;
  @AnyLogicInternalCodegenAPI
  protected static final int _text3 = 7;
  @AnyLogicInternalCodegenAPI
  protected static final int _text5 = 8;
  @AnyLogicInternalCodegenAPI
  protected static final int _text6 = 9;
  @AnyLogicInternalCodegenAPI
  protected static final int _text4 = 10;
  @AnyLogicInternalCodegenAPI
  protected static final int _plot = 11;
  @AnyLogicInternalCodegenAPI
  protected static final int _plot1 = 12;
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 13;
  @AnyLogicInternalCodegenAPI
  protected static final int _presentation = 0;
  
  @AnyLogicInternalCodegenAPI
  public boolean isPublicPresentationDefined()
  {
    return true;
  }
  
  @AnyLogicInternalCodegenAPI
  public boolean isEmbeddedAgentPresentationVisible(Agent _a) {
    return super.isEmbeddedAgentPresentationVisible(_a);
  }
  




  @AnyLogicInternalCodegenAPI
  protected static final double[] _shapeBody_pointsDX_xjal()
  {
    return new double[] { 0.0D, 0.0D, 3.0D, -1.0D, -2.0D, -2.0D, -2.0D, 0.0D, -1.0D, 0.0D, 1.0D, 3.0D, 4.0D, 5.0D, 4.0D, 6.0D, 6.0D, 6.0D, 5.0D, 1.0D, 4.0D, 4.0D, 4.0D, 0.0D };
  }
  
  @AnyLogicInternalCodegenAPI
  protected static final double[] _shapeBody_pointsDY_xjal() { return new double[] { 0.0D, 4.0D, 2.0D, 3.0D, 3.0D, 10.0D, 11.0D, 11.0D, 9.0D, 17.0D, 17.0D, 17.0D, 17.0D, 9.0D, 11.0D, 11.0D, 10.0D, 3.0D, 3.0D, 2.0D, 4.0D, 0.0D, -3.0D, -3.0D }; }
  
  @AnyLogicInternalCodegenAPI
  protected static final double[] _shapeBody_pointsDZ_xjal() {
    return new double[] { 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D };
  }
  

  @AnyLogicInternalCodegenAPI
  protected static final int _icon = -1;
  
  protected Plot plot;
  protected Plot plot1;
  protected ShapeCurve shapeBody;
  protected ShapeGroup person;
  protected ShapeText text_Links;
  protected ShapeText text;
  
  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal()
  {
    shapeBody = new ShapeCurve(
      true, -2.0D, -7.0D, 
      null, UtilitiesColor.black, 
      24, true, _shapeBody_pointsDX_xjal(), _shapeBody_pointsDY_xjal(), 
      true, 1.0D, LINE_STYLE_SOLID);
    
    text_Links = new ShapeText(
      SHAPE_DRAW_2D, false, -200.0D, 50.0D, 0.0D, 0.0D, 
      UtilitiesColor.black, "links", 
      _text_Links_Font, ALIGNMENT_LEFT);
    
    text = new ShapeText(
      SHAPE_DRAW_2D, false, 670.0D, 360.0D, 0.0D, 0.0D, 
      UtilitiesColor.green, "Increment the affect of the \r\nindividual if any is triggered", 
      _text_Font, ALIGNMENT_LEFT);
    
    text1 = new ShapeText(
      SHAPE_DRAW_2D, false, 10.0D, 580.0D, 0.0D, 0.0D, 
      UtilitiesColor.green, "For rituals, \r\nfind individuals through network. ", 
      _text1_Font, ALIGNMENT_LEFT);
    
    text2 = new ShapeText(
      SHAPE_DRAW_2D, false, 10.0D, 650.0D, 0.0D, 0.0D, 
      UtilitiesColor.gray, "If threat is natural or predation, \r\nyou can use proximate individuals", 
      _text2_Font, ALIGNMENT_LEFT);
    
    text3 = new ShapeText(
      SHAPE_DRAW_2D, false, 790.0D, 660.0D, 0.0D, 0.0D, 
      UtilitiesColor.green, "When the agent is in the \r\nEnhanced Ritual Engagement \r\nstate, the affect should be decremented \r\nat each time period", 
      _text3_Font, ALIGNMENT_LEFT);
    
    text5 = new ShapeText(
      SHAPE_DRAW_2D, false, 730.0D, 440.0D, 0.0D, 0.0D, 
      UtilitiesColor.green, "If affect > thresh then \r\nmove into Hyper_vigalance", 
      _text5_Font, ALIGNMENT_LEFT);
    
    text6 = new ShapeText(
      SHAPE_DRAW_2D, false, 390.0D, 920.0D, 0.0D, 0.0D, 
      UtilitiesColor.green, "When affect falls below the \r\nthreshold then you exit Hyper_Vigilance", 
      _text6_Font, ALIGNMENT_LEFT);
    
    text4 = new ShapeText(
      SHAPE_DRAW_2D, false, 1150.0D, 290.0D, 0.0D, 0.0D, 
      UtilitiesColor.black, "Not Used in MERV 1.0 - May be reused in ERIKA or MERV 2.0", 
      _text4_Font, ALIGNMENT_LEFT);
  }
  


  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal()
  {
    List<DataSet> _items = new ArrayList(2);
    DataSet _item = 
      DS_Avg_SP;
    
    _items.add(_item);
    _item = 
      DS_Avg_AP;
    
    _items.add(_item);
    List<String> _titles = new ArrayList(2);
    _titles.add("Average SP");
    _titles.add("Average AP");
    List<Chart2DPlot.Appearance> _appearances = new ArrayList(2);
    _appearances.add(new Chart2DPlot.Appearance(UtilitiesColor.oliveDrab, true, Chart.INTERPOLATION_LINEAR, 1.0D, Chart.POINT_CIRCLE));
    _appearances.add(new Chart2DPlot.Appearance(UtilitiesColor.deepSkyBlue, true, Chart.INTERPOLATION_LINEAR, 1.0D, Chart.POINT_CIRCLE));
    plot = new Plot(
      this, false, 740.0D, 940.0D, 
      400.0D, 190.0D, 
      null, null, 
      50.0D, 30.0D, 
      320.0D, 100.0D, UtilitiesColor.white, UtilitiesColor.black, UtilitiesColor.black, 
      30.0D, Chart.SOUTH, 
      Chart.SCALE_AUTO, 
      0.0D, 0.0D, Chart.SCALE_AUTO, 
      0.0D, 0.0D, Chart.GRID_DEFAULT, Chart.GRID_DEFAULT, 
      UtilitiesColor.darkGray, UtilitiesColor.darkGray, _items, _titles, _appearances);
    



    List<DataSet> _items = new ArrayList(1);
    DataSet _item = 
      DS_Group_Size;
    
    _items.add(_item);
    List<String> _titles = new ArrayList(1);
    _titles.add("Group Size over Time");
    List<Chart2DPlot.Appearance> _appearances = new ArrayList(1);
    _appearances.add(new Chart2DPlot.Appearance(UtilitiesColor.deepSkyBlue, true, Chart.INTERPOLATION_LINEAR, 1.0D, Chart.POINT_CIRCLE));
    plot1 = new Plot(
      this, false, 740.0D, 1140.0D, 
      400.0D, 190.0D, 
      null, null, 
      50.0D, 30.0D, 
      320.0D, 100.0D, UtilitiesColor.white, UtilitiesColor.black, UtilitiesColor.black, 
      30.0D, Chart.SOUTH, 
      Chart.SCALE_AUTO, 
      0.0D, 0.0D, Chart.SCALE_AUTO, 
      0.0D, 0.0D, Chart.GRID_DEFAULT, Chart.GRID_DEFAULT, 
      UtilitiesColor.darkGray, UtilitiesColor.darkGray, _items, _titles, _appearances);
    


    person = new ShapeGroup(this, SHAPE_DRAW_2D, true, 0.0D, 0.0D, 0.0D, 0.0D, new Object[] {
    
      shapeBody });
  }
  

  protected ShapeText text1;
  
  protected ShapeText text2;
  protected ShapeText text3;
  protected ShapeText text5;
  protected ShapeText text6;
  protected ShapeText text4;
  protected ShapeTopLevelPresentationGroup presentation;
  protected ShapeModelElementsGroup icon;
  @AnyLogicInternalCodegenAPI
  public ShapeTopLevelPresentationGroup getPresentationShape()
  {
    return presentation;
  }
  
  @AnyLogicInternalCodegenAPI
  public ShapeModelElementsGroup getModelElementsShape()
  {
    return icon;
  }
  
  @AnyLogicInternalCodegenAPI
  public Object getPersistentShape(int _shape)
  {
    switch (_shape) {
    case 0:  return presentation;
    case -1:  return icon;
    case 11:  return plot;
    case 12:  return plot1;
    case 1:  return shapeBody;
    case 2:  return person;
    case 3:  return text_Links;
    case 4:  return text;
    case 5:  return text1;
    case 6:  return text2;
    case 7:  return text3;
    case 8:  return text5;
    case 9:  return text6;
    case 10:  return text4; }
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
      _name_xjal = checkNameOfShape_xjal(_shape, plot, "plot"); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal(_shape, plot1, "plot1"); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal(_shape, shapeBody, "shapeBody"); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal(_shape, person, "person"); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal(_shape, text_Links, "text_Links"); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal(_shape, text, "text"); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal(_shape, text1, "text1"); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal(_shape, text2, "text2"); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal(_shape, text3, "text3"); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal(_shape, text5, "text5"); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal(_shape, text6, "text6"); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal(_shape, text4, "text4"); if (_name_xjal != null) return _name_xjal;
    } catch (Exception e) {
      return null;
    }
    return super.getNameOfShape_xjal(_shape); }
  
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition_pointsX_xjal = { 430, 430 };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition_pointsY_xjal = { 90, 120 };
  
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition15_pointsX_xjal = { 430, 430 };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition15_pointsY_xjal = { 150, 190 };
  
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition4_pointsX_xjal = { 390, 390 };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition4_pointsY_xjal = { 230, 270 };
  
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition12_pointsX_xjal = { 470, 500, 480 };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition12_pointsY_xjal = { 340, 340, 370 };
  
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition14_pointsX_xjal = { 490, 510, 500 };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition14_pointsY_xjal = { 380, 380, 410 };
  
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition13_pointsX_xjal = { 510, 520, 520 };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition13_pointsY_xjal = { 420, 420, 450 };
  
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition10_pointsX_xjal = { 530, 540, 540, 580, 580 };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition10_pointsY_xjal = { 460, 460, 380, 380, 400 };
  
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition21_pointsX_xjal = { 580, 580 };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition21_pointsY_xjal = { 420, 460 };
  
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition9_pointsX_xjal = { 580, 580, 330 };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition9_pointsY_xjal = { 480, 500, 500 };
  
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition16_pointsX_xjal = { 300, 300, 340 };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition16_pointsY_xjal = { 490, 400, 400 };
  
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition20_pointsX_xjal = { 320, 320, 390 };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition20_pointsY_xjal = { 530, 750, 750 };
  
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition1_pointsX_xjal = { 460, 460 };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition1_pointsY_xjal = { 620, 720 };
  
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition17_pointsX_xjal = { 490, 490, 520, 520, 480, 480 };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition17_pointsY_xjal = { 620, 650, 650, 570, 570, 590 };
  
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition5_pointsX_xjal = { 430, 430 };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition5_pointsY_xjal = { 760, 840 };
  
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition7_pointsX_xjal = { 430, 430, 300, 300 };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition7_pointsY_xjal = { 870, 890, 890, 530 };
  
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition8_pointsX_xjal = { 500, 500 };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition8_pointsY_xjal = { 760, 800 };
  
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition19_pointsX_xjal = { 560, 560 };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition19_pointsY_xjal = { 800, 760 };
  
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition11_pointsX_xjal = { 592, 600, 600 };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition11_pointsY_xjal = { 470, 470, 530 };
  
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition22_pointsX_xjal = { 592, 700, 700, 590 };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition22_pointsY_xjal = { 410, 410, 740, 740 };
  
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition18_pointsX_xjal = { 380, 380, 410 };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition18_pointsY_xjal = { 360, 430, 430 };
  
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition2_pointsX_xjal = { 370, 350, 350, 390 };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition2_pointsY_xjal = { 340, 340, 740, 740 };
  
  @AnyLogicInternalCodegenAPI
  protected static final Color _Assessment_FillColor = new Color(838909951, true);
  @AnyLogicInternalCodegenAPI
  protected static final Color _Hyper_Vigilance_FillColor = new Color(1239366710, true);
  
  @AnyLogicInternalCodegenAPI
  private void drawModelElements_Events_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass) {
    if (!_publicOnly) {
      drawEvent(_panel, _g, 65136, 550, 10, 0, "event", event);
    }
  }
  
  @AnyLogicInternalCodegenAPI
  private void drawModelElements_Statecharts_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass) {
    if (!_publicOnly) {
      drawState(_panel, _g, 340, 190, 170, 40, 10, 20, "Regular_Ritual_Engagement", UtilitiesColor.GOLD, Regular_Ritual_Engagement, statechart);
    }
    if (!_publicOnly) {
      drawState(_panel, _g, 340, 530, 340, 380, 10, 15, "Hyper_Vigilance", _Hyper_Vigilance_FillColor, Hyper_Vigilance, statechart);
    }
    if (!_publicOnly) {
      drawState(_panel, _g, 390, 720, 200, 40, 20, 20, "Enhanced_Ritual_Engagement", UtilitiesColor.GOLD, Enhanced_Ritual_Engagement, statechart);
    }
    if (!_publicOnly) {
      drawState(_panel, _g, 400, 590, 100, 30, 15, 15, "Scan", UtilitiesColor.GOLD, Scan, statechart);
    }
    if (!_publicOnly) {
      drawState(_panel, _g, 370, 840, 130, 30, 10, 15, "Calmed_Period", UtilitiesColor.GOLD, Calmed_Period, statechart);
    }
    if (!_publicOnly) {
      drawState(_panel, _g, 340, 270, 280, 220, 10, 10, "Assessment", _Assessment_FillColor, Assessment, statechart);
    }
    if (!_publicOnly) {
      drawState(_panel, _g, 370, 330, 100, 30, 5, 15, "Predation_Check", UtilitiesColor.GOLD, Predation_Check, statechart);
    }
    if (!_publicOnly) {
      drawState(_panel, _g, 390, 370, 100, 30, 10, 15, "Natural_Check", UtilitiesColor.GOLD, Natural_Check, statechart);
    }
    if (!_publicOnly) {
      drawState(_panel, _g, 430, 450, 100, 30, 10, 15, "Social_Check", UtilitiesColor.GOLD, Social_Check, statechart);
    }
    if (!_publicOnly) {
      drawState(_panel, _g, 410, 410, 100, 30, 0, 15, "Contagion_Check", UtilitiesColor.GOLD, Contagion_Check, statechart);
    }
    if (!_publicOnly) {
      drawBranchState(_panel, _g, 580, 470, 10, 0, null, branch2);
    }
    if (!_publicOnly) {
      drawState(_panel, _g, 380, 60, 100, 30, 10, 10, "Initialization", UtilitiesColor.GOLD, Initialization, statechart);
    }
    if (!_publicOnly) {
      drawState(_panel, _g, 270, 490, 60, 40, 15, 15, "Move", UtilitiesColor.GOLD, Move, statechart);
    }
    if (!_publicOnly) {
      drawState(_panel, _g, 380, 120, 100, 30, 10, 10, "set_group_links", UtilitiesColor.GOLD, set_group_links, statechart);
    }
    if (!_publicOnly) {
      drawState(_panel, _g, 470, 800, 180, 30, 10, 15, "continue_enh_rit_engagement", UtilitiesColor.GOLD, continue_enh_rit_engagement, statechart);
    }
    if (!_publicOnly) {
      drawBranchState(_panel, _g, 580, 410, 10, 0, null, branch);
    }
    if (!_publicOnly) {
      drawStatechartEntryPoint(_panel, _g, 430, 30, 430, 60, 440, 30, "statechart", statechart);
    }
    if (!_publicOnly) {
      drawInitialStatePointer(_panel, _g, 440, 560, 440, 590);
    }
    if (!_publicOnly) {
      drawTransition(_panel, _g, _transition1_pointsX_xjal, _transition1_pointsY_xjal, 470, 620, null, transition1, Agent.TransitionIcon.MESSAGE, 460, 660);
    }
    if (!_publicOnly) {
      drawTransition(_panel, _g, _transition4_pointsX_xjal, _transition4_pointsY_xjal, 400, 230, null, transition4, Agent.TransitionIcon.TIMEOUT, 390, 240);
    }
    if (!_publicOnly) {
      drawTransition(_panel, _g, _transition5_pointsX_xjal, _transition5_pointsY_xjal, 440, 760, null, transition5, Agent.TransitionIcon.MESSAGE, 430, 780);
    }
    if (!_publicOnly) {
      drawTransition(_panel, _g, _transition7_pointsX_xjal, _transition7_pointsY_xjal, 440, 870, null, transition7, Agent.TransitionIcon.MESSAGE, 400, 890);
    }
    if (!_publicOnly) {
      drawBranchExit(_panel, _g, _transition9_pointsX_xjal, _transition9_pointsY_xjal, 590, 480, null);
    }
    if (!_publicOnly) {
      drawTransition(_panel, _g, _transition10_pointsX_xjal, _transition10_pointsY_xjal, 540, 460, null, transition10, Agent.TransitionIcon.MESSAGE, 540, 420);
    }
    if (!_publicOnly) {
      drawBranchExit(_panel, _g, _transition11_pointsX_xjal, _transition11_pointsY_xjal, 602, 470, null);
    }
    if (!_publicOnly) {
      drawTransition(_panel, _g, _transition12_pointsX_xjal, _transition12_pointsY_xjal, 480, 340, null, transition12, Agent.TransitionIcon.MESSAGE, 490, 340);
    }
    if (!_publicOnly) {
      drawTransition(_panel, _g, _transition13_pointsX_xjal, _transition13_pointsY_xjal, 520, 420, null, transition13, Agent.TransitionIcon.MESSAGE, 520, 430);
    }
    if (!_publicOnly) {
      drawTransition(_panel, _g, _transition14_pointsX_xjal, _transition14_pointsY_xjal, 500, 380, null, transition14, Agent.TransitionIcon.MESSAGE, 510, 380);
    }
    if (!_publicOnly) {
      drawTransition(_panel, _g, _transition15_pointsX_xjal, _transition15_pointsY_xjal, 440, 150, null, transition15, Agent.TransitionIcon.MESSAGE, 430, 170);
    }
    if (!_publicOnly) {
      drawTransition(_panel, _g, _transition16_pointsX_xjal, _transition16_pointsY_xjal, 310, 490, null, transition16, Agent.TransitionIcon.TIMEOUT, 300, 470);
    }
    if (!_publicOnly) {
      drawTransition(_panel, _g, _transition17_pointsX_xjal, _transition17_pointsY_xjal, 500, 620, null, transition17, Agent.TransitionIcon.TIMEOUT, 520, 610);
    }
    if (!_publicOnly) {
      drawTransition(_panel, _g, _transition18_pointsX_xjal, _transition18_pointsY_xjal, 390, 360, null, transition18, Agent.TransitionIcon.MESSAGE, 380, 410);
    }
    if (!_publicOnly) {
      drawTransition(_panel, _g, _transition2_pointsX_xjal, _transition2_pointsY_xjal, 380, 340, null, transition2, Agent.TransitionIcon.MESSAGE, 350, 450);
    }
    if (!_publicOnly) {
      drawInitialStatePointer(_panel, _g, 440, 290, 440, 330);
    }
    if (!_publicOnly) {
      drawTransition(_panel, _g, _transition_pointsX_xjal, _transition_pointsY_xjal, 440, 90, null, transition, Agent.TransitionIcon.MESSAGE, 430, 100);
    }
    if (!_publicOnly) {
      drawTransition(_panel, _g, _transition8_pointsX_xjal, _transition8_pointsY_xjal, 510, 760, null, transition8, Agent.TransitionIcon.MESSAGE, 500, 770);
    }
    if (!_publicOnly) {
      drawTransition(_panel, _g, _transition19_pointsX_xjal, _transition19_pointsY_xjal, 570, 800, null, transition19, Agent.TransitionIcon.TIMEOUT, 560, 780);
    }
    if (!_publicOnly) {
      drawTransition(_panel, _g, _transition20_pointsX_xjal, _transition20_pointsY_xjal, 330, 530, null, transition20, Agent.TransitionIcon.MESSAGE, 320, 550);
    }
    if (!_publicOnly) {
      drawBranchExit(_panel, _g, _transition21_pointsX_xjal, _transition21_pointsY_xjal, 590, 420, null);
    }
    if (!_publicOnly) {
      drawBranchExit(_panel, _g, _transition22_pointsX_xjal, _transition22_pointsY_xjal, 602, 410, null);
    }
  }
  
  @AnyLogicInternalCodegenAPI
  private void drawModelElements_PlainVariables_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass) {
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 20, 210, 10, 0, "predation_tolerance", Double.valueOf(predation_tolerance), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 20, 250, 10, 0, "natural_tolerance", Double.valueOf(natural_tolerance), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 20, 290, 10, 0, "contagion_tolerance", Double.valueOf(contagion_tolerance), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 20, 330, 10, 0, "social_tolerance", Double.valueOf(social_tolerance), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 20, 150, 10, 0, "anthropomorphic_promiscuity", Double.valueOf(anthropomorphic_promiscuity), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 20, 110, 10, 0, "sociographic_prudery", Double.valueOf(sociographic_prudery), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 20, 180, 10, 0, "group_ID", Integer.valueOf(group_ID), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 20, 370, 10, 0, "contagion_probability", Double.valueOf(contagion_probability), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 20, 400, 10, 0, "social_probability", Double.valueOf(social_probability), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 20, 70, 10, 0, "prior_anthropomorphic_promiscuity", Double.valueOf(prior_anthropomorphic_promiscuity), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 1410, 320, 10, 0, "group_distance_anthropomorphic", Double.valueOf(group_distance_anthropomorphic), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 20, 30, 10, 0, "prior_sociographic_prudery", Double.valueOf(prior_sociographic_prudery), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 960, 220, 10, 0, "contagionH_distance", Double.valueOf(contagionH_distance), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 960, 270, 10, 0, "socialH_distance", Double.valueOf(socialH_distance), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 1410, 350, 10, 0, "group_distance_sociographic", Double.valueOf(group_distance_sociographic), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 950, 800, 10, 0, "Largest_Group_Size_for_Ritual", Double.valueOf(Largest_Group_Size_for_Ritual), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 20, 1100, 10, 0, "my_extinction_rate", Double.valueOf(my_extinction_rate), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 370, 640, 10, 0, "Available", Boolean.valueOf(Available), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 800, 800, 10, 0, "Number_of_Rituals", Integer.valueOf(Number_of_Rituals), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 20, 510, 10, 0, "my_links", my_links, false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 180, 780, 10, 0, "affect", Double.valueOf(affect), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 20, 980, 10, 0, "memory", memory, false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 20, 1130, 10, 0, "disposition", Double.valueOf(disposition), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 20, 950, 10, 0, "probability", Double.valueOf(probability), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 20, 710, 10, 0, "lambda", Double.valueOf(lambda), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 100, 710, 10, 0, "delta", Double.valueOf(delta), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 100, 730, 10, 0, "learning_rate", Double.valueOf(learning_rate), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 20, 1010, 10, 0, "my_affect_matrix", my_affect_matrix, false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 20, 1040, 10, 0, "my_values", my_values, false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 20, 1070, 10, 0, "my_threshold", Double.valueOf(my_threshold), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 370, 700, 10, 0, "in_ritual", Boolean.valueOf(in_ritual), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 180, 840, 10, 0, "violence_counter", Integer.valueOf(violence_counter), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 180, 810, 10, 0, "affect_previous", Double.valueOf(affect_previous), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 65136, 750, 10, 0, "net_affect_increase_length", Integer.valueOf(net_affect_increase_length), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 65136, 800, 10, 0, "net_affect_increase_length_max", Integer.valueOf(net_affect_increase_length_max), false);
    }
  }
  
  @AnyLogicInternalCodegenAPI
  private void drawModelElements_Functions_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass) {
    if (!_publicOnly) {
      drawFunction(_panel, _g, 700, 50, 10, 0, "set_group_ID");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 700, 80, 10, 0, "set_prior_anthropomorphic_promiscuity");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 700, 200, 10, 0, "set_sociographic_prudery");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 700, 230, 10, 0, "set_anthropomorphic_promiscuity");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 700, 260, 10, 0, "set_predation_tolerance");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 700, 290, 10, 0, "set_natural_tolerance");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 950, 50, 10, 0, "set_contagion_tolerance");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 950, 80, 10, 0, "set_social_tolerance");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 950, 110, 10, 0, "set_contagion_probability");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 950, 140, 10, 0, "set_social_probability");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 950, 200, 10, 0, "set_contagionH_distance");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 1180, 320, 10, 0, "set_group_distance_anthropomorphic");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 370, 670, 10, 0, "join_ritual");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 700, 110, 10, 0, "set_prior_sociographic_prudery");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 950, 250, 10, 0, "set_socialH_distance");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 1180, 350, 10, 0, "set_group_distance_sociographic");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 20, 530, 10, 0, "set_link_list");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 20, 550, 10, 0, "update_link_text");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 20, 830, 10, 0, "belief_affect_increase");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 20, 850, 10, 0, "belief_affect_decrease");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 150, 1130, 10, 0, "update_disposition");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 150, 950, 10, 0, "update_probability_and_memory");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 150, 1070, 10, 0, "set_my_threshold");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 150, 1040, 10, 0, "set_my_values");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 150, 1010, 10, 0, "set_my_affect_matrix");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 20, 760, 10, 0, "update_affect_increase");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 150, 1100, 10, 0, "set_my_extinction_rate");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 20, 790, 10, 0, "update_affect_decrease");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 180, 1150, 10, 0, "getConnectedAgentsWeight");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 210, 1170, 10, 0, "is2ndOrderConnection");
    }
  }
  
  @AnyLogicInternalCodegenAPI
  private void drawModelElements_DataElements_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass) {
    if (!_publicOnly) {
      drawDataset(_panel, _g, 810, 840, 15, 0, "DS_Avg_SP", DS_Avg_SP);
    }
    if (!_publicOnly) {
      drawDataset(_panel, _g, 810, 880, 15, 0, "DS_Avg_AP", DS_Avg_AP);
    }
    if (!_publicOnly) {
      drawDataset(_panel, _g, 800, 910, 15, 0, "DS_Group_Size", DS_Group_Size);
    }
  }
  
  @AnyLogicInternalCodegenAPI
  private void drawModelElements_AgentLinks_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass) {
    if (_publicOnly) return;
    drawLinkToContainer(_panel, _g, 50, -100, 10, 0, "main", main);
    drawLinkToAgent(_panel, _g, 50, -50, 15, 0, "connections", true, connections);
    drawLinkToAgent(_panel, _g, 730, 530, 15, 0, "Links_InGroupRitualMembers", false, Links_InGroupRitualMembers);
    drawLinkToAgent(_panel, _g, 730, 560, 15, 0, "Links_Neighbors", false, Links_Neighbors);
  }
  
  @AnyLogicInternalCodegenAPI
  public void drawModelElements(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass)
  {
    super.drawModelElements(_panel, _g, _publicOnly, true);
    drawModelElements_Events_xjal(_panel, _g, _publicOnly, _isSuperClass);
    drawModelElements_Statecharts_xjal(_panel, _g, _publicOnly, _isSuperClass);
    drawModelElements_PlainVariables_xjal(_panel, _g, _publicOnly, _isSuperClass);
    drawModelElements_Functions_xjal(_panel, _g, _publicOnly, _isSuperClass);
    drawModelElements_DataElements_xjal(_panel, _g, _publicOnly, _isSuperClass);
    drawModelElements_AgentLinks_xjal(_panel, _g, _publicOnly, _isSuperClass);
  }
  
  @AnyLogicInternalCodegenAPI
  private boolean onClickModelAt_AgentLinks_xjal(Panel _panel, double _x, double _y, int _clickCount, boolean _publicOnly, boolean _isSuperClass) {
    if (modelElementContains(_x, _y, 50.0D, -100.0D)) {
      if (_clickCount == 2) {
        _panel.browseAgent_xjal(50.0D, -100.0D, this, "main");
      } else {
        _panel.addInspect(50.0D, -100.0D, this, "main");
      }
      return true;
    }
    if (modelElementContains(_x, _y, 50.0D, -50.0D)) {
      _panel.addInspect_xjal(50.0D, -50.0D, this, "connections", 2);
      return true;
    }
    if (modelElementContains(_x, _y, 730.0D, 530.0D)) {
      _panel.addInspect(730.0D, 530.0D, this, "Links_InGroupRitualMembers");
      return true;
    }
    if (modelElementContains(_x, _y, 730.0D, 560.0D)) {
      _panel.addInspect(730.0D, 560.0D, this, "Links_Neighbors");
      return true;
    }
    return false;
  }
  
  @AnyLogicInternalCodegenAPI
  private boolean onClickModelAt_PlainVariables_xjal(Panel _panel, double _x, double _y, int _clickCount, boolean _publicOnly, boolean _isSuperClass)
  {
    if ((!_publicOnly) && (modelElementContains(_x, _y, 20.0D, 210.0D))) {
      _panel.addInspect(20.0D, 210.0D, this, "predation_tolerance");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, 20.0D, 250.0D))) {
      _panel.addInspect(20.0D, 250.0D, this, "natural_tolerance");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, 20.0D, 290.0D))) {
      _panel.addInspect(20.0D, 290.0D, this, "contagion_tolerance");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, 20.0D, 330.0D))) {
      _panel.addInspect(20.0D, 330.0D, this, "social_tolerance");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, 20.0D, 150.0D))) {
      _panel.addInspect(20.0D, 150.0D, this, "anthropomorphic_promiscuity");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, 20.0D, 110.0D))) {
      _panel.addInspect(20.0D, 110.0D, this, "sociographic_prudery");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, 20.0D, 180.0D))) {
      _panel.addInspect(20.0D, 180.0D, this, "group_ID");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, 20.0D, 370.0D))) {
      _panel.addInspect(20.0D, 370.0D, this, "contagion_probability");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, 20.0D, 400.0D))) {
      _panel.addInspect(20.0D, 400.0D, this, "social_probability");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, 20.0D, 70.0D))) {
      _panel.addInspect(20.0D, 70.0D, this, "prior_anthropomorphic_promiscuity");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, 1410.0D, 320.0D))) {
      _panel.addInspect(1410.0D, 320.0D, this, "group_distance_anthropomorphic");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, 20.0D, 30.0D))) {
      _panel.addInspect(20.0D, 30.0D, this, "prior_sociographic_prudery");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, 960.0D, 220.0D))) {
      _panel.addInspect(960.0D, 220.0D, this, "contagionH_distance");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, 960.0D, 270.0D))) {
      _panel.addInspect(960.0D, 270.0D, this, "socialH_distance");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, 1410.0D, 350.0D))) {
      _panel.addInspect(1410.0D, 350.0D, this, "group_distance_sociographic");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, 950.0D, 800.0D))) {
      _panel.addInspect(950.0D, 800.0D, this, "Largest_Group_Size_for_Ritual");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, 20.0D, 1100.0D))) {
      _panel.addInspect(20.0D, 1100.0D, this, "my_extinction_rate");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, 370.0D, 640.0D))) {
      _panel.addInspect(370.0D, 640.0D, this, "Available");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, 800.0D, 800.0D))) {
      _panel.addInspect(800.0D, 800.0D, this, "Number_of_Rituals");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, 20.0D, 510.0D))) {
      _panel.addInspect(20.0D, 510.0D, this, "my_links");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, 180.0D, 780.0D))) {
      _panel.addInspect(180.0D, 780.0D, this, "affect");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, 20.0D, 980.0D))) {
      _panel.addInspect(20.0D, 980.0D, this, "memory");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, 20.0D, 1130.0D))) {
      _panel.addInspect(20.0D, 1130.0D, this, "disposition");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, 20.0D, 950.0D))) {
      _panel.addInspect(20.0D, 950.0D, this, "probability");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, 20.0D, 710.0D))) {
      _panel.addInspect(20.0D, 710.0D, this, "lambda");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, 100.0D, 710.0D))) {
      _panel.addInspect(100.0D, 710.0D, this, "delta");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, 100.0D, 730.0D))) {
      _panel.addInspect(100.0D, 730.0D, this, "learning_rate");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, 20.0D, 1010.0D))) {
      _panel.addInspect(20.0D, 1010.0D, this, "my_affect_matrix");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, 20.0D, 1040.0D))) {
      _panel.addInspect(20.0D, 1040.0D, this, "my_values");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, 20.0D, 1070.0D))) {
      _panel.addInspect(20.0D, 1070.0D, this, "my_threshold");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, 370.0D, 700.0D))) {
      _panel.addInspect(370.0D, 700.0D, this, "in_ritual");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, 180.0D, 840.0D))) {
      _panel.addInspect(180.0D, 840.0D, this, "violence_counter");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, 180.0D, 810.0D))) {
      _panel.addInspect(180.0D, 810.0D, this, "affect_previous");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -400.0D, 750.0D))) {
      _panel.addInspect(-400.0D, 750.0D, this, "net_affect_increase_length");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -400.0D, 800.0D))) {
      _panel.addInspect(-400.0D, 800.0D, this, "net_affect_increase_length_max");
      return true;
    }
    return false;
  }
  
  @AnyLogicInternalCodegenAPI
  private boolean onClickModelAt_Events_xjal(Panel _panel, double _x, double _y, int _clickCount, boolean _publicOnly, boolean _isSuperClass) {
    if ((!_publicOnly) && (modelElementContains(_x, _y, -400.0D, 550.0D))) {
      _panel.addInspect(-400.0D, 550.0D, this, "event");
      return true;
    }
    return false;
  }
  
  @AnyLogicInternalCodegenAPI
  private boolean onClickModelAt_DataElements_xjal(Panel _panel, double _x, double _y, int _clickCount, boolean _publicOnly, boolean _isSuperClass) {
    if ((!_publicOnly) && (modelElementContains(_x, _y, 810.0D, 840.0D))) {
      _panel.addInspect(810.0D, 840.0D, this, "DS_Avg_SP");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, 810.0D, 880.0D))) {
      _panel.addInspect(810.0D, 880.0D, this, "DS_Avg_AP");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, 800.0D, 910.0D))) {
      _panel.addInspect(800.0D, 910.0D, this, "DS_Group_Size");
      return true;
    }
    return false;
  }
  
  @AnyLogicInternalCodegenAPI
  public boolean onClickModelAt(Panel _panel, double _x, double _y, int _clickCount, boolean _publicOnly, boolean _isSuperClass)
  {
    if (onClickModelAt_AgentLinks_xjal(_panel, _x, _y, _clickCount, _publicOnly, _isSuperClass)) return true;
    if (onClickModelAt_PlainVariables_xjal(_panel, _x, _y, _clickCount, _publicOnly, _isSuperClass)) return true;
    if (onClickModelAt_Events_xjal(_panel, _x, _y, _clickCount, _publicOnly, _isSuperClass)) return true;
    if (onClickModelAt_DataElements_xjal(_panel, _x, _y, _clickCount, _publicOnly, _isSuperClass)) return true;
    return super.onClickModelAt(_panel, _x, _y, _clickCount, _publicOnly, true);
  }
  




  public Person(Engine engine, Agent owner, AgentList<? extends Person> ownerPopulation)
  {
    super(engine, owner, ownerPopulation);_createPersistentElementsBP0_xjal();
    


































































































































































    connections = new LinkToAgentStandardImpl(this, _connections_commonAnimationSettings_xjal);
    














    Links_InGroupRitualMembers = new LinkToAgentCollectionImpl(this, _Links_InGroupRitualMembers_commonAnimationSettings_xjal);
    



    Links_Neighbors = new LinkToAgentCollectionImpl(this, _Links_Neighbors_commonAnimationSettings_xjal);instantiateBaseStructureThis_xjal();
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
  
  @AnyLogicInternalCodegenAPI
  private void setupReferences_xjal() {
    main = get_Main();
  }
  


  @AnyLogicCustomSerialization(AnyLogicCustomSerializationMode.REFERENCE)
  public transient Main main;
  

  @AnyLogicInternalCodegenAPI
  public void doCreate()
  {
    super.doCreate();
    
    setupPlainVariables_Person_xjal();
    
    _createPersistentElementsAP0_xjal();
    presentation = new ShapeTopLevelPresentationGroup(this, true, 0.0D, 0.0D, 0.0D, 0.0D, new Object[] { person, text_Links, text, text1, text2, text3, text5, text6, text4, plot, plot1 });
    icon = new ShapeModelElementsGroup(this, (ModelElementDescriptor[])getElementProperty("merv_1_0_3.Person.icon", "modelElementDescriptors"), new Object[0]);
    icon.setIconOffsets(0.0D, 0.0D);
    

    setupInitialConditions_xjal(Person.class);
  }
  
  @AnyLogicInternalCodegenAPI
  public void setupExt_xjal(AgentExtension _ext)
  {
    if (((_ext instanceof ExtAgentWithSpatialMetrics)) && ((_ext instanceof ExtWithSpaceType)))
    {
      double _value = 
        10.0D;
      
      ((ExtAgentWithSpatialMetrics)_ext).setSpeed(_value, MPS);
    }
    if ((_ext instanceof ExtAgentContinuous)) {
      ExtAgentContinuous _e = (ExtAgentContinuous)_ext;
      _e.setAutomaticVerticalRotation(true);
    }
  }
  
  @AnyLogicInternalCodegenAPI
  public void doStart()
  {
    super.doStart();
    event.start();
    _plot_autoUpdateEvent_xjal.start();
    _plot1_autoUpdateEvent_xjal.start();
    statechart.start();
  }
  




  @AnyLogicInternalCodegenAPI
  public void setupPlainVariables_xjal()
  {
    setupPlainVariables_Person_xjal();
  }
  



  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_Person_xjal()
  {
    Available = 
      true;
    
    Number_of_Rituals = 
      0;
    
    my_links = 
      new double[main.pop];
    
    affect = 
      0.001D;
    
    memory = 
      new ArrayList();
    
    disposition = 
      0.0D;
    
    probability = 
      4.0D;
    
    lambda = 
      1.0D;
    
    delta = 
      0.0D;
    
    learning_rate = 
      0.05D;
    
    my_affect_matrix = 
      new double[(int)main.num_beliefs];
    
    my_values = 
      new double[(int)main.num_beliefs];
    
    my_threshold = 
      0.5D;
    
    in_ritual = 
      false;
    
    violence_counter = 
      0;
    
    affect_previous = 
      0.0D;
    
    net_affect_increase_length = 
      0;
    
    net_affect_increase_length_max = 
      0;
  }
  


  public Main get_Main()
  {
    Agent owner = getOwner();
    if ((owner instanceof Main)) { return (Main)owner;
    }
    return null;
  }
  






  @AnyLogicInternalCodegenAPI
  static LinkToAgentAnimationSettings _connections_commonAnimationSettings_xjal = new LinkToAgentAnimationSettingsImpl(false, UtilitiesColor.black, 1.0D, LINE_STYLE_SOLID, ARROW_NONE, 0.0D);
  public LinkToAgentCollection<Agent, Agent> connections;
  
  public LinkToAgentCollection<? extends Agent, ? extends Agent> getLinkToAgentStandard_xjal()
  {
    return connections;
  }
  
  @AnyLogicInternalCodegenAPI
  public void onReceive(Object _msg_xjal, Agent _sender_xjal) {
    super.onReceive(_msg_xjal, _sender_xjal);
    statechart.fireEvent(_msg_xjal);
  }
  

  @AnyLogicInternalCodegenAPI
  static LinkToAgentAnimationSettings _Links_InGroupRitualMembers_commonAnimationSettings_xjal = new LinkToAgentAnimationSettingsImpl(true, UtilitiesColor.black, 1.0D, LINE_STYLE_SOLID, ARROW_NONE, 0.0D);
  
  public LinkToAgentCollection<Person, Person> Links_InGroupRitualMembers;
  
  @AnyLogicInternalCodegenAPI
  static LinkToAgentAnimationSettings _Links_Neighbors_commonAnimationSettings_xjal = new LinkToAgentAnimationSettingsImpl(false, UtilitiesColor.black, 1.0D, LINE_STYLE_SOLID, ARROW_NONE, 0.0D);
  public LinkToAgentCollection<Person, Person> Links_Neighbors;
  @AnyLogicInternalCodegenAPI
  private static final long serialVersionUID = 2344309920102185511L;
  
  public Person()
  {
    _createPersistentElementsBP0_xjal();
    





















































































































































































































































































































































































































































































































































































































































































































































































































































































































































    connections = new LinkToAgentStandardImpl(this, _connections_commonAnimationSettings_xjal);
    














    Links_InGroupRitualMembers = new LinkToAgentCollectionImpl(this, _Links_InGroupRitualMembers_commonAnimationSettings_xjal);
    



    Links_Neighbors = new LinkToAgentCollectionImpl(this, _Links_Neighbors_commonAnimationSettings_xjal);
  }
  
  @AnyLogicInternalCodegenAPI
  public void drawLinksToAgents(boolean _underAgents_xjal, LinkToAgentAnimator _animator_xjal) {
    super.drawLinksToAgents(_underAgents_xjal, _animator_xjal);
    if (_underAgents_xjal) {
      _animator_xjal.drawLink(this, connections, true, true);
    }
    if (_underAgents_xjal) {
      _animator_xjal.drawLink(this, Links_InGroupRitualMembers, false, false);
    }
    if (_underAgents_xjal) {
      _animator_xjal.drawLink(this, Links_Neighbors, false, false);
    }
  }
  
  public AgentList<? extends Person> getPopulation() {
    return super.getPopulation();
  }
  
  public List<? extends Person> agentsInRange(double distance) {
    return super.agentsInRange(distance);
  }
  
  @AnyLogicInternalCodegenAPI
  public boolean isLoggingToDB(EventOriginator _e)
  {
    if (_e == _plot_autoUpdateEvent_xjal) return false;
    if (_e == _plot1_autoUpdateEvent_xjal) return false;
    return super.isLoggingToDB(_e);
  }
  
  public void onChange()
  {
    super.onChange();
    statechart.onChange();
  }
  
  @AnyLogicInternalCodegenAPI
  public void onDestroy() {
    event.onDestroy();
    _plot_autoUpdateEvent_xjal.onDestroy();
    _plot1_autoUpdateEvent_xjal.onDestroy();
    Links_InGroupRitualMembers.onDestroy();
    Links_Neighbors.onDestroy();
    statechart.onDestroy();
    
    DS_Avg_SP.destroyUpdater_xjal();
    DS_Avg_AP.destroyUpdater_xjal();
    DS_Group_Size.destroyUpdater_xjal();
    super.onDestroy();
  }
}
