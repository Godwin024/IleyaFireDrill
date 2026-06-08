def get_rider_wages_per_day_first_stage(first_stage_rate):

    rider_wages = 0
    if first_stage_rate < 50:
        rider_wages = first_stage_rate * 160 + 5000
        
    return rider_wages
    
def get_rider_wages_per_day_second_stage(second_stage_rate):
    
    rider_wages_second_stage = 0
    if second_stage_rate <= 59:
        rider_wages_second_stage = second_stage_rate * 200 + 5000
        
    return rider_wages_second_stage 
    
def get_rider_wages_per_day_third_stage(third_stage_rate):

    rider_wages_third_stage = 0 
    if third_stage_rate <= 69:
        rider_wages_third_stage = third_stage_rate * 250 + 5000
    return rider_wages_third_stage        
          
    
def get_rider_wages_per_day_fourth_stage(fouth_stage_rate) :

    rider_wages_fourth_stage = 0
    if fouth_stage_rate >= 70:
        rider_wages_fourth_stage = fouth_stage_rate * 500 + 5000
    
    
    return rider_wages_fourth_stage         
                  
        
        
        
