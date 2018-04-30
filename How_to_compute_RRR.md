What is healthy food? there are 2 main methods to score the food:  
1) the absence of problematic ingredients  
2) the presence of beneficial nutrients or nutrient density  

In our project, based on the dataset we have, we will use a simplified version of "ratio of recommended to restricted (RRR) food score".   
RRR = (SUM%DVrecommended/6)/(SUM%DVrestricted/5)
(DV = mean percentage daily values)
The RRR food score computed the ratio of the “good” to the “bad” nutrients and to the energy content of the food. Six nutrients (protein, calcium, iron, vitamin A, vitamin C, and fiber) were defined a priori as desirable, whereas 5 nutrients (energy, saturated fat, cholesterol, sugar, and sodium) were defined as undesirable

The features we will use in our scoring formula are: calories, fat, sodium, protein
daily values:
calories:2000
protein: 56 grams per day for the average sedentary man; 46 grams per day for the average sedentary woman
fat: 20 to 35 percent of each day's calories = 44 to 77 grams of fat per day.  
sodium:
United States Department of Agriculture (USDA): 2300 mg.
American Heart Association (AHA): 1500 mg (2).
Academy of Nutrition and Dietetics (AND): 1500 to 2300 mg.
American Diabetes Association (ADA): 1500 to 2300 mg.

Our simplified version of RRR: (protein/51) / (calories/2000 +  fat/60 + sodium/2300)  

Reference:
Concept of a nutritious food: toward a nutrient density score, http://ajcn.nutrition.org/content/82/4/721.full  

Composite Index for Aggregating Nutrient Density Using Food Labels: Ratio of Recommended to Restricted Food Components, http://www.sciencedirect.com/science/article/pii/S1499404606601267

Protein: https://www.healthline.com/nutrition/how-much-protein-per-day

Fat: http://healthyeating.sfgate.com/ideally-many-grams-fat-should-consume-daily-5501.html  

Sodium: https://www.healthline.com/nutrition/how-much-sodium-per-day
