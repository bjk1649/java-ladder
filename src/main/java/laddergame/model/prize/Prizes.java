package laddergame.model.prize;

import java.util.ArrayList;
import java.util.List;
import laddergame.model.ErrorMessage;
import laddergame.model.participant.Participants;

public class Prizes {

  private final List<Prize> prizes;
  public Prizes(Participants participants, List<Prize> prizes) {
    validateDuplicate(participants, prizes);
    this.prizes = prizes;
  }

  private void validateDuplicate(Participants participants, List<Prize> prizes) {
    if (participants.getParticipants().size() != prizes.size()) {
      throw new IllegalArgumentException(ErrorMessage.MISMATCH_COUNT.getMessage());
    }
  }

  public List<Prize> getPrizes() {
    return new ArrayList<>(prizes);
  }
}
