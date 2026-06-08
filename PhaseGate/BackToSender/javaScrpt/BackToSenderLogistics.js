function getRiderWagesPerDayFirstStage(firstStageRate){

    let riderWages = 0;
    if(firstStageRate < 50){
    
        riderWages = firstStageRate * 160 + 5000;
    }
    return riderWages
}

module.exports = { getRiderWagesPerDayFirstStage }


function getRiderWagesPerDaySecondStage(secondStageRate){

    let riderWagesSecondStage = 0;
    if(secondStageRate <= 59){
        riderWagesSecondStage = secondStageRate * 200 + 5000;
        
    } 
    return riderWagesSecondStage
}

module.exports = {getRiderWagesPerDayFirstStage, getRiderWagesPerDaySecondStage }

function getRiderWagesPerDayThirdStage(thirdStageRate){
    
    let riderWagesThirdStage = 0;
    if(thirdStageRate <= 69){
        riderWagesThirdStage = thirdStageRate * 250 + 5000;
        
    }
    return riderWagesThirdStage
}

module.exports = {getRiderWagesPerDayFirstStage, getRiderWagesPerDaySecondStage , getRiderWagesPerDayThirdStage}

function getRiderWagesPerDayFourthStage(fourthStageRate){

    let riderWagesFourthStage = 0;
    if(fourthStageRate >= 70){
        riderWagesFourthStage = fourthStageRate * 500 + 5000;
        
    }
    return riderWagesFourthStage

}

module.exports = {getRiderWagesPerDayFirstStage, getRiderWagesPerDaySecondStage , getRiderWagesPerDayThirdStage,getRiderWagesPerDayFourthStage }

