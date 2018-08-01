library(ggplot2)
library(tidyverse)

printFigure1PlotAndGetData <- function() {
	data = read.csv("fig1DS.csv", header=T)
	plotToReturn = ggplot(subset(data, Type.of.Incident == "Shooting Victim"), aes(x=Year, y=Number.Of.Incidents, fill=Group.Id, group=Group.Id))+
	geom_bar(stat="identity", position=position_dodge())+
	ylab("Number of Shooting Incidents")+
	guides(fill=guide_legend(title="Group"))+
	ggtitle("Periods of Mutually Escalating Anxiety Between Religious Groups in Northern Ireland: 1973-2001") + 
	theme(plot.title = element_text(hjust = 0.5))+
	xlim(1973, 2001)	
	print(plotToReturn)
	return(data)
}

printFigure9PlotAndGetData <- function() {
	data = read.csv("fig9DS.csv", header=T)
	plotToReturn = 
	ggplot(data, aes(x=Length, y=Score, group=Condition, color=str_wrap(Condition, 60)))+
	geom_point()+
	geom_line()+
	ggtitle("Comparison of Suspiciousness Scores For Conditions")+
	xlab("Minimum Length of Time Series of Mutually Escalating Anxiety")+
	ylab("Condition Suspiciousness Score")+
	scale_color_manual(values=c("#F8766D", "#619CFF", "#00BA38"), name="Condition Name")+
	theme(plot.title = element_text(hjust = 0.5))
	print(plotToReturn)
	return(data)
}

printFigure4PlotAndGetData <- function() {
	data = read.csv("fig4.csv", header=T)
	plotToReturn = 
	ggplot(data, aes(x=Time, y=Value, fill=GroupId))+
	geom_bar(stat="identity")+
	xlab("Time")+
	ylab("Avg. Agent Anxiety Per Group")+
	ggtitle("Avg. Agent Anxiety Over Time")+
	theme(plot.title = element_text(hjust = 0.5))
	print(plotToReturn)
	return(data)
}

printFigure8PlotAndGetData <- function() {
	data = read.csv("fig8DS.csv", header=T)
	data$count.as.prct = data$Count / sum(data$Count)
	data$count.as.prct = data$count.as.prct*100
	plotToReturn = 
	ggplot(data, aes(x=as.factor(Length), y=count.as.prct, fill=State, group=State))+
	geom_bar(stat="identity", position=position_dodge())+
	xlab("Percentage of Total Escalating Time Series")+
	scale_y_continuous(name="Length of Escalating Time Series in Time Steps", breaks=c(0, 5, 10, 15, 20, 25), labels=c("0%", "5%", "10%", "15%", "20%", "25%"))
	print(plotToReturn)
	return(data)
}

getParamSweepData <- function() {
	data = read.csv(unzip("param-sweep-data-set.csv.zip"), header=T)
	print("The sweep data can be explored to identify the suspiciousness of different conditions as is done in the paper using a tool which implements approach described in Appendix A at: https://github.com/rossgore/IVandVLevelChecker.")
	print("The link above provides a Mac and Windows version of the tool and the source code of the tool's implementation (https://github.com/rossgore/IVandVLevelChecker/tree/master/src).")
	print("We have also provided a local copy of this code for analysis can be unzipped in the file: TraceValidationScript.zip")
	return (data)
}

paramSweepData = getParamSweepData()

# note the command below will also print Fig 1
dataForFig1 = printFigure1PlotAndGetData()

# note the command below will also print Fig 4
dataForFig4 = printFigure4PlotAndGetData()

# note the command below will also print Fig 8
dataForFig8 = printFigure8PlotAndGetData()

# note the command below will also print Fig 9
dataForFig9 = printFigure9PlotAndGetData()

