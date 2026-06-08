const { getRiderWagesPerDayFirstStage, getRiderWagesPerDaySecondStage , getRiderWagesPerDayThirdStage, getRiderWagesPerDayFourthStage} = require("./BackToSenderLogistics");

test("Test that if rider wage is less than 50 returns 9000", ()=> {

    let collectionRate = 25;
    let actual = getRiderWagesPerDayFirstStage(collectionRate);
    let expected = 9000;
     
    expect(actual).toEqual(expected);
})

test("Test that if ride collection rate is less or equal 59 returns is correct", ()=>{

    let theSecondStageCollectionRate = 59;
    let actual = getRiderWagesPerDaySecondStage(theSecondStageCollectionRate);
    let expected = 16800;
    
    expect(actual).toEqual(expected);

})

test("test that if  rider collection rate is less or equal 69 returns is correct", ()=>{

    let theThirdStageCollectionRate = 69;
    let actual = getRiderWagesPerDayThirdStage(theThirdStageCollectionRate);
    let expected = 22250;
    
    expect(actual).toEqual(expected);

})

test("test that if rider collection rate is greater or equal 70 returns correct", ()=>{
    let theFourthStageCollectionRate = 70;
    let actual = getRiderWagesPerDayFourthStage(theFourthStageCollectionRate);
    let expected = 40000;
    
    expect(actual).toEqual(expected);
    

})


