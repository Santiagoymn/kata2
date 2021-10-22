package kata3;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;


public class HistogramDisplay extends ApplicationFrame{
   
       
    public HistogramDisplay() {
        super("HISTOGRAMA");
        this.setContentPane(this.createPanel());
        this.pack();
    }
   
    private JPanel createPanel(){
        ChartPanel chartpanel = new ChartPanel(createChart(createDataSet()));
        setPreferredSize(new Dimension(500,400));
        return chartpanel;
    }
   
    private JFreeChart createChart(DefaultCategoryDataset dataSet) {
        JFreeChart chart = ChartFactory.createBarChart("Histograma JFreeChart",
                                                        "Dominios email",
                                                        "Nº de emails",
                                                        dataSet,
                                                        PlotOrientation.VERTICAL,
                                                        false,
                                                        false,
                                                        rootPaneCheckingEnabled);
        return chart;
    }
   
    private DefaultCategoryDataset createDataSet(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
       
        dataSet.addValue(5, "", "ULPGC.es");
        dataSet.addValue(2, "", "ULL.es");
        dataSet.addValue(3, "", "icloud.com");
        dataSet.addValue(1, "", "gmail.es");
        
        return dataSet;
    }
   
    public void execute() {
        setVisible(true);
    }

   
   
}