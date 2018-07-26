library(ggplot2)
library(tidyverse)

printFigure8PlotAndGetData <- function() {
	data = read.csv("fig8onlyDS.csv", header=T)
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

printFigure3PlotAndGetData <- function() {
	data = read.csv("fig3onlyDS.csv", header=T)
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

printFigure7PlotAndGetData <- function() {
	data = read.csv("fig7onlyDS.csv", header=T)
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

# note the command below will also print Fig 3
dataForFig3 = printFigure3PlotAndGetData()

# note the command below will also print Fig 7
dataForFig7 = printFigure7PlotAndGetData()

# note the command below will also print Fig 8
dataForFig8 = printFigure8PlotAndGetData()

