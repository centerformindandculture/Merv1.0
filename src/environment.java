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
import com.anylogic.engine.elements.IElementDescriptor;
import com.anylogic.engine.presentation.LinkToAgentAnimator;
import com.anylogic.engine.presentation.ModelElementDescriptor;
import com.anylogic.engine.presentation.Panel;
import com.anylogic.engine.presentation.ShapeGroup;
import com.anylogic.engine.presentation.ShapeModelElementsGroup;
import com.anylogic.engine.presentation.ShapePolyLine;
import com.anylogic.engine.presentation.ShapeRectangle;
import com.anylogic.engine.presentation.ShapeText;
import com.anylogic.engine.presentation.ShapeTopLevelPresentationGroup;
import com.anylogic.engine.presentation.UtilitiesColor;
import com.anylogic.engine.presentation.ViewArea;
import java.awt.Font;
import java.awt.Graphics2D;
import java.util.List;
import java.util.Map;
































public class environment
  extends Agent
{
  public double ecological_capital;
  public double social_capital;
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors(environment.class);
  


  @AnyLogicInternalCodegenAPI
  public Map<String, IElementDescriptor> getElementDesciptors() { return elementDesciptors_xjal; }
  
  @AnyLogicCustomProposalPriority(type=AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final Scale scale = new Scale(10.0D);
  
  public Scale getScale()
  {
    return scale;
  }
  






  public Statechart<environment.statechart_state> statechart = new Statechart(this, (short)1);
  public Statechart<environment.statechart_time_state> statechart_time = new Statechart(this, (short)1);
  
  @AnyLogicInternalCodegenAPI
  public String getNameOf(Statechart _s)
  {
    if (_s == statechart) return "statechart";
    if (_s == statechart_time) return "statechart_time";
    return super.getNameOf(_s);
  }
  
  @AnyLogicInternalCodegenAPI
  public void executeActionOf(Statechart _s)
  {
    if (_s == statechart) {
      enterState(state_set_position, true);
      return;
    }
    if (_s == statechart_time) {
      enterState(wait_for_initialization, true);
      return;
    }
    super.executeActionOf(_s);
  }
  



















































  @AnyLogicCustomProposalPriority(type=AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final environment.statechart_state state_set_position = environment.statechart_state.state_set_position;
  @AnyLogicCustomProposalPriority(type=AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final environment.statechart_state state_create_neighbor_links = environment.statechart_state.state_create_neighbor_links;
  @AnyLogicCustomProposalPriority(type=AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final environment.statechart_state finalState = environment.statechart_state.finalState;
  
















































  @AnyLogicCustomProposalPriority(type=AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final environment.statechart_time_state wait_for_initialization = environment.statechart_time_state.wait_for_initialization;
  @AnyLogicCustomProposalPriority(type=AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final environment.statechart_time_state update_and_color_time = environment.statechart_time_state.update_and_color_time;
  
  @AnyLogicInternalCodegenAPI
  private void enterState(environment.statechart_state _state, boolean _destination)
  {
    switch (_state) {
    case finalState: 
      logToDBEnterState(statechart, _state);
      
      statechart.setActiveState_xjal(state_set_position);
      


      double columnIndex = Math.floor(getIndex() % 10) * 50.0D;
      double rowIndex = Math.floor(getIndex() / 10) * 50.0D;
      

      setXY(30.0D + columnIndex, 30.0D + rowIndex);
      
      statechart.fireEvent("create_neighbor_links");
      
      transition7.start();
      return;
    case state_create_neighbor_links: 
      logToDBEnterState(statechart, _state);
      
      statechart.setActiveState_xjal(state_create_neighbor_links);
      
      int columnIndex = (int)Math.floor(getIndex() % 10);
      int rowIndex = (int)Math.floor(getIndex() / 10);
      int neighbor_index_top = 0;
      int neighbor_index_right = 0;
      int neighbor_index_bottom = 0;
      int neighbor_index_left = 0;
      








































      statechart.fireEvent("create_ecological_capital");
      
      transition.start();
      return;
    case state_set_position: 
      logToDBEnterState(statechart, _state);
      
      statechart.setActiveState_xjal(finalState);
      statechart.onDestroy();
      return;
    }
    
  }
  
  @AnyLogicInternalCodegenAPI
  private void exitState(environment.statechart_state _state, Transition _t, boolean _source)
  {
    switch (_state) {
    case finalState: 
      logToDBExitState(statechart, _state);
      logToDB(statechart, _t, _state);
      
      if ((!_source) || (_t != transition7)) transition7.cancel();
      return;
    case state_create_neighbor_links: 
      logToDBExitState(statechart, _state);
      logToDB(statechart, _t, _state);
      
      if ((!_source) || (_t != transition)) transition.cancel();
      return;
    }
    
  }
  
  @AnyLogicInternalCodegenAPI
  private void exitInnerStates(environment.statechart_state _destination)
  {
    environment.statechart_state _state = (environment.statechart_state)statechart.getActiveSimpleState();
    while (_state != _destination) {
      exitState(_state, null, false);
      _state = (environment.statechart_state)_state.getContainerState();
    }
  }
  
  @AnyLogicInternalCodegenAPI
  private void enterState(environment.statechart_time_state _state, boolean _destination) { switch (_state) {
    case update_and_color_time: 
      logToDBEnterState(statechart_time, _state);
      
      statechart_time.setActiveState_xjal(wait_for_initialization);
      transition6.start();
      return;
    case wait_for_initialization: 
      logToDBEnterState(statechart_time, _state);
      
      statechart_time.setActiveState_xjal(update_and_color_time);
      



      settlement_shape.setFillColor(UtilitiesColor.green);
      









      transition4.start();
      return;
    }
    
  }
  
  @AnyLogicInternalCodegenAPI
  private void exitState(environment.statechart_time_state _state, Transition _t, boolean _source)
  {
    switch (_state) {
    case update_and_color_time: 
      logToDBExitState(statechart_time, _state);
      logToDB(statechart_time, _t, _state);
      
      if ((!_source) || (_t != transition6)) transition6.cancel();
      return;
    case wait_for_initialization: 
      logToDBExitState(statechart_time, _state);
      logToDB(statechart_time, _t, _state);
      
      if ((!_source) || (_t != transition4)) transition4.cancel();
      return;
    }
    
  }
  
  @AnyLogicInternalCodegenAPI
  private void exitInnerStates(environment.statechart_time_state _destination)
  {
    environment.statechart_time_state _state = (environment.statechart_time_state)statechart_time.getActiveSimpleState();
    while (_state != _destination) {
      exitState(_state, null, false);
      _state = (environment.statechart_time_state)_state.getContainerState();
    }
  }
  
  public TransitionTimeout transition4 = new TransitionTimeout(this);
  
  @AnyLogicInternalCodegenAPI
  public String getNameOf(TransitionTimeout _t)
  {
    if (_t == transition4) return "transition4";
    return super.getNameOf(_t);
  }
  
  @AnyLogicInternalCodegenAPI
  public Statechart getStatechartOf(TransitionTimeout _t)
  {
    if (_t == transition4) return statechart_time;
    return super.getStatechartOf(_t);
  }
  
  @AnyLogicInternalCodegenAPI
  public void executeActionOf(TransitionTimeout _t)
  {
    if (_t == transition4) {
      exitState(update_and_color_time, _t, true);
      enterState(update_and_color_time, true);
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
      
      _value = toModelTime(_value, YEAR);
      return _value;
    }
    return super.evaluateTimeoutOf(_t);
  }
  


  public TransitionMessage transition7 = new TransitionMessage(this);
  public TransitionMessage transition = new TransitionMessage(this);
  public TransitionMessage transition6 = new TransitionMessage(this);
  
  @AnyLogicInternalCodegenAPI
  public String getNameOf(TransitionMessage _t)
  {
    if (_t == transition7) return "transition7";
    if (_t == transition) return "transition";
    if (_t == transition6) return "transition6";
    return super.getNameOf(_t);
  }
  
  @AnyLogicInternalCodegenAPI
  public Statechart getStatechartOf(TransitionMessage _t)
  {
    if (_t == transition7) return statechart;
    if (_t == transition) return statechart;
    if (_t == transition6) return statechart_time;
    return super.getStatechartOf(_t);
  }
  
  @AnyLogicInternalCodegenAPI
  public void executeActionOf(TransitionMessage _t, Object _msg)
  {
    if (_t == transition7) {
      exitState(state_set_position, _t, true);
      enterState(state_create_neighbor_links, true);
      return;
    }
    if (_t == transition) {
      exitState(state_create_neighbor_links, _t, true);
      enterState(finalState, true);
      return;
    }
    if (_t == transition6) {
      exitState(wait_for_initialization, _t, true);
      enterState(update_and_color_time, true);
      return;
    }
    super.executeActionOf(_t, _msg);
  }
  
  @AnyLogicInternalCodegenAPI
  public boolean testMessageOf(TransitionMessage _t, Object _msg) {
    if (_t == transition7)
    {

      Object msg = _msg;
      Object _g = 
        "create_neighbor_links";
      
      return msg.equals(_g);
    }
    if (_t == transition)
    {

      Object msg = _msg;
      Object _g = 
        "create_ecological_capital";
      
      return msg.equals(_g);
    }
    if (_t == transition6)
    {

      Object msg = _msg;
      Object _g = 
        "continue";
      
      return msg.equals(_g);
    }
    return super.testMessageOf(_t, _msg);
  }
  
  public ViewArea viewArea_settlement = new ViewArea(this, null, 0.0D, 0.0D, 1000.0D, 800.0D);
  public ViewArea _origin_VA = new ViewArea(this, "[Origin]", 0.0D, 0.0D, 1000.0D, 800.0D);
  
  @AnyLogicInternalCodegenAPI
  public int getViewAreas(Map<String, ViewArea> _output) {
    if (_output != null) {
      _output.put("viewArea_settlement", viewArea_settlement);
      _output.put("_origin_VA", _origin_VA);
    }
    return 2 + super.getViewAreas(_output); }
  
  @AnyLogicInternalCodegenAPI
  protected static final Font _text_Font = new Font("SansSerif", 1, 12);
  @AnyLogicInternalCodegenAPI
  protected static final int _text = 1;
  @AnyLogicInternalCodegenAPI
  protected static final int _settlement_shape = 2;
  @AnyLogicInternalCodegenAPI
  protected static final int _shape_settled = 3;
  @AnyLogicInternalCodegenAPI
  protected static final int _group = 4;
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 5;
  @AnyLogicInternalCodegenAPI
  protected static final int _presentation = 0;
  @AnyLogicInternalCodegenAPI
  protected static final int _icon = -1;
  protected ShapeText text;
  protected ShapeRectangle settlement_shape;
  protected ShapePolyLine shape_settled;
  protected ShapeGroup group;
  protected ShapeTopLevelPresentationGroup presentation;
  protected ShapeModelElementsGroup icon;
  
  @AnyLogicInternalCodegenAPI
  public boolean isPublicPresentationDefined() { return false; }
  
  @AnyLogicInternalCodegenAPI
  public boolean isEmbeddedAgentPresentationVisible(Agent _a)
  {
    return super.isEmbeddedAgentPresentationVisible(_a);
  }
  




  @AnyLogicInternalCodegenAPI
  protected static final double[] _shape_settled_pointsDX_xjal()
  {
    return new double[] { 0.0D, -5.0D, -25.0D, -30.0D, -30.0D, -25.0D, -5.0D, 0.0D, 0.0D, -5.0D, -25.0D, -30.0D, -30.0D };
  }
  
  @AnyLogicInternalCodegenAPI
  protected static final double[] _shape_settled_pointsDY_xjal() { return new double[] { 0.0D, -5.0D, -5.0D, 0.0D, 10.0D, 15.0D, 15.0D, 20.0D, 30.0D, 35.0D, 35.0D, 30.0D, 25.0D }; }
  
  @AnyLogicInternalCodegenAPI
  protected static final double[] _shape_settled_pointsDZ_xjal() {
    return new double[] { 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D };
  }
  
  @AnyLogicInternalCodegenAPI
  public boolean onShapeClick(int _shape, int index, double clickx, double clicky)
  {
    switch (_shape)
    {
    case 2: 
      ShapeRectangle self = settlement_shape;
      
      viewArea_settlement.navigateTo();
      

      break;
    
    case 3: 
      ShapePolyLine self = shape_settled;
      
      viewArea_settlement.navigateTo();
      
      break;
    default:  return super.onShapeClick(_shape, index, clickx, clicky);
    }
    return false;
  }
  





  @AnyLogicInternalCodegenAPI
  private void _shape_settled_SetDynamicParams_xjal(ShapePolyLine shape)
  {
    boolean _visible = 
      false;
    
    shape.setVisible(_visible);
  }
  



  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal()
  {
    text = new ShapeText(
      SHAPE_DRAW_2D, false, 380.0D, 80.0D, 0.0D, 0.0D, 
      UtilitiesColor.black, "Potential Settlement:", 
      _text_Font, ALIGNMENT_LEFT);
    
    settlement_shape = new environment.1(this, 
      SHAPE_DRAW_2D, true, -30.0D, -30.0D, 0.0D, 0.0D, 
      UtilitiesColor.black, UtilitiesColor.white, 
      50.0D, 50.0D, 10.0D, 1.0D, LINE_STYLE_SOLID);
    












    shape_settled = new environment.2(this, 
      SHAPE_DRAW_2D, true, 10.0D, -20.0D, 0.0D, UtilitiesColor.black, null, 
      13, _shape_settled_pointsDX_xjal(), _shape_settled_pointsDY_xjal(), _shape_settled_pointsDZ_xjal(), false, 10.0D, 1.0D, LINE_STYLE_SOLID);
    

















    shape_settled.setVisible(false);
  }
  
  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal()
  {
    group = new ShapeGroup(this, SHAPE_DRAW_2D, false, 0.0D, 0.0D, 0.0D, 0.0D, new Object[] {
    
      settlement_shape, 
      shape_settled });
  }
  










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
    case 1:  return text;
    case 2:  return settlement_shape;
    case 3:  return shape_settled;
    case 4:  return group; }
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
      _name_xjal = checkNameOfShape_xjal(_shape, text, "text"); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal(_shape, settlement_shape, "settlement_shape"); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal(_shape, shape_settled, "shape_settled"); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal(_shape, group, "group"); if (_name_xjal != null) return _name_xjal;
    } catch (Exception e) {
      return null;
    }
    return super.getNameOfShape_xjal(_shape); }
  
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition7_pointsX_xjal = { 100, 100 };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition7_pointsY_xjal = { 220, 270 };
  
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition_pointsX_xjal = { 100, 100 };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition_pointsY_xjal = { 300, 342 };
  
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition6_pointsX_xjal = { 320, 320 };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition6_pointsY_xjal = { 300, 350 };
  
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition4_pointsX_xjal = { 290, 290, 340, 340 };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition4_pointsY_xjal = { 380, 410, 410, 380 };
  @AnyLogicCustomSerialization(AnyLogicCustomSerializationMode.REFERENCE)
  public transient Main main;
  
  @AnyLogicInternalCodegenAPI
  private void drawModelElements_Statecharts_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass) { if (!_publicOnly) {
      drawState(_panel, _g, 50, 190, 120, 30, 15, 15, "state_set_position", UtilitiesColor.GOLD, state_set_position, statechart);
    }
    if (!_publicOnly) {
      drawFinalState(_panel, _g, 100, 350, 10, 0, null, finalState, statechart);
    }
    if (!_publicOnly) {
      drawState(_panel, _g, 50, 270, 170, 30, 10, 10, "state_create_neighbor_links", UtilitiesColor.GOLD, state_create_neighbor_links, statechart);
    }
    if (!_publicOnly) {
      drawStatechartEntryPoint(_panel, _g, 100, 150, 100, 190, 110, 150, "statechart", statechart);
    }
    if (!_publicOnly) {
      drawTransition(_panel, _g, _transition_pointsX_xjal, _transition_pointsY_xjal, 110, 300, null, transition, Agent.TransitionIcon.MESSAGE, 100, 320);
    }
    if (!_publicOnly) {
      drawTransition(_panel, _g, _transition7_pointsX_xjal, _transition7_pointsY_xjal, 110, 220, null, transition7, Agent.TransitionIcon.MESSAGE, 100, 240);
    }
    if (!_publicOnly) {
      drawState(_panel, _g, 250, 350, 140, 30, 10, 10, "update_and_color_time", UtilitiesColor.GOLD, update_and_color_time, statechart_time);
    }
    if (!_publicOnly) {
      drawState(_panel, _g, 250, 270, 130, 30, 10, 15, "wait_for_initialization", UtilitiesColor.GOLD, wait_for_initialization, statechart_time);
    }
    if (!_publicOnly) {
      drawStatechartEntryPoint(_panel, _g, 320, 230, 320, 270, 330, 230, "statechart_time", statechart_time);
    }
    if (!_publicOnly) {
      drawTransition(_panel, _g, _transition4_pointsX_xjal, _transition4_pointsY_xjal, 300, 380, null, transition4, Agent.TransitionIcon.TIMEOUT, 290, 400);
    }
    if (!_publicOnly) {
      drawTransition(_panel, _g, _transition6_pointsX_xjal, _transition6_pointsY_xjal, 330, 300, null, transition6, Agent.TransitionIcon.MESSAGE, 320, 320);
    }
  }
  
  @AnyLogicInternalCodegenAPI
  private void drawModelElements_PlainVariables_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass) {
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 60, 410, 10, 0, "ecological_capital", Double.valueOf(ecological_capital), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 60, 460, 10, 0, "social_capital", Double.valueOf(social_capital), false);
    }
  }
  
  @AnyLogicInternalCodegenAPI
  private void drawModelElements_AgentLinks_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass) {
    if (_publicOnly) return;
    drawLinkToContainer(_panel, _g, 50, -100, 10, 0, "main", main);
    drawLinkToAgent(_panel, _g, 50, -50, 15, 0, "connections", true, connections);
    drawLinkToAgent(_panel, _g, 300, 130, 15, 0, "neighbor_links", false, neighbor_links);
    drawLinkToAgent(_panel, _g, 460, 130, 15, 0, "building_link", false, building_link);
    drawLinkToAgent(_panel, _g, 300, 170, 15, 0, "residence_links", false, residence_links);
  }
  
  @AnyLogicInternalCodegenAPI
  public void drawModelElements(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass)
  {
    super.drawModelElements(_panel, _g, _publicOnly, true);
    drawModelElements_Statecharts_xjal(_panel, _g, _publicOnly, _isSuperClass);
    drawModelElements_PlainVariables_xjal(_panel, _g, _publicOnly, _isSuperClass);
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
    if (modelElementContains(_x, _y, 300.0D, 130.0D)) {
      _panel.addInspect(300.0D, 130.0D, this, "neighbor_links");
      return true;
    }
    if (modelElementContains(_x, _y, 460.0D, 130.0D)) {
      _panel.addInspect(460.0D, 130.0D, this, "building_link");
      return true;
    }
    if (modelElementContains(_x, _y, 300.0D, 170.0D)) {
      _panel.addInspect(300.0D, 170.0D, this, "residence_links");
      return true;
    }
    return false;
  }
  
  @AnyLogicInternalCodegenAPI
  private boolean onClickModelAt_PlainVariables_xjal(Panel _panel, double _x, double _y, int _clickCount, boolean _publicOnly, boolean _isSuperClass)
  {
    if ((!_publicOnly) && (modelElementContains(_x, _y, 60.0D, 410.0D))) {
      _panel.addInspect(60.0D, 410.0D, this, "ecological_capital");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, 60.0D, 460.0D))) {
      _panel.addInspect(60.0D, 460.0D, this, "social_capital");
      return true;
    }
    return false;
  }
  
  @AnyLogicInternalCodegenAPI
  public boolean onClickModelAt(Panel _panel, double _x, double _y, int _clickCount, boolean _publicOnly, boolean _isSuperClass)
  {
    if (onClickModelAt_AgentLinks_xjal(_panel, _x, _y, _clickCount, _publicOnly, _isSuperClass)) return true;
    if (onClickModelAt_PlainVariables_xjal(_panel, _x, _y, _clickCount, _publicOnly, _isSuperClass)) return true;
    return super.onClickModelAt(_panel, _x, _y, _clickCount, _publicOnly, true);
  }
  




  public environment(Engine engine, Agent owner, AgentList<? extends environment> ownerPopulation)
  {
    super(engine, owner, ownerPopulation);_createPersistentElementsBP0_xjal();
    
















































































































    connections = new LinkToAgentStandardImpl(this, _connections_commonAnimationSettings_xjal);
    















    neighbor_links = new LinkToAgentCollectionImpl(this, _neighbor_links_commonAnimationSettings_xjal);
    



    building_link = new LinkToAgentCollectionImpl(this, _building_link_commonAnimationSettings_xjal);
    



    residence_links = new LinkToAgentCollectionImpl(this, _residence_links_commonAnimationSettings_xjal);instantiateBaseStructureThis_xjal();
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
  






  @AnyLogicInternalCodegenAPI
  public void doCreate()
  {
    super.doCreate();
    
    setupPlainVariables_environment_xjal();
    
    _createPersistentElementsAP0_xjal();
    presentation = new ShapeTopLevelPresentationGroup(this, true, 0.0D, 0.0D, 0.0D, 0.0D, new Object[] { text, group });
    icon = new ShapeModelElementsGroup(this, (ModelElementDescriptor[])getElementProperty("merv_1_0_3.environment.icon", "modelElementDescriptors"), new Object[0]);
    icon.setIconOffsets(0.0D, 0.0D);
    

    setupInitialConditions_xjal(environment.class);
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
    statechart.start();
    statechart_time.start();
  }
  




  @AnyLogicInternalCodegenAPI
  public void setupPlainVariables_xjal()
  {
    setupPlainVariables_environment_xjal();
  }
  



  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_environment_xjal()
  {
    ecological_capital = 
      0.0D;
    
    social_capital = 
      0.0D;
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
    statechart_time.fireEvent(_msg_xjal);
    statechart.fireEvent(_msg_xjal);
  }
  

  @AnyLogicInternalCodegenAPI
  static LinkToAgentAnimationSettings _neighbor_links_commonAnimationSettings_xjal = new LinkToAgentAnimationSettingsImpl(false, UtilitiesColor.red, 1.0D, LINE_STYLE_SOLID, ARROW_NONE, 0.0D);
  
  public LinkToAgentCollection<Agent, Agent> neighbor_links;
  
  @AnyLogicInternalCodegenAPI
  static LinkToAgentAnimationSettings _building_link_commonAnimationSettings_xjal = new LinkToAgentAnimationSettingsImpl(true, UtilitiesColor.red, 1.0D, LINE_STYLE_SOLID, ARROW_NONE, 0.0D);
  
  public LinkToAgentCollection<Agent, Agent> building_link;
  
  @AnyLogicInternalCodegenAPI
  static LinkToAgentAnimationSettings _residence_links_commonAnimationSettings_xjal = new LinkToAgentAnimationSettingsImpl(false, UtilitiesColor.black, 1.0D, LINE_STYLE_SOLID, ARROW_NONE, 0.0D);
  public LinkToAgentCollection<Agent, Agent> residence_links;
  @AnyLogicInternalCodegenAPI
  private static final long serialVersionUID = 2341884251727125366L;
  
  public environment()
  {
    _createPersistentElementsBP0_xjal();
    
















































































































































































































































































































    connections = new LinkToAgentStandardImpl(this, _connections_commonAnimationSettings_xjal);
    















    neighbor_links = new LinkToAgentCollectionImpl(this, _neighbor_links_commonAnimationSettings_xjal);
    



    building_link = new LinkToAgentCollectionImpl(this, _building_link_commonAnimationSettings_xjal);
    



    residence_links = new LinkToAgentCollectionImpl(this, _residence_links_commonAnimationSettings_xjal);
  }
  
  @AnyLogicInternalCodegenAPI
  public void drawLinksToAgents(boolean _underAgents_xjal, LinkToAgentAnimator _animator_xjal) {
    super.drawLinksToAgents(_underAgents_xjal, _animator_xjal);
    if (!_underAgents_xjal) {
      _animator_xjal.drawLink(this, connections, true, true);
    }
    if (!_underAgents_xjal) {
      _animator_xjal.drawLink(this, neighbor_links, false, false);
    }
    if (!_underAgents_xjal) {
      _animator_xjal.drawLink(this, building_link, false, false);
    }
    if (_underAgents_xjal) {
      _animator_xjal.drawLink(this, residence_links, false, false);
    }
  }
  
  public AgentList<? extends environment> getPopulation() {
    return super.getPopulation();
  }
  
  public List<? extends environment> agentsInRange(double distance) {
    return super.agentsInRange(distance);
  }
  
  public void onChange()
  {
    super.onChange();
    statechart.onChange();
    statechart_time.onChange();
  }
  
  @AnyLogicInternalCodegenAPI
  public void onDestroy() {
    neighbor_links.onDestroy();
    building_link.onDestroy();
    residence_links.onDestroy();
    statechart.onDestroy();
    statechart_time.onDestroy();
    super.onDestroy();
  }
}
