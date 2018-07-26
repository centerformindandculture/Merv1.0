package merv_1_0_3;

import com.anylogic.engine.Agent;
import com.anylogic.engine.Agent.TransitionIcon;
import com.anylogic.engine.AgentExtension;
import com.anylogic.engine.AgentList;
import com.anylogic.engine.AnyLogicCustomProposalPriority;
import com.anylogic.engine.AnyLogicCustomProposalPriority.Type;
import com.anylogic.engine.AnyLogicInternalCodegenAPI;
import com.anylogic.engine.Engine;
import com.anylogic.engine.ExtAgentContinuous;
import com.anylogic.engine.ExtAgentWithSpatialMetrics;
import com.anylogic.engine.ExtWithSpaceType;
import com.anylogic.engine.LinkToAgentAnimationSettings;
import com.anylogic.engine.LinkToAgentAnimationSettingsImpl;
import com.anylogic.engine.LinkToAgentCollection;
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
import com.anylogic.engine.presentation.ShapeCurve;
import com.anylogic.engine.presentation.ShapeGroup;
import com.anylogic.engine.presentation.ShapeModelElementsGroup;
import com.anylogic.engine.presentation.ShapeTopLevelPresentationGroup;
import com.anylogic.engine.presentation.UtilitiesColor;
import com.anylogic.engine.presentation.ViewArea;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
































public class Hazard_Social
  extends Agent
{
  public String Type;
  @AnyLogicInternalCodegenAPI
  private static String[] _parameterNames_xjal;
  
  @AnyLogicInternalCodegenAPI
  public String _Type_DefaultValue_xjal()
  {
    Hazard_Social self = this;
    return 
      "NaturalDisaster";
  }
  
  public void set_Type(String Type)
  {
    if (Type == this.Type) {
      return;
    }
    String _oldValue_xjal = this.Type;
    this.Type = Type;
    onChange_Type_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_Type()
  {
    onChange_Type_xjal(Type);
  }
  





  public void setParametersToDefaultValues()
  {
    super.setParametersToDefaultValues();
    Type = _Type_DefaultValue_xjal();
  }
  
  public boolean setParameter(String _name_xjal, Object _value_xjal, boolean _callOnChange_xjal) {
    String str;
    switch ((str = _name_xjal).hashCode()) {case 2622298:  if (str.equals("Type"))
      {
        if (_callOnChange_xjal) {
          set_Type((String)_value_xjal);
        } else {
          Type = ((String)_value_xjal);
        }
        return true; }
      break; }
    return super.setParameter(_name_xjal, _value_xjal, _callOnChange_xjal);
  }
  
  public <T> T getParameter(String _name_xjal)
  {
    String str;
    Object _result_xjal;
    switch ((str = _name_xjal).hashCode()) {case 2622298:  if (str.equals("Type"))
        _result_xjal = Type;
      break; } Object _result_xjal = super.getParameter(_name_xjal);
    
    return _result_xjal;
  }
  



  public String[] getParameterNames()
  {
    String[] result = _parameterNames_xjal;
    if (result == null) {
      List<String> list = new ArrayList(Arrays.asList(super.getParameterNames()));
      list.add("Type");
      result = (String[])list.toArray(new String[list.size()]);
      _parameterNames_xjal = result;
    }
    return result; }
  
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors(Hazard_Social.class);
  


  @AnyLogicInternalCodegenAPI
  public Map<String, IElementDescriptor> getElementDesciptors() { return elementDesciptors_xjal; }
  
  @AnyLogicCustomProposalPriority(type=AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final Scale scale = new Scale(10.0D);
  
  public Scale getScale()
  {
    return scale;
  }
  






  public Statechart<Hazard_Social.statechart_state> statechart = new Statechart(this, (short)1);
  
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
      enterState(No_Hazard, true);
      return;
    }
    super.executeActionOf(_s);
  }
  



















































  @AnyLogicCustomProposalPriority(type=AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final Hazard_Social.statechart_state No_Hazard = Hazard_Social.statechart_state.No_Hazard;
  @AnyLogicCustomProposalPriority(type=AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final Hazard_Social.statechart_state Start_Hazard = Hazard_Social.statechart_state.Start_Hazard;
  @AnyLogicCustomProposalPriority(type=AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final Hazard_Social.statechart_state End_Hazard = Hazard_Social.statechart_state.End_Hazard;
  
  @AnyLogicInternalCodegenAPI
  private void enterState(Hazard_Social.statechart_state _state, boolean _destination)
  {
    switch (_state) {
    case End_Hazard: 
      logToDBEnterState(statechart, _state);
      
      statechart.setActiveState_xjal(No_Hazard);
      transition.start();
      return;
    case No_Hazard: 
      logToDBEnterState(statechart, _state);
      
      statechart.setActiveState_xjal(Start_Hazard);
      transition1.start();
      return;
    case Start_Hazard: 
      logToDBEnterState(statechart, _state);
      
      statechart.setActiveState_xjal(End_Hazard);
      transition2.start();
      return;
    }
    
  }
  
  @AnyLogicInternalCodegenAPI
  private void exitState(Hazard_Social.statechart_state _state, Transition _t, boolean _source)
  {
    switch (_state) {
    case End_Hazard: 
      logToDBExitState(statechart, _state);
      logToDB(statechart, _t, _state);
      
      if ((!_source) || (_t != transition)) transition.cancel();
      return;
    case No_Hazard: 
      logToDBExitState(statechart, _state);
      logToDB(statechart, _t, _state);
      
      if ((!_source) || (_t != transition1)) transition1.cancel();
      return;
    case Start_Hazard: 
      logToDBExitState(statechart, _state);
      logToDB(statechart, _t, _state);
      
      if ((!_source) || (_t != transition2)) transition2.cancel();
      return;
    }
    
  }
  
  @AnyLogicInternalCodegenAPI
  private void exitInnerStates(Hazard_Social.statechart_state _destination)
  {
    Hazard_Social.statechart_state _state = (Hazard_Social.statechart_state)statechart.getActiveSimpleState();
    while (_state != _destination) {
      exitState(_state, null, false);
      _state = (Hazard_Social.statechart_state)_state.getContainerState();
    }
  }
  
  public TransitionTimeout transition1 = new TransitionTimeout(this);
  public TransitionTimeout transition2 = new TransitionTimeout(this);
  
  @AnyLogicInternalCodegenAPI
  public String getNameOf(TransitionTimeout _t)
  {
    if (_t == transition1) return "transition1";
    if (_t == transition2) return "transition2";
    return super.getNameOf(_t);
  }
  
  @AnyLogicInternalCodegenAPI
  public Statechart getStatechartOf(TransitionTimeout _t)
  {
    if (_t == transition1) return statechart;
    if (_t == transition2) return statechart;
    return super.getStatechartOf(_t);
  }
  
  @AnyLogicInternalCodegenAPI
  public void executeActionOf(TransitionTimeout _t)
  {
    if (_t == transition1) {
      exitState(Start_Hazard, _t, true);
      enterState(End_Hazard, true);
      return;
    }
    if (_t == transition2) {
      exitState(End_Hazard, _t, true);
      enterState(No_Hazard, true);
      return;
    }
    super.executeActionOf(_t);
  }
  
  @AnyLogicInternalCodegenAPI
  public double evaluateTimeoutOf(TransitionTimeout _t)
  {
    if (_t == transition1) {
      double _value = 
        1.0D;
      
      _value = toModelTime(_value, HOUR);
      return _value;
    }
    if (_t == transition2) {
      double _value = 
        1.0D;
      
      _value = toModelTime(_value, HOUR);
      return _value;
    }
    return super.evaluateTimeoutOf(_t);
  }
  


  public TransitionMessage transition = new TransitionMessage(this);
  
  @AnyLogicInternalCodegenAPI
  public String getNameOf(TransitionMessage _t)
  {
    if (_t == transition) return "transition";
    return super.getNameOf(_t);
  }
  
  @AnyLogicInternalCodegenAPI
  public Statechart getStatechartOf(TransitionMessage _t)
  {
    if (_t == transition) return statechart;
    return super.getStatechartOf(_t);
  }
  
  @AnyLogicInternalCodegenAPI
  public void executeActionOf(TransitionMessage _t, Object _msg)
  {
    if (_t == transition) {
      exitState(No_Hazard, _t, true);
      enterState(Start_Hazard, true);
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
        "Start_Hazard";
      
      return msg.equals(_g);
    }
    return super.testMessageOf(_t, _msg);
  }
  
  public ViewArea _origin_VA = new ViewArea(this, "[Origin]", 0.0D, 0.0D, 1000.0D, 800.0D);
  
  @AnyLogicInternalCodegenAPI
  public int getViewAreas(Map<String, ViewArea> _output) {
    if (_output != null) {
      _output.put("_origin_VA", _origin_VA);
    }
    return 1 + super.getViewAreas(_output); }
  
  protected static final Color __ps300_Line_Color = new Color(-11702146, true);
  @AnyLogicInternalCodegenAPI
  protected static final int __ps300 = 1;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps301 = 2;
  @AnyLogicInternalCodegenAPI
  protected static final int _cloud = 3;
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 4;
  @AnyLogicInternalCodegenAPI
  protected static final int _presentation = 0;
  @AnyLogicInternalCodegenAPI
  protected static final int _icon = -1;
  protected ShapeCurve _ps300;
  protected ShapeCurve _ps301;
  protected ShapeGroup cloud;
  protected ShapeTopLevelPresentationGroup presentation;
  protected ShapeModelElementsGroup icon;
  
  @AnyLogicInternalCodegenAPI
  public boolean isPublicPresentationDefined() {
    return true;
  }
  
  @AnyLogicInternalCodegenAPI
  public boolean isEmbeddedAgentPresentationVisible(Agent _a) {
    return super.isEmbeddedAgentPresentationVisible(_a);
  }
  




  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps300_pointsDX_xjal()
  {
    return new double[] { 0.0D, 5.038D, 10.535D, 10.535D, 10.535D, 11.908D, 20.611D, 29.313D, 31.146D, 31.146D, 31.146D, 37.558D, 40.764D, 44.428D, 38.016D, 38.016D, 38.016D, 42.596D, 38.932D, 34.81D, 27.023D, 27.023D, 27.023D, 24.733D, 16.947D, 9.618D, 7.787D, 7.787D, 7.787D, 3.206D, -1.374D, -6.87D, 0.0D, 0.0D, 0.0D, -5.038D };
  }
  
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps300_pointsDY_xjal() { return new double[] { 0.0D, -4.552D, 0.91D, 0.91D, 0.91D, -5.463D, -5.463D, -5.463D, 2.731D, 2.731D, 2.731D, -0.91D, 5.463D, 11.836D, 14.568D, 14.568D, 14.568D, 19.12D, 24.128D, 29.136D, 25.494D, 25.494D, 25.494D, 31.867D, 31.867D, 31.867D, 25.038D, 25.038D, 25.038D, 27.77D, 23.218D, 15.934D, 10.471D, 10.471D, 10.471D, 4.552D }; }
  
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps300_pointsDZ_xjal() {
    return new double[] { 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D };
  }
  
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps301_pointsDX_xjal() { return new double[] { 0.0D, 4.123D, 9.618D, 9.618D, 9.618D, 10.992D, 19.237D, 26.565D, 27.481D, 27.481D, 27.481D, 26.565D, 19.237D, 12.367D, 9.618D, 9.618D, 9.618D, 4.58D, 0.916D, -2.29D, 1.374D, 1.374D, 1.374D, -3.664D, -1.832D, -5.038D, 0.458D, 0.458D, 0.458D, -4.123D }; }
  
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps301_pointsDY_xjal() {
    return new double[] { 0.0D, -4.552D, 0.91D, 0.91D, 0.91D, -6.374D, -6.374D, -5.918D, 0.91D, 0.91D, 0.91D, -5.008D, -5.463D, -5.918D, 2.276D, 2.276D, 2.276D, -2.276D, 0.91D, 3.642D, 8.649D, 8.649D, 8.649D, 13.202D, 19.12D, 13.657D, 8.195D, 8.195D, 8.195D, 4.552D };
  }
  
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps301_pointsDZ_xjal() { return new double[] { 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D }; }
  



  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal()
  {
    _ps300 = new ShapeCurve(
      true, -18.321D, -14.113D, 
      __ps300_Line_Color, UtilitiesColor.lightBlue, 
      36, true, __ps300_pointsDX_xjal(), __ps300_pointsDY_xjal(), 
      true, 1.0D, LINE_STYLE_SOLID);
    
    _ps301 = new ShapeCurve(
      true, -16.947D, -11.836D, 
      null, UtilitiesColor.white, 
      30, true, __ps301_pointsDX_xjal(), __ps301_pointsDY_xjal(), 
      true, 1.0D, LINE_STYLE_SOLID);
  }
  

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal()
  {
    cloud = new ShapeGroup(this, SHAPE_DRAW_2D, true, 0.0D, 0.0D, 0.0D, 0.0D, new Object[] {
    
      _ps300, 
      _ps301 });
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
    case 1:  return _ps300;
    case 2:  return _ps301;
    case 3:  return cloud; }
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
      _name_xjal = checkNameOfShape_xjal(_shape, _ps300, "_ps300"); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal(_shape, _ps301, "_ps301"); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal(_shape, cloud, "cloud"); if (_name_xjal != null) return _name_xjal;
    } catch (Exception e) {
      return null;
    }
    return super.getNameOfShape_xjal(_shape); }
  
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition_pointsX_xjal = { 150, 150 };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition_pointsY_xjal = { 170, 230 };
  
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition1_pointsX_xjal = { 150, 150 };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition1_pointsY_xjal = { 260, 320 };
  
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition2_pointsX_xjal = { 200, 230, 230, 200 };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _transition2_pointsY_xjal = { 340, 340, 150, 150 };
  
  @AnyLogicInternalCodegenAPI
  private void drawModelElements_Statecharts_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass)
  {
    if (!_publicOnly) {
      drawState(_panel, _g, 100, 140, 100, 30, 15, 15, "No_Hazard", UtilitiesColor.GOLD, No_Hazard, statechart);
    }
    if (!_publicOnly) {
      drawState(_panel, _g, 100, 230, 100, 30, 10, 10, "Start_Hazard", UtilitiesColor.GOLD, Start_Hazard, statechart);
    }
    if (!_publicOnly) {
      drawState(_panel, _g, 100, 320, 100, 30, 10, 10, "End_Hazard", UtilitiesColor.GOLD, End_Hazard, statechart);
    }
    if (!_publicOnly) {
      drawStatechartEntryPoint(_panel, _g, 150, 100, 150, 140, 160, 100, "statechart", statechart);
    }
    if (!_publicOnly) {
      drawTransition(_panel, _g, _transition_pointsX_xjal, _transition_pointsY_xjal, 160, 170, null, transition, Agent.TransitionIcon.MESSAGE, 150, 190);
    }
    if (!_publicOnly) {
      drawTransition(_panel, _g, _transition1_pointsX_xjal, _transition1_pointsY_xjal, 160, 260, null, transition1, Agent.TransitionIcon.TIMEOUT, 150, 280);
    }
    if (!_publicOnly) {
      drawTransition(_panel, _g, _transition2_pointsX_xjal, _transition2_pointsY_xjal, 210, 340, null, transition2, Agent.TransitionIcon.TIMEOUT, 230, 250);
    }
  }
  
  @AnyLogicInternalCodegenAPI
  private void drawModelElements_Parameters_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass) {
    if (!_publicOnly) {
      drawParameter(_panel, _g, 50, 50, 10, 0, "Type", Type, 0);
    }
  }
  
  @AnyLogicInternalCodegenAPI
  private void drawModelElements_AgentLinks_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass) {
    if (_publicOnly) return;
    drawLinkToAgent(_panel, _g, 50, -50, 15, 0, "connections", true, connections);
  }
  
  @AnyLogicInternalCodegenAPI
  public void drawModelElements(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass)
  {
    super.drawModelElements(_panel, _g, _publicOnly, true);
    drawModelElements_Statecharts_xjal(_panel, _g, _publicOnly, _isSuperClass);
    drawModelElements_Parameters_xjal(_panel, _g, _publicOnly, _isSuperClass);
    drawModelElements_AgentLinks_xjal(_panel, _g, _publicOnly, _isSuperClass);
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
    if ((!_publicOnly) && (modelElementContains(_x, _y, 50.0D, 50.0D))) {
      _panel.addInspect(50.0D, 50.0D, this, "Type");
      return true;
    }
    return false;
  }
  
  @AnyLogicInternalCodegenAPI
  public boolean onClickModelAt(Panel _panel, double _x, double _y, int _clickCount, boolean _publicOnly, boolean _isSuperClass)
  {
    if (onClickModelAt_AgentLinks_xjal(_panel, _x, _y, _clickCount, _publicOnly, _isSuperClass)) return true;
    if (onClickModelAt_Parameters_xjal(_panel, _x, _y, _clickCount, _publicOnly, _isSuperClass)) return true;
    return super.onClickModelAt(_panel, _x, _y, _clickCount, _publicOnly, true);
  }
  




  public Hazard_Social(Engine engine, Agent owner, AgentList<? extends Hazard_Social> ownerPopulation)
  {
    super(engine, owner, ownerPopulation);_createPersistentElementsBP0_xjal();
    


































































































    connections = new LinkToAgentStandardImpl(this, _connections_commonAnimationSettings_xjal);instantiateBaseStructureThis_xjal();
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
  
  public Hazard_Social(String Type)
  {
    _createPersistentElementsBP0_xjal();
    
















































































































































































































































    connections = new LinkToAgentStandardImpl(this, _connections_commonAnimationSettings_xjal);markParametersAreSet();this.Type = Type;
  }
  
  @AnyLogicInternalCodegenAPI
  public void doCreate()
  {
    super.doCreate();
    
    setupPlainVariables_Hazard_Social_xjal();
    
    _createPersistentElementsAP0_xjal();
    presentation = new ShapeTopLevelPresentationGroup(this, true, 0.0D, 0.0D, 0.0D, 0.0D, new Object[] { cloud });
    icon = new ShapeModelElementsGroup(this, (ModelElementDescriptor[])getElementProperty("merv_1_0_3.Hazard_Social.icon", "modelElementDescriptors"), new Object[0]);
    icon.setIconOffsets(0.0D, 0.0D);
    

    setupInitialConditions_xjal(Hazard_Social.class);
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
  }
  




  @AnyLogicInternalCodegenAPI
  public void setupPlainVariables_xjal()
  {
    setupPlainVariables_Hazard_Social_xjal();
  }
  









  @AnyLogicInternalCodegenAPI
  static LinkToAgentAnimationSettings _connections_commonAnimationSettings_xjal = new LinkToAgentAnimationSettingsImpl(false, UtilitiesColor.black, 1.0D, LINE_STYLE_SOLID, ARROW_NONE, 0.0D);
  public LinkToAgentCollection<Agent, Agent> connections;
  @AnyLogicInternalCodegenAPI
  private static final long serialVersionUID = 11272037374218536L;
  
  public Hazard_Social()
  {
    _createPersistentElementsBP0_xjal();
    
















































































































































































































































    connections = new LinkToAgentStandardImpl(this, _connections_commonAnimationSettings_xjal);
  }
  
  public LinkToAgentCollection<? extends Agent, ? extends Agent> getLinkToAgentStandard_xjal() { return connections; }
  
  @AnyLogicInternalCodegenAPI
  public void onReceive(Object _msg_xjal, Agent _sender_xjal)
  {
    super.onReceive(_msg_xjal, _sender_xjal);
    statechart.fireEvent(_msg_xjal);
  }
  

  @AnyLogicInternalCodegenAPI
  public void drawLinksToAgents(boolean _underAgents_xjal, LinkToAgentAnimator _animator_xjal)
  {
    super.drawLinksToAgents(_underAgents_xjal, _animator_xjal);
    if (_underAgents_xjal) {
      _animator_xjal.drawLink(this, connections, true, true);
    }
  }
  
  public AgentList<? extends Hazard_Social> getPopulation() {
    return super.getPopulation();
  }
  
  public List<? extends Hazard_Social> agentsInRange(double distance) {
    return super.agentsInRange(distance);
  }
  
  public void onChange()
  {
    super.onChange();
    statechart.onChange();
  }
  
  @AnyLogicInternalCodegenAPI
  public void onDestroy() {
    statechart.onDestroy();
    super.onDestroy();
  }
  
  @AnyLogicInternalCodegenAPI
  protected void onChange_Type_xjal(String oldValue) {}
  
  @AnyLogicInternalCodegenAPI
  private void setupReferences_xjal() {}
  
  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_Hazard_Social_xjal() {}
}
