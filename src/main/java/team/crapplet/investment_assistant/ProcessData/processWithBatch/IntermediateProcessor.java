package team.crapplet.investment_assistant.ProcessData.processWithBatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

public class IntermediateProcessor implements ItemProcessor<Input, Input> {

    private static final Logger log = LoggerFactory.getLogger(IntermediateProcessor.class);

    @Override
    public Input process(final Input input) throws Exception {
        final String firstName = input.getAverage_Inventory().toUpperCase();
        final String lastName = input.get_cls().toUpperCase();

//        final Input transformedInput = new Input();
//
//        log.info("Converting (" + input + ") into (" + transformedInput + ")");
//
        return null;
    }

}
