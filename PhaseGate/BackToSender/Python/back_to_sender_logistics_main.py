from back_to_sender_logistics import *

user_input = int(input("Enter your collection rate: "))

if user_input < 0 or user_input > 100:
    print("invalid input, Collection rate must be between 0 and 100")
        
elif user_input < 50:
    print("Your daily wage is: ", get_rider_wages_per_day_first_stage(user_input)) 
        
elif user_input < 59:
    print("Your daily wage is: ",get_rider_wages_per_day_second_stage(user_input))
        
elif user_input < 69:
    print("Your daily wage is: ", get_rider_wages_per_day_third_stage(user_input))
        
elif user_input >= 70:
    print("Your daily wage is: ", get_rider_wages_per_day_fourth_stage(user_input)) 
    
