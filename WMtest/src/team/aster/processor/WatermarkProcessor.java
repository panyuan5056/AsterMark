package team.aster.processor;

import team.aster.model.DatasetWithPK;

import java.util.ArrayList;

public abstract class WatermarkProcessor {
    IEncoderNumericImpl encoder;
    IDecoder decoder;

    public void encodeDB(DatasetWithPK datasetWithPK, ArrayList<String> watermarkList){

        encoder.encode(datasetWithPK, watermarkList);
    }

    public String decodeDB(DatasetWithPK datasetWithPK){

        return decoder.decode(datasetWithPK);
    }

    public IEncoderNumericImpl getEncoder() {
        return encoder;
    }

    public IDecoder getDecoder() {
        return decoder;
    }
}
