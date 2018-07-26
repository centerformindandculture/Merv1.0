package merv_1_0_3;

import com.anylogic.engine.AnyLogicInternalCodegenAPI;
import com.anylogic.engine.Engine;
import com.anylogic.engine.ExperimentSimulation;
import com.anylogic.engine.elements.IElementDescriptor;
import com.anylogic.engine.presentation.IPresentation;
import com.anylogic.engine.presentation.ModelElementDescriptor;
import com.anylogic.engine.presentation.Panel;
import com.anylogic.engine.presentation.Presentation;
import com.anylogic.engine.presentation.ShapeButton;
import com.anylogic.engine.presentation.ShapeControl;
import com.anylogic.engine.presentation.ShapeModelElementsGroup;
import com.anylogic.engine.presentation.ShapeText;
import com.anylogic.engine.presentation.ShapeTextField;
import com.anylogic.engine.presentation.ShapeTopLevelPresentationGroup;
import com.anylogic.engine.presentation.StatusBar;
import com.anylogic.engine.presentation.ToolBar;
import com.anylogic.engine.presentation.UtilitiesColor;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics2D;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Map;
import java.util.Random;
import javax.swing.JApplet;















































public class Simulation
  extends ExperimentSimulation<Main>
{
  @AnyLogicInternalCodegenAPI
  public static String[] COMMAND_LINE_ARGUMENTS_xjal = new String[0];
  


  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors(Simulation.class);
  public String csvFileName_PopulationLevel;
  public String csvFileName_IndividualLevel;
  
  @AnyLogicInternalCodegenAPI
  public Map<String, IElementDescriptor> getElementDesciptors() { return elementDesciptors_xjal; }
  
  public Simulation()
  {
    setCommandLineArguments_xjal(COMMAND_LINE_ARGUMENTS_xjal);
    


















    HazardFrequency = 10.0D;
    


    Intensity = 0.5D;
  }
  
  public double HazardFrequency;
  public double Intensity;
  void createCSV_PopulationLevel()
  {
    try {
      File checkFile = new File("Terror Management Theory ABM - Population Level.csv");
      
      if (!checkFile.exists())
      {



        StringBuilder sb = new StringBuilder();
        sb.append("group_ID_percentOfPopInMajority");sb.append(',');
        sb.append("prior_anthropomorphic_promiscuity_min");sb.append(',');
        sb.append("prior_anthropomorphic_promiscuity_max");sb.append(',');
        sb.append("prior_anthropomorphic_promiscuity_mode");sb.append(',');
        sb.append("prior_sociographic_promiscuity_min");sb.append(',');
        sb.append("prior_sociographic_promiscuity_max");sb.append(',');
        sb.append("prior_sociographic_promiscuity_mode");sb.append(',');
        sb.append("predation_tolerance_min");sb.append(',');
        sb.append("predation_tolerance_max");sb.append(',');
        sb.append("predation_tolerance_mode");sb.append(',');
        sb.append("natural_tolerance_min");sb.append(',');
        sb.append("natural_tolerance_max");sb.append(',');
        sb.append("natural_tolerance_mode");sb.append(',');
        sb.append("contagion_tolerance_min");sb.append(',');
        sb.append("contagion_tolerance_max");sb.append(',');
        sb.append("contagion_tolerance_mode");sb.append(',');
        sb.append("social_tolerance_min");sb.append(',');
        sb.append("social_tolerance_max");sb.append(',');
        sb.append("social_tolerance_mode");sb.append(',');
        sb.append("contagion_probability_min");sb.append(',');
        sb.append("contagion_probability_max");sb.append(',');
        sb.append("contagion_probability_mode");sb.append(',');
        sb.append("predation_probability_min");sb.append(',');
        sb.append("predation_probability_max");sb.append(',');
        sb.append("predation_probability_mode");sb.append(',');
        sb.append("social_probability_min");sb.append(',');
        sb.append("social_probability_max");sb.append(',');
        sb.append("social_probability_mode");sb.append(',');
        sb.append("chanceForNaturalHazardToOccur");sb.append(',');
        sb.append("group_distance_anthropomorphic_min");sb.append(',');
        sb.append("group_distance_anthropomorphic_max");sb.append(',');
        sb.append("group_distance_sociographic_min");sb.append(',');
        sb.append("group_distance_sociographic_max");sb.append(',');
        sb.append("group_distance_contagionHazard_min");sb.append(',');
        sb.append("group_distance_contagionHazard_max");sb.append(',');
        sb.append("group_distance_socialHazard_min");sb.append(',');
        sb.append("group_distance_socialHazard_max");sb.append(',');
        

        sb.append("Total_Group_1_Anthropomorphic_Promiscuity");sb.append(',');
        sb.append("Total_Group_2_Anthropomorphic_Promiscuity");sb.append(',');
        sb.append("Total_Group_1_Sociographic_Prudery");sb.append(',');
        sb.append("Total_Group_2_Sociographic_Prudery");sb.append(',');
        sb.append("Maximum_Group_Size");sb.append(',');
        sb.append("Total_Number_of_Groups");sb.append(',');
        
        sb.append('\n');
        
        OutputStream csvFile = new FileOutputStream(new File("Terror Management Theory ABM - Population Level.csv"));
        
        csvFileName_PopulationLevel = "Terror Management Theory ABM - Population Level.csv";
        
        PrintStream printcsv = new PrintStream(csvFile);
        printcsv.append(sb.toString());
        printcsv.close();
        csvFile.close();
      }
      
      csvFileName_PopulationLevel = "Terror Management Theory ABM - Population Level.csv";
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  void createCSV_IndividualLevel()
  {
    try
    {
      File checkFile = new File("Terror Management Theory ABM - Individual Level.csv");
      
      if (!checkFile.exists())
      {



        StringBuilder sb = new StringBuilder();
        sb.append("group_ID");sb.append(',');
        sb.append("group_distance_anthropomorphic");sb.append(',');
        sb.append("group_distance_sociographic");sb.append(',');
        sb.append("socialH_distance");sb.append(',');
        sb.append("contagionH_distance");sb.append(',');
        sb.append("contagion_tolerance");sb.append(',');
        sb.append("natural_tolerance");sb.append(',');
        sb.append("predation_tolerance");sb.append(',');
        sb.append("social_tolerance");sb.append(',');
        sb.append("contagion_probability");sb.append(',');
        sb.append("social_probability");sb.append(',');
        

        sb.append("Number_of_Rituals");sb.append(',');
        sb.append("Largest_Group_Size_for_Ritual");sb.append(',');
        sb.append("prior_anthropomorphic_promiscuity");sb.append(',');
        sb.append("anthropomorphic_promiscuity");sb.append(',');
        sb.append("prior_sociographic_prudery");sb.append(',');
        sb.append("sociographic_prudery");sb.append(',');
        
        sb.append('\n');
        
        OutputStream csvFile = new FileOutputStream(new File("Terror Management Theory ABM - Individual Level.csv"));
        
        csvFileName_IndividualLevel = "Terror Management Theory ABM - Individual Level.csv";
        
        PrintStream printcsv = new PrintStream(csvFile);
        printcsv.append(sb.toString());
        printcsv.close();
        csvFile.close();
      }
      
      csvFileName_IndividualLevel = "Terror Management Theory ABM - Individual Level.csv";
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  @AnyLogicInternalCodegenAPI
  public void drawModelElements(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass)
  {
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 170, 550, 
        10, 0, 
        "csvFileName_PopulationLevel", csvFileName_PopulationLevel, false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 420, 550, 
        10, 0, 
        "csvFileName_IndividualLevel", csvFileName_IndividualLevel, false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 65386, 150, 
        10, 0, 
        "HazardFrequency", Double.valueOf(HazardFrequency), false);
    }
    if (!_publicOnly) {
      drawPlainVariable(_panel, _g, 65386, 200, 
        10, 0, 
        "Intensity", Double.valueOf(Intensity), false);
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 150, 500, 
        10, 0, 
        "createCSV_PopulationLevel");
    }
    if (!_publicOnly) {
      drawFunction(_panel, _g, 400, 500, 
        10, 0, 
        "createCSV_IndividualLevel");
    }
  }
  
  @AnyLogicInternalCodegenAPI
  public boolean onClickModelAt(Panel _panel, double _x, double _y, int _clickCount, boolean _publicOnly, boolean _isSuperClass) {
    if ((!_publicOnly) && (modelElementContains(_x, _y, 170.0D, 550.0D))) {
      _panel.addInspect(170.0D, 550.0D, this, "csvFileName_PopulationLevel");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, 420.0D, 550.0D))) {
      _panel.addInspect(420.0D, 550.0D, this, "csvFileName_IndividualLevel");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -150.0D, 150.0D))) {
      _panel.addInspect(-150.0D, 150.0D, this, "HazardFrequency");
      return true;
    }
    if ((!_publicOnly) && (modelElementContains(_x, _y, -150.0D, 200.0D))) {
      _panel.addInspect(-150.0D, 200.0D, this, "Intensity");
      return true;
    }
    return false; }
  
  @AnyLogicInternalCodegenAPI
  protected static final Font _button_Font = new Font("Dialog", 0, 11);
  @AnyLogicInternalCodegenAPI
  protected static final Font _editbox_Font = _button_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _editbox1_Font = _button_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _button1_Font = _button_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text_Font = new Font("SansSerif", 0, 24);
  @AnyLogicInternalCodegenAPI
  protected static final Font _text1_Font = new Font("Times New Roman", 1, 12);
  @AnyLogicInternalCodegenAPI
  protected static final Font _text2_Font = _text1_Font;
  
  @AnyLogicInternalCodegenAPI
  protected static final int _button = 1;
  @AnyLogicInternalCodegenAPI
  protected static final int _editbox = 2;
  @AnyLogicInternalCodegenAPI
  protected static final int _editbox1 = 3;
  @AnyLogicInternalCodegenAPI
  protected static final int _button1 = 4;
  @AnyLogicInternalCodegenAPI
  protected static final int _text = 5;
  @AnyLogicInternalCodegenAPI
  protected static final int _text1 = 6;
  @AnyLogicInternalCodegenAPI
  protected static final int _text2 = 7;
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 8;
  @AnyLogicInternalCodegenAPI
  protected static final int _presentation = 0;
  @AnyLogicInternalCodegenAPI
  protected static final int _icon = -1;
  protected ShapeButton button;
  protected ShapeTextField editbox;
  protected ShapeTextField editbox1;
  protected ShapeButton button1;
  protected ShapeText text;
  protected ShapeText text1;
  protected ShapeText text2;
  protected ShapeTopLevelPresentationGroup presentation;
  protected ShapeModelElementsGroup icon;
  @AnyLogicInternalCodegenAPI
  private static final long serialVersionUID = 45611397861253072L;
  
  @AnyLogicInternalCodegenAPI
  public void executeShapeControlAction(int _shape, int index)
  {
    switch (_shape) {
    case 1: 
      ShapeButton self = button;
      if (getState() == IDLE)
        run();
      getPresentation().setPresentable(getEngine().getRoot());
      
      break;
    case 4: 
      ShapeButton self = button1;
      createCSV_IndividualLevel();
      createCSV_PopulationLevel();
      
      break;
    case 2: case 3: default: 
      super.executeShapeControlAction(_shape, index);
    }
    
  }
  

  @AnyLogicInternalCodegenAPI
  public void executeShapeControlAction(int _shape, int index, String value)
  {
    switch (_shape) {
    case 2: 
      HazardFrequency = Double.parseDouble(value);
      break;
    case 3: 
      Intensity = Double.parseDouble(value);
      break;
    default: 
      super.executeShapeControlAction(_shape, index, value);
    }
    
  }
  
  @AnyLogicInternalCodegenAPI
  public double getShapeControlMinimum(int _shape, int index)
  {
    switch (_shape) {
    case 2:  return Double.NEGATIVE_INFINITY;
    case 3:  return Double.NEGATIVE_INFINITY; }
    return super.getShapeControlMinimum(_shape, index);
  }
  

  @AnyLogicInternalCodegenAPI
  public double getShapeControlMaximum(int _shape, int index)
  {
    switch (_shape) {
    case 2:  return Double.POSITIVE_INFINITY;
    case 3:  return Double.POSITIVE_INFINITY; }
    return super.getShapeControlMaximum(_shape, index);
  }
  

  @AnyLogicInternalCodegenAPI
  public String getShapeControlDefaultValueString(int _shape, int index)
  {
    switch (_shape) {
    case 2:  return String.valueOf(
        HazardFrequency);
    case 3: 
      return String.valueOf(
        Intensity);
    }
    return super.getShapeControlDefaultValueString(_shape, index);
  }
  




  @AnyLogicInternalCodegenAPI
  private void _button_SetDynamicParams_xjal(ShapeButton shape)
  {
    shape.setText(
      getState() == IDLE ? 
      "Run" : 
      "Top level agent");
  }
  





  @AnyLogicInternalCodegenAPI
  private void _editbox_SetDynamicParams_xjal(ShapeTextField shape)
  {
    shape.setRange(getShapeControlMinimum(2), getShapeControlMaximum(2));
  }
  




  @AnyLogicInternalCodegenAPI
  private void _editbox1_SetDynamicParams_xjal(ShapeTextField shape)
  {
    shape.setRange(getShapeControlMinimum(3), getShapeControlMaximum(3));
  }
  




  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal()
  {
    button = new Simulation.1(this, 
      this, true, 40.0D, 80.0D, 
      100.0D, 30.0D, 
      UtilitiesColor.controlDefault, UtilitiesColor.controlDefault, true, 
      _button_Font, 
      "Run");
    

















    editbox = new Simulation.2(this, 
      this, true, 150.0D, 220.0D, 
      100.0D, 30.0D, 
      UtilitiesColor.controlDefault, UtilitiesColor.controlDefault, true, _editbox_Font, 
      ShapeControl.TYPE_DOUBLE, getShapeControlMinimum(2), getShapeControlMaximum(2));
    






















    editbox1 = new Simulation.3(this, 
      this, true, 150.0D, 320.0D, 
      100.0D, 30.0D, 
      UtilitiesColor.controlDefault, UtilitiesColor.controlDefault, true, _editbox1_Font, 
      ShapeControl.TYPE_DOUBLE, getShapeControlMinimum(3), getShapeControlMaximum(3));
    






















    button1 = new Simulation.4(this, 
      this, true, 150.0D, 440.0D, 
      150.0D, 30.0D, 
      UtilitiesColor.controlDefault, UtilitiesColor.controlDefault, true, 
      _button1_Font, 
      "Setup CSV Files");
    












    text = new ShapeText(
      SHAPE_DRAW_2D, true, 40.0D, 30.0D, 0.0D, 0.0D, 
      UtilitiesColor.royalBlue, "MERV 1.0", 
      _text_Font, ALIGNMENT_LEFT);
    
    text1 = new ShapeText(
      SHAPE_DRAW_2D, true, 150.0D, 190.0D, 0.0D, 0.0D, 
      UtilitiesColor.black, "Hazard Frequency", 
      _text1_Font, ALIGNMENT_LEFT);
    
    text2 = new ShapeText(
      SHAPE_DRAW_2D, true, 150.0D, 290.0D, 0.0D, 0.0D, 
      UtilitiesColor.black, "Intensity", 
      _text2_Font, ALIGNMENT_LEFT);
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
    case 1:  return button;
    case 2:  return editbox;
    case 3:  return editbox1;
    case 4:  return button1;
    case 5:  return text;
    case 6:  return text1;
    case 7:  return text2; }
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
      _name_xjal = checkNameOfShape_xjal(_shape, editbox, "editbox"); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal(_shape, editbox1, "editbox1"); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal(_shape, button1, "button1"); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal(_shape, text, "text"); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal(_shape, text1, "text1"); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal(_shape, text2, "text2"); if (_name_xjal != null) return _name_xjal;
    } catch (Exception e) {
      return null;
    }
    return super.getNameOfShape_xjal(_shape);
  }
  
  public int getWindowWidth()
  {
    return 1000;
  }
  
  public int getWindowHeight()
  {
    return 800;
  }
  
  @AnyLogicInternalCodegenAPI
  public void onDestroy_xjal()
  {
    super.onDestroy_xjal();
  }
  


























  @AnyLogicInternalCodegenAPI
  public static void main(String[] args)
  {
    COMMAND_LINE_ARGUMENTS_xjal = args;
    prepareBeforeExperimentStart_xjal(Simulation.class);
    Simulation ex = new Simulation();
    ex.setCommandLineArguments_xjal(args);
    ex.setup(null);
  }
  





  @AnyLogicInternalCodegenAPI
  public void initDefaultRandomNumberGenerator(Engine _e)
  {
    _e.setDefaultRandomGenerator(new Random());
  }
  

  @AnyLogicInternalCodegenAPI
  public Main createRoot(Engine engine)
  {
    return new Main(engine, null, null);
  }
  
  @AnyLogicInternalCodegenAPI
  public void setupRootParameters(Main self, boolean callOnChangeActions)
  {
    Main root = self;
    
    double group_ID_percentOfPopInMajority_xjal = 
      30.0D;
    
    if (callOnChangeActions) {
      self.set_group_ID_percentOfPopInMajority(group_ID_percentOfPopInMajority_xjal);
    } else {
      group_ID_percentOfPopInMajority = group_ID_percentOfPopInMajority_xjal;
    }
    
    double prior_anthropomorphic_promiscuity_min_xjal = self._prior_anthropomorphic_promiscuity_min_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_prior_anthropomorphic_promiscuity_min(prior_anthropomorphic_promiscuity_min_xjal);
    } else {
      prior_anthropomorphic_promiscuity_min = prior_anthropomorphic_promiscuity_min_xjal;
    }
    
    double prior_anthropomorphic_promiscuity_max_xjal = self._prior_anthropomorphic_promiscuity_max_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_prior_anthropomorphic_promiscuity_max(prior_anthropomorphic_promiscuity_max_xjal);
    } else {
      prior_anthropomorphic_promiscuity_max = prior_anthropomorphic_promiscuity_max_xjal;
    }
    
    double prior_anthropomorphic_promiscuity_mode_xjal = self._prior_anthropomorphic_promiscuity_mode_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_prior_anthropomorphic_promiscuity_mode(prior_anthropomorphic_promiscuity_mode_xjal);
    } else {
      prior_anthropomorphic_promiscuity_mode = prior_anthropomorphic_promiscuity_mode_xjal;
    }
    
    double sociographic_prudery_min_xjal = self._sociographic_prudery_min_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_sociographic_prudery_min(sociographic_prudery_min_xjal);
    } else {
      sociographic_prudery_min = sociographic_prudery_min_xjal;
    }
    
    double sociographic_prudery_max_xjal = self._sociographic_prudery_max_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_sociographic_prudery_max(sociographic_prudery_max_xjal);
    } else {
      sociographic_prudery_max = sociographic_prudery_max_xjal;
    }
    
    double sociographic_prudery_mode_xjal = self._sociographic_prudery_mode_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_sociographic_prudery_mode(sociographic_prudery_mode_xjal);
    } else {
      sociographic_prudery_mode = sociographic_prudery_mode_xjal;
    }
    
    double anthropomorphic_promiscuity_min_xjal = self._anthropomorphic_promiscuity_min_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_anthropomorphic_promiscuity_min(anthropomorphic_promiscuity_min_xjal);
    } else {
      anthropomorphic_promiscuity_min = anthropomorphic_promiscuity_min_xjal;
    }
    
    double anthropomorphic_promiscuity_max_xjal = self._anthropomorphic_promiscuity_max_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_anthropomorphic_promiscuity_max(anthropomorphic_promiscuity_max_xjal);
    } else {
      anthropomorphic_promiscuity_max = anthropomorphic_promiscuity_max_xjal;
    }
    
    double anthropomorphic_promiscuity_mode_xjal = self._anthropomorphic_promiscuity_mode_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_anthropomorphic_promiscuity_mode(anthropomorphic_promiscuity_mode_xjal);
    } else {
      anthropomorphic_promiscuity_mode = anthropomorphic_promiscuity_mode_xjal;
    }
    
    double predation_tolerance_min_xjal = self._predation_tolerance_min_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_predation_tolerance_min(predation_tolerance_min_xjal);
    } else {
      predation_tolerance_min = predation_tolerance_min_xjal;
    }
    
    double predation_tolerance_max_xjal = self._predation_tolerance_max_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_predation_tolerance_max(predation_tolerance_max_xjal);
    } else {
      predation_tolerance_max = predation_tolerance_max_xjal;
    }
    
    double predation_tolerance_mode_xjal = self._predation_tolerance_mode_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_predation_tolerance_mode(predation_tolerance_mode_xjal);
    } else {
      predation_tolerance_mode = predation_tolerance_mode_xjal;
    }
    
    double natural_tolerance_min_xjal = self._natural_tolerance_min_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_natural_tolerance_min(natural_tolerance_min_xjal);
    } else {
      natural_tolerance_min = natural_tolerance_min_xjal;
    }
    
    double natural_tolerance_max_xjal = self._natural_tolerance_max_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_natural_tolerance_max(natural_tolerance_max_xjal);
    } else {
      natural_tolerance_max = natural_tolerance_max_xjal;
    }
    
    double natural_tolerance_mode_xjal = self._natural_tolerance_mode_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_natural_tolerance_mode(natural_tolerance_mode_xjal);
    } else {
      natural_tolerance_mode = natural_tolerance_mode_xjal;
    }
    
    double contagion_tolerance_min_xjal = self._contagion_tolerance_min_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_contagion_tolerance_min(contagion_tolerance_min_xjal);
    } else {
      contagion_tolerance_min = contagion_tolerance_min_xjal;
    }
    
    double contagion_tolerance_max_xjal = self._contagion_tolerance_max_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_contagion_tolerance_max(contagion_tolerance_max_xjal);
    } else {
      contagion_tolerance_max = contagion_tolerance_max_xjal;
    }
    
    double contagion_tolerance_mode_xjal = self._contagion_tolerance_mode_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_contagion_tolerance_mode(contagion_tolerance_mode_xjal);
    } else {
      contagion_tolerance_mode = contagion_tolerance_mode_xjal;
    }
    
    double social_tolerance_min_xjal = self._social_tolerance_min_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_social_tolerance_min(social_tolerance_min_xjal);
    } else {
      social_tolerance_min = social_tolerance_min_xjal;
    }
    
    double social_tolerance_max_xjal = self._social_tolerance_max_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_social_tolerance_max(social_tolerance_max_xjal);
    } else {
      social_tolerance_max = social_tolerance_max_xjal;
    }
    
    double social_tolerance_mode_xjal = 
      5.0D;
    
    if (callOnChangeActions) {
      self.set_social_tolerance_mode(social_tolerance_mode_xjal);
    } else {
      social_tolerance_mode = social_tolerance_mode_xjal;
    }
    
    double contagion_probability_min_xjal = self._contagion_probability_min_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_contagion_probability_min(contagion_probability_min_xjal);
    } else {
      contagion_probability_min = contagion_probability_min_xjal;
    }
    
    double contagion_probability_max_xjal = self._contagion_probability_max_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_contagion_probability_max(contagion_probability_max_xjal);
    } else {
      contagion_probability_max = contagion_probability_max_xjal;
    }
    
    double contagion_probability_mode_xjal = 
      80.0D;
    
    if (callOnChangeActions) {
      self.set_contagion_probability_mode(contagion_probability_mode_xjal);
    } else {
      contagion_probability_mode = contagion_probability_mode_xjal;
    }
    
    double predation_probability_min_xjal = self._predation_probability_min_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_predation_probability_min(predation_probability_min_xjal);
    } else {
      predation_probability_min = predation_probability_min_xjal;
    }
    
    double predation_probability_max_xjal = self._predation_probability_max_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_predation_probability_max(predation_probability_max_xjal);
    } else {
      predation_probability_max = predation_probability_max_xjal;
    }
    
    double predation_probability_mode_xjal = self._predation_probability_mode_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_predation_probability_mode(predation_probability_mode_xjal);
    } else {
      predation_probability_mode = predation_probability_mode_xjal;
    }
    
    double social_probability_min_xjal = self._social_probability_min_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_social_probability_min(social_probability_min_xjal);
    } else {
      social_probability_min = social_probability_min_xjal;
    }
    
    double social_probability_max_xjal = self._social_probability_max_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_social_probability_max(social_probability_max_xjal);
    } else {
      social_probability_max = social_probability_max_xjal;
    }
    
    double social_probability_mode_xjal = 
      5.0D;
    
    if (callOnChangeActions) {
      self.set_social_probability_mode(social_probability_mode_xjal);
    } else {
      social_probability_mode = social_probability_mode_xjal;
    }
    
    double chanceForNaturalHazardToOccur_xjal = self._chanceForNaturalHazardToOccur_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_chanceForNaturalHazardToOccur(chanceForNaturalHazardToOccur_xjal);
    } else {
      chanceForNaturalHazardToOccur = chanceForNaturalHazardToOccur_xjal;
    }
    
    double group_distance_anthropomorphic_min_xjal = self._group_distance_anthropomorphic_min_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_group_distance_anthropomorphic_min(group_distance_anthropomorphic_min_xjal);
    } else {
      group_distance_anthropomorphic_min = group_distance_anthropomorphic_min_xjal;
    }
    
    double group_distance_anthropomorphic_max_xjal = self._group_distance_anthropomorphic_max_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_group_distance_anthropomorphic_max(group_distance_anthropomorphic_max_xjal);
    } else {
      group_distance_anthropomorphic_max = group_distance_anthropomorphic_max_xjal;
    }
    
    double prior_sociographic_promiscuity_min_xjal = self._prior_sociographic_promiscuity_min_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_prior_sociographic_promiscuity_min(prior_sociographic_promiscuity_min_xjal);
    } else {
      prior_sociographic_promiscuity_min = prior_sociographic_promiscuity_min_xjal;
    }
    
    double prior_sociographic_promiscuity_max_xjal = self._prior_sociographic_promiscuity_max_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_prior_sociographic_promiscuity_max(prior_sociographic_promiscuity_max_xjal);
    } else {
      prior_sociographic_promiscuity_max = prior_sociographic_promiscuity_max_xjal;
    }
    
    double prior_sociographic_promiscuity_mode_xjal = self._prior_sociographic_promiscuity_mode_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_prior_sociographic_promiscuity_mode(prior_sociographic_promiscuity_mode_xjal);
    } else {
      prior_sociographic_promiscuity_mode = prior_sociographic_promiscuity_mode_xjal;
    }
    
    double group_distance_sociographic_min_xjal = self._group_distance_sociographic_min_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_group_distance_sociographic_min(group_distance_sociographic_min_xjal);
    } else {
      group_distance_sociographic_min = group_distance_sociographic_min_xjal;
    }
    
    double group_distance_sociographic_max_xjal = self._group_distance_sociographic_max_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_group_distance_sociographic_max(group_distance_sociographic_max_xjal);
    } else {
      group_distance_sociographic_max = group_distance_sociographic_max_xjal;
    }
    
    double group_distance_contagionHazard_min_xjal = self._group_distance_contagionHazard_min_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_group_distance_contagionHazard_min(group_distance_contagionHazard_min_xjal);
    } else {
      group_distance_contagionHazard_min = group_distance_contagionHazard_min_xjal;
    }
    
    double group_distance_contagionHazard_max_xjal = self._group_distance_contagionHazard_max_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_group_distance_contagionHazard_max(group_distance_contagionHazard_max_xjal);
    } else {
      group_distance_contagionHazard_max = group_distance_contagionHazard_max_xjal;
    }
    
    double group_distance_socialHazard_min_xjal = self._group_distance_socialHazard_min_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_group_distance_socialHazard_min(group_distance_socialHazard_min_xjal);
    } else {
      group_distance_socialHazard_min = group_distance_socialHazard_min_xjal;
    }
    
    double group_distance_socialHazard_max_xjal = self._group_distance_socialHazard_max_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_group_distance_socialHazard_max(group_distance_socialHazard_max_xjal);
    } else {
      group_distance_socialHazard_max = group_distance_socialHazard_max_xjal;
    }
    
    double beta_coeff_xjal = self._beta_coeff_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_beta_coeff(beta_coeff_xjal);
    } else {
      beta_coeff = beta_coeff_xjal;
    }
    
    double prob_link_reassignment_xjal = self._prob_link_reassignment_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_prob_link_reassignment(prob_link_reassignment_xjal);
    } else {
      prob_link_reassignment = prob_link_reassignment_xjal;
    }
    
    int pop_xjal = self._pop_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_pop(pop_xjal);
    } else {
      pop = pop_xjal;
    }
    
    long seed_xjal = self._seed_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_seed(seed_xjal);
    } else {
      seed = seed_xjal;
    }
    
    int length_of_memory_xjal = self._length_of_memory_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_length_of_memory(length_of_memory_xjal);
    } else {
      length_of_memory = length_of_memory_xjal;
    }
    
    double num_beliefs_xjal = self._num_beliefs_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_num_beliefs(num_beliefs_xjal);
    } else {
      num_beliefs = num_beliefs_xjal;
    }
    
    double cultural_dissonance_xjal = self._cultural_dissonance_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_cultural_dissonance(cultural_dissonance_xjal);
    } else {
      cultural_dissonance = cultural_dissonance_xjal;
    }
    
    double extinction_rate_xjal = self._extinction_rate_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_extinction_rate(extinction_rate_xjal);
    } else {
      extinction_rate = extinction_rate_xjal;
    }
    
    double weight_second_order_connection_xjal = self._weight_second_order_connection_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_weight_second_order_connection(weight_second_order_connection_xjal);
    } else {
      weight_second_order_connection = weight_second_order_connection_xjal;
    }
    
    double weight_third_order_connection_xjal = self._weight_third_order_connection_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_weight_third_order_connection(weight_third_order_connection_xjal);
    } else {
      weight_third_order_connection = weight_third_order_connection_xjal;
    }
    
    double threshold_xjal = self._threshold_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_threshold(threshold_xjal);
    } else {
      threshold = threshold_xjal;
    }
    
    double vision_xjal = 
      30.0D;
    
    if (callOnChangeActions) {
      self.set_vision(vision_xjal);
    } else {
      vision = vision_xjal;
    }
    
    int Violence_Counter_Update_Interval_xjal = self._Violence_Counter_Update_Interval_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Violence_Counter_Update_Interval(Violence_Counter_Update_Interval_xjal);
    } else {
      Violence_Counter_Update_Interval = Violence_Counter_Update_Interval_xjal;
    }
    
    int Affect_Counter_Update_Interval_xjal = self._Affect_Counter_Update_Interval_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Affect_Counter_Update_Interval(Affect_Counter_Update_Interval_xjal);
    } else {
      Affect_Counter_Update_Interval = Affect_Counter_Update_Interval_xjal;
    }
  }
  




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
    engine.setTimeUnit(HOUR);
    engine.setStartDate(toDate(2015, 10, 17, 0, 0, 0));
    engine.setRealTimeMode(true);
    engine.setRealTimeScale(1.0D);
  }
  



  @AnyLogicInternalCodegenAPI
  public void setup(Container container)
  {
    setName("TerrorManagement_ABM_1 : Simulation");
    Presentation _p = new Presentation(this, 
      container != null ? Presentation.MODE_COMPONENT : (container instanceof JApplet) ? Presentation.MODE_APPLET : 
      Presentation.MODE_APPLICATION, container);
    

    _createPersistentElementsBP0_xjal();
    

    _createPersistentElementsAP0_xjal();
    presentation = new ShapeTopLevelPresentationGroup(this, true, 0.0D, 0.0D, 0.0D, 0.0D, new Object[] { text, text1, text2, button, editbox, editbox1, button1 });
    icon = new ShapeModelElementsGroup(this, (ModelElementDescriptor[])getElementProperty("merv_1_0_3.Simulation.icon", "modelElementDescriptors"), new Object[0]);
    
    _p.start();
    
    Panel _panel = _p.getPanel();
    ToolBar _tb = _p.getToolBar();
    StatusBar _sb = _p.getStatusBar();
    
    _panel.setFrameManagementBalance(2.0D);
    
    _sb.setSectionVisible(StatusBar.DATE, true);
    _sb.setSectionVisible(StatusBar.EPS, false);
    _sb.setSectionVisible(StatusBar.EXPERIMENT, false);
    _sb.setSectionVisible(StatusBar.FPS, false);
    _sb.setSectionVisible(StatusBar.MEMORY, true);
    _sb.setSectionVisible(StatusBar.SECONDS, false);
    _sb.setSectionVisible(StatusBar.SIMULATION, true);
    _sb.setSectionVisible(StatusBar.STATUS, true);
    _sb.setSectionVisible(StatusBar.STEP, false);
    _sb.setSectionVisible(StatusBar.TIME, true);
    _tb.setSectionVisible(ToolBar.ANIMATION, false);
    _tb.setSectionVisible(ToolBar.EXECUTION, true);
    _tb.setSectionVisible(ToolBar.FILE, false);
    _tb.setSectionVisible(ToolBar.NAVIGATION, true);
    _tb.setSectionVisible(ToolBar.TIME_SCALE, true);
    _tb.setSectionVisible(ToolBar.VIEW, false);
    editbox.setValueToDefault();
    editbox1.setValueToDefault();
  }
  
  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {}
}
